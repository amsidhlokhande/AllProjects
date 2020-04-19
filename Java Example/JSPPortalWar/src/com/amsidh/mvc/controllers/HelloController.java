package com.amsidh.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("VIEW")
public class HelloController {

	@RequestMapping
	public String showIndex()
	{
		return "index";
	}
}
