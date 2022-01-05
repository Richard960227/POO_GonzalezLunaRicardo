/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dears
 */
public class Sistema extends javax.swing.JFrame implements Runnable{

    String hora, minutos, segundos;
    Thread hilo;
    private ImageIcon imagen;
    private Icon icono;
    
    double cambioventa;
    
    int contador;
    int contador1;
    
    
    public Sistema() {
        initComponents();
        
        
        this.setLocationRelativeTo(this);
        
        this.Imagen(this.fondo,"src/Imagenes/fondo.png");
        this.Imagen(this.vacio,"src/Imagenes/vacio.png");
        this.Imagen(this.cobro,"src/Imagenes/cobro.png");
        this.Imagen(this.cobro1,"src/Imagenes/cobro1.png");
        this.Imagen(this.cobro2,"src/Imagenes/cobro2.png");
        this.Imagen(this.cobro3,"src/Imagenes/cobro3.png");
        this.Imagen(this.cobro4,"src/Imagenes/cobro4.png");
        this.Imagen(this.cobro5,"src/Imagenes/cobro5.png");
        this.Imagen(this.cobrotarjeta,"src/Imagenes/tarjeta.png");
        this.Imagen(this.cancelacion,"src/Imagenes/cancelar.png");
        this.Imagen(this.cobroefectivo,"src/Imagenes/efectivo.png");
        this.Imagen(this.ticket,"src/Imagenes/ticket.png");
        this.Imagen(this.menucaja,"src/Imagenes/menucaja.png");
        this.Imagen(this.descuentot,"src/Imagenes/descuento.png");
        this.Imagen(this.factura1,"src/Imagenes/factura.png");
        this.Imagen(this.reimpresion1,"src/Imagenes/reimpresion.png");
        this.Imagen(this.menugerencia,"src/Imagenes/menugerencia.png");
        this.Imagen(this.fondoarqueo,"src/Imagenes/arqueo.png");
        this.Imagen(this.fondoretiro,"src/Imagenes/retiro.png");
        this.Imagen(this.fondofin,"src/Imagenes/fin.png");
        
        lbfecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run(){
        
        Thread current = Thread.currentThread();
        
        while (current == hilo){
            hora();
            lbhora.setText(hora + ":" + minutos + ":" + segundos);
            horaticket.setText(hora + ":" + minutos);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vacio = new javax.swing.JLabel();
        Box5 = new javax.swing.JCheckBox();
        Box4 = new javax.swing.JCheckBox();
        Box3 = new javax.swing.JCheckBox();
        Box2 = new javax.swing.JCheckBox();
        Box1 = new javax.swing.JCheckBox();
        fondofin = new javax.swing.JLabel();
        fin = new javax.swing.JLabel();
        Field6 = new javax.swing.JTextField();
        Field5 = new javax.swing.JTextField();
        Field4 = new javax.swing.JTextField();
        Field3 = new javax.swing.JTextField();
        Field2 = new javax.swing.JTextField();
        Field1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondoretiro = new javax.swing.JLabel();
        retiro = new javax.swing.JLabel();
        fondoarqueo = new javax.swing.JLabel();
        arqueo = new javax.swing.JLabel();
        menugerencia = new javax.swing.JLabel();
        reimpresion1 = new javax.swing.JLabel();
        reimpresion = new javax.swing.JLabel();
        factura1 = new javax.swing.JLabel();
        factura = new javax.swing.JLabel();
        aplicardes = new javax.swing.JButton();
        aplicar = new javax.swing.JTextField();
        cant = new javax.swing.JCheckBox();
        porcen = new javax.swing.JCheckBox();
        descuentot = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        menucaja = new javax.swing.JLabel();
        dcobro = new javax.swing.JLabel();
        cobro5 = new javax.swing.JLabel();
        cobro4 = new javax.swing.JLabel();
        cobro3 = new javax.swing.JLabel();
        cobro2 = new javax.swing.JLabel();
        cobro1 = new javax.swing.JLabel();
        cobro = new javax.swing.JLabel();
        transaccion = new javax.swing.JLabel();
        clienteticket = new javax.swing.JLabel();
        fechaticket = new javax.swing.JLabel();
        horaticket = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        totalefec = new javax.swing.JLabel();
        totalticket = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        otros = new javax.swing.JLabel();
        concepto = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        vueltacam = new javax.swing.JLabel();
        cobroef = new javax.swing.JTextField();
        cobroefectivo = new javax.swing.JLabel();
        cancelacion = new javax.swing.JLabel();
        cobrotarjeta = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        lbtransaccion = new javax.swing.JLabel();
        tarjeta = new javax.swing.JLabel();
        tarjeta1 = new javax.swing.JLabel();
        efectivo = new javax.swing.JLabel();
        efectivo1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        eje61 = new javax.swing.JLabel();
        eje6 = new javax.swing.JLabel();
        eje51 = new javax.swing.JLabel();
        eje5 = new javax.swing.JLabel();
        eje41 = new javax.swing.JLabel();
        eje4 = new javax.swing.JLabel();
        eje31 = new javax.swing.JLabel();
        eje3 = new javax.swing.JLabel();
        eje21 = new javax.swing.JLabel();
        eje2 = new javax.swing.JLabel();
        eje11 = new javax.swing.JLabel();
        eje1 = new javax.swing.JLabel();
        caja = new javax.swing.JLabel();
        caja1 = new javax.swing.JLabel();
        gerencia = new javax.swing.JLabel();
        gerencia1 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(vacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 340));

        Box5.setBackground(new java.awt.Color(255, 255, 255));
        Box5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Box5.setForeground(new java.awt.Color(153, 153, 153));
        Box5.setText("VENTA TOTAL");
        getContentPane().add(Box5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        Box4.setBackground(new java.awt.Color(255, 255, 255));
        Box4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Box4.setForeground(new java.awt.Color(153, 153, 153));
        Box4.setText("TRANSACCIONES");
        getContentPane().add(Box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        Box3.setBackground(new java.awt.Color(255, 255, 255));
        Box3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Box3.setForeground(new java.awt.Color(153, 153, 153));
        Box3.setText("DESCUENTOS");
        getContentPane().add(Box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        Box2.setBackground(new java.awt.Color(255, 255, 255));
        Box2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Box2.setForeground(new java.awt.Color(153, 153, 153));
        Box2.setText("RETIROS");
        getContentPane().add(Box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        Box1.setBackground(new java.awt.Color(255, 255, 255));
        Box1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Box1.setForeground(new java.awt.Color(153, 153, 153));
        Box1.setText("TODOS");
        Box1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Box1MouseReleased(evt);
            }
        });
        getContentPane().add(Box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 80, -1));
        getContentPane().add(fondofin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 430, 340));

        fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finMouseClicked(evt);
            }
        });
        getContentPane().add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 60, 60));

        Field6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Field6.setBorder(null);
        getContentPane().add(Field6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 30, 10));

        Field5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Field5.setBorder(null);
        getContentPane().add(Field5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 30, 10));

        Field4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Field4.setBorder(null);
        getContentPane().add(Field4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 30, 10));

        Field3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Field3.setBorder(null);
        getContentPane().add(Field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 30, 10));

        Field2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Field2.setBorder(null);
        getContentPane().add(Field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 30, 10));

        Field1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Field1.setBorder(null);
        getContentPane().add(Field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 30, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 40, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 40, 10));
        getContentPane().add(fondoretiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 430, 340));

        retiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retiroMouseClicked(evt);
            }
        });
        getContentPane().add(retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 60, 60));
        getContentPane().add(fondoarqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 430, 340));

        arqueo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arqueoMouseClicked(evt);
            }
        });
        getContentPane().add(arqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 270, 70, 70));
        getContentPane().add(menugerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 228, 90, 320));
        getContentPane().add(reimpresion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 430, 340));

        reimpresion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reimpresionMouseClicked(evt);
            }
        });
        getContentPane().add(reimpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 70, 60));
        getContentPane().add(factura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 430, 340));

        factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturaMouseClicked(evt);
            }
        });
        getContentPane().add(factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 70, 60));

        aplicardes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        aplicardes.setText("APLICAR");
        aplicardes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aplicardesMouseClicked(evt);
            }
        });
        getContentPane().add(aplicardes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 311, 80, 20));

        aplicar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        aplicar.setBorder(null);
        getContentPane().add(aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 130, -1));

        cant.setBackground(new java.awt.Color(255, 255, 255));
        cant.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        cant.setForeground(new java.awt.Color(153, 153, 153));
        cant.setText("CANTIDAD");
        getContentPane().add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 290, 110, -1));

        porcen.setBackground(new java.awt.Color(255, 255, 255));
        porcen.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        porcen.setForeground(new java.awt.Color(153, 153, 153));
        porcen.setText("PORCENTAJE");
        getContentPane().add(porcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 290, 110, -1));
        getContentPane().add(descuentot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 420, 340));

        descuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descuentoMouseClicked(evt);
            }
        });
        getContentPane().add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 70, 60));
        getContentPane().add(menucaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 208, 90, 340));

        dcobro.setBackground(new java.awt.Color(255, 255, 255));
        dcobro.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dcobro.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(dcobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 474, 50, 40));
        getContentPane().add(cobro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 330));
        getContentPane().add(cobro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 330));
        getContentPane().add(cobro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 330));
        getContentPane().add(cobro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 330));
        getContentPane().add(cobro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 330));
        getContentPane().add(cobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 215, 520, 330));

        transaccion.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(transaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 60, 40));

        clienteticket.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(clienteticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 90, 20));

        fechaticket.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(fechaticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 90, 20));

        horaticket.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(horaticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 90, 20));

        cambio.setForeground(new java.awt.Color(153, 153, 153));
        cambio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 50, 30));

        totalefec.setForeground(new java.awt.Color(153, 153, 153));
        totalefec.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(totalefec, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 50, 20));

        totalticket.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(totalticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 80, 32));

        iva.setForeground(new java.awt.Color(153, 153, 153));
        iva.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 340, 70, 30));

        otros.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 50, 30));

        concepto.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(concepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 280, 70, 30));
        getContentPane().add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 340));

        vueltacam.setForeground(new java.awt.Color(153, 153, 153));
        vueltacam.setToolTipText("");
        getContentPane().add(vueltacam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 424, 80, 30));

        cobroef.setBorder(null);
        cobroef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cobroefKeyReleased(evt);
            }
        });
        getContentPane().add(cobroef, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 80, 20));
        getContentPane().add(cobroefectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 340));
        getContentPane().add(cancelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 209, 520, 340));
        getContentPane().add(cobrotarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 520, 340));

        lbhora.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        lbhora.setForeground(new java.awt.Color(255, 255, 255));
        lbhora.setText("00:00:00");
        getContentPane().add(lbhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, -1, 25));

        lbfecha.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setText("DD/MM/YYYY");
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, 25));

        lbtransaccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbtransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 90, 25));

        tarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarjetaMouseClicked(evt);
            }
        });
        getContentPane().add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 70, 60));

        tarjeta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarjeta1MouseClicked(evt);
            }
        });
        getContentPane().add(tarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 450, 60, 60));

        efectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                efectivoMouseClicked(evt);
            }
        });
        getContentPane().add(efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 60, 60));

        efectivo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                efectivo1MouseClicked(evt);
            }
        });
        getContentPane().add(efectivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 450, 70, 60));

        total.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 60, 40));

        subtotal.setBackground(new java.awt.Color(255, 255, 255));
        subtotal.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 60, 30));

        cliente.setBorder(null);
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 24));

        eje61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje61MouseClicked(evt);
            }
        });
        getContentPane().add(eje61, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 80, 30));

        eje6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje6MouseClicked(evt);
            }
        });
        getContentPane().add(eje6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 60, 30));

        eje51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje51MouseClicked(evt);
            }
        });
        getContentPane().add(eje51, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 174, 70, 20));

        eje5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje5MouseClicked(evt);
            }
        });
        getContentPane().add(eje5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 70, 30));

        eje41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje41MouseClicked(evt);
            }
        });
        getContentPane().add(eje41, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 174, 80, 20));

        eje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje4MouseClicked(evt);
            }
        });
        getContentPane().add(eje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 60, 30));

        eje31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje31MouseClicked(evt);
            }
        });
        getContentPane().add(eje31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 30));

        eje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje3MouseClicked(evt);
            }
        });
        getContentPane().add(eje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 30));

        eje21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje21MouseClicked(evt);
            }
        });
        getContentPane().add(eje21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, 30));

        eje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje2MouseClicked(evt);
            }
        });
        getContentPane().add(eje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, 30));

        eje11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje11MouseClicked(evt);
            }
        });
        getContentPane().add(eje11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 30));

        eje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eje1MouseClicked(evt);
            }
        });
        getContentPane().add(eje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 30));

        caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaMouseClicked(evt);
            }
        });
        getContentPane().add(caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 60, 60));

        caja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caja1MouseClicked(evt);
            }
        });
        getContentPane().add(caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 60, 60));

        gerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciaMouseClicked(evt);
            }
        });
        getContentPane().add(gerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 60, 60));

        gerencia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerencia1MouseClicked(evt);
            }
        });
        getContentPane().add(gerencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 60, 60));

        salir.setPreferredSize(new java.awt.Dimension(125, 125));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 60, 60));

        fondo.setMaximumSize(new java.awt.Dimension(805, 573));
        fondo.setMinimumSize(new java.awt.Dimension(805, 573));
        fondo.setPreferredSize(new java.awt.Dimension(805, 573));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 805, 573));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Box1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box1MouseReleased
        if(Box1.isSelected()){
            Box2.setSelected(true);
            Box3.setSelected(true);
            Box4.setSelected(true);
            Box5.setSelected(true);
        }else{
            Box2.setSelected(false);
            Box3.setSelected(false);
            Box4.setSelected(false);
            Box5.setSelected(false);
        }
    }//GEN-LAST:event_Box1MouseReleased

    private void finMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finMouseClicked

        Box5.setVisible(true);
        Box4.setVisible(true);
        Box3.setVisible(true);
        Box2.setVisible(true);
        Box1.setVisible(true);
        fondofin.setVisible(true);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(true);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(true);
        menugerencia.setVisible(true);
        gerencia.setVisible(false);
        gerencia1.setVisible(true);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_finMouseClicked

    private void retiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retiroMouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(true);
        jLabel3.setVisible(true);
        jLabel1.setVisible(true);
        Field6.setVisible(true);
        Field5.setVisible(true);
        Field4.setVisible(true);
        Field3.setVisible(true);
        Field2.setVisible(true);
        Field1.setVisible(true);
        fondoretiro.setVisible(true);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(true);
        menugerencia.setVisible(true);
        gerencia.setVisible(false);
        gerencia1.setVisible(true);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_retiroMouseClicked

    private void arqueoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arqueoMouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(true);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(true);
        fondoarqueo.setVisible(true);
        arqueo.setVisible(false);
        menugerencia.setVisible(true);
        gerencia.setVisible(false);
        gerencia1.setVisible(true);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_arqueoMouseClicked

    private void reimpresionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reimpresionMouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        menucaja.setVisible(true);
        caja.setVisible(false);
        caja1.setVisible(true);
        descuento.setVisible(true);
        factura.setVisible(true);
        factura1.setVisible(false);
        reimpresion.setVisible(true);
        reimpresion1.setVisible(true);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_reimpresionMouseClicked

    private void facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaMouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        menucaja.setVisible(true);
        caja.setVisible(false);
        caja1.setVisible(true);
        descuento.setVisible(true);
        factura.setVisible(true);
        factura1.setVisible(true);
        descuentot.setVisible(false);
        reimpresion.setVisible(true);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_facturaMouseClicked

    private void aplicardesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplicardesMouseClicked
        if ((porcen.isSelected()) && (cant.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "Seleccione Solo Una Opción");
        }else if(porcen.isSelected()){

            double porcend;
            double aplicar1 = Double.parseDouble(this.aplicar.getText());
            double total1 = Double.parseDouble(this.total.getText());

            porcend = (aplicar1 / 100) * total1;
            dcobro.setText(String.valueOf(porcend));
            otros.setText(String.valueOf(porcend));

        }else if(cant.isSelected()){

            double aplicar1 = Double.parseDouble(this.aplicar.getText());

            dcobro.setText(String.valueOf(aplicar1));
            otros.setText(String.valueOf(aplicar1));
        }

    }//GEN-LAST:event_aplicardesMouseClicked

    private void descuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        menucaja.setVisible(true);
        caja.setVisible(false);
        caja1.setVisible(true);
        descuento.setVisible(true);
        descuentot.setVisible(true);
        factura.setVisible(true);
        factura1.setVisible(false);
        reimpresion.setVisible(true);
        reimpresion1.setVisible(false);
        porcen.setVisible(true);
        cant.setVisible(true);
        aplicar.setVisible(true);
        aplicardes.setVisible(true);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_descuentoMouseClicked

    private void cobroefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cobroefKeyReleased

        try {

            if (vueltacam.getText().equals("")) {

                vueltacam.setText(String.valueOf(total));

            } else {
                vueltacam.setText("00.00");
            }

            double cambiocompra = Double.parseDouble(this.cobroef.getText());

            double totalcompra = Double.parseDouble(this.total.getText());

            cambioventa = cambiocompra - totalcompra;

            vueltacam.setText(String.valueOf(cambioventa));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese Efectivo");
        }

    }//GEN-LAST:event_cobroefKeyReleased

    private void tarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaMouseClicked
        contador ++;
        String numero = String.valueOf(contador);
        lbtransaccion.setText(numero);

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(true);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(true);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(true);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_tarjetaMouseClicked

    private void tarjeta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjeta1MouseClicked
        contador = contador;
        String numero = String.valueOf(contador);
        transaccion.setText(numero);

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(true);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(true);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_tarjeta1MouseClicked

    private void efectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivoMouseClicked
        contador ++;
        String numero = String.valueOf(contador);
        lbtransaccion.setText(numero);

        contador1 ++;
        String numero1 = String.valueOf(contador1);
        transaccion.setText(numero1);

        cobroef.setText("00.00");
        vueltacam.setText("00.00");

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(true);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(true);
        cobroef.setVisible(true);
        cobroefectivo.setVisible(true);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(true);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);

    }//GEN-LAST:event_efectivoMouseClicked

    private void efectivo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivo1MouseClicked

        if (cobroef.getText().equals("00.00")){

            JOptionPane.showMessageDialog(rootPane, "Inserte Efectivo");

            cobroefectivo.setVisible(true);
        } else {

            double totaliva;
            double costoeje;
            double i = .16;
            double totaltic = Double.parseDouble(this.total.getText());
            double montocliente = Double.parseDouble(this.cobroef.getText());

            costoeje = 50 * 2;
            totaliva = costoeje * i;

            cambio.setText(String.valueOf(cambioventa));
            totalefec.setText(String.valueOf(montocliente));
            totalticket.setText(String.valueOf(totaltic));
            iva.setText(String.valueOf(totaliva));
            fechaticket.setText(fecha());
            aplicar.setText("");

            if (cliente.getText().equals("")) {

                clienteticket.setText("S/N");

            } else {
                int cliente1 = Integer.parseInt(this.cliente.getText());
                clienteticket.setText(String.valueOf(cliente1));
            }

            contador = contador;
            String numero = String.valueOf(contador);
            transaccion.setText(numero);

            Box5.setVisible(false);
            Box4.setVisible(false);
            Box3.setVisible(false);
            Box2.setVisible(false);
            Box1.setVisible(false);
            fondofin.setVisible(false);
            fin.setVisible(false);
            jLabel3.setVisible(false);
            jLabel1.setVisible(false);
            Field6.setVisible(false);
            Field5.setVisible(false);
            Field4.setVisible(false);
            Field3.setVisible(false);
            Field2.setVisible(false);
            Field1.setVisible(false);
            fondoretiro.setVisible(false);
            retiro.setVisible(false);
            fondoarqueo.setVisible(false);
            arqueo.setVisible(false);
            menugerencia.setVisible(false);
            gerencia.setVisible(true);
            gerencia1.setVisible(false);
            factura.setVisible(false);
            factura1.setVisible(false);
            reimpresion.setVisible(false);
            reimpresion1.setVisible(false);
            menucaja.setVisible(false);
            caja.setVisible(false);
            caja1.setVisible(false);
            descuento.setVisible(false);
            descuentot.setVisible(false);
            porcen.setVisible(false);
            cant.setVisible(false);
            aplicar.setVisible(false);
            aplicardes.setVisible(false);
            vacio.setVisible(false);
            transaccion.setVisible(true);
            cambio.setVisible(true);
            totalefec.setVisible(true);
            totalticket.setVisible(true);
            iva.setVisible(true);
            otros.setVisible(true);
            concepto.setVisible(true);
            ticket.setVisible(true);
            vueltacam.setVisible(true);
            cobroef.setVisible(true);
            cobroefectivo.setVisible(false);
            cancelacion.setVisible(false);
            cobrotarjeta.setVisible(false);
            cobro5.setVisible(false);
            cobro4.setVisible(false);
            cobro3.setVisible(false);
            cobro2.setVisible(false);
            cobro1.setVisible(false);
            cobro.setVisible(false);
            tarjeta.setVisible(false);
            tarjeta1.setVisible(false);
            efectivo.setVisible(false);
            efectivo1.setVisible(false);
            cliente.setVisible(false);
            eje6.setVisible(true);
            eje61.setVisible(false);
            eje5.setVisible(true);
            eje51.setVisible(false);
            eje4.setVisible(true);
            eje41.setVisible(false);
            eje3.setVisible(true);
            eje31.setVisible(false);
            eje2.setVisible(true);
            eje21.setVisible(false);
            eje1.setVisible(true);
            eje11.setVisible(false);
            subtotal.setVisible(true);
            total.setVisible(true);
            fechaticket.setVisible(true);
            horaticket.setVisible(true);
            clienteticket.setVisible(true);
            lbtransaccion.setVisible(true);
            dcobro.setVisible(false);
        }
    }//GEN-LAST:event_efectivo1MouseClicked

    private void eje61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje61MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(false);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_eje61MouseClicked

    private void eje6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje6MouseClicked

        double i = .16;
        double totaliva;
        double totalventa;
        double subtotalventa;
        double costoeje;

        concepto.setText("Motocicleta");
        cliente.setText("");

        if (aplicar.getText().equals("")) {

            dcobro.setText("00.00");
            otros.setText("00.00");

            costoeje = 50 * 2;
            totaliva = costoeje * i;
            totalventa = costoeje + totaliva;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        } else {
            double otros1 = Double.parseDouble(this.dcobro.getText());

            otros.setText(String.valueOf(otros1));
            dcobro.setText(String.valueOf(otros1));

            costoeje = 50 * 2;
            totaliva = costoeje * i;
            totalventa = (costoeje + totaliva) - otros1;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        }

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(true);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(false);
        eje61.setVisible(true);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(true);

    }//GEN-LAST:event_eje6MouseClicked

    private void eje51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje51MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(false);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_eje51MouseClicked

    private void eje5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje5MouseClicked

        double i = .16;
        double totaliva;
        double totalventa;
        double subtotalventa;
        double costoeje;

        if (aplicar.getText().equals("")) {

            dcobro.setText("00.00");
            otros.setText("00.00");

            costoeje = 50 * 2;
            totaliva = costoeje * i;
            totalventa = costoeje + totaliva;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        } else {
            double otros1 = Double.parseDouble(this.dcobro.getText());

            otros.setText(String.valueOf(otros1));
            dcobro.setText(String.valueOf(otros1));

            costoeje = 50 * 2;
            totaliva = costoeje * i;
            totalventa = (costoeje + totaliva) - otros1;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        }

        concepto.setText("Autobuses");
        cliente.setText("");

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(true);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(true);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(true);
    }//GEN-LAST:event_eje5MouseClicked

    private void eje41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje41MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(false);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_eje41MouseClicked

    private void eje4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje4MouseClicked

        double i = .16;
        double totaliva;
        double totalventa;
        double subtotalventa;
        double costoeje;

        if (aplicar.getText().equals("")) {

            dcobro.setText("00.00");
            otros.setText("00.00");

            costoeje = 50 * 2;
            totaliva = costoeje * i;
            totalventa = costoeje + totaliva;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        } else {
            double otros1 = Double.parseDouble(this.dcobro.getText());

            otros.setText(String.valueOf(otros1));
            dcobro.setText(String.valueOf(otros1));

            costoeje = 50 * 2;
            totaliva = costoeje * i;
            totalventa = (costoeje + totaliva) - otros1;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        }

        concepto.setText("Automoviles");
        cliente.setText("");

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(true);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(true);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(true);
    }//GEN-LAST:event_eje4MouseClicked

    private void eje31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje31MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(false);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_eje31MouseClicked

    private void eje3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje3MouseClicked
        double i = .16;
        double totaliva;
        double totalventa;
        double subtotalventa;
        double costoeje;

        if (aplicar.getText().equals("")) {

            dcobro.setText("00.00");
            otros.setText("00.00");

            costoeje = 50 * 6;
            totaliva = costoeje * i;
            totalventa = costoeje + totaliva;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        } else {
            double otros1 = Double.parseDouble(this.dcobro.getText());

            otros.setText(String.valueOf(otros1));
            dcobro.setText(String.valueOf(otros1));

            costoeje = 50 * 6;
            totaliva = costoeje * i;
            totalventa = (costoeje + totaliva) - otros1;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        }

        concepto.setText("6 & 9 Ejes");
        cliente.setText("");

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(true);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(true);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(true);
    }//GEN-LAST:event_eje3MouseClicked

    private void eje21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje21MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(false);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_eje21MouseClicked

    private void eje2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje2MouseClicked
        double i = .16;
        double totaliva;
        double totalventa;
        double subtotalventa;
        double costoeje;

        if (aplicar.getText().equals("")) {

            dcobro.setText("00.00");
            otros.setText("00.00");

            costoeje = 50 * 5;
            totaliva = costoeje * i;
            totalventa = costoeje + totaliva;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        } else {
            double otros1 = Double.parseDouble(this.dcobro.getText());

            otros.setText(String.valueOf(otros1));
            dcobro.setText(String.valueOf(otros1));

            costoeje = 50 * 5;
            totaliva = costoeje * i;
            totalventa = (costoeje + totaliva) - otros1;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        }

        concepto.setText("4 & 5 Ejes");
        cliente.setText("");

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(true);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(true);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(true);
    }//GEN-LAST:event_eje2MouseClicked

    private void eje11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje11MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(false);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(false);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_eje11MouseClicked

    private void eje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eje1MouseClicked
        double i = .16;
        double totaliva;
        double totalventa;
        double subtotalventa;
        double costoeje;

        if (aplicar.getText().equals("")) {

            dcobro.setText("00.00");
            otros.setText("00.00");

            costoeje = 50 * 3;
            totaliva = costoeje * i;
            totalventa = costoeje + totaliva;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        } else {
            double otros1 = Double.parseDouble(this.dcobro.getText());

            otros.setText(String.valueOf(otros1));
            dcobro.setText(String.valueOf(otros1));

            costoeje = 50 * 3;
            totaliva = costoeje * i;
            totalventa = (costoeje + totaliva) - otros1;
            subtotalventa = totalventa - totaliva;

            subtotal.setText(String.valueOf(subtotalventa));
            total.setText(String.valueOf(totalventa));

        }

        concepto.setText("2 & 3 Ejes");
        cliente.setText("");

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(true);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(true);
        tarjeta1.setVisible(false);
        efectivo.setVisible(true);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(true);
        subtotal.setVisible(true);
        total.setVisible(true);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(true);
    }//GEN-LAST:event_eje1MouseClicked

    private void cajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaMouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        menucaja.setVisible(true);
        caja.setVisible(false);
        caja1.setVisible(true);
        descuento.setVisible(true);
        descuentot.setVisible(false);
        factura.setVisible(true);
        factura1.setVisible(false);
        reimpresion.setVisible(true);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_cajaMouseClicked

    private void caja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja1MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(true);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_caja1MouseClicked

    private void gerenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciaMouseClicked

        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(true);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(true);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(true);
        menugerencia.setVisible(true);
        gerencia.setVisible(false);
        gerencia1.setVisible(true);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(false);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(false);
        eje61.setVisible(false);
        eje5.setVisible(false);
        eje51.setVisible(false);
        eje4.setVisible(false);
        eje41.setVisible(false);
        eje3.setVisible(false);
        eje31.setVisible(false);
        eje2.setVisible(false);
        eje21.setVisible(false);
        eje1.setVisible(false);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_gerenciaMouseClicked

    private void gerencia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerencia1MouseClicked
        Box5.setVisible(false);
        Box4.setVisible(false);
        Box3.setVisible(false);
        Box2.setVisible(false);
        Box1.setVisible(false);
        fondofin.setVisible(false);
        fin.setVisible(false);
        jLabel3.setVisible(false);
        jLabel1.setVisible(false);
        Field6.setVisible(false);
        Field5.setVisible(false);
        Field4.setVisible(false);
        Field3.setVisible(false);
        Field2.setVisible(false);
        Field1.setVisible(false);
        fondoretiro.setVisible(false);
        retiro.setVisible(false);
        fondoarqueo.setVisible(false);
        arqueo.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        factura.setVisible(false);
        factura1.setVisible(false);
        reimpresion.setVisible(false);
        reimpresion1.setVisible(false);
        menucaja.setVisible(false);
        caja.setVisible(true);
        caja1.setVisible(false);
        menugerencia.setVisible(false);
        gerencia.setVisible(true);
        gerencia1.setVisible(false);
        descuento.setVisible(false);
        descuentot.setVisible(false);
        porcen.setVisible(false);
        cant.setVisible(false);
        aplicar.setVisible(false);
        aplicardes.setVisible(false);
        vacio.setVisible(true);
        transaccion.setVisible(false);
        cambio.setVisible(false);
        totalefec.setVisible(false);
        totalticket.setVisible(false);
        iva.setVisible(false);
        otros.setVisible(false);
        concepto.setVisible(false);
        ticket.setVisible(false);
        vueltacam.setVisible(false);
        cobroef.setVisible(false);
        cobroefectivo.setVisible(false);
        cancelacion.setVisible(false);
        cobrotarjeta.setVisible(false);
        cobro5.setVisible(false);
        cobro4.setVisible(false);
        cobro3.setVisible(false);
        cobro2.setVisible(false);
        cobro1.setVisible(false);
        cobro.setVisible(false);
        tarjeta.setVisible(false);
        tarjeta1.setVisible(false);
        efectivo.setVisible(false);
        efectivo1.setVisible(false);
        cliente.setVisible(false);
        eje6.setVisible(true);
        eje61.setVisible(false);
        eje5.setVisible(true);
        eje51.setVisible(false);
        eje4.setVisible(true);
        eje41.setVisible(false);
        eje3.setVisible(true);
        eje31.setVisible(false);
        eje2.setVisible(true);
        eje21.setVisible(false);
        eje1.setVisible(true);
        eje11.setVisible(false);
        subtotal.setVisible(false);
        total.setVisible(false);
        fechaticket.setVisible(false);
        horaticket.setVisible(false);
        clienteticket.setVisible(false);
        lbtransaccion.setVisible(true);
        dcobro.setVisible(false);
    }//GEN-LAST:event_gerencia1MouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        Inicio abrir = new Inicio();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirMouseClicked

    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
    
    private void Imagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Box1;
    private javax.swing.JCheckBox Box2;
    private javax.swing.JCheckBox Box3;
    private javax.swing.JCheckBox Box4;
    private javax.swing.JCheckBox Box5;
    private javax.swing.JTextField Field1;
    private javax.swing.JTextField Field2;
    private javax.swing.JTextField Field3;
    private javax.swing.JTextField Field4;
    private javax.swing.JTextField Field5;
    private javax.swing.JTextField Field6;
    private javax.swing.JTextField aplicar;
    private javax.swing.JButton aplicardes;
    private javax.swing.JLabel arqueo;
    private javax.swing.JLabel caja;
    private javax.swing.JLabel caja1;
    private javax.swing.JLabel cambio;
    private javax.swing.JLabel cancelacion;
    private javax.swing.JCheckBox cant;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel clienteticket;
    private javax.swing.JLabel cobro;
    private javax.swing.JLabel cobro1;
    private javax.swing.JLabel cobro2;
    private javax.swing.JLabel cobro3;
    private javax.swing.JLabel cobro4;
    private javax.swing.JLabel cobro5;
    private javax.swing.JTextField cobroef;
    private javax.swing.JLabel cobroefectivo;
    private javax.swing.JLabel cobrotarjeta;
    private javax.swing.JLabel concepto;
    private javax.swing.JLabel dcobro;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel descuentot;
    private javax.swing.JLabel efectivo;
    private javax.swing.JLabel efectivo1;
    private javax.swing.JLabel eje1;
    private javax.swing.JLabel eje11;
    private javax.swing.JLabel eje2;
    private javax.swing.JLabel eje21;
    private javax.swing.JLabel eje3;
    private javax.swing.JLabel eje31;
    private javax.swing.JLabel eje4;
    private javax.swing.JLabel eje41;
    private javax.swing.JLabel eje5;
    private javax.swing.JLabel eje51;
    private javax.swing.JLabel eje6;
    private javax.swing.JLabel eje61;
    private javax.swing.JLabel factura;
    private javax.swing.JLabel factura1;
    private javax.swing.JLabel fechaticket;
    private javax.swing.JLabel fin;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoarqueo;
    private javax.swing.JLabel fondofin;
    private javax.swing.JLabel fondoretiro;
    private javax.swing.JLabel gerencia;
    private javax.swing.JLabel gerencia1;
    private javax.swing.JLabel horaticket;
    private javax.swing.JLabel iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lbtransaccion;
    private javax.swing.JLabel menucaja;
    private javax.swing.JLabel menugerencia;
    private javax.swing.JLabel otros;
    private javax.swing.JCheckBox porcen;
    private javax.swing.JLabel reimpresion;
    private javax.swing.JLabel reimpresion1;
    private javax.swing.JLabel retiro;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel tarjeta;
    private javax.swing.JLabel tarjeta1;
    private javax.swing.JLabel ticket;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalefec;
    private javax.swing.JLabel totalticket;
    private javax.swing.JLabel transaccion;
    private javax.swing.JLabel vacio;
    private javax.swing.JLabel vueltacam;
    // End of variables declaration//GEN-END:variables
}
