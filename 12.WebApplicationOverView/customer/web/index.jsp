<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-06
  Time: 09:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Customer</title>
  </head>
  <body>

  <h1>          Danh Sách Khách Hàng        </h1>s
  <table>
    <tr>
      <td width="200px">Ten</td>
      <td width="150px">Dia chi</td>
      <td width="150px">Ngay sinh</td>
    </tr>
    <c:forEach items="${customers}" var="cus">
      <tr>
        <td width="200px">${cus.name}</td>
        <td width="150px">${cus.address}</td>
        <td width="150px">${cus.birthday}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
