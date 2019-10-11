<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/4
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>showPage</title>
</head>
<body>
<h1>欢迎进入你的通讯录</h1><br>
请选择要进行的操作<br>
<form action="/Demo_war_exploded/ChooseServlet" method="post">
    <input type="submit" name="choose" value="查看所有朋友列表"><br>
    <input type="submit" name="choose" value="添加朋友"><br>
    <input type="submit" name="choose" value="退出">
</form>


</body>
</html>
