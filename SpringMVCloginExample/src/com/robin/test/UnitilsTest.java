/*package com.robin.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;

import com.jcg.examples.service.UserService;

public class UnitilsTest extends UnitilsJUnit4 {
	//@SpringApplicationContext({"springBeanConfiguration.xml"});
	private ApplicationContext applicationContext;
	
	//@SpringBean("userService")
	private UserService userService;
	
	@Test
	public void testUserService() throws SQLException{
		assertNotNull(applicationContext);
		assertTrue(userService.isValidUser("robin", "123456"));
	}
}
*/