package com.amsidh.spring.tutorial;

import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent{

	public MyCustomEvent(Object source) {
		super(source);
		
	}

	public String toString()
	{
		return "MyCustomEvent occured";
	}
}
