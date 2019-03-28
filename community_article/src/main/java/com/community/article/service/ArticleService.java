package com.community.article.service;

import com.community.article.dao.ArticleDao;
import com.community.article.entity.ArticleEntity;
import com.community.common.entity.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ArticleService {
    @Autowired
    ArticleDao articleDao;

    @Autowired
    RedisTemplate redisTemplate;

    String REDIS_PRE = "ARTICLE_";

    public void examine(String articleId) {
        articleDao.updateState(articleId, StateCode.VALID);
    }


    public void updateThumbup(String articleId) {
        redisTemplate.delete(REDIS_PRE + articleId);
        articleDao.increaseThumbup(articleId);
    }

    public void deleteById(String articleId) {
        redisTemplate.delete(REDIS_PRE + articleId);
        articleDao.deleteById(articleId);
    }

    public ArticleEntity selectById(String articleId) {
        ArticleEntity articleEntity = (ArticleEntity) redisTemplate.opsForValue().get(REDIS_PRE + articleId);
        if (articleEntity == null) {
            articleEntity = articleDao.selectById(articleId);
            redisTemplate.opsForValue().set(REDIS_PRE + articleId, articleEntity, 10, TimeUnit.SECONDS);
        }
        return articleEntity;
    }
}
