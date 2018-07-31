package com.example.sbDemo1.service;

import com.example.sbDemo1.dao.UserDao;
import com.example.sbDemo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ucmed on 2018/7/30.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User finUserUserName(String name){
        User user = null;
        try {
            user = userDao.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
