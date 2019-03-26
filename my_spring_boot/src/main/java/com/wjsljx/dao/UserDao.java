package com.wjsljx.dao;

import com.wjsljx.model.User;
import org.springframework.stereotype.Repository;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: UserDao.java
 * Description:
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */
@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}