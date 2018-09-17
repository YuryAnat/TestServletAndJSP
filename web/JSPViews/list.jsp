<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sysadmin
  Date: 17.09.2018
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List user</title>
</head>
<body>
<ul>
    <%
        List<String> names = (List<String>) request.getAttribute("userNames");
        if (names != null && !names.isEmpty()){
            for (String name : names) {
                out.println("<li" + name + "</li>");
            }
        }else out.println("<p>There are no users yet!</p>");
    %>
</ul>
<div>
    <button onclick="location.href='/'">Back to main</button>
</div>

</body>
</html>
