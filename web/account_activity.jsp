<%@page import="TOBA.authentication.User"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TOBA</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <header role="banner">
            <h1>Titan Online Banking Application (TOBA)</h1>
        </header>
        
        <c:if test="${user == null}">
            <p>Welcome${user.firstName + user.lastName}</p>
        </c:if>
        <c:if test="${user == null}">
            <p>Not Logged In</p>
        </c:if>
    </body>
</html>