<%--
  Created by IntelliJ IDEA.
  User: bjsoldier
  Date: 2019/9/22
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${user.uName},欢迎登陆
    <ul>

        <c:forEach items="${ls}" var="listTopic">
            <li>${listTopic.tTitle}&nbsp;&nbsp;&nbsp;&nbsp;
                    ${listTopic.tContext}&nbsp;&nbsp;&nbsp;&nbsp;
                    ${listTopic.pTime}&nbsp;&nbsp;&nbsp;&nbsp;
                    ${listTopic.tTitle}&nbsp;&nbsp;&nbsp;&nbsp;
            </li>
        </c:forEach>
    </ul>
</body>
</html>
