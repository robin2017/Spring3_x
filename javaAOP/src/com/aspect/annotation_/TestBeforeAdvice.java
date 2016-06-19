package com.aspect.annotation_;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;


public class TestBeforeAdvice {
	public static void main(String[] args) {
		AspectJProxyFactory factory=new AspectJProxyFactory();
		Waiter target=new NaiveWaiter();
		
		factory.setTarget(target);
		
		factory.addAspect(GreetingBeforeAdvice.class);
		
		Waiter proxy=factory.getProxy();
		
		proxy.greetTo("robin");
		proxy.serveTo("robin");
	}
}
