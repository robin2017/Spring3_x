package com.robin.test;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

import com.jcg.examples.controller.LoginController;

//@SpringApplicationContext("classpath:springBeanConfiguration.xml")
public class ControllerTest extends UnitilsJUnit4{

/*	@SpringBeanByType
	private AnnotationMethodHandlerAdapter handlerAdapter;
	@SpringBeanByType
	private LoginController controller;
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;*/
	
/*	@Before
	public void before(){
		request=new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");
		response=new MockHttpServletResponse();
	}*/
 	
	@Test
	public void logincheck() throws Exception{
	/*	request.setRequestURI("/login.jsp");
		request.addParameter("userName", "robin");
		request.addParameter("password", "123456");
		ModelAndView mav=handlerAdapter.handle(request, response,controller);
		LoginBean loginBean=(LoginBean)request.getSession().getAttribute("userName");
		
		assertNotNull(mav);
		assertEquals(mav.getViewName(),"welcome");
		assertNotNull(loginBean);
	//	assertThat(user.getUsername(),equalTo("robin"));
		*/ 
	}
	
	
	
	
	
	}
