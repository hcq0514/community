package com.community.user.service;

import com.community.user.dao.UserDao;
import com.community.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    UserDao userDao;


    public void add(UserEntity userEntity) {
        //使用BCryptPasswordEncoder加密
        String passowrd = encoder.encode(userEntity.getPassword());
        userEntity.setPassword(passowrd);
        userDao.insert(userEntity);
    }

    public UserEntity findByIdAndPassword(String Id, String password) {
        UserEntity userEntity = userDao.selectById(Id);
        if (userEntity != null && encoder.encode(password).equals(userEntity.getPassword())) {
            return userEntity;
        }
        return null;
    }

}
