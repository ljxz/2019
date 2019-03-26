package com.wjsljx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement  //启动事物 #注意表的设置是否支持事物InnoDB
@SpringBootApplication
@MapperScan("com.wjsljx.dao") //扫描dao层
public class MySpringBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

}
