<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-03
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <form action="converter.jsp" method="post">
    <h1>Currency Converter</h1>
    <p>Amount :</p>
    <input type="number" name = "rate" value = "0">
    <p>From Currency : </p>
    <select name="fromCurrency">
      <option name = "VND" value="VND">Viet Nam</option>
      <option name = "USD" value="USD">USD</option>
    </select>
    <p>To Currency : </p>
    <select name="toCurrency">
      <option name = "USD" value="USD">USD</option>
      <option name="VND" value="VND">VND</option>
    </select>
    <p><input type="submit" name = "submit" value="converter"><p>
    <input type="text" name="result">
  </form>
  </body>
</html>
