/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13_ventana;

/**
 *
 * @author dears
 */


import javax.swing.*;


public class Ventana extends javax.swing.JFrame {
    
    public static void main(String[] args){
        
        /*
        Como se vio en la teoria es necesario primero crear el frame
        */
        
        JFrame ventana = new JFrame("Hola Mundo");
        
        //hay que definir el tamaño de la ventana
        ventana.setSize(290, 150);
        //definir tus acciones de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito el panel para poder incorporar los componentes de la interfaz
        JPanel panel = new JPanel();
        //en ese´panel agregamos los componentes
        ventana.add(panel);
        
        //vamos a crear un metodo para agregar componentes
        agregarComponente(panel);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    private static void agregarComponente(JPanel panel) {
        //el panel se debe de inicializar
        panel.setLayout(null);//el panel esta vacio
        
        //agregamos los componentes como:
        JLabel userlabel = new JLabel ("Usuario");
        /*
        Para inicializar los componentes se utiliza e metodo
        
        setBounds
        
        el cual utiliza 4 parametros para poder posicionar el 
        componente dentro del panel
        
        2 como coordenadas x y
        2 para definir el tamaño
        */
        
        userlabel.setBounds(20, 10, 80, 25);
        //lo agregamos al panel
        panel.add(userlabel);
        
        //agregar un campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(90, 10, 165, 25);
        panel.add(usertext);
        
        //etiqueta de password
        JLabel userpassword = new JLabel("Password");
        userpassword.setBounds(20, 40, 80, 25);
        panel.add(userpassword);
        
        JTextField passtext = new JTextField(20);
        passtext.setBounds(90, 40, 165, 25);
        panel.add(passtext);
        
        //dos botones
        JButton loginbutton = new JButton("Iniciar Sesion");
        loginbutton.setBounds(20, 80, 115, 25);
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("Registrarse");
        registrobutton.setBounds(140, 80, 115, 25);
        panel.add(registrobutton);
        
    }
    
    private void loginbutton(java.awt.event.ActionEvent evt) {                                         
        String Usuario = "Admin";
        String Password = "Ricardo";
        
        String Pass = new String(userpassword.getPassword());
        if(usertext.getText().equals(Usuario)&& Pass.equals(Password)){
            Saludo sl = new Saludo();
            sl.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Usuario / Contraseña Incorrecta");
        }
    }
    
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField userpassword;
    private javax.swing.JTextField usertext;
}
