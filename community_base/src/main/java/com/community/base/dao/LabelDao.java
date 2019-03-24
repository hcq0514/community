package com.community.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.community.base.entity.LabelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
@Mapper
public interface LabelDao extends BaseMapper<LabelEntity> {
    @Select("select * from comm_label")
    IPage<LabelEntity> selectPageVo(Page page);

}
