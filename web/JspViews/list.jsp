<%@ page import="java.util.List" %>
<%@ page import="app.entities.user.SavedUsers" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles/w3.css">
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<style>
    table, th, td {
        border: 1px solid black;
    }
    th, td {
        text-align: center;
    }
</style>

<body class="w3-light-gray">
<div class="w3-container w3-blue-grey w3-opacity w3-left-align">
    <h1>List users!</h1>
</div>

<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-light-blue">
            <h2>Users</h2>
        </div>
        <%
            List<SavedUsers> names = (List<SavedUsers>) request.getAttribute("userNames");

            if (names != null && !names.isEmpty()) {



                out.println("<table style=\"width:50%\">\n");
                out.println("<tr>" + "<th>id</th>\n" + "<th>name</th>\n" + "<th></th>" + "</tr>");

                    for (SavedUsers s : names) {
                        out.println("<tr>");
                        out.println("<td>" + s.getId() + "</td>");
                        out.println("<td>" + s.getName() + "</td>");
                        out.println("<td>" + "<button onclick=\"location.href='/listPet'\"${line.id}>List pets</button>" + "</td>");
                        out.println("</tr>");
                    }

                out.println("</table>\n");

            } else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
                    +
                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                    "   <h5>There are no users yet!</h5>\n" +
                    "</div>");
        %>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-center w3-padding">
    <button class="w3-btn w3-round-large w3-hover-light-green" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
