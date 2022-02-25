<%-- 
    Document   : Dueño
    Created on : 23/02/2022, 09:17:31 AM
    Author     : dears
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*;" %>
<%@page import="BD.*" %>

<%@page session="true" %>

<%
    String usuario = "";
    HttpSession sesionok = request.getSession(true);
    
    if(sesionok.getAttribute("user") == null){
        %>
        
        <jsp:forward page="index.html">
            <jsp:param name="Error" value="Es Obligatorio Autenticarse"/>
        </jsp:forward>
        
        <%
    }//else{
        usuario = (String)sesionok.getAttribute("user");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solo el Master</title>
    </head>
    <body>
        <h1>Bienvenido : <%=usuario %> </h1>
        <br>
        <h1>Tabla de Empleados de la Tienda Funkos</h1>
        <br>
        <% Vector<Empleado>listaempleados = new Empleado().listarEmpleados(); %>
        <div class="table_usuarios">
            <table border="1" class="tabla_empleados">
                <tr>
                    <th>Id de Empleado</th>
                    <th>Nombre</th>
                    <th>User</th>
                    <th>Password</th>
                    <th>Rol</th>
                </tr>
                <%
                    for(Empleado emp : listaempleados){
                        
                %>
                
                <tr>
                    <td><%=emp.getId_employee()%> </td>
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
