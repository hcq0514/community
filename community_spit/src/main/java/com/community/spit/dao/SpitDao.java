package com.community.spit.dao;

import com.community.spit.entity.SpitEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author hcq
 * @date 2019-03-25
 */
@Mapper
public interface SpitDao extends MongoRepository<SpitEntity,String> {

}
