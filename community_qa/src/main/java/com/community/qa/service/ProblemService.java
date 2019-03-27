package com.community.qa.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.community.qa.dao.ProblemDao;
import com.community.qa.entity.ProblemEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class ProblemService {
    @Autowired
    ProblemDao problemDao;

    public IPage<ProblemEntity> selectLatestProblemByLabelId(Page<Object> page, String labelId) {
        return problemDao.selectLatestProblemByLabelId(page, labelId);
    }

    public IPage<ProblemEntity> selectHotProblemByLabelId(Page<Object> page, String labelId) {
        return problemDao.selectHotProblemByLabelId(page, labelId);
    }

    public IPage<ProblemEntity> selectWaitAnswerQuestionListByLabelId(Page<Object> page, String labelId) {
        return problemDao.selectWaitAnswerQuetionListByLabelId(page, labelId);
    }
}
