package com.wjsljx.controller;

import com.wjsljx.model.User;
import com.wjsljx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: MyController.java
 * Description:
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */
//@RestController  #表示返回字符串
//@EnableAutoConfiguration

@Controller
public class MyController {
    @Autowired
    UserService userService;


    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(){
        System.out.println("进入");
        return "index";
    }

    @RequestMapping("/hello")
    private String indexHello(){
        User user=userService.getUserById(1);
//        System.out.println(user.getUserName());
        return "Hello World!";
    }

    @RequestMapping("/insert")
    private String insert(){
        User user=null;
        userService.insert(user);
        return "Hello World!";
    }




}
