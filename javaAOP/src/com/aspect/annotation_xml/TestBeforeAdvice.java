package com.aspect.annotation_xml;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xml.Waiter;


public class TestBeforeAdvice {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config-aop.xml");
		NaiveWaiter waiter=(NaiveWaiter)context.getBean("waiter");
		waiter.greetTo("robin");
		waiter.serveTo("robin");
	}
}

