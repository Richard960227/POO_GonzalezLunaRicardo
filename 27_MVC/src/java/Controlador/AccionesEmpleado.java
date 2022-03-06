/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import BD.Empleado;
import java.sql.*;
import java.util.*;

/**
 *
 * @author dears
 */
public class AccionesEmpleado {

    public static int registrarEmpleado(Empleado e) {

        int estatus = 0;

        try {
            Connection con = Conexion.getConexion();
            String q = "insert into empleado(id, name, user, pass, name_rol) values(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setString(3, e.getUser());
            ps.setString(4, e.getPass());
            ps.setString(5, e.getName_rol());
            ps.executeUpdate();

            System.out.println("Registro Exitoso");
            con.close();

        } catch (Exception ed) {
            System.out.println("Error de Registro");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    public static int actualizarEmpleado(Empleado e) {

        int estatus = 0;

        try {
            Connection con = Conexion.getConexion();
            String q = "update empleado set name = ?, user = ?, pass = ?,name_rol = ? where id = ?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, e.getName());
            ps.setString(2, e.getUser());
            ps.setString(3, e.getPass());
            ps.setString(4, e.getName_rol());
            ps.setInt(5, e.getId());

            estatus = ps.executeUpdate();
            System.out.println("Actualización Exitosa");
            con.close();

        } catch (Exception ed) {
            System.out.println("Error de Actualización");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    public static int borrarEmpleado(int id) {

        int estatus = 0;

        try {
            Connection con = Conexion.getConexion();
            String q = "delete from empleado where id = ?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            estatus = ps.executeUpdate();
            System.out.println("Eliminado");
            con.close();

        } catch (Exception ed) {
            System.out.println("Error de Eliminación");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    public static Empleado buscarEmpleadoById(int id) {

        Empleado e = new Empleado();

        try {
            Connection con = Conexion.getConexion();
            String q = "select * from empleado where id = ?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setUser(rs.getString(3));
                e.setPass(rs.getString(4));
                e.setName_rol(rs.getString(5));
            }
            System.out.println("Se Encontro Empleado");
            con.close();

        } catch (Exception ed) {
            System.out.println("Error de Busqueda");
            System.out.println(ed.getMessage());
        }
        return e;
    }

    public static List<Empleado> getAllEmpleados() {
        List<Empleado> lista = new ArrayList<Empleado>();

        try {
            Connection con = Conexion.getConexion();
            String q = "select * from empleado";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setUser(rs.getString(3));
                e.setPass(rs.getString(4));
                e.setName_rol(rs.getString(5));
                lista.add(e);
            }
            System.out.println("Se Encontraron Empleados");
            con.close();

        } catch (Exception ed) {
            System.out.println("Error de Busqueda");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
}
