/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;

/**
 *
 * @author dears
 */
public class Conexion {

    public static Connection getConexion() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/funkos";
            String user = "root";
            String password = "759213";

            return DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ed) {
            System.out.println("Error al Conectar");
            System.out.println(ed.getMessage());
        } catch (Exception ex) {
            System.out.println("Error Logico");
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
}
