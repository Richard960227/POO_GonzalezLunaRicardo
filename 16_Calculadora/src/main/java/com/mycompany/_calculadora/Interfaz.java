/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dears
 */
public class Interfaz extends JFrame implements ActionListener{
    
    //definir los campos que son necesarios para interfaz
    JTextField txtnum1;
    JTextField txtnum2;
    //definir botones
    JButton btnresta;
    JButton btnsuma;
    JButton btnproducto;
    JButton btndivision;
    //etiquetas
    JLabel numero1;
    JLabel numero2;
    JLabel titulo;
    JLabel resultado;
    JLabel mostrarresultado;
    //panel
    JPanel panel = (JPanel)this.getContentPane();//contenedor de la interfaz
    
    Operaciones op = new Operaciones();
    
    //variable para las operaciones
    double num1, num2;
    
    //interfaz
    
    public Interfaz(){
        
        //aqui vamos a cargar con todo
        setLayout(null);
        //localizacion del panel
        setLocation(100,80);
        //que no se pueda redimensionar
        setResizable(false);
        //definir el tamaño
        setSize(200,310);
        //salir del programa cuando se cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hay que cargar los componentes
        componentes();
    }
    
    private void componentes(){
        
        panel.setLayout(null);
        titulo = new JLabel("Calculadora Maizoro");
        titulo.setBounds(30, 10, 200, 30);
        panel.add(titulo);
        
        panel.setLayout(null);
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10, 50, 60, 25);
        panel.add(numero1);
        
        txtnum1 = new JTextField();
        txtnum1.setBounds(80, 50, 90, 25);
        panel.add(txtnum1);
        
        numero2 = new JLabel("Numero 2");
        numero2.setBounds(10, 80, 60, 25);
        panel.add(numero2);
        
        txtnum2 = new JTextField();
        txtnum2.setBounds(80, 80, 90, 25);
        panel.add(txtnum2);
        
        resultado = new JLabel("Resultado");
        resultado.setBounds(10, 115, 60, 25);
        panel.add(resultado);
        
        mostrarresultado = new JLabel("");
        mostrarresultado.setBounds(80, 115, 90, 25);
        panel.add(mostrarresultado);
        
        btnsuma = new JButton("+");
        btnsuma.setBounds(37, 155, 50, 50);
        panel.add(btnsuma);
        //mando a llamar el listener (accion)
        btnsuma.addActionListener(this); //del metodo abstracto
        
        btnresta = new JButton("-");
        btnresta.setBounds(93, 155, 50, 50);
        panel.add(btnresta);
        //mando a llamar el listener (accion)
        btnresta.addActionListener(this); //del metodo abstracto
        
        btnproducto = new JButton("*");
        btnproducto.setBounds(37, 210, 50, 50);
        panel.add(btnproducto);
        //mando a llamar el listener (accion)
        btnproducto.addActionListener(this); //del metodo abstracto
        
        btndivision = new JButton("/");
        btndivision.setBounds(93, 210, 50, 50);
        panel.add(btndivision);
        //mando a llamar el listener (accion)
        btndivision.addActionListener(this); //del metodo abstracto
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //aqui adentro se diferencia las acciones
        try{
            if (e.getSource()==btnsuma){
            //estoy asignando la variable num1
            //el valor
            num1 = Double.parseDouble(txtnum1.getText());
            
            op.setNum1(num1);
            
            num2 = Double.parseDouble(txtnum2.getText());
            
            op.setNum2(num2);
            
            //debo mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.suma()));
        }
        }catch (Exception obj){
            JOptionPane.showMessageDialog(rootPane, "Operación Invalida");
        }
        
        try{
           if (e.getSource()==btnresta){
            //estoy asignando la variable num1
            //el valor
            num1 = Double.parseDouble(txtnum1.getText());
            
            op.setNum1(num1);
            
            num2 = Double.parseDouble(txtnum2.getText());
            
            op.setNum2(num2);
            
            //debo mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.resta()));
        } 
        }catch (Exception obj){
            JOptionPane.showMessageDialog(rootPane, "Operación Invalida");
        }
        
        try{
            if (e.getSource()==btnproducto){
            //estoy asignando la variable num1
            //el valor
            num1 = Double.parseDouble(txtnum1.getText());
            
            op.setNum1(num1);
            
            num2 = Double.parseDouble(txtnum2.getText());
            
            op.setNum2(num2);
            
            //debo mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.producto()));
        }
        }catch (Exception obj){
            JOptionPane.showMessageDialog(rootPane, "Operación Invalida");
        }
        
        try{
            if (e.getSource()==btndivision){
            //estoy asignando la variable num1
            //el valor
            num1 = Double.parseDouble(txtnum1.getText());
            
            op.setNum1(num1);
            
            num2 = Double.parseDouble(txtnum2.getText());
            
            op.setNum2(num2);
            
            //debo mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.division()));
        }
        }catch (Exception obj){
            JOptionPane.showMessageDialog(rootPane, "Operación Invalida");
        }
        
    }
    
           
    
    
}
