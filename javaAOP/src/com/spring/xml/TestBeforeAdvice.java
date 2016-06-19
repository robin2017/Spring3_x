package com.spring.xml;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeforeAdvice {
	public static void main(String[] args) {
		String configPath="beans.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configPath);
		Waiter waiter=(Waiter)context.getBean("waiter");
		waiter.greetTo("robin");
		waiter.serveTo("robin");
	}
}
