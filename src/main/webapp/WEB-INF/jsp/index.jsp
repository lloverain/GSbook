<%--
  Created by IntelliJ IDEA.
  User: llove
  Date: 2020/1/9
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css">
    <script src="/js/zhuye.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>

<div class="foot">
    <div class="footleft">
        图书分类
        <table>
            <tr>
                <th>图书分类</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${bookzl}" varStatus="i" var="item">
                <tr>
                    <td>${item.CName}</td>
                    <td><button type="button" onclick="deletebookzl(${item.CID})">删除</button></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="footright">
        <h3>添加分类信息</h3><br>
        分类名称:<input type="text" id="bookzl"><button type="button" onclick="baocun()">保存</button>
    </div>
</div>
</body>
</html>