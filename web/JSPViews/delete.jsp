<%--
  Created by IntelliJ IDEA.
  User: sysadmin
  Date: 19.09.2018
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user</title>
</head>
<body>
    <div>
        <%
            if (request.getAttribute("delUser") != null){
                if ((boolean) request.getAttribute("delUser")){
                    out.println("User delete: " + request.getParameter("name"));
                }else {
                    out.println("User name: " + request.getParameter("name") + " not found");
                }
            }
        %>
        <form method="post">
            <div>
                <input type="text" name="name">
            </div>
            <div>
                <button type="submit">Delete</button>
            </div>
        </form>
    </div>


    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
