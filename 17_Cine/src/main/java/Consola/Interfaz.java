/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Consola;

import javax.swing.JOptionPane;

/**
 *
 * @author dears
 */
public class Interfaz extends javax.swing.JFrame{
    
    
    
    
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        txtnum5 = new javax.swing.JTextField();
        Imprimir = new javax.swing.JButton();
        Sala = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AM = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        ME = new javax.swing.JLabel();
        txtnum8 = new javax.swing.JTextField();
        txtnum7 = new javax.swing.JTextField();
        txtnum6 = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Total = new javax.swing.JButton();
        TotalG1 = new javax.swing.JLabel();
        TotalG3 = new javax.swing.JLabel();
        TotalG2 = new javax.swing.JLabel();
        TotalG4 = new javax.swing.JLabel();
        Miercoles = new javax.swing.JCheckBox();
        Antes = new javax.swing.JCheckBox();
        Despues = new javax.swing.JCheckBox();
        TotalG5 = new javax.swing.JLabel();
        Normal = new javax.swing.JCheckBox();
        TresD = new javax.swing.JCheckBox();
        Sala1 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JLabel();
        sala = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        ME3 = new javax.swing.JLabel();
        TotalG6 = new javax.swing.JLabel();
        TotalG7 = new javax.swing.JLabel();
        Horario = new javax.swing.JComboBox<>();
        txtnum3 = new javax.swing.JLabel();

        jLabel12.setText("GENERAL");
        jLabel12.setMaximumSize(new java.awt.Dimension(50, 25));
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 25));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(294, 360));

        Nombre.setText("PELICULA");
        Nombre.setMaximumSize(new java.awt.Dimension(50, 25));
        Nombre.setMinimumSize(new java.awt.Dimension(50, 25));
        Nombre.setPreferredSize(new java.awt.Dimension(150, 25));

        Tipo.setText("OPCION");
        Tipo.setMaximumSize(new java.awt.Dimension(50, 25));
        Tipo.setPreferredSize(new java.awt.Dimension(50, 25));

        txtnum5.setPreferredSize(new java.awt.Dimension(50, 25));
        txtnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum5ActionPerformed(evt);
            }
        });

        Imprimir.setText("CONSULTAR TICKET");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        Sala.setText("SALA");
        Sala.setMaximumSize(new java.awt.Dimension(50, 25));
        Sala.setPreferredSize(new java.awt.Dimension(50, 25));

        E.setText("ESTUDIANTES");
        E.setMaximumSize(new java.awt.Dimension(50, 25));
        E.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel10.setText("NUMERO DE ENTRADAS");
        jLabel10.setToolTipText("");
        jLabel10.setMaximumSize(new java.awt.Dimension(50, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(239, 25));

        AM.setText("ADULTOS MAYORES");
        AM.setMaximumSize(new java.awt.Dimension(50, 25));
        AM.setPreferredSize(new java.awt.Dimension(150, 25));

        G.setText("GENERAL");
        G.setMaximumSize(new java.awt.Dimension(50, 25));
        G.setPreferredSize(new java.awt.Dimension(150, 25));

        ME.setText("MENORES DE EDAD");
        ME.setMaximumSize(new java.awt.Dimension(50, 25));
        ME.setPreferredSize(new java.awt.Dimension(150, 25));

        txtnum8.setPreferredSize(new java.awt.Dimension(50, 25));
        txtnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum8ActionPerformed(evt);
            }
        });

        txtnum7.setPreferredSize(new java.awt.Dimension(50, 25));
        txtnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum7ActionPerformed(evt);
            }
        });

        txtnum6.setPreferredSize(new java.awt.Dimension(50, 25));
        txtnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum6ActionPerformed(evt);
            }
        });

        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Total.setText("Calcular");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        TotalG1.setPreferredSize(new java.awt.Dimension(50, 25));

        TotalG3.setPreferredSize(new java.awt.Dimension(50, 25));

        TotalG2.setPreferredSize(new java.awt.Dimension(50, 25));

        TotalG4.setPreferredSize(new java.awt.Dimension(50, 25));

        Miercoles.setText("Miercoles");

        Antes.setText("Antes de 18:00");

        Despues.setText("Despues de 18:00");

        TotalG5.setPreferredSize(new java.awt.Dimension(50, 25));

        Normal.setText("Normal");

        TresD.setText("3D");

        Sala1.setText("TIPO DE SALA");
        Sala1.setMaximumSize(new java.awt.Dimension(50, 25));
        Sala1.setPreferredSize(new java.awt.Dimension(50, 25));

        txtnum1.setMaximumSize(new java.awt.Dimension(50, 25));
        txtnum1.setMinimumSize(new java.awt.Dimension(50, 25));
        txtnum1.setPreferredSize(new java.awt.Dimension(150, 25));

        sala.setMaximumSize(new java.awt.Dimension(50, 25));
        sala.setPreferredSize(new java.awt.Dimension(50, 25));

        Subtotal.setText("SubTotal   $");
        Subtotal.setMaximumSize(new java.awt.Dimension(50, 25));
        Subtotal.setPreferredSize(new java.awt.Dimension(150, 25));

        IVA.setText("IVA             $");
        IVA.setMaximumSize(new java.awt.Dimension(50, 25));
        IVA.setPreferredSize(new java.awt.Dimension(150, 25));

        ME3.setText("Total      $");
        ME3.setMaximumSize(new java.awt.Dimension(50, 25));
        ME3.setPreferredSize(new java.awt.Dimension(150, 25));

        TotalG6.setPreferredSize(new java.awt.Dimension(50, 25));

        TotalG7.setPreferredSize(new java.awt.Dimension(50, 25));

        Horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2:00 PM", "3:30 PM", "4:00 PM", "6:00 PM", "8:10 PM", "9:30 PM" }));
        Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorarioActionPerformed(evt);
            }
        });

        txtnum3.setMaximumSize(new java.awt.Dimension(50, 25));
        txtnum3.setMinimumSize(new java.awt.Dimension(50, 25));
        txtnum3.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Normal)
                        .addGap(10, 10, 10)
                        .addComponent(TresD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalG7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sala1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Miercoles)
                            .addComponent(Antes)
                            .addComponent(Despues)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(Total))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TotalG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TotalG6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ME3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalG5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Miercoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Antes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Despues))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sala1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Normal)
                            .addComponent(TresD))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TotalG1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TotalG2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TotalG3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TotalG4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ME3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalG6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalG7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar)
                            .addComponent(Imprimir)))
                    .addComponent(TotalG5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum5ActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        Ticket abrir = new Ticket();
        abrir.setVisible(true);
        
        Ticket.N1.setText(txtnum5.getText());
        Ticket.N2.setText(txtnum6.getText());
        Ticket.N3.setText(txtnum7.getText());
        Ticket.N4.setText(txtnum8.getText());
        
        Ticket.TotalG11.setText(TotalG1.getText());
        Ticket.TotalG21.setText(TotalG2.getText());
        Ticket.TotalG31.setText(TotalG3.getText());
        Ticket.TotalG41.setText(TotalG4.getText());
        Ticket.Horario1.setText(txtnum3.getText());
        Ticket.txtnum11.setText(txtnum1.getText());
        Ticket.sala1.setText(sala.getText());
        
        Ticket.TotalG51.setText(TotalG5.getText());
        Ticket.TotalG61.setText(TotalG6.getText());
        Ticket.TotalG71.setText(TotalG7.getText());
        
        dispose();
        
        
    }//GEN-LAST:event_ImprimirActionPerformed
        
    private void txtnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum8ActionPerformed

    private void txtnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum7ActionPerformed

    private void txtnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum6ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        //variable para las operaciones
        int costoa = 52;
        int costod = 65;
        int costom = 45;
        int costomym = 42;
        int tresd = 80;
        int suma;
        double iva = .16;
        double sub;
        double tot;

        int boletos = Integer.parseInt(txtnum5.getText());
        int boletos1 = Integer.parseInt(txtnum6.getText());
        int boletos2 = Integer.parseInt(txtnum7.getText());
        int boletos3 = Integer.parseInt(txtnum8.getText());

        String total;
        String subt;
        String i;
        
        try{
            if ((Normal.isSelected()) && (Antes.isSelected())) {
            boletos *= costoa;
            boletos1 *= costom;
            boletos2 *= costomym;
            boletos3 *= costomym;

            total = Integer.toString(boletos);
            TotalG1.setText(total);
            total = Integer.toString(boletos1);
            TotalG2.setText(total);
            total = Integer.toString(boletos2);
            TotalG3.setText(total);
            total = Integer.toString(boletos3);
            TotalG4.setText(total);
        }

        else if ((Normal.isSelected()) && (Despues.isSelected())) {
            boletos *= costod;
            boletos1 *= costom;
            boletos2 *= costomym;
            boletos3 *= costomym;

            total = Integer.toString(boletos);
            TotalG1.setText(total);
            total = Integer.toString(boletos1);
            TotalG2.setText(total);
            total = Integer.toString(boletos2);
            TotalG3.setText(total);
            total = Integer.toString(boletos3);
            TotalG4.setText(total);
        }

        else if ((Normal.isSelected()) && (Miercoles.isSelected())) {
            boletos *= costom;
            boletos1 *= costom;
            boletos2 *= costomym;
            boletos3 *= costomym;

            total = Integer.toString(boletos);
            TotalG1.setText(total);
            total = Integer.toString(boletos1);
            TotalG2.setText(total);
            total = Integer.toString(boletos2);
            TotalG3.setText(total);
            total = Integer.toString(boletos3);
            TotalG4.setText(total);
        }

        else if ((TresD.isSelected()) && (Antes.isSelected()) || (Despues.isSelected()) || (Miercoles.isSelected())) {
            boletos *= tresd;
            boletos1 *= tresd;
            boletos2 *= tresd;
            boletos3 *= tresd;

            total = Integer.toString(boletos);
            TotalG1.setText(total);
            total = Integer.toString(boletos1);
            TotalG2.setText(total);
            total = Integer.toString(boletos2);
            TotalG3.setText(total);
            total = Integer.toString(boletos3);
            TotalG4.setText(total);
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Opción o Sala");
        }
        
        int total1 = Integer.parseInt(TotalG1.getText());
        int total2 = Integer.parseInt(TotalG2.getText());
        int total3 = Integer.parseInt(TotalG3.getText());
        int total4 = Integer.parseInt(TotalG4.getText());
        
        suma = total1 + total2 + total3 + total4;
        total = Integer.toString(suma);
        TotalG5.setText(total);
        
        double to = Double.parseDouble(TotalG5.getText());
        tot = to * iva;
        i = String.valueOf(tot);
        TotalG7.setText(i);
        
        double subtotal = Double.parseDouble(TotalG5.getText());
        sub = subtotal - tot;
        subt = String.valueOf(sub);
        TotalG6.setText(subt);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Introduce los Campos Requeridos");
        }
        
    }//GEN-LAST:event_TotalActionPerformed

    private void HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorarioActionPerformed
        String horario = " ";
        horario = horario + Horario.getSelectedItem().toString();
        txtnum3.setText(horario);
    }//GEN-LAST:event_HorarioActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AM;
    private javax.swing.JCheckBox Antes;
    private javax.swing.JButton Cancelar;
    private javax.swing.JCheckBox Despues;
    private javax.swing.JLabel E;
    private javax.swing.JLabel G;
    private javax.swing.JComboBox<String> Horario;
    private javax.swing.JLabel IVA;
    private javax.swing.JButton Imprimir;
    private javax.swing.JLabel ME;
    private javax.swing.JLabel ME3;
    private javax.swing.JCheckBox Miercoles;
    private javax.swing.JLabel Nombre;
    private javax.swing.JCheckBox Normal;
    private javax.swing.JLabel Sala;
    private javax.swing.JLabel Sala1;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Tipo;
    private javax.swing.JButton Total;
    private javax.swing.JLabel TotalG1;
    private javax.swing.JLabel TotalG2;
    private javax.swing.JLabel TotalG3;
    private javax.swing.JLabel TotalG4;
    private javax.swing.JLabel TotalG5;
    private javax.swing.JLabel TotalG6;
    private javax.swing.JLabel TotalG7;
    private javax.swing.JCheckBox TresD;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel sala;
    public static javax.swing.JLabel txtnum1;
    public static javax.swing.JLabel txtnum3;
    public static javax.swing.JTextField txtnum5;
    public static javax.swing.JTextField txtnum6;
    public static javax.swing.JTextField txtnum7;
    private javax.swing.JTextField txtnum8;
    // End of variables declaration//GEN-END:variables
}

