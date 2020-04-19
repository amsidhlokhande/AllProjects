package com.amsidh.spring.tutorial.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggableAspect {

	@Before("@annotation(com.amsidh.spring.tutorial.annotations.Loggable)")
	public void beforeLoggableAnnotationAdvice(JoinPoint joinPoint)
	{
		
		System.out.println("Before custom loggable annotation advice called"+joinPoint);
	}
	

}
