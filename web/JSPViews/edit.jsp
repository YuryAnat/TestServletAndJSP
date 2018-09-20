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
    <title>Edit user</title>
</head>
<body>
<div class="w3-container w3-blue-grey w3-opacity w3-center">
    <h1>Update users!</h1>
</div>

<div>
    <div>
        <%
            if (request.getAttribute("passed") !=  null){
                if ((boolean) request.getAttribute("passed")){
                    out.println("Old user name: " + request.getParameter("name") + " new name: " + request.getParameter("newName"));
                }else {
                    out.println("User name: " + request.getParameter("name") + " not found");
                }
            }
        %>
        <form method="post">

            <label>Old name:
                <input type="text" name="name">
            </label>
            <label>New name:
                <input type="text" name="newName">
            </label>
            <label>New password:
                <input type="password" name="pass">
            </label>
            <div>
                <button type="submit">Update</button>
            </div>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
