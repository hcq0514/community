package com.community.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.community.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public  interface UserDao extends BaseMapper<UserEntity> {

}
