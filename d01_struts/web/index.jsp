<%--
  Created by IntelliJ IDEA.
  User: cll
  Date: 2018/4/19
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>jsp 标题struts复习</title>
</head>
  <body>
    $END$
    <a href="${pageContext.request.contextPath}/hello.action">let me see</a>
    asassaas
    s<<a href="www">sds</a>
    <a href="${pageContext.request.contextPath}/hello.do">let me see do</a>

    <br>
    <a href="${pageContext.request.contextPath}/action1">默认方法</a><br>

    <<a href="${pageContext.request.contextPath}/addUser">增加用户名</a>
    没有封装：<<br>
    <form action="${pageContext.request.contextPath}/registerUser" method="post">
      <%-- 字段名和属性要保持一致 --%>
      用户名：<input type="text" name="name"/><br>
      年龄：<input type="text" name="age"/><br>
      <input type="submit" value="注册"/>
    </form>
    User封装：<br>
    <form action="${pageContext.request.contextPath}/registerUser2" method="post">
      用户名：<input type="text" name="user.name" /><br>
      年龄：<<input type="test" name="user.age" /><br>
      <input type="submit" value="注册"><br>
    </form>

    使用模型驱动：<br>
    <form action="${pageContext.request.contextPath}/registerUser3">
      <%-- 字段名和属性要保持一致 --%>
      用户名：<input type="text" name="name"/><br>
      年龄：<input type="text" name="age"/><br>
      <input type="submit" value="注册"/>
    </form>
  </body>
</html>
