package com.jcg.examples.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.LoginDelegate;
import com.jcg.examples.viewBean.LoginBean;


@Controller
public class LoginController
{	
		//装载的是展现层的组件，不是业务层的，实现解耦！！
		@Autowired
		private LoginDelegate loginDelegate;

		@RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView displayLogin_asgfhgfhghfghd(HttpServletRequest request)
		{	
			LoginBean loginBean=new LoginBean();
			ModelAndView model = new ModelAndView("login");
			request.setAttribute("hhh", "request say:i am back");
			//LoginBean loginBean = new LoginBean();
			model.addObject("loginBean", loginBean);
			//结合前缀/jsp,后缀.jsp，得到路径为/jsp/login.jsp,其中还带着一个loginBean对象用来装输入数据！！！
			return model;
		}
		//此处用到了loginBean存放的数据来处理！！！
		@RequestMapping(value="/login_post",method=RequestMethod.POST)
		public ModelAndView executeLogin_afghdfhgfhsd(HttpServletRequest request,@ModelAttribute("loginBean")LoginBean loginBean)
		{
				ModelAndView model= null;
				try
				{
						boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
						if(isValidUser)
						{
								System.out.println("User Login Successful");
								request.setAttribute("loggedInUser", loginBean.getUsername());
								//成功则是进入新的界面
								model = new ModelAndView("welcome");
						}
						else
						{
							//失败则还是原来的界面
							//并且添加了一个message
								model = new ModelAndView("login");
								request.setAttribute("message", "Invalid credentials!!");
						}

				}
				catch(Exception e)
				{
						e.printStackTrace();
				}

				return model;
		}
}
