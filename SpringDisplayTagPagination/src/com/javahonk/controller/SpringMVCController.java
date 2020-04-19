package com.javahonk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringMVCController {

    @RequestMapping(value = "/paginationDisplayTag.web", method = 
            RequestMethod.GET)
    public String printWelcome(@ModelAttribute("person") 
    Person person,BindingResult result, ModelMap model, 
    HttpServletRequest request,
            HttpServletResponse response) {

	List<Person> personsList = new ArrayList<Person>();
        for (int i = 0; i < 25; i++) {
            Person person2 = new Person();
            person2.setName("John Landy");
            person2.setPosition("System Architect");
            person2.setSalary("$320,800");
            person2.setLocation("NY");
            person2.setPhone("999999999");
            personsList.add(person2);  
            
            person2 = new Person();
            person2.setName("Igor Chunky");
            person2.setPosition("Solution Architect");
            person2.setSalary("$340,800");
            person2.setLocation("NY");
            person2.setPhone("987897899");
            personsList.add(person2); 
            
            person2 = new Person();
            person2.setName("Manish Malhotra");
            person2.setPosition("Sr. Solution Architect");
            person2.setSalary("$380,800");
            person2.setLocation("CT");
            person2.setPhone("1234567890");
            personsList.add(person2); 
            
            person2 = new Person();
            person2.setName("Ramesh Sikka");
            person2.setPosition("Sr. Architect");
            person2.setSalary("$310,800");
            person2.setLocation("CA");
            person2.setPhone("4654321234");
            personsList.add(person2); 
            
            person2 = new Person();
            person2.setName("Bob Sidebottom");
            person2.setPosition("Architect");
            person2.setSalary("$300,800");
            person2.setLocation("NJ");
            person2.setPhone("9876543212");
	}
        
        person.setPersonList(personsList);
        return "paginationDisplayTag";

    }

 
}