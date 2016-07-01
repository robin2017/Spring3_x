package com.test.service;
import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ServerMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, InterruptedException, Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-config.xml" });
		System.in.read(); // 防止系统退出
	}
}