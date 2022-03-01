<%-- 
    Document   : Dueño
    Created on : 23/02/2022, 09:17:31 AM
    Author     : dears
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="BD.*" %>

<%@page session= "true" %>

<%
    String usuario = "";
    HttpSession sesionok = request.getSession(true);

    if (sesionok.getAttribute("id_empleado") == null) {
%>

<jsp:forward page="index.html">
    <jsp:param name="Error" value="Es Obligatorio Autenticarse"/>
</jsp:forward>

<%
} else {
    usuario = (String) sesionok.getAttribute("name");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monster Store S.A. de C.V.</title>
        <link rel="icon" href="IMG/monster.png">
        <link rel="stylesheet" href="CSS/Style.css"/>
    </head>
    <body background="IMG/fondo.png">
        <img src="IMG/volver.png" type="button" onclick="history.back()" name="btnback" class="back"/>
        <h1>Welcome Master <%=usuario%> </h1>
        <br>
        <h1>Funkos Store Employee Chart</h1>
        <br>
        <% ArrayList<Empleado> listaempleados = new ArrayList<Empleado>(); %>
        <div class="tabla_usuarios">
            <table border="1" class="tabla_empleados">
                <tr>
                    <th>Id Employee</th>
                    <th>Name</th>
                    <th>User</th>
                    <th>Password</th>
                    <th>Rol</th>
                </tr>
                <tr>
                    <% for (Empleado emp : listaempleados) {%>
                    <td><%=emp.getId_employee() %> </td>
                    <td><%=emp.getName()%></td>
                    <td><%=emp.getUser()%></td>
                    <td><%=emp.getPass()%></td>
                    <td><%=emp.getName_rol()%></td>
                </tr>
                <% } %>


            </table>
        </div>
    </body>
    <%}%>
</html>
