<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>CodePeace</title>
    <link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="../css/common/common.css">
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div>${error}</div>
    <label>用户名:</label>
    <input type="text" name="username"><br>
    <label>密码:</label>
    <input type="text" name="password"><br>
    <input type="submit" value="登录">
    <a href="static/jsp/register.jsp">注册</a>
</form>
</body>
<script>

</script>
</html>
