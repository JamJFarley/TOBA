<%-- 
    Document   : index
    Created on : Nov 3, 2015, 5:06:53 PM
    Author     : James.Farley
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="styles/main.css" type="text/css"/>
<!--<link href="css/bootstrap.min.css" rel="stylesheet">  -->

 <c:import url="/includes/header.html" />
        <header role="banner">
            <h1>Titan Online Banking Application (TOBA)</h1>
        </header>
	<nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="New_customer.jsp">New Customer?</a></li>
                <li><a href="account_activity.jsp">Account Activity</a></li>
            </ul>
	</nav>
<c:import url="/includes/footer.jsp" />

