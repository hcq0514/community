package com.community.recruit.service;

import com.community.recruit.dao.RecruitDao;
import com.community.recruit.entity.RecruitEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author hcq
 * @date 2019-03-25
 */
public class RecruitService  {
    @Autowired
    RecruitDao recruitDao;

    /**
     * 查询最新职位列表(按创建日期降序排序)
     * @return
     */
    public List<RecruitEntity> selectLatestJob(String state){
        return recruitDao.selectJobByStateOrderyByCreatetimeDesc(state);
    }

    public List<RecruitEntity> selectRecommendCompany(String isShot) {
        return recruitDao.selectByIsShot(isShot);
    }
}
