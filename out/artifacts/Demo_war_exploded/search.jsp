<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/4
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>searchPage</title>
</head>
<body>
<h1>查找你的朋友</h1>
请输入待查找朋友的相关信息(姓名/城市/电话)~<br>

<form action="/Demo_war_exploded/search" method="post">
<input type="text" name="info"><br>
    <input type="submit" value="点击查找">
</form>

</body>
</html>
