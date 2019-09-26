<%-- 
    Document   : crear_usuario
    Created on : 25/09/2019, 17:28:01
    Author     : yelbetto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva cuenta</title>
        <%@include file='/css/all_css.html' %>
        <link rel="stylesheet" href='../css/crear_us.css'>
    </head>
    <body>
        <%@include file="vista_crear.html" %>
        <h1>
            <% HttpSession s = request.getSession();%>
            <% out.print(s.getAttribute("usuario"));%>
        </h1>
    </body>
</html>
