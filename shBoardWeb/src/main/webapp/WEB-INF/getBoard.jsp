<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>    
<%@ page import="com.springbook.biz.board.BoardVO" %>    
<%@ page contentType="text/html; charset=EUC-KR"%>

<%

//1. �˻��� �Խñ� ��ȣ ����
String seq = request.getParameter("seq");

// 2.DB ���� ó��
BoardVO vo = new BoardVO();
vo.setSeq(Integer.parseInt(seq));

BoardDAO boardDAO = new BoardDAO();
BoardVO board = boardDAO.getBoard(vo);

// 3. ���� ȭ��

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>