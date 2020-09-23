
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        nav li:nth-child(1){
            background: #383838;
        }
    </style>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/static/css/admin/common/adminCommon.css">
    <link rel="stylesheet" type="text/css" href="/static/css/admin/common/table.css">
    <script type="text/javascript" src="/static/jq/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" src="/static/js/admin/common.js"></script>
</head>
<body>

<div class="container">
    <%@include file="/static/jsp/admin/moudle/adminHeader.jsp"%>
    <div>
        <%@include file="/static/jsp/admin/moudle/adminNav.jsp"%>
        <div class="main_right">
            <div >
                <div class="manage">
                    <div class="search">
                        <input type="text">
                        <input type="button" value="查询">
                        <input type="button" value="创作博客">
                    </div>
                    <div class="blog_table">
                        <table cellpadding="0" cellspacing="0">
                            <tr>
                                <th>标题</th>
                                <th>操作</th>
                            </tr>
                            <tr>
                                <td>JAVA编程思想</td>
                                <td>
                                    <input type="button" value="修改">
                                    <input type="button" value="删除">
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%@include file="/static/jsp/admin/moudle/adminFooter.jsp"%>
</div>

</body>
</html>
