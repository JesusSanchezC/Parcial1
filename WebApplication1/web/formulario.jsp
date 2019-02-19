<%-- 
    Document   : formulario.jsp
    Created on : 21-ene-2019, 16:54:40
    Author     : macbookretina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                front-size: 30px;
            }
        </style>
    </head>
    <body>
        <% String colorFuente=(String)request.getAttribute("colorFuentes"); %>
        <% String colorFondo=(String)request.getAttribute("colorFondo"); %>
        <h1>Hello Mundo formulario!</h1>
    </body>
</html>
