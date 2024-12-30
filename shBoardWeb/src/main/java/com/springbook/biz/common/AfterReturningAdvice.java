package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	/*
	 * public void afterLog() { System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ����"); }
	 */
	
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			System.out.println(user.getName() + " �α���(Admin");
		}
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���� �� : " + returnObj.toString());
	}
}
