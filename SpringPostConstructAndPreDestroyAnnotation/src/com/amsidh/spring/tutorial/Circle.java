package com.amsidh.spring.tutorial;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {

	@Autowired
	@Resource(name="pointC")
	private Point centerPoint;

	public Point getCenterPoint() {
		return centerPoint;
	}
	

	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}


	@Override
	public void draw() {
		System.out.println("Circle center point (" + centerPoint.getX() + " , "
				+ centerPoint.getY() + " )");

	}

	@PostConstruct
	public void initCircle()
	{
		System.out.println("Init Circle is callled");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy Circle caledd");
	}
	
}
