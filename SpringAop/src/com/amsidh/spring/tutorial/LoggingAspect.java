package com.amsidh.spring.tutorial;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("drawMethodOfShape()")
	public void loggingAdviceAllDrawMethod() {
		System.out.println("Advice run for all draw() method");
	}

	@Pointcut("execution(public void draw())")
	public void drawMethodOfShape() {
	}
	/*
	@Before("pointCutForAllSetter()")
	public void loggingAdviceForAllSetter() {
		System.out.println("Advice run for setter(..) method");
	}

	@Pointcut("execution(public void set*(..))")
	public void pointCutForAllSetter() {
	}

	@Before("pointCutForGetter()")
	public void loggingBeforeAdviceForGetter() {
		System.out.println("Advice run for point getter() method");
	}
*/
	/*@Pointcut("execution(public * com.amsidh.spring.tutorial.Triangle.get*())")
	public void pointCutForGetter() {
	}
	*/
	
/*	@After("pointCutForGetter()")
	public void loggingAfterAdviceForGetter()
	{
		System.out.println("After advice run for getter method");
	}
*/
	
	/*@Around("pointCutForGetter()")
	public Object loggingAroundAdviceForGetter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		
		Object obj=null;
		System.out.println("Around advice Before getter method");
		obj=proceedingJoinPoint.proceed();
		System.out.println("Around advice After getter method");
		return obj;
	}
	*/
	
}
