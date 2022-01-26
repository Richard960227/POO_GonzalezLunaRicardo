/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proceso;

import javax.swing.JFrame;

/**
 *
 * @author dears
 */
public class Principal extends JFrame {

    public Principal() {
        setTitle("Juego");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new Tablero());
        setVisible(true);
    }

    public static void main(String args[]) {
        new Principal();
    }
}
