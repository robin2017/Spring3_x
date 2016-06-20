package com.baobaotao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.dao.UserDao;
import com.baobaotao.service.UserService;

public class ServiceTest {
	public static void main(String[] args){
	     ApplicationContext context = 
	             new ClassPathXmlApplicationContext("applicationContext.xml");
	     UserService userService=(UserService)context.getBean("userService");
	 	 System.out.println(userService.hasMatchUser("admin", "123456"));
 
	 	 
	}
}
