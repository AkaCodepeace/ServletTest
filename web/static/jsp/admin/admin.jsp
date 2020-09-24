<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/19
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        nav li:nth-child(1){
            background: #484848;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/static/css/admin/common/adminCommon.css">
    <link rel="stylesheet" type="text/css" href="/static/css/admin/common/table.css">
    <script type="text/javascript" src="/static/jq/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" src="/static/js/admin/admin.js"></script>
    <script type="text/javascript" src="/static/js/admin/common.js"></script>
</head>
<body>

<div class="container">
    <%@include file="/static/jsp/admin/moudle/adminHeader.jsp"%>
    <div>
        <%@include file="/static/jsp/admin/moudle/adminNav.jsp"%>
        <div class="main_right">
        </div>
    </div>
    <%@include file="/static/jsp/admin/moudle/adminFooter.jsp"%>
</div>

</body>

</html>
