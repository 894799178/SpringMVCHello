<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/5 0005
  Time: 上午 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h4>--->${requestScope.user.userName}</h4>
        <h4>--->${requestScope.user.password}</h4>

        <h4>${sessionScope.user.userName}</h4>
        <h4>${sessionScope.user.password}</h4>
</body>
</html>
