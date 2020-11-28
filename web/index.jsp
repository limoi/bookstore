<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/4
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login Page</title>
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body>
<form action="firstServlet.do"method="post">
  学号：<input name="num" type="text"><br>
  姓名：<input name="name" type="text"><br>
  <input type="submit" value="登录">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <input type="reset" value="取消">
</form>
</body>
</html>
