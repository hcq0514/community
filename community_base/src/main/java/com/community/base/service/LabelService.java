package com.community.base.service;

import com.community.base.dao.LabelDao;
import com.community.base.entity.LabelEntity;
import com.community.common.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
@Service
public class LabelService {
    @Autowired
    LabelDao labelDao;

    @Autowired
    IdWorker idWorker;

    public void add(LabelEntity labelEntity) {
        labelEntity.setId(idWorker.generateId());
        labelDao.insert(labelEntity);
    }

    public void deleteById(String id) {
        labelDao.deleteById(id);
    }

    public void update(LabelEntity labelEntity) {
        labelDao.insert(labelEntity);
    }

    public List<LabelEntity> findAll() {
        return labelDao.selectList(null);
    }

    public LabelEntity findById(String id) {
        return labelDao.selectById(id);
    }


}
