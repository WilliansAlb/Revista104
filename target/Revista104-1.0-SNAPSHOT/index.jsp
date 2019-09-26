<%-- 
    Document   : index
    Created on : 15/09/2019, 21:25:52
    Author     : willians
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REV - 104</title>
        <%@include file='/css/all_css.html'%>
    </head>
    <body>
        <%
            HttpSession s = request.getSession();
            out.print(s.getAttribute("usuario"));;
        %>
        <%
            if (s.getAttribute("usuario") == null) {
        %>
        <%@include file='/views/vista_crear.html' %>
        <%
                } else {%>
        <%@include file='/views/nav_bar.html' %>
        <h1>Acá va a ir si ya está metido un user</h1>
        <%
                    }
        %>
        <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
        <script type="text/javascript">
    </body>
</html>
