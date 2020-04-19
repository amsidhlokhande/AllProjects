package com.amsidh.mvc.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView accessPublicPage() {
		ModelAndView model=new ModelAndView();
		model.addObject("message","This page is publicly accessible. No authentication is required to view.");
		model.setViewName("public"); 
		return model;
	}
	

	@RequestMapping(value = { "login" })
	public ModelAndView loginPage(@RequestParam(required = false) String error,
			String logout) {

		String message = "";

		if (error != null) {
			message = "Invalid username or password, try again !" + error;

		} else if (logout != null) {

			message = "Logged Out successfully, login again to continue !";
		}
		return new ModelAndView("login", "message", message);
	}

	@RequestMapping("welcome")
	public ModelAndView profilePage(Authentication authentication) {
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		System.out.println(userDetails.getUsername() + "   "
				+ userDetails.getAuthorities().size());
		return new ModelAndView("success", "message",
				"You are authorised user!");
	}
	
}
