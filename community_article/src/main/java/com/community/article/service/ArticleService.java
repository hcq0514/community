package com.community.article.service;

import com.community.article.dao.ArticleDao;
import com.community.common.entity.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ArticleService {
    @Autowired
    ArticleDao articleDao;

    public void examine(String articleId) {
        articleDao.updateState(articleId, StateCode.VALID);
    }


    public void updateThumbup(String articleId) {
        articleDao.increaseThumbup(articleId);
    }
}
