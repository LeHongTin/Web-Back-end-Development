<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-13
  Time: 08:56
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="get">
    <input type="hidden" name="condiment">
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    <p><input type="submit" value="save"></p>
</form>
<c:forEach items ="${condiment}" var="cond">
    <tr>${cond}</tr>
</c:forEach>
</body>
</html>
