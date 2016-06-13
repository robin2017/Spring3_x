package com.robin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.robin.bean.User;
import com.robin.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String register() {
		return "user/register";
	}
	
	public ModelAndView createUser(User user){
		
		userService.createUser(user);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("user/createSuccess");
		mav.addObject("user",user);
		return mav;
		
	}
}
