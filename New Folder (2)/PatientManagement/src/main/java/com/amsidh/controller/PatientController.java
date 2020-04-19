package com.amsidh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/operation.do", method = RequestMethod.POST)
	public String operations(@ModelAttribute Patient patient, BindingResult result,
			@RequestParam(value = "myAction") String actions,ModelMap model)
	{
		Patient resultPatient = new Patient();
		if (actions.equals("Add"))
		{
			patientService.addPatient(patient);
		}
		if (actions.equals("Delete"))
		{
			patientService.removePatient(patient.getPatId());
		}
		if (actions.equals("Update"))
		{
			patientService.updatePatient(patient);
		}

		if (actions.equals("Search"))
		{
			Patient searchPatient = patientService.searchPatient(patient.getPatId());
			resultPatient = searchPatient != null ? searchPatient : new Patient();
			model.addAttribute("patient",resultPatient);
			model.addAttribute("listOfPatient", patientService.getAllPatient());
			return "patient";
			
		}
		
		return "redirect:/patient/welcome";
	}

}
