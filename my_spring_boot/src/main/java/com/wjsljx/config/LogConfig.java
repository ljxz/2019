package com.wjsljx.config;
/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: LogConfig.java
 * Description: 日志配置
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */
import com.wjsljx.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

//    @Bean
    public User logMethod() {
        LOG.info("==========控制台输出日志 print log==========");
        return new User();
    }
}