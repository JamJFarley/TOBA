<%-- 
    Document   : passwordReset
    Created on : Nov 8, 2015, 3:30:10 AM
    Author     : James.Farley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset Page</title>
    </head>
    <body>
        <h1>Password Reset</h1>
        <form action="PasswordResetServlet" method="post">
            <input name="password" value="${user.password}"/>
            <div><input type="submit" value="submit" id="submit"></div> 
        </form>
    </body>
</html>
