<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Hello! ${name}</h2>
    <div>JSP List Test</div>
    <c:forEach var="item" items="${list}" varStatus="idx">
        ${idx.index}, ${item} </br>
    </c:forEach>
</body>
</html>
