<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-03
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
  dic.put("hello","xinchao");
  dic.put("red","do");
  dic.put("how","the nao");
  dic.put("what","cai gi");
  dic.put("book","sach");
  dic.put("computer","may tinh");
  dic.put("book","sách");
  dic.put("boy","con trai");

  String search = request.getParameter("keyWord");

  String result = dic.get(search);
    if (result != null) {
        out.println("Word: " + search);
        out.println("Result: " + result);
    } else {
        out.println("Not found");
    }

%>

</body>
</html>