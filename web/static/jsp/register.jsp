<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/1
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CodePeace</title>
    <link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon" />
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">
    <label>用户名:</label>
    <input type="text" name="username"><span>${error}</span><br>
    <label>密码:</label>
    <input type="text" name="password"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
