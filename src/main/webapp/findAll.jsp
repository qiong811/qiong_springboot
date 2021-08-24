<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Qiong
  Date: 2021/7/12
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${requestScope.list}" var="student">
        ${student.id}
        ${student.name}
        ${student.age}
        <fmt:formatDate value="${student.bir}"></fmt:formatDate>
        ${student.salary}
        <hr>
    </c:forEach>
</body>
</html>
