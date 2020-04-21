<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/3 0003
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试</a>
    <form action="account/saveAccount" method="post">
        名字：<input type="text" name="name">
        密码：<input type="text" name="password">
        金额：<input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
