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
    <link type="text/css" rel="stylesheet" href="/static/css/common/common.css">
</head>
<body>
<%@include file="/static/jsp/moudle/header.jsp" %>
<form action="${pageContext.request.contextPath}/register" method="post">
    <label>用户名:</label>
    <input type="text" name="username"><span>${error}</span><br>
    <label>密码:</label>
    <input type="text" name="password"><br>
    <input type="submit" value="注册">
</form>
<%@include file="/static/jsp/moudle/footer.jsp" %>
</body>
</html>
