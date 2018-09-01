<%--
  Created by IntelliJ IDEA.
  User: renshunyu
  Date: 2018/9/1
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sessionattributes</title>
</head>
<body>
中间页面
${requestScope.get("name")}
${sessionScope.get("name")}
<a href="/address">地址</a>
</body>
</html>
