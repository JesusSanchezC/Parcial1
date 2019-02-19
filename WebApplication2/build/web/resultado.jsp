<%-- 
    Document   : resultado
    Created on : 21-ene-2019, 18:22:15
    Author     : macbookretina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola</h1>
        <%= request.getParameter("fist name") %><br>
        <%= request.getParameter("last name") %><br>
        <%= request.getParameter("country") %><br>
        <%= request.getParameter("subject") %><br>
                
    </body>
</html>
