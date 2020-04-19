/**
 * 
 */
package com.amsidh.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author VIRU
 * 
 */

public class LoggingAspect {

	public Object loggingAdviceForCircle(ProceedingJoinPoint pjp)
			throws Throwable {

		System.out.println("Entering " + pjp.getSignature());
		Object returnValue = pjp.proceed();
		System.out.println("Exiting " + pjp.getSignature());
		return returnValue;
	}

	public Object loggingAdviceForTriangle(ProceedingJoinPoint pjp)
			throws Throwable {

		System.out.println("Entering " + pjp.getSignature());
		Object returnValue = pjp.proceed();
		System.out.println("Exiting " + pjp.getSignature());
		return returnValue;
	}

	public void allGetters() {
	}

	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before method Executed");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Method Executed....");
		} catch (Throwable e) {
			System.out.println("Around Advice throws exception");
		}
		System.out.println("After Finally executed........");

		return returnValue;
	}
}
