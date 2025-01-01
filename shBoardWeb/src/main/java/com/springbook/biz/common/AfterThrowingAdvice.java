package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {

	/*
	 * public void exceptionLog() {
	 * System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ���� �߻�"); }
	 */
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {
		
	}
	
	@AfterThrowing(pointcut="allPointcut()", throwing="excepObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[���� ó��] : " + method + "() �޼ҵ� ���� �� �߻��� ���� �޽��� : " + exceptObj.getMessage());
	}
}
