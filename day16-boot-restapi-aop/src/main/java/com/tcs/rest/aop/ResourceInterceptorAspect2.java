package com.tcs.rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.tcs.rest.resource.Product;

import lombok.extern.slf4j.Slf4j;

//@Aspect
//@Component
//@Slf4j
public class ResourceInterceptorAspect2 {
	
	@Pointcut("execution(* com.tcs.rest.resources.*.*(..))")//("execution(com.tcs.rest.resources.ProductResource)")
	public void loggingPointCut() {
		
	}
	
	@AfterReturning(value="execution(* com.tcs.rest.resources.*.*(..))", returning = "product")
	public void afterRet(JoinPoint joinPoint, Product product) {
		//log.info("After Returning method invoked:: " + product);
	}
	
	@AfterThrowing(value="execution(* com.tcs.rest.resources.*.*(..))", throwing = "e")
	public void afterThrow(JoinPoint joinPoint, Exception e) {
		//log.info("After method invoked:: " + e);
	}
	
//	@After("loggingPointCut()")
//	public void after(JoinPoint joinPoint) {
//		log.info("After method invoked:: " + joinPoint.getSignature());
//	}
}
