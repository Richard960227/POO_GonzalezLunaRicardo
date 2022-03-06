<%-- 
    Document   : EditarEmpleado
    Created on : 5/03/2022, 01:40:42 PM
    Author     : dears
--%>

<%@page import="BD.Empleado"%>
<%@page import="Controlador.AccionesEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monster Store S.A. de C.V.</title>
        <link rel="icon" href="IMG/monster.png">
        <link rel="stylesheet" href="CSS/Style.css"/>
    </head>
    <body background="IMG/fondo.png">
        <img src="IMG/volver.png" type="button" onclick="history.back()" name="btnback" class="back"/><br>
        <form method="post" name="actualizarempleado" action="ActualizarEmpleado">
            <table class="tabla_empleados">
                <%
                    int id = Integer.parseInt(request.getParameter("id"));

                    Empleado e = AccionesEmpleado.buscarEmpleadoById(id);
                %>
                <tr >
                    <td colspan="2"><h1 style="text-align: center">Edit Employee</h1></td>
                </tr>
                <tr>
                    <td>Id Employee</td>
                    <td><input type="number" name="id2" value="<%=e.getId()%>" ></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name2" size="30" value="<%=e.getName()%>" ></td>
                </tr>
                <tr>
                    <td>User</td>
                    <td><input type="text" name="user2" size="30" value="<%=e.getUser()%>" ></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass2" size="30" value="<%=e.getPass()%>" ></td>
                </tr>
                <tr>
                    <td>Name Rol</td>
                    <td><input type="text" name="name_rol2" size="30" value="<%=e.getName_rol()%>" ></td>
                </tr> 
                <tr>
                    <td colspan="2"><input type="image" src="IMG/actualizar.png" name="guardar" style="width: 50px; height: 50px"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
