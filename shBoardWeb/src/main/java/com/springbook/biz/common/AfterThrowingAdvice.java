package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {

	/*
	 * public void exceptionLog() {
	 * System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ���� �߻�"); }
	 */
	
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[���� ó��] : " + method + "() �޼ҵ� ���� �� �߻��� ���� �޽��� : " + exceptObj.getMessage());
	}
}
