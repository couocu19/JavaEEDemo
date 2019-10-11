<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/4
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>updatePage</title>
</head>
<body>

<h1>修改朋友信息</h1>
你可以开始修改啦！<br>

<form action="/Demo_war_exploded/AfterUpdateServlet" method="post">
    <input type="hidden" name="id" value="${friend.id}"><br>
    姓名: <input type="text" name="name" value="${friend.name}"><br>
    城市:<input type="text" name="locate" value="${friend.location}"><br>
    联系电话: <input type="text" name="phone" value="${friend.phoneNum}"> <br>
    <input type="submit" value="更新信息">
</form>



</body>
</html>
