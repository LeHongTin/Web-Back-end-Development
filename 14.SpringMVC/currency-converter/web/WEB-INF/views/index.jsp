<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-07
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h1>Currency Converter</h1>
  <form action="/translate" method="post">
    <p><label>Rate: </label><br/></p>
    <p><input type="text" name="rate" placeholder="RATE" value="22000"/><br/></p>
    <p><label>USD: </label><br/></p>
    <p><input type="number" name="usd" placeholder="USD" value="0"/><br/></p>
    <p><input type = "submit" id = "submit" value = "Converter"/></p>
    <p>Result : ${vnd} vnd</p>
  </form>
  </body>
</html>
