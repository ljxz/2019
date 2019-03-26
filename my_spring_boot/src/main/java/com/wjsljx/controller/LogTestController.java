package com.wjsljx.controller;

import com.wjsljx.exception.JsonResult;
import com.wjsljx.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: LogTestController.java
 * Description:
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */

@RestController
public class LogTestController {

    protected static Logger logger = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/logtest")
    public JsonResult Test(@RequestParam(value = "role") Integer role)throws Exception  {

            logger.info("访问了controller");
            int i = role;

            //Exception异常会自动拦截，这里只是做个测试自定义异常
            if (i<0) {
                //int j = i / 0;
            throw new MyException("999", "异常");
//                   JsonResult.failed(999, "异常");

            } else {
                return new JsonResult(200, "成功", new HashMap<>(0));
            }


    }
}
