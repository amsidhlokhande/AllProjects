package com.amsidh.spring.tutorial.service;

import com.amsidh.EmployeeProxy;
import com.amsidh.spring.tutorial.domain.Circle;

public class FactoryService {

	public Object getBean(String name) {
		if (name.equals("employee")) {
			return new EmployeeProxy();
		}
		if (name.equals("circle")) {
			return new Circle();
		}

		return null;
	}
}
