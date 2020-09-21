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
    <link rel="stylesheet" type="text/css" href="/static/css/admin/common/admincommon.css">
    <link rel="stylesheet" type="text/css" href="/static/css/admin/page/admin.css">
</head>
<body>

<div class="container">
    <%@include file="/static/jsp/admin/moudle/adminheader.jsp"%>
    <div>
        <%@include file="/static/jsp/admin/moudle/adminnav.jsp"%>
        <div class="main_right">
            <div >
                <div class="blog_manage">
                    <div class="blog_search">
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
    <%@include file="/static/jsp/admin/moudle/adminfooter.jsp"%>
</div>

</body>
</html>
