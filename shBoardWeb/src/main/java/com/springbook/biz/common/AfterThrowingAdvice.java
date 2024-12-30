package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {

	/*
	 * public void exceptionLog() {
	 * System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생"); }
	 */
	
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[예외 처리] : " + method + "() 메소드 수행 중 발생한 예외 메시지 : " + exceptObj.getMessage());
	}
}
