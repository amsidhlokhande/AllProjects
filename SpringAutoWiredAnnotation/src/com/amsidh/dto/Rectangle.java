package com.amsidh.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.amsidh.intf.Shape;

@Component
public class Rectangle implements Shape ,DisposableBean,InitializingBean{

	private Point pointA;

	private Point pointB;
    
	@Resource
	private Point pointC;

	private Point pointD;

	@Autowired
	public Rectangle(Point pointA, Point pointB, Point pointC,@Qualifier("pointB") Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
		System.out.println("Rectangle is initilized..");
	}

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}

	/**
	 * @return the pointD
	 */
	public Point getPointD() {
		return pointD;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.intf.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle with below Details");
		System.out.println("A( " + pointA.getX() + " , " + pointA.getY() + ")");
		System.out.println("B( " + pointB.getX() + " , " + pointB.getY() + ")");
		System.out.println("C( " + pointC.getX() + " , " + pointC.getY() + ")");
		System.out.println("D( " + pointD.getX() + " , " + pointD.getY() + ")");

	}

	@PostConstruct
	public void AfterInitilizing()
	{
		System.out.println("After Initilizing the Rectangle");
	}
	
	@PostConstruct
	public void AfterInitilizing2()
	{
		System.out.println("After Initilizing the Rectangle 2");
	}
	
	@PreDestroy
	public void preDestoryTriangle()
	{
		System.out.println("Before removing the Rectangle.");
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("Rectangle is Removed.");
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initilising the Rectangle second time");
		
	}
 
	
  	
}
