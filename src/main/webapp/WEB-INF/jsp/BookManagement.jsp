<%--
  Created by IntelliJ IDEA.
  User: llove
  Date: 2020/1/9
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>图书管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css">
    <script src="/js/BookManagement.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="foot">
    <div class="footleft">
        图书信息列表
        <table>
            <tr>
                <th>书名</th>
                <th>作者</th>
                <th>类型</th>
                <th>售价</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${bookinfo}" varStatus="i" var="item">
                <tr>
                    <td>${item.BTitle}</td>
                    <td>${item.BAuthor}</td>
                    <td>${item.BCategoryID}</td>
                    <td>${item.BPrice}</td>
                    <td>
                        <button type="button" onclick="deletebookinfo(${item.BID})">删除</button>
                        <button type="button">编辑</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="footright">
        <h3>添加图书信息</h3><br>
        <form id="bookinfo">
            图书书名:<input type="text" name="BTitle"><br>
            图书作者:<input type="text" name="BAuthor"><br>
            图书分类:
            <select name="BCategoryID">
                <c:forEach items="${bookzl}" varStatus="i" var="item">
                    <option value="${item.CID}">${item.CName}</option>
                </c:forEach>
            </select><br>
            图书售价:<input type="number" name="BPrice"><br>
            图书出版社:<input type="text" name="BPublisher"><br>
            图书图片:<input type="file" name="BPhoto"><br>
            <input type="button" value="保存" onclick="addbookinfo()">
        </form>
    </div>
</div>
</body>
</html>
