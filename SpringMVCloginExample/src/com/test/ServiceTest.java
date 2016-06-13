package com.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jcg.examples.dao.impl.UserDaoImpl;
import com.jcg.examples.service.UserService;

public class ServiceTest {
  public static void main(String[] args){
	 ApplicationContext context = 
	            new ClassPathXmlApplicationContext("springBeanConfiguration.xml");
	 UserService userService=(UserService) context.getBean("userService");
	 try {
		System.out.println(userService.isValidUser("robin", "123456"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
