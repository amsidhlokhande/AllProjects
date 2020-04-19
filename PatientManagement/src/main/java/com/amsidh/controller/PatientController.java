package com.amsidh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amsidh.beans.Patient;
import com.amsidh.service.PatientService;

@Controller
@RequestMapping(value = "/patient")
public class PatientController
{
	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome(ModelAndView modelAndView)
	{
		modelAndView = new ModelAndView("patient", "patient", new Patient());
		// modelAndView.addObject("patient", new Patient());
		modelAndView.addObject("listOfPatient", patientService.getAllPatient());
		return modelAndView;
	}


}
