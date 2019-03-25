package com.community.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.community.base.entity.LabelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
@Mapper
public interface LabelDao extends BaseMapper<LabelEntity> {
    String TABLE_NAME = "comm_label";

    /**
     * 有效标签列表
     * @return
     */
    @Select("select * from " + TABLE_NAME)
    IPage<LabelEntity> selectPageVo(Page page);

    /**
     * 有效标签列表
     * @return
     */
    @Select("select * from " + TABLE_NAME + "  where  state = 1")
    List<LabelEntity> selectAvailableLabel();

    /**
     * 根据state跟recommend查询
     * @return
     */
    @Select("select * from " + TABLE_NAME + "  where  state = #{state} and recommend = #{recommend}")
    List<LabelEntity> selectByStateAndRecommend(String state,String recommend);

}
