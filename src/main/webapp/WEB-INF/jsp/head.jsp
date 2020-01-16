<%--
  Created by IntelliJ IDEA.
  User: llove
  Date: 2020/1/9
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/head.css">
    <script src="/js/head.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<div class="head">${sessionScope.name},你好！<a href="/loginout">登出</a></div>
<div class="content">
    <a href="/zhuye">首页</a>
    <a href="/index">图书分类管理</a>
    <a href="/bookmanagement">图书管理</a>
    <a>购书订单管理</a>
</div>
</body>
</html>
