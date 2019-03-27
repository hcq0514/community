package com.community.recruit.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.community.recruit.entity.RecruitEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hcq
 * @date 2019-03-25
 */
@Mapper
public interface RecruitDao extends BaseMapper<RecruitEntity> {
    /**
     *  0：非热门 1：热门
      */
    @Select("select * from comm_enterprise where is shot = #{isShot}")
    List<RecruitEntity> selectByIsShot(String isShot);

    @Select("select * from comm_recruit where state  = #{state} order by createtime desc")
    List<RecruitEntity> selectJobByStateOrderyByCreatetimeDesc(String state);
}
