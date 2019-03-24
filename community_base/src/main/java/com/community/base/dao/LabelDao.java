package com.community.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.community.base.entity.LabelEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
@Mapper
public interface LabelDao extends BaseMapper<LabelEntity> {

}
