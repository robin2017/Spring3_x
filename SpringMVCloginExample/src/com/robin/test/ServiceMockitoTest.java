package com.robin.test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
 
import org.mockito.MockitoAnnotations;

import com.jcg.examples.service.UserService;
 
  
 
import static org.mockito.Mockito.*;  
 


public class ServiceMockitoTest {
	UserService mockUserService=mock(UserService.class);

	@Before
	public void initMocks_asas(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testMockInterface_asas() throws SQLException{
	
		doReturn(true).when(mockUserService).isValidUser("robin", "dsf");
		
		boolean re=mockUserService.isValidUser("robin", "dsf");
		
		assertTrue(re);
	}
}
