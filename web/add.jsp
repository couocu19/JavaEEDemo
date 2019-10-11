<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/4
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addPage</title>
</head>
<body>
<h1>录入朋友信息</h1>
<form action="/Demo_war_exploded/AddServlet" method="post">
    姓名:<input type="text" name="name"><br>
    城市:<input type="text" name="locate"><br>
    联系电话:<input type="text" name="phonenum"><br>
    <input type="submit" name="点击录入">
</form>
</body>
</html>
