<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>测试视图跳转</title>
</head>
<body>
<h1>查询所有用户</h1>
<table align="center" cellspacing="0" border="1" style="height:200px;width:150px;">
      <tr>
          <th>name</th>
          <th>age</th>
      </tr>
  <c:forEach items="${userList}" var="user">
      <tr>
          <td>${user.name}</td>
          <td>${user.age}</td>
      </tr>
  </c:forEach>
</table>
</body>
</html>