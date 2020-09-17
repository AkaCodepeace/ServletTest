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
    <link type="text/css" rel="stylesheet" href="/static/css/show/common/common.css">
    <link type="text/css" rel="stylesheet" href="/static/css/show/page/register.css">
</head>
<body>
<div class="container">
    <%@include file="/static/jsp/moudle/header.jsp" %>
    <div class="main register">
        <div class="register_main">
            <div>
                <form action="${pageContext.request.contextPath}/register" method="post">
                    <div>注册</div>
                    <div>
                        <label>用户名:</label>
                        <input type="text" name="username"><span>${error}</span>
                    </div>
                    <div>
                        <label>密&nbsp码:</label>
                        <input type="text" name="password"><br>
                    </div>
                    <div>
                        <input type="submit" value="注册">
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%@include file="/static/jsp/moudle/footer.jsp" %>
</div>

</body>
</html>
