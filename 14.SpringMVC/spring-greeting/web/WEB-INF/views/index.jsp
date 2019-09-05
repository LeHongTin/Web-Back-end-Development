<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-07
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Greeting</title>
  </head>
  <body>
  <form action="/greeting" method="post">
    <input type="text" name="name">
  </form>
  <h1>Hello : ${name} </h1>
  </body>
</html>
