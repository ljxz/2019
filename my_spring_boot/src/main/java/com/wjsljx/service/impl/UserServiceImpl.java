package com.wjsljx.service.impl;

import com.wjsljx.dao.UserDao;
import com.wjsljx.model.User;
import com.wjsljx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: UserServiceImpl.java
 * Description:
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int insert(User user) {
        userDao.insert(new User("111111","12312312"));
        userDao.insert(new User("22222","12312312"));
        userDao.insert(new User("1111111111111111111","12312312"));
        userDao.insert(new User("33333","12312312"));
        userDao.insert(new User("44444","12312312"));
        userDao.insert(new User("55555","12312312"));

        return 0;
    }
}
