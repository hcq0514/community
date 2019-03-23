package com.community.base.dao;

import com.community.base.entity.LabelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
public interface LabelDao extends JpaRepository<LabelEntity, String>, JpaSpecificationExecutor<LabelEntity> {
    //    JpaRepository提供了基本的增删改查
    //JpaSpecificationExecutor用于做复杂的条件查询
}
