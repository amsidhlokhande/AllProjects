package com.amsidh.spring.tutorial;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	
	public void draw()
	{
		System.out.println("Triangle drawn!!!!");
		MyCustomEvent customEvent=new MyCustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher=applicationEventPublisher;
	}
}
