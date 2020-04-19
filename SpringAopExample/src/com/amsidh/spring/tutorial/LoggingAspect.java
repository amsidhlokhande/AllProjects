package com.amsidh.spring.tutorial;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	/*@Before("execution(public String get*())")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before Getter logging aspect executed..");
	}
	
	@Before("execution(public void setName(..))")
	public void beforeLoggingAdviceForAllSetter()
	{
		System.out.println("Before Setter logging aspect executed..");
	}*/
	
	/*@Before("execution(public * get*())")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before Getter logging aspect executed..");
	}
	
	@Before("execution(* setName(..))")
	public void beforeLoggingAdviceForAllSetter()
	{
		System.out.println("Before Setter logging aspect executed..");
	}*/
	
	/*@Before("execution(public * com.amsidh.spring.tutorial.Circle.get*())")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before Getter logging aspect executed..");
	}
	
	@Before("execution(* com.amsidh.spring.tutorial.Triangle.setName(..))")
	public void beforeLoggingAdviceForAllSetter()
	{
		System.out.println("Before Setter logging aspect executed..");
	}*/
	
	/*@Before("allCircleMethod()")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before adivce is executed ");
	}
	
	@Pointcut("execution(* com.amsidh.spring.tutorial.Circle.*(..))")
	public void allCircleMethod(){}
	*/
	
	/*@Before("allCircleMethod()")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before adivce is executed ");
	}
	
	@Pointcut("within(com.amsidh.spring.tutorial.Circle)")
	public void allCircleMethod(){}*/
	
	/*@Before("allMethodsInPackage()")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before adivce is executed ");
	}
	
	@Pointcut("within(com.amsidh.spring.tutorial.*)")
	public void allMethodsInPackage(){}
	*/
	
	/*@Before("allMethodsInPackage()")
	public void beforeLoggingAdviceForAllGetter()
	{
		System.out.println("Before adivce is executed ");
	}
	
	@Pointcut("within(com.amsidh.spring..*)")
	public void allMethodsInPackage(){}
	*/
	
/*
	@Before("args(String)")
	public void beforeLoggingAdviceForAMethodWhichTakeStringAsParameter()
	{
		System.out.println("Before adivce is executed ");
	}
	*/
	
	/*@Before("allMethodsInPackage()")
	public void beforeLoggingAdvice(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.toString()+ " called.");
	}
	
	@Pointcut("within(com.amsidh.spring.tutorial.Circle)")
	public void allMethodsInPackage(){}
	*/
	
	/*@Before("allMethodsInPackage()")
	public void beforeLoggingAdvice(JoinPoint joinPoint)
	{
		Circle circle=(Circle)joinPoint.getTarget();
		System.out.println(circle.getName()+ " called.");
	}
	
	@Pointcut("within(com.amsidh.spring.tutorial.Circle)")
	public void allMethodsInPackage(){}*/
	
	/*@Before("args(String)")
	public void beforeLoggingAdvice()
	{
		System.out.println("The method which takes string as parameter is called.");
	}
   */
	
	/*@Before("args(name)")
	public void beforeLoggingAdvice(String name)
	{
		System.out.println("Before advice called.Paramater Name:"+name);
	}
	
*/
	
	/*@AfterReturning("args(name)")
	public void afterSuccessfullyReturnLoggingAdvice(String name)
	{
		System.out.println("After successfully execute a method advice called.Paramater Name:"+name);
	}
	
	@AfterThrowing("args(name)")
	public void afterThrowingLoggingAdvice(String name)
	{
		System.out.println("After Throwing exception advice called");
	}
	
	@After("args(name)")
	public void afterLoggingAdvice(String name)
	{
		System.out.println("After advice called.Paramater Name:"+name);
	}
*/
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void afterSuccessfullyReturnLoggingAdvice(String name,String returnString)
	{
		System.out.println("After successfully execute a method advice called.Paramater Name:"+name);
		System.out.println("After return the value of parametere: "+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void afterThrowingLoggingAdvice(String name,RuntimeException ex)
	{
		System.out.println("After Throwing exception advice called");
		System.out.println("Exception Value: "+ex);
	}
	
	@After("args(name)")
	public void afterLoggingAdvice(String name)
	{
		System.out.println("After advice called.Paramater Name:"+name);
	}

	
}
