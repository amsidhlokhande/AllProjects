package com.amsidh.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String  sayHello(ModelMap model)
	{
		model.addAttribute("message","Spring 3.0 MVC Framework Hello World Example!");
		model.addAttribute("auther", "AmsidhLokhande");  
		return "hello";
	}
}
