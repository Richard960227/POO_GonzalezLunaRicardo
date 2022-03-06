<%-- 
    Document   : Registro
    Created on : 5/03/2022, 11:07:57 AM
    Author     : dears
--%>

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
        <a href="index.html"><img src="IMG/volver.png" type="button" name="btnback" class="back"/></a>
        <div class="tabla_usuarios">
            <form method="post" name="registroempleado" action="GuardarEmpleado">
                <table class="tabla_empleados">
                    <tr>
                        <td colspan="2"><h1>Registration to MonStore</h1></td>
                    </tr>
                    <tr>
                        <td>ID</td>
                        <td><input type="number" name="id"></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" size="30"></td>
                    </tr>
                    <tr>
                        <td>User</td>
                        <td><input type="text" name="user" size="30"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" size="30"></td>
                    </tr>
                    <tr>
                        <td>Name Rol</td>
                        <td><input type="text" name="name_rol" size="30"></td>
                    </tr>
                    <tr>
                        <td><a href="ConsultarEmpleados.jsp"><image src="IMG/registro.png" name="registros" style="width: 30px; height: 30px"></a></td>
                        <td><input type="image" src="IMG/guardar.png" name="guardar" style="width: 50px; height: 50px"></td>    
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
