package com.baobaotao;

import static org.junit.Assert.*;

import java.util.Date;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.unitils.UnitilsJUnit4;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserService extends UnitilsJUnit4{

	@Autowired
    private UserService userService;

	@Test
	public void testHasMatchUser() {
	 	boolean b1 = userService.hasMatchUser("admin", "123456");
 		boolean b2 = userService.hasMatchUser("admin", "1111");
		assertTrue(b1);
		assertTrue(!b2);
		System.out.println("1"); 
	}

 	@Test
	public void testFindUserByUserName() {
		User user = userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
		System.out.println("2");
	} 

 	@Test
	public void testAddLoginLog() {
		User user = userService.findUserByUserName("admin");
		user.setUserId(1);
		user.setUserName("admin");
		user.setLastIp("192.168.12.7");
		user.setLastVisit(new Date());
		userService.loginSuccess(user);
		System.out.println("3");
	} 
}
 