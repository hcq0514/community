package com.community.spit.service;

import com.community.spit.dao.SpitDao;
import com.community.spit.entity.SpitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hcq
 * @date 2019-03-25
 */
@Service
public class SpitService {
    @Autowired
    SpitDao spitDao;

    @Autowired
    MongoTemplate mongoTemplate;


    public void add(SpitEntity spitEntity) {
        spitDao.save(spitEntity);
    }

    public SpitEntity findById(String id) {
        return spitDao.findById(id).get();
    }

    public List<SpitEntity> findAll() {
        return spitDao.findAll();
    }

    public void updateThumbup(String id) {
        Query query=new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        Update update=new Update();
        update.inc("thumbup",1);
        mongoTemplate.updateFirst(query,update,"spit");
    }
}
