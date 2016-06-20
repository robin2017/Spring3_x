package com.baobaotao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import com.baobaotao.dao.UserDao;

public class DaoTest {
	public static void main(String[] args){
		
	
	     ApplicationContext context = 
	             new ClassPathXmlApplicationContext("applicationContext.xml");
	     UserDao userDao=(UserDao)context.getBean("userDao");
	 	 System.out.println(userDao.getMatchCount("robin", "123456"));
	 	System.out.println(userDao.getMatchCount("admin", "123456"));
	 	 
	}
}
