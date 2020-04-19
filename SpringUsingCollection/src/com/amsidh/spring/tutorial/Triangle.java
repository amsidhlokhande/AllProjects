package com.amsidh.spring.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	private List<Point> listOfPoints=new ArrayList<Point>();
	
	
	public List<Point> getListOfPoints() {
		return listOfPoints;
	}


	public void setListOfPoints(List<Point> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}


	public void draw()
	{
		for (Point point : listOfPoints) {
			System.out.println("Point ("+point.getX()+","+point.getY()+")");
		}
	}
}
