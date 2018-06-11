<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
<h2>Hello World!</h2>
<c:forEach items="${requestScope.users}" var="user">
    ${user.username}--------${user.id}<br>
</c:forEach>
</body>
</html>
