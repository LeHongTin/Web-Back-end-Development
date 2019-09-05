<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-10
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Email Validation</title>
  </head>
  <body>
  <h1>Email Validation</h1>
  <h3 style="color: red">${message}</h3>

  <form action="/validate" method="post">
    <input type="text" name="email">
    <input type="submit" value="validate">
  </form>
  </body>

</html>
