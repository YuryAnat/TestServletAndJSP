<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles/w3.css">
    <title>New app</title>
</head>
<body class="w3-light-gray">
    <!-- header -->
    <div class="w3-container w3-blue-gray w3-opacity w3-center">
        <h1>First app!</h1>
    </div>

    <div class="w3-container w3-center">
        <div class="w3-bar w3-padding-large w3-padding-24">
            <button class="w3-btn w3-hover-light-gray w3-round-large" onclick="location.href='/list'">List users</button>
            <button class="w3-btn w3-hover-light-green w3-round-large" onclick="location.href='/add'">Add user</button>
            <button class="w3-btn w3-hover-light-green w3-round-large" onclick="location.href='/edit'">Edit user</button>
            <button class="w3-btn w3-hover-text-red w3-hover-light-green w3-round-large" onclick="location.href='/delete'">Delete user</button>
        </div>
    </div>

</body>
</html>
