<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-05-07
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Customer</title>
  </head>
  <body>
  <h1>    Danh sach khach hang</h1>
  <form>
    <table>
      <tr>
        <td width="150px">Ten</td>
        <td width="150px">Ngay sinh</td>
        <td width="150px">Dia chi</td>
      </tr>
<c:forEach items="customer" var="cus">
  <tr></tr>
  <tr></tr>
  <tr></tr>
</c:forEach>
    </table>
  </form>
  </body>
</html>
