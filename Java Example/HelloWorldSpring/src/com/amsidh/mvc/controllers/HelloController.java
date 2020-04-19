/**
 * 
 */
package com.amsidh.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VIRU
 * 
 */
@Controller
public class HelloController {

	@RequestMapping(value={"/","index"},method=RequestMethod.GET)
	public ModelAndView homePage()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("message", "This is Hello World Message From Spring Technology.");
		model.setViewName("index");
		return model;
	}
	
}
