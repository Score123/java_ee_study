<%--
  Created by IntelliJ IDEA.
  User: cll
  Date: 2018/4/20
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
    <body>
        <form action="${pageContext.request.contextPath}/register" method="post">
            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            生日：<input type="text" name="birthday"><br>
            爱好：<input type="checkbox" name="hobby" value="ss">ss
                <input type="checkbox" name="hobby" value="听歌">听歌
                <input type="checkbox" name="hobby" value="写代码">写代码<br>
            已婚：<input type="checkbox" name="married" value="true"><br>
            <input type="submit" value="注册"/><br>
        </form>
    </body>
</html>
