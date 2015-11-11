<%-- 
    Document   : footer
    Created on : Nov 1, 2015, 1:12:02 AM
    Author     : James.Farley
--%>

<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
<p>&copy; Copyright <%= currentYear %> TOBA; </p>
</body>
</html>
