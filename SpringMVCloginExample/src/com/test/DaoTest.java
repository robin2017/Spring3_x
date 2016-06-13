package com.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jcg.examples.dao.impl.UserDaoImpl;

public class DaoTest {
	public static void main(String[] args){
		 ApplicationContext context = 
		            new ClassPathXmlApplicationContext("springBeanConfiguration.xml");
		 UserDaoImpl userDao=(UserDaoImpl) context.getBean("userDao");
		 try {
			System.out.println(userDao.isValidUser("robin", "a123456"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
