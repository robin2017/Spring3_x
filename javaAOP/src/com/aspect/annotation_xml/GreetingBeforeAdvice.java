package com.aspect.annotation_xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class GreetingBeforeAdvice {
	@Before("execution(* greetTo(..))")
	public void beforeGreeting(){
		System.out.println("how are you");
	}
	
	@Before("execution(* serveTo(..))")
	public void beforeServing(){
		System.out.println("how are you");
	}
 
}
