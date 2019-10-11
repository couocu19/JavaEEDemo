<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/5
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>allListPage</title>
</head>
<body>

<c:if test="${requestScope.isNull != null}">
    你的通讯录里暂时还没有朋友,快去添加吧~<br>
    <%
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    %>
</c:if>
<table border="2">
    <tr>
        <td>姓名</td>
        <td>城市</td>
        <td>联系电话</td>
        <td>选择操作</td>
    </tr>
    <c:forEach items="${friends}" var="f">
        <tr>
            <td>${f.name}</td>
            <td>${f.location}</td>
            <td>${f.phoneNum}</td>
            <td><a href="<c:url value="delete?id=${f.id}"/>">删除</a>
                /<a href="<c:url value="update?id=${f.id}"/>">修改</a></td>
        </tr>

    </c:forEach>
    <br>
</table>

<form action="<c:url value="add.jsp"/>" method="">
    <input type="submit" value="添加">

</form>
<form action="<c:url value="search.jsp"/>" method="">
    <input type="submit" value="查找">

</form>
</body>
</html>
