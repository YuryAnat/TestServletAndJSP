<%--
  Created by IntelliJ IDEA.
  User:
  Date: 19.09.2018
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles/w3.css">
    <title>Edit user</title>
</head>
<body class="w3-light-gray">
<div class="w3-container w3-blue-grey w3-opacity w3-center">
    <h1>Edit users!</h1>
</div>

<div>
    <%
        if (request.getAttribute("passed") !=  null){
            if ((boolean) request.getAttribute("passed")){
                out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                        "   <h5>Old user name: " + request.getParameter("name") + " new name: " + request.getParameter("newName") +  "</h5>\n" +
                        "</div>");
            }else {
                out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                        "   <h5>User name: " + request.getParameter("name") + " not found" + "</h5>\n" +
                        "</div>");
            }
        }
    %>
    <div class="w3-card-4">
        <div class="w3-container w3-center w3-green">
            <h2>Edit user</h2>
        </div>

        <div class="w3-card-4">
            <form method="post" class="w3-selection w3-light-grey w3-padding">
                <label>Old name:
                    <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%">
                </label>
                <label>New name:
                    <input type="text" name="newName" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%">
                </label>
                <label>New password:
                    <input type="password" name="pass" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%">
                </label>
                <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Update</button>
            </form>
        </div>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-center w3-padding ">
    <button onclick="location.href='/'" class="w3-btn w3-round-large w3-hover-light-green">Back to main</button>
</div>
</body>
</html>
