package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL ��ɾ��
	private final String USER_GET = "select * from users where id=? and password=?";
	
	

}
