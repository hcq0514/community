package com.community.qa.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.community.qa.entity.ProblemEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
@Mapper
public interface ProblemDao extends BaseMapper<ProblemEntity> {
    String TABLE_NAME = "comm_problem";

    /**
     * 有效标签列表
     *
     * @return
     */
    @Select("select * from " + TABLE_NAME)
    IPage<ProblemEntity> selectPageVo(Page page);


    @Select("select * from " + TABLE_NAME + " inner join comm_pl pl  where  pl.labelid  = #{labelId} order by createtime desc")
    IPage<ProblemEntity> selectLatestProblemByLabelId(Page<Object> page, String labelId);

    @Select("select * from " + TABLE_NAME + " inner join comm_pl pl  where  pl.labelid  = #{labelId} order by reply desc")
    IPage<ProblemEntity> selectHotProblemByLabelId(Page<Object> page, String labelId);

    @Select("select * from " + TABLE_NAME + " inner join comm_pl pl  where  pl.labelid  = #{labelId} and reply = 0  order by createtime desc")
    IPage<ProblemEntity> selectWaitAnswerQuetionListByLabelId(Page<Object> page, String labelId);
}
