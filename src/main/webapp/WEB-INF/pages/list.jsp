<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/8/16
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Controller层跳转的测试页面--%>
<h3>查询所有的账户信息</h3>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>

</body>
</html>
