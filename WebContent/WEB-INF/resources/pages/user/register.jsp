<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="register.action" method="post">
	用户名：<input type="text" name="userName" value=""/><br/>
	账号：<input type="text" name="loginName" value=""/><br/>
	密码：<input type="text" name="password" value=""/><br/>
	确认密码：<input type="text" name="password" value=""/><br/>
	性别：<input type="radio" name="sex" value="1" checked/>男<input type="radio" name="sex" value="0"/>女<br/>
	邮箱：<input type="text" name="email" value=""/><br/>
	手机：<input type="text" name="phone" value=""/><br/>
	头像：<input type="text" name="photoUrl" value=""/><br/>
	<input type="submit" value="jSubmit" />
</form>
</body>
</html>