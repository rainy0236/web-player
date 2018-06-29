<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录</title>
</head>
<body>
<form action="login.action" method="post">
用户名：<input type="text" name="loginName" value=""/><br/>
密码：<input type="password" name="password" value=""/><br/>
<input type="submit" value="登录"/>
</form>
<%
String isSuccess = request.getAttribute("isSuccess").toString();
%>
<script>
alert(<%=isSuccess %>);
</script>
</body>
</html>