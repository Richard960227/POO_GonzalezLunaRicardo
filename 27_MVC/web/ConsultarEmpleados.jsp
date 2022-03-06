<%-- 
    Document   : ConsultarEmpleados
    Created on : 5/03/2022, 11:06:00 AM
    Author     : dears
--%>

<%@page import="Controlador.AccionesEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="BD.*" %>

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
        <% List<Empleado> lista = AccionesEmpleado.getAllEmpleados(); %>
        <table class="tabla_empleados">
            <tr>
                <td colspan="7"><h1 style="text-align: center">Funkos Store Employee Chart</h1></td>
            </tr>
            <tr>
                <th class="cons">ID</th>
                <th class="cons">Name</th>
                <th class="cons">User</th>
                <th class="cons">Password</th>
                <th class="cons">Rol</th>
                <th class="cons">Edit</th>
                <th class="cons">Delete</th>
            </tr>
            <tr>
                <% for (Empleado e : lista) {%>
                <td><%=e.getId()%> </td>
                <td><%=e.getName()%></td>
                <td><%=e.getUser()%></td>
                <td><%=e.getPass()%></td>
                <td><%=e.getName_rol()%></td>
                <td><a href="EditarEmpleado.jsp?id=<%=e.getId()%>" ><img src="IMG/editar.png" name="btnback" class="editar"/></a></td>
                <td><a href="borrarempleado?id=<%=e.getId()%>" ><img src="IMG/eliminar.png" name="btnback" class="editar"/></a></td>
            </tr>
            <% }%>


        </table>

    </div>
</body>
</html>
