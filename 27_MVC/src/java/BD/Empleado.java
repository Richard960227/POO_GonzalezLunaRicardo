/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author dears
 */

public class Empleado {

    private int id_employee;
    private String name;
    private String user;
    private String pass;
    private int id_rol;
    private String name_rol;

    public Empleado() {
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getName_rol() {
        return name_rol;
    }

    public void setName_rol(String name_rol) {
        this.name_rol = name_rol;
    }

//cuales son las funciones del usuario?
//Registra
//Modifica sus Datos
//Consulta todos los empleados
    public ArrayList<Empleado> listarEmpleados() throws ClassNotFoundException {
        ArrayList<Empleado> listaempleados = new ArrayList<Empleado>();
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConexion();
            String q = "Select * from empleado";
            pre = con.prepareStatement(q);
            rs = pre.executeQuery();
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setId_employee(rs.getInt("id_employee"));
                emp.setName(rs.getString("name"));
                emp.setUser(rs.getString("user"));
                emp.setPass(rs.getString("pass"));
                emp.setId_rol(rs.getInt("id_rol"));
                emp.setName_rol(rs.getString("name_rol"));
                listaempleados.add(emp);
                System.out.println(emp.id_employee);
                System.out.println(emp.getName());
            }
        } catch (SQLException ed) {
            System.out.println("Error al Consultar la Tabla Empleado");
            System.out.println(ed.getMessage());
            listaempleados = null;
        } finally {
            try {
                //cerrar todas las conexiones por seguridad
                rs.close();
                pre.close();
                con.close();
            } catch (Exception e) {
                System.out.println("Error de Logica de Datos");
                System.out.println(e.getMessage());
            }
        }
        return listaempleados;
    }


//Verificar tipo de usuario
    public Empleado verificacionUsuario(String usuario, String password) throws ClassNotFoundException {
        Empleado emp = null;
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {

            /*Tengo que comparar el nombre de usuario y password respecto de la bd, 
            si coincide accede sino manda un mensaje de error en las credenciales
             */
            //primero me debo de conectar a la bd
            con = Conexion.getConexion();

            String q = "select * from empleado "
                    + "where user = ? and pass = ?";
            pre = con.prepareStatement(q);
            pre.setString(1, usuario);
            pre.setString(2, password);

            rs = pre.executeQuery();

            while (rs.next()) {
                emp = new Empleado();
                emp.setId_employee(rs.getInt("id_employee"));
                emp.setName(rs.getString("name"));
                emp.setUser(rs.getString("user"));
                emp.setPass(rs.getString("pass"));
                emp.setId_rol(rs.getInt("id_rol"));
                emp.setName_rol(rs.getString("name_rol"));
                break;
            }

        } catch (SQLException ed) {
            System.out.println("Error al Conectar la Tabla Empleado");
            System.out.println(ed.getMessage());
            emp = null;
        } finally {
            try {
                //cerrar todas las conexiones por seguridad
                rs.close();
                pre.close();
            } catch (Exception e) {
                System.out.println("Error de Logica de Datos");
                System.out.println(e.getMessage());
            }
        }
        return emp;
    }
}
