package com.robin.test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jcg.examples.service.UserService;
import com.jcg.examples.service.impl.UserServiceImpl;
import com.jcg.examples.viewBean.LoginBean;
  
import static org.junit.Assert.*;  
import static org.mockito.Mockito.*;  
 


public class MockitoTest {
	UserService mockUserService=mock(UserService.class);
	UserServiceImpl mockServiceImpl=mock(UserServiceImpl.class);
	@Mock
	LoginBean mockUser;
	@Before
	public void initMocks_asas(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testMockInterface_asas() throws SQLException{
		when(mockUserService.isValidUser("robin", "ddd")).thenReturn(true);
		doReturn(true).when(mockServiceImpl).isValidUser("robin", "dsf");
		
		LoginBean u=new LoginBean();
		u.setUsername("john");
		u.setPassword("123456");
		
		doNothing().when(mockUserService).isValidUser("robin", "dd");
		
		boolean re=mockUserService.isValidUser("r", "d");
		
		assertTrue(re);
	}
}
