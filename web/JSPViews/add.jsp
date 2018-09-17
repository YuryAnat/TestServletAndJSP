<%--
  Created by IntelliJ IDEA.
  User: sysadmin
  Date: 17.09.2018
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>
<body>
    <form>
        <label>Name:
            <input type="Text" name="name"><br />
        </label>

        <label>Password:
            <input type="password" name="pass"><br />
        </label>
        <button type="submit">Submit</button>
    </form>
    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
