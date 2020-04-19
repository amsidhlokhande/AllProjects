package com.amsidh.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amsidh.mvc.domain.User;
import com.amsidh.mvc.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public void homePage(HttpServletRequest request,HttpServletResponse response)
	{
		try {
			request.getRequestDispatcher("userForm").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("userForm")
	public String userInfo(@ModelAttribute("user") User user,ModelMap modelMap)
	{
		user=new User();
		modelMap=new ModelMap();
		modelMap.put("user", user);
		modelMap.put("userList", userService.getAllUsers());
		return "userform";
	}
	@RequestMapping("addUser")
	public String addUser(@ModelAttribute("user") User user,BindingResult bindingResult,ModelMap modelMap)
	{
	   //do validation in this method
		if(!bindingResult.hasErrors())
		{
			modelMap=new ModelMap();
			modelMap.put("user", user);
			return "success";	
		}else
		{
			return "userform";
		}
	}public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
