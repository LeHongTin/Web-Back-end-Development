<%@ page import="javafx.scene.control.DialogPane" %>
<%@ page import="sun.rmi.server.Dispatcher" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-03
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    float amount = Float.parseFloat(request.getParameter("rate"));
    float result=0;
    String fromCurrency = request.getParameter("fromCurrency");
    String toCurrency = request.getParameter("toCurrency");
    if(fromCurrency.equals("VND") && toCurrency.equals("USD")) {
        result = amount / 23000;
        out.println(result);
    }

    if(fromCurrency.equals("USD") && toCurrency.equals("VND")) {
        result = amount * 23000;
        out.println(result);
    }
    Dispatcher dispatcher= (Dispatcher) request.getRequestDispatcher("index.jsp");

%>
</body>
</html>
