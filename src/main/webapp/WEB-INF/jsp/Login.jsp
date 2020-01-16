<%--
  Created by IntelliJ IDEA.
  User: llove
  Date: 2020/1/9
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>图书网后台管理系统</h1>
<h3>用户登录</h3>
<form action="/login" method="post">
    登录账户：<input type="text" name="user"><br>
    登录密码：<input type="password" name="password"><br>
    <input type="radio">记住账户和密码<br>
    <input type="submit" value="登录">
</form>
</body>
</html>
