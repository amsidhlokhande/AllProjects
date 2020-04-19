package com.amsidh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.amsidh.messanger.Message;

@Aspect
public class LoggerAsspectJ
{
	/*
	 * @Before("execution(public void display())") public void beforeMessage() {
	 * System.out.println("This is before message"); }
	 * 
	 * @After("execution(public void display())") public void afterMessage() {
	 * System.out.println("This is after message"); }
	 * 
	 * @Around("execution(public void display())") public void aroundMessage() {
	 * System.out.println("This is around message"); }
	 */

	@Before("execution(public void com.amsidh.messanger.Message.dis*())")
	public void getTargetObject(JoinPoint joinPoint)
	{
		System.out.println("Get the Calling method Details:" + joinPoint.toString());
		// Get the Object of a class whose method is triggered.
		Message message = (Message) joinPoint.getTarget();
		if (message.flag == false)
		{
			message.init();
		}
	}

}
