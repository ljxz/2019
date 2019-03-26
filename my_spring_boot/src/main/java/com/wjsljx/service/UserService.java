package com.wjsljx.service;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: UserService.java
 * Description:
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */

import com.wjsljx.model.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    User getUserById(int userId);

    @Transactional
    int insert(User user);
}