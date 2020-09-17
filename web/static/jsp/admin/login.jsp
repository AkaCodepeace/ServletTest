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
    <link rel="stylesheet" type="text/css" href="/static/css/show/common/common.css">
    <link rel="stylesheet" type="text/css" href="/static/css/show/page/login.css">
</head>
<body>
<div class="container">
    <%@include file="/static/jsp/moudle/header.jsp" %>
    <div class="main login">
        <div class="login_main">
            <div>
                <form action="${pageContext.request.contextPath}/login" method="post">
                    <div>登录</div>
                    <div>${error}</div>
                    <div>
                        <label>用户名:</label>
                        <input type="text" name="username"><br>
                    </div>
                    <div>
                        <label>密&nbsp码:</label>
                        <input type="text" name="password"><br>
                    </div>
                    <div>
                        <input type="submit" value="登录">
                        <a href="static/jsp/admin/register.jsp">注册</a>
                    </div>

                </form>
            </div>
        </div>
    </div>
    <%@include file="/static/jsp/moudle/footer.jsp" %>
</div>

</body>
<script>

</script>
</html>
