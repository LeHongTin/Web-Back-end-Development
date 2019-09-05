<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-07
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary Simple</title>
  </head>
  <body>
  <h1>Dictionary Vietnamese</h1>
  <form action="/translate" method="post">
    <input type="text" name="word" placehoder="Enter your work :" value="${word}">
    <input type="submit" value="Search">
    <p>Result: ${vietnamese}</p>
  </form>
  </body>
</html>
