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

    if (sesionok.getAttribute("empleado") == null) {
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
        <% ArrayList<Empleado> listarEmpleados = new Empleado().listarEmpleados(); %>
        <div class="tabla_usuarios">
            <table border="1" class="tabla_empleados">
                <thead>
                    <h1>Funkos Store Employee Chart</h1>
                </thead>
                <tr>
                    <th>Id Employee</th>
                    <th>Name</th>
                    <th>User</th>
                    <th>Password</th>
                    <th>Rol</th>
                    <th>Editar</th>
                    <th>Eliminar</th>
                </tr>
                <tr>
                    <% for (Empleado emp : listarEmpleados) {%>
                    <td><%=emp.getId_employee()%> </td>
                    <td><%=emp.getName()%></td>
                    <td><%=emp.getUser()%></td>
                    <td><%=emp.getPass()%></td>
                    <td><%=emp.getName_rol()%></td>
                <form method="post" name="formulario" action="EditarUsuario">
                    <td><img src="IMG/editar.png" name="btnback" class="editar"/></td>
                </form>
                <form method="post" name="formulario" action="EliminarUsuario">
                    <td><img src="IMG/eliminar.png" name="btnback" class="eliminar"/></td>
                </form>
                    
                </tr>
                <% } %>


            </table>

        </div>
    </body>
    <%}%>
</html>
