package com.community.article.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.community.article.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: hcq
 * @Date: 2019/3/27
 */
@Mapper
public interface ArticleDao extends BaseMapper<ArticleEntity> {
    String TABLE_NAME = "comm_article";

    /**
     * 修改文章state(状态)
     * @param articleId
     * @param state
     */
    @Update("update " + TABLE_NAME + " SET state = #{state} where id = #{articleId} ")
    void updateState(String articleId, String state);

    /**
     * 点赞数加1
     * @param articleId
     */
    @Update("update " + TABLE_NAME + " SET thumbup = thumbup+1 where id = #{articleId}")
    void increaseThumbup(String articleId);
}
