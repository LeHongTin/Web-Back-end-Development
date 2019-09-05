<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-13
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="post">
    <p>
        <input type="number" name="firstNumber">
        <input type="number" name="secondNumber">
    </p>
    <p>
        <input type="submit" name="operator" value="Addition(+)">
        <input type="submit" name="operator" value="Subtraction(-)">
        <input type="submit" name="operator" value="Multiplication(x)">
        <input type="submit" name="operator" value="Division(:)">
    </p>
    <p>
        Result ${operator}: ${result}
    </p>
</form>

</body>
</html>
