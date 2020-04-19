package com.amsidh.mvc.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringSecurityFrontController {

	@RequestMapping(value={"/","/admin**"},method=RequestMethod.GET)
	public ModelAndView homePage()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("message","This is default login page");
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(Principal principal)
	{
		
		
		ModelAndView model=new ModelAndView();
		if(principal.getName().equals("amsidhlokhande"))
		{
			model.addObject("message","This is secured login success page");
			model.addObject("user",principal.getName());
			model.setViewName("success");
				
		}else
		{
			model.addObject("message","This is default login page");
			model.setViewName("failure");
			
		}
		return model;
	} 
}
