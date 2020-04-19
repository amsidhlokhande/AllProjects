package com.amsidh;

import com.amsidh.spring.tutorial.aspects.LoggableAspect;
import com.amsidh.spring.tutorial.domain.Employee;

public class EmployeeProxy extends Employee{

	public String getEmployeeName() {
		new LoggableAspect().beforeLogAdvice();
		return super.getEmployeeName();
	}
	
}
