package com.amsidh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	/*
	 * @Before("anyBeforeGetMethodPointCut()") public void
	 * beforeMethodLoggingAdvice() {
	 * System.out.println("Before method logging advice called"); }
	 * 
	 * @Pointcut("execution(public * get*())") public void
	 * anyBeforeGetMethodPointCut() {
	 * 
	 * }
	 * 
	 * 
	 * @After("anyAfterGetMethodPointCut() && anyGetMethodFromPackagePointCut()")
	 * public void afterMethodLoggingAdvice() {
	 * System.out.println("After method logging advice called"); }
	 * 
	 * @Pointcut("execution(public * get*())") public void
	 * anyAfterGetMethodPointCut() {
	 * 
	 * }
	 * 
	 * 
	 * @Pointcut("execution(* com.amsidh.aspect.domain.*.get*())") public void
	 * anyGetMethodFromPackagePointCut() {
	 * 
	 * }
	 * 
	 * @Around("anyGetMethodFromPackagePointCut()") public void
	 * aroundMethodLoggingAdvice() {
	 * System.out.println("Around Method Logging Advice"); }
	 * 
	 * @Pointcut("execution(* * .*(..))") public void anyMehtodAnyPackage() {
	 * 
	 * }
	 * 
	 * @Before("anyMehtodAnyPackage()") public void anyMethodAnyPackageAdvice()
	 * { System.out.println("anyMethodAnyPackageAdvice advice called"); }
	 */

	/*
	 * @After("withinPackage() || withinPackageAndSubPackage() || withinClass()")
	 * public void withinPackageOrClass() {
	 * System.out.println("Within Package or SubPackage or Class advice is called"
	 * ); }
	 * 
	 * @Pointcut("within(com.amsidh.aspect.main.*)") public void
	 * withinPackage(){}
	 * 
	 * @Pointcut("within(com.amsidh..*)") public void
	 * withinPackageAndSubPackage(){}
	 * 
	 * 
	 * @Pointcut("within(com.amsidh.aspect.service.ShapeServiceImpl)") public
	 * void withinClass(){}
	 */

/*	// to know which method is called from the target class called
	@AfterReturning("execution(* com.amsidh.aspect.service.ShapeServiceImpl.*(..))")
	public void AfterGetCircle(JoinPoint joinPoint) {

		System.out.println("After Returning get Circle " + joinPoint);
	}

	// to know from which class the method is called
	@AfterReturning("within(com.amsidh.aspect.service..*)")
	public void toKnowObjectReturnFromMethod(JoinPoint joinPoint) {
		System.out.println("After Returning get Circle "
				+ joinPoint.getTarget());
	}
	
	@AfterReturning("args(String)")
	public void stringTypeParameterMethod()
	{
		System.out.println("stringTypeParameterMethod advice called");
	}
	
	@AfterReturning("args(name)")
	public void toCatchTheStringTypeParameterMethod(String name)
	{
		System.out.println("stringTypeParameterMethod advice called "+name);
	}
*/
	
	/*@After("args(name)")
	public void AfterToCatchTheStringTypeParameterMethod(String name)
	{
		System.out.println("stringTypeParameterMethod advice called "+name);
	}
	*/
	/*@AfterReturning(pointcut="args(name)",returning="returningObject")
	public void stringArgumentMethod(String name,Object returningObject)
	{
	  System.out.println("Taking "+name+" and returning "+ returningObject.toString());	
	}
	*/
	/*
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void stringArgumentMethod(String name,Exception ex)
	{
	  System.out.println("Taking "+name+" and returning "+ ex);	
	}*/
	/*
	@Around("execution(* get*())")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object=null;
		try {
			System.out.println("Before Method");
			object=proceedingJoinPoint.proceed();
			System.out.println("After Method");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Method throws Exception");
			e.printStackTrace();
		}
		return object;
	}*/
	

	@Around("@annotation(com.amsidh.pointcuts.Loggable)")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object=null;
		try {
			System.out.println("Before Method");
			object=proceedingJoinPoint.proceed();
			System.out.println("After Method");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Method throws Exception");
			e.printStackTrace();
		}
		return object;
	}
	
}
