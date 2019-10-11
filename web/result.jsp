<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/5
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>showResultPage</title>
</head>
<body>
<table border="2">
    <tr>
        <td>姓名</td>
        <td>城市</td>
        <td>联系电话</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="f">
        <tr>
            <td>${f.name}</td>
            <td>${f.location}</td>
            <td>${f.phoneNum}</td>
        </tr>

    </c:forEach>
    <br>
</table>

<form action="/Demo_war_exploded/ListServlet" method="">
    <input type="submit" value="返回主列表">
</form>
<form action="search.jsp" method="">
    <input type="submit" value="返回上一级">
</form>





</body>
</html>
