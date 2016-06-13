package com.robin.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.robin.dao.UserDAOimpl;



public class DAOTest {
	  public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");

	      UserDAOimpl UserDAOimpl = 
	      (UserDAOimpl)context.getBean("userDAOimpl");
	      
	 
	      int number=UserDAOimpl.getMatchCount("robin", "123456");
	      System.out.println(number);

	 
		  
	   }
}
