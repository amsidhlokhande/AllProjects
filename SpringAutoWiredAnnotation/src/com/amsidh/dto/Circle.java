package com.amsidh.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.amsidh.intf.Shape;
@Component
public class Circle implements Shape {
	
	private Point centerPoint;

	@Autowired
	public Circle(@Qualifier("pointC") Point centerPoint)
	{
		this.centerPoint=centerPoint;
	}
	/**
	 * @return the centerPoint
	 */
	public Point getCenterPoint() {
		return centerPoint;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.intf.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drwaing Circle with the center point ("
				+ centerPoint.getX() + " , " + centerPoint.getY()+")");

	}

}
