package com.mycompany.graficador;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JColorChooser;

public class Dibujo extends javax.swing.JFrame {
    
    private Color colorito;
    String aux;
    private Graphics2D g2d;
    private Graphics2D g3d;
    
    public Dibujo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        palabra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        colores = new javax.swing.JButton();
        negrita = new javax.swing.JRadioButton();
        subrayado = new javax.swing.JRadioButton();
        Pcontrol = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel1.setText("TRANSFORMADOR DE TEXTO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1270, 720));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraActionPerformed(evt);
            }
        });
        palabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                palabraKeyReleased(evt);
            }
        });

        jLabel2.setText("Ingrese una palabra");

        colores.setText("Color");
        colores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                coloresMousePressed(evt);
            }
        });

        negrita.setText("negrita");

        subrayado.setText("Subrayado");

        Pcontrol.setText("Puntos de control");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1)))
                        .addGap(47, 47, 47)
                        .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subrayado)
                            .addComponent(negrita, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pcontrol))
                        .addGap(0, 498, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subrayado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(negrita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pcontrol)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(colores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabraKeyReleased
        
        //librerias utilizadas para poder dibujar
        g2d = (Graphics2D)jPanel1.getGraphics();
        Path2D.Double curve = new Path2D.Double();
        g2d.setColor(Color.BLACK);
        
        g3d = (Graphics2D)jPanel1.getGraphics();
        
        g3d.setColor(Color.RED);
        
        jPanel1.update(g2d);
        
        boolean Subr, Puntos;
        Puntos = Pcontrol.isSelected();
        Subr = subrayado.isSelected();
        
        if(negrita.isSelected()){//sleeccionar el boton para que comienze a escribir en negritas
            g2d.setStroke(new BasicStroke(3.0f));
        }
        
        g2d.setColor(colorito);
        
        //declaracion de variables
        char aux;
        
        String text = palabra.getText();//convierte la variable de textfield en un string
        int x=0,y=0;//posiciones iniciales
        
        for (int i = 0; i < text.length(); i++) {
            //guarda en la variable aux letra por letra una variable tipo char la cual luego es modificada por una de tipo string y guardada en la variable letra
            aux = text.charAt(i);
            //StringBuilder caret = new StringBuilder(aux);
            String letra = Character.toString(aux);
            if (x<1100){
                if ("a".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(10+x, 70+y, 20+x, 65+y, 20+x, 50+y);
                    curve.moveTo(20+x, 50+y);
                    curve.curveTo(30+x, 75+y, 50+x, 75+y, 60+x, 50+y);
                    curve.moveTo(20+x, 50+y);
                    curve.curveTo(30+x, 20+y, 50+x, 20+y, 60+x, 50+y);
                    curve.moveTo(60+x, 50+y);
                    curve.curveTo(55+x, 65+y, 60+x, 70+y, 70+x, 70+y);
                    //x = x + 70;
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 70+y, 4, 4);
                        g3d.fillOval(20+x, 65+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        g3d.fillOval(30+x, 75+y, 4, 4);
                        g3d.fillOval(50+x, 75+y, 4, 4);
                        g3d.fillOval(60+x, 50+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        g3d.fillOval(30+x, 20+y, 4, 4);
                        g3d.fillOval(50+x, 20+y, 4, 4);
                        g3d.fillOval(60+x, 50+y, 4, 4);
                        g3d.fillOval(60+x, 50+y, 4, 4);
                        g3d.fillOval(55+x, 65+y, 4, 4);
                        g3d.fillOval(60+x, 70+y, 4, 4);
                        g3d.fillOval(70+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(80+x, 75+y);
                    }
                    x=x+70;
                }
                if ("b".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(17+x, 68+y, 30+x, 48+y, 23+x, 25+y);
                    curve.moveTo(23+x, 25+y);
                    curve.curveTo(22+x, 19+y, 18+x, 19+y, 18+x, 25+y);
                    curve.moveTo(18+x, 25+y);
                    curve.curveTo(10+x, 35+y, 10+x, 55+y, 18+x, 68+y);
                    curve.moveTo(18+x, 68+y);
                    curve.curveTo(20+x, 75+y, 20+x, 70+y, 30+x, 65+y);
                    curve.moveTo(30+x, 65+y);
                    curve.curveTo(32+x, 63+y, 33+x, 59+y, 32+x, 55+y);
                    curve.moveTo(32+x, 55+y);
                    curve.lineTo(40+x, 55+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(17+x, 68+y, 4, 4);
                        g3d.fillOval(30+x, 48+y, 4, 4);
                        g3d.fillOval(25+x, 25+y, 4, 4);
                        g3d.fillOval(22+x, 19+y, 4, 4);
                        g3d.fillOval(18+x, 19+y, 4, 4);
                        g3d.fillOval(18+x, 25+y, 4, 4);
                        g3d.fillOval(10+x, 35+y, 4, 4);
                        g3d.fillOval(10+x, 55+y, 4, 4);
                        g3d.fillOval(18+x, 68+y, 4, 4);
                        g3d.fillOval(20+x, 75+y, 4, 4);
                        g3d.fillOval(20+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 65+y, 4, 4);
                        g3d.fillOval(32+x, 63+y, 4, 4);
                        g3d.fillOval(33+x, 59+y, 4, 4);
                        g3d.fillOval(32+x, 55+y, 4, 4);
                        g3d.fillOval(40+x, 55+y, 4, 4);
                    }

                    //solucion al no quedar en 70
                    curve.curveTo(39+x, 63+y, 40+x, 70+y, 50+x, 70+y);
                    
                    
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+50;
                }
                if ("c".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(12+x, 65+y, 16+x, 60+y, 20+x, 50+y);
                    curve.moveTo(20+x, 50+y);
                    curve.curveTo(23+x, 35+y, 35+x, 28+y, 50+x, 35+y);
                    curve.moveTo(20+x, 50+y);
                    curve.curveTo(23+x, 65+y, 30+x, 72+y, 55+x, 70+y);
                    curve.moveTo(20+x, 50+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(12+x, 65+y, 4, 4);
                        g3d.fillOval(16+x, 60+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        g3d.fillOval(23+x, 35+y, 4, 4);
                        g3d.fillOval(35+x, 28+y, 4, 4);
                        g3d.fillOval(50+x, 35+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        g3d.fillOval(23+x, 65+y, 4, 4);
                        g3d.fillOval(30+x, 72+y, 4, 4);
                        g3d.fillOval(55+x, 70+y, 4, 4);
                        g3d.fillOval(20+x, 50+y, 4, 4);
                        
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+50;
                }
                if ("d".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(10+x, 69+y, 13+x, 65+y, 15+x, 55+y);
                    curve.moveTo(15+x, 55+y);
                    curve.curveTo(20+x, 40+y, 38+x, 40+y, 40+x, 55+y);
                    curve.moveTo(40+x, 55+y);
                    curve.lineTo(40+x, 10+y);
                    curve.moveTo(15+x, 55+y);
                    curve.curveTo(20+x, 75+y, 35+x, 75+y, 40+x, 55+y);
                    curve.moveTo(40+x, 55+y);
                    curve.curveTo(40+x, 65+y, 45+x, 72+y, 55+x, 70+y);  
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 69+y, 4, 4);
                        g3d.fillOval(13+x, 65+y, 4, 4);
                        g3d.fillOval(15+x, 55+y, 4, 4);
                        g3d.fillOval(15+x, 55+y, 4, 4);
                        g3d.fillOval(20+x, 40+y, 4, 4);
                        g3d.fillOval(38+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 55+y, 4, 4);
                        g3d.fillOval(15+x, 55+y, 4, 4);
                        g3d.fillOval(20+x, 75+y, 4, 4);
                        g3d.fillOval(35+x, 75+y, 4, 4);
                        g3d.fillOval(40+x, 55+y, 4, 4);
                        g3d.fillOval(40+x, 65+y, 4, 4);
                        g3d.fillOval(45+x, 72+y, 4, 4);
                        g3d.fillOval(55+x, 70+y, 4, 4);
                        g3d.fillOval(40+x, 10+y, 4, 4);
                        
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+55;
                }
                if ("e".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(15+x, 69+y, 27+x, 57+y, 26+x, 43+y);
                    curve.moveTo(26+x, 43+y);
                    curve.curveTo(25+x, 30+y, 18+x, 30+y, 13+x, 43+y);
                    curve.moveTo(13+x, 43+y);
                    curve.curveTo(10+x, 55+y, 25+x, 68+y, 50+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 69+y, 4, 4);
                        g3d.fillOval(27+x, 57+y, 4, 4);
                        g3d.fillOval(26+x, 43+y, 4, 4);
                        g3d.fillOval(25+x, 30+y, 4, 4);
                        g3d.fillOval(18+x, 30+y, 4, 4);
                        g3d.fillOval(13+x, 43+y, 4, 4);
                        g3d.fillOval(10+x, 55+y, 4, 4);
                        g3d.fillOval(25+x, 68+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);  
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+50;
                }

                if ("f".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(20+x, 65+y, 30+x, 50+y, 20+x, 20+y);
                    curve.curveTo(15+x, 15+y, 15+x, 30+y, 10+x, 35+y);
                    curve.curveTo(8+x, 52+y, 8+x, 75+y, 10+x, 90+y);
                    curve.moveTo(10+x, 90+y);
                    curve.curveTo(12+x, 98+y, 18+x, 98+y, 20+x, 90+y);
                    curve.moveTo(20+x, 90+y);
                    curve.curveTo(25+x, 75+y, 18+x, 53+y, 10+x, 60+y);
                    curve.moveTo(10+x, 60+y);
                    curve.curveTo(15+x, 74+y, 20+x, 75+y, 40+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(20+x, 65+y, 4, 4);
                        g3d.fillOval(30+x, 50+y, 4, 4);
                        g3d.fillOval(20+x, 20+y, 4, 4);
                        g3d.fillOval(15+x, 15+y, 4, 4);
                        g3d.fillOval(15+x, 30+y, 4, 4);
                        g3d.fillOval(10+x, 35+y, 4, 4);
                        g3d.fillOval(8+x, 52+y, 4, 4);
                        g3d.fillOval(8+x, 75+y, 4, 4);
                        g3d.fillOval(10+x, 90+y, 4, 4);
                        g3d.fillOval(12+x, 98+y, 4, 4);
                        g3d.fillOval(18+x, 98+y, 4, 4);
                        g3d.fillOval(20+x, 90+y, 4, 4);
                        g3d.fillOval(25+x, 75+y, 4, 4);
                        g3d.fillOval(18+x, 53+y, 4, 4);
                        g3d.fillOval(10+x, 60+y, 4, 4);
                        g3d.fillOval(15+x, 74+y, 4, 4);
                        g3d.fillOval(20+x, 75+y, 4, 4);
                        g3d.fillOval(40+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+40;
                }

                if ("g".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(10+x, 73+y, 16+x, 58+y, 15+x, 55+y);
                    curve.moveTo(15+x, 55+y);
                    curve.curveTo(25+x, 40+y, 35+x, 40+y,40+x , 55+y);
                    curve.moveTo(40+x, 55+y);
                    curve.curveTo(35+x, 75+y, 25+x, 75+y, 15+x, 55+y);
                    curve.moveTo(40+x, 55+y);
                    curve.lineTo(40+x, 90+y);
                    curve.moveTo(40+x, 90+y);
                    curve.curveTo(40+x, 105+y, 25+x, 120+y, 10+x, 100+y);
                    curve.moveTo(10+x, 100+y);
                    curve.curveTo(25+x, 82+y, 35+x, 75+y, 50+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 73+y, 4, 4);
                        g3d.fillOval(16+x, 58+y, 4, 4);
                        g3d.fillOval(15+x, 55+y, 4, 4);
                        g3d.fillOval(25+x, 40+y, 4, 4);
                        g3d.fillOval(35+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 55+y, 4, 4);
                        g3d.fillOval(35+x, 75+y, 4, 4);
                        g3d.fillOval(25+x, 75+y, 4, 4);
                        g3d.fillOval(15+x, 55+y, 4, 4);
                        g3d.fillOval(40+x, 44+y, 4, 4);
                        g3d.fillOval(40+x, 90+y, 4, 4);
                        g3d.fillOval(40+x, 105+y, 4, 4);
                        g3d.fillOval(25+x, 120+y, 4, 4);
                        g3d.fillOval(10+x, 100+y, 4, 4);
                        g3d.fillOval(25+x, 82+y, 4, 4);
                        g3d.fillOval(35+x, 75+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+50;
                }
                if ("h".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(15+x, 60+y, 28+x, 42+y, 30+x, 28+y);
                    curve.moveTo(15+x, 28+y);
                    curve.lineTo(15+x , 70+y);
                    curve.moveTo(30+x, 28+y);
                    curve.curveTo(25+x, 12+y, 22+x, 12+y, 15+x, 28+y);
                    curve.moveTo(15+x, 70+y);
                    curve.curveTo(15+x, 48+y, 32+x, 48+y, 35+x, 62+y);
                    curve.moveTo(35+x, 62+y);
                    curve.curveTo(35+x, 72+y, 40+x, 75+y, 50+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 60+y, 4, 4);
                        g3d.fillOval(28+x, 42+y, 4, 4);
                        g3d.fillOval(30+x, 28+y, 4, 4);
                        g3d.fillOval(15+x, 28+y, 4, 4);
                        g3d.fillOval(15+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 28+y, 4, 4);
                        g3d.fillOval(25+x, 12+y, 4, 4);
                        g3d.fillOval(22+x, 12+y, 4, 4);
                        g3d.fillOval(15+x, 28+y, 4, 4);
                        g3d.fillOval(15+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 48+y, 4, 4);
                        g3d.fillOval(32+x, 48+y, 4, 4);
                        g3d.fillOval(35+x, 62+y, 4, 4);
                        g3d.fillOval(35+x, 62+y, 4, 4);
                        g3d.fillOval(35+x, 72+y, 4, 4);
                        g3d.fillOval(40+x, 75+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+50;
                }

                if ("i".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(18+x, 65+y, 25+x, 58+y, 20+x, 45+y);
                    curve.moveTo(20+x, 35+y);
                    curve.curveTo(18+x, 36+y, 18+x, 39+y, 20+x, 40+y);
                    curve.curveTo(22+x, 39+y, 22+x, 36+y, 20+x, 35+y);
                    curve.moveTo(20+x, 45+y);
                    curve.curveTo(13+x, 52+y, 20+x, 68+y, 45+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(18+x, 65+y, 4, 4);
                        g3d.fillOval(25+x, 58+y, 4, 4);
                        g3d.fillOval(20+x, 45+y, 4, 4);
                        g3d.fillOval(20+x, 35+y, 4, 4);
                        g3d.fillOval(18+x, 36+y, 4, 4);
                        g3d.fillOval(18+x, 39+y, 4, 4);
                        g3d.fillOval(20+x, 40+y, 4, 4);
                        g3d.fillOval(22+x, 39+y, 4, 4);
                        g3d.fillOval(22+x, 36+y, 4, 4);
                        g3d.fillOval(20+x, 35+y, 4, 4);
                        g3d.fillOval(20+x, 45+y, 4, 4);
                        g3d.fillOval(13+x, 52+y, 4, 4);
                        g3d.fillOval(20+x, 68+y, 4, 4);
                        g3d.fillOval(45+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x=x+45;
                }

                if ("j".equals(letra)){//listo
                    curve.moveTo(25+x, 35+y);
                    curve.curveTo(22+x, 36+y, 22+x, 44+y, 25+x, 45+y);
                    curve.curveTo(28+x, 44+y, 28+x, 36+y, 25+x, 35+y);

                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(15+x, 70+y, 15+x, 70+y, 25+x, 50+y);
                    curve.lineTo(25+x, 110+y);
                    curve.curveTo(0+x, 135+y, 0+x, 80+y, 40+x, 70+y);
                    if (Puntos== true) {//puntos de control
                        g3d.fillOval(25+x, 35+y, 4, 4);
                        g3d.fillOval(22+x, 36+y, 4, 4);
                        g3d.fillOval(22+x, 44+y, 4, 4);
                        g3d.fillOval(25+x, 45+y, 4, 4);
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 70+y, 4, 4);
                        g3d.fillOval(25+x, 50+y, 4, 4);
                        g3d.fillOval(25+x, 110+y, 4, 4);
                        g3d.fillOval(0+x, 135+y, 4, 4);
                        g3d.fillOval(0+x, 80+y, 4, 4);
                        g3d.fillOval(40+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
                    }
                    x = x + 40;
                }
                if("k".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(25+x, 65+y, 25+x, 20+y, 20+x,15+y );
                    curve.curveTo(15+x, 20+y, 15+x, 35+y, 20+x, 70+y);
                    curve.moveTo(20+x, 48+y);
                    curve.curveTo(40+x, 51+y, 40+x, 59+y, 25+x, 60+y);
                    curve.curveTo(40+x, 59+y, 40+x, 69+y, 25+x, 70+y);
                    curve.curveTo(20+x, 70+y, 30+x, 70+y, 45+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(25+x, 65+y, 4, 4);
                        g3d.fillOval(25+x, 20+y, 4, 4);
                        g3d.fillOval(20+x, 15+y, 4, 4);
                        g3d.fillOval(15+x, 20+y, 4, 4);
                        g3d.fillOval(15+x, 35+y, 4, 4);
                        g3d.fillOval(20+x, 70+y, 4, 4);
                        g3d.fillOval(20+x, 48+y, 4, 4);
                        g3d.fillOval(40+x, 51+y, 4, 4);
                        g3d.fillOval(40+x, 59+y, 4, 4);
                        g3d.fillOval(25+x, 60+y, 4, 4);
                        g3d.fillOval(40+x, 69+y, 4, 4);
                        g3d.fillOval(25+x, 70+y, 4, 4);
                        g3d.fillOval(20+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 70+y, 4, 4);
                        g3d.fillOval(45+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(45+x, 75+y);
                    }
                    x = x + 45;
                }
                if("l".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(25+x, 65+y, 25+x, 20+y, 20+x,15+y);
                    curve.curveTo(5+x, 20+y, 5+x, 65+y, 35+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(25+x, 65+y, 4, 4);
                        g3d.fillOval(25+x, 20+y, 4, 4);
                        g3d.fillOval(20+x, 15+y, 4, 4);
                        g3d.fillOval(5+x, 20+y, 4, 4);
                        g3d.fillOval(5+x, 65+y, 4, 4);
                        g3d.fillOval(35+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(35+x, 75+y);
                    }
                    x = x + 35; 
                }
                if("m".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(2+x, 70+y, 8+x, 70+y, 10+x, 64+y);
                    curve.lineTo(10+x, 40+y);
                    curve.curveTo(15+x, 35+y, 20+x, 35+y, 25+x, 40+y);
                    curve.lineTo(25+x, 70+y);
                    curve.moveTo(25+x, 40+y);
                    curve.curveTo(30+x, 35+y, 35+x, 35+y, 40+x, 40+y);
                    curve.lineTo(40+x, 70+y);
                    curve.moveTo(40+x, 40+y);
                    curve.curveTo(45+x, 35+y, 45+x, 35+y, 55+x, 40+y);
                    curve.lineTo(55+x, 64+y);
                    curve.curveTo(53+x, 70+y, 62+x, 70+y, 65+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(2+x, 70+y, 4, 4);
                        g3d.fillOval(8+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 64+y, 4, 4);
                        g3d.fillOval(10+x, 40+y, 4, 4);
                        g3d.fillOval(15+x, 35+y, 4, 4);
                        g3d.fillOval(20+x, 35+y, 4, 4);
                        g3d.fillOval(25+x, 40+y, 4, 4);
                        g3d.fillOval(25+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 35+y, 4, 4);
                        g3d.fillOval(35+x, 35+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 70+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(45+x, 35+y, 4, 4);
                        g3d.fillOval(55+x, 40+y, 4, 4);
                        g3d.fillOval(55+x, 64+y, 4, 4);
                        g3d.fillOval(53+x, 70+y, 4, 4);
                        g3d.fillOval(62+x, 70+y, 4, 4);
                        g3d.fillOval(65+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(65+x, 75+y);
                    }
                    x = x + 65;
                }
                if("n".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(2+x, 70+y, 8+x, 70+y, 10+x, 64+y);
                    curve.lineTo(10+x, 40+y);
                    curve.curveTo(15+x, 35+y, 20+x, 35+y, 25+x, 40+y);
                    curve.lineTo(25+x, 70+y);
                    curve.moveTo(25+x, 40+y);
                    curve.curveTo(30+x, 35+y, 35+x, 35+y, 40+x, 40+y);
                    curve.lineTo(40+x, 64+y);
                    curve.curveTo(43+x, 70+y, 47+x, 70+y, 50+x, 70+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(2+x, 70+y, 4, 4);
                        g2d.fillOval(8+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 64+y, 4, 4);
                        g3d.fillOval(10+x, 40+y, 4, 4);
                        g3d.fillOval(15+x, 35+y, 4, 4);
                        g3d.fillOval(20+x, 35+y, 4, 4);
                        g3d.fillOval(25+x, 40+y, 4, 4);
                        g3d.fillOval(25+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 35+y, 4, 4);
                        g3d.fillOval(35+x, 35+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 64+y, 4, 4);
                        g3d.fillOval(43+x, 70+y, 4, 4);
                        g3d.fillOval(47+x, 70+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
                    }
                    x = x +50;
                }
                if("ñ".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(2+x, 70+y, 8+x, 70+y, 10+x, 64+y);
                    curve.lineTo(10+x, 40+y);
                    curve.curveTo(15+x, 35+y, 20+x, 35+y, 25+x, 40+y);
                    curve.lineTo(25+x, 70+y);
                    curve.moveTo(25+x, 40+y);
                    curve.curveTo(30+x, 35+y, 35+x, 35+y, 40+x, 40+y);
                    curve.lineTo(40+x, 64+y);
                    curve.curveTo(43+x, 70+y, 47+x, 70+y, 50+x, 70+y);
                    curve.moveTo(15+x, 30+y);
                    curve.curveTo(20+x, 25+y, 30+x, 35+y, 35+x, 30+y);
                    if (Puntos == true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(2+x, 70+y, 4, 4);
                        g3d.fillOval(8+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 64+y, 4, 4);
                        g3d.fillOval(10+x, 40+y, 4, 4);
                        g3d.fillOval(15+x, 35+y, 4, 4);
                        g3d.fillOval(20+x, 35+y, 4, 4);
                        g3d.fillOval(25+x, 40+y, 4, 4);
                        g3d.fillOval(25+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 35+y, 4, 4);
                        g3d.fillOval(35+x, 35+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 64+y, 4, 4);
                        g3d.fillOval(43+x, 70+y, 4, 4);
                        g3d.fillOval(47+x, 70+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 30+y, 4, 4);
                        g3d.fillOval(20+x, 25+y, 4, 4);
                        g3d.fillOval(30+x, 35+y, 4, 4);
                        g3d.fillOval(35+x, 30+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
                    }
                    x = x + 50;
                }
                if("o".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(4+x, 70+y, 8+x, 70+y, 13+x, 64+y);
                    curve.moveTo(25+x, 40+y);
                    curve.curveTo(5+x, 45+y, 5+x, 65+y, 25+x, 70+y);
                    curve.curveTo(45+x, 65+y, 45+x, 45+y, 25+x, 40+y);
                    curve.moveTo(13+x, 46+y);
                    curve.curveTo(18+x, 50+y, 40+x, 50+y, 45+x, 45+y);
                    curve.moveTo(37+x, 64+y);
                    curve.curveTo(42+x, 70+y, 46+x, 70+y, 50+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
                    }
                    x = x + 50;
                }
                if("p".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(5+x, 75+y, 17+x, 47+y, 20+x, 40+y);
                    curve.curveTo(45+x, 45+y, 45+x, 65+y, 20+x, 70+y);
                    curve.lineTo(20+x, 40+y);
                    curve.lineTo(20+x, 90+y);
                    curve.moveTo(20+x, 70+y);
                    curve.curveTo(25+x, 72+y, 40+x, 72+y, 45+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(45+x, 75+y);
                    }
                    x = x +45;
                }
                if("q".equals(letra)){//listo
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(4+x, 70+y, 8+x, 70+y, 10+x, 64+y);
                    curve.moveTo(20+x, 40+y);
                    curve.curveTo(0+x, 45+y, 0+x, 65+y, 20+x, 70+y);
                    curve.curveTo(40+x, 65+y, 40+x, 45+y, 20+x, 40+y);
                    curve.moveTo(35+x, 55+y);
                    curve.lineTo(35+x, 90+y);
                    curve.moveTo(35+x, 70+y);
                    curve.curveTo(20+x, 85+y, 20+x, 60+y, 45+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(45+x, 75+y);
                    }
                    x = x + 45;
                }
                if("r".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(10+x, 65+y, 10+x, 35+y, 0+x, 30+y);
                    curve.curveTo(0+x, 60+y, 40+x, 35+y, 30+x, 40+y);
                    curve.curveTo(25+x, 35+y, 25+x, 65+y, 30+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 65+y, 4, 4);
                        g3d.fillOval(10+x, 35+y, 4, 4);
                        g3d.fillOval(0+x, 30+y, 4, 4);
                        g3d.fillOval(0+x, 60+y, 4, 4);
                        g3d.fillOval(40+x, 35+y, 4, 4);
                        g3d.fillOval(30+x, 40+y, 4, 4);
                        g3d.fillOval(25+x, 35+y, 4, 4);
                        g3d.fillOval(25+x, 65+y, 4, 4);
                        g3d.fillOval(30+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
                    }
                    x = x + 30;
                }

                if("s".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(15+x, 70+y, 25+x, 30+y, 20+x, 30+y);
                    curve.curveTo(40+x, 35+y, 50+x, 90+y, 25+x, 67+y);
                    curve.curveTo(35+x, 60+y, 40+x, 80+y, 50+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 70+y, 4, 4);
                        g3d.fillOval(25+x, 30+y, 4, 4);
                        g3d.fillOval(20+x, 30+y, 4, 4);
                        g3d.fillOval(40+x, 35+y, 4, 4);
                        g3d.fillOval(50+x, 90+y, 4, 4);
                        g3d.fillOval(25+x, 67+y, 4, 4);
                        g3d.fillOval(35+x, 60+y, 4, 4);
                        g3d.fillOval(40+x, 80+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
                    }
                    x = x + 50;
                }
                if("t".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(25+x, 70+y, 20+x, 20+y, 20+x, 0+y);
                    curve.curveTo(20+x, 70+y, 20+x, 70+y, 40+x, 70+y);
                    curve.moveTo(8+x, 25+y);
                    curve.lineTo(32+x, 25+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(25+x, 70+y, 4, 4);
                        g3d.fillOval(20+x, 20+y, 4, 4);
                        g3d.fillOval(20+x, 0+y, 4, 4);
                        g3d.fillOval(20+x, 70+y, 4, 4);
                        g3d.fillOval(40+x, 70+y, 4, 4);
                        g3d.fillOval(8+x, 25+y, 4, 4);
                        g3d.fillOval(32+x, 25+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
                    }
                    x = x + 40;
                }
                if("u".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(15+x, 75+y, 15+x, 45+y, 15+x, 40+y);
                    curve.curveTo(10+x, 83+y, 45+x, 83+y, 40+x, 40+y);
                    curve.curveTo(40+x, 45+y, 40+x, 75+y, 55+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(15+x, 75+y, 4, 4);
                        g3d.fillOval(15+x, 45+y, 4, 4);
                        g3d.fillOval(15+x, 40+y, 4, 4);
                        g3d.fillOval(10+x, 83+y, 4, 4);
                        g3d.fillOval(45+x, 83+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 45+y, 4, 4);
                        g3d.fillOval(40+x, 75+y, 4, 4);
                        g3d.fillOval(55+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
                    }
                    x = x + 55;
                }
                if("v".equals(letra)){
                    curve.moveTo(0+x, 45+y);
                    curve.curveTo(5+x, 35+y, 10+x, 35+y, 15+x, 40+y);
                    curve.curveTo(10+x, 83+y, 45+x, 83+y, 40+x, 40+y);
                    curve.curveTo(45+x, 45+y, 49+x, 45+y, 53+x, 40+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 45+y, 4, 4);
                        g3d.fillOval(5+x, 35+y, 4, 4);
                        g3d.fillOval(10+x, 35+y, 4, 4);
                        g3d.fillOval(15+x, 40+y, 4, 4);
                        g3d.fillOval(10+x, 83+y, 4, 4);
                        g3d.fillOval(45+x, 83+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(45+x, 45+y, 4, 4);
                        g3d.fillOval(49+x, 45+y, 4, 4);
                        g3d.fillOval(53+x, 40+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
                    }
                    x = x + 53;
                }
                if("w".equals(letra)){
                    curve.moveTo(0+x, 45+y);
                    curve.curveTo(5+x, 30+y, 10+x, 30+y, 15+x, 30+y);
                    curve.curveTo(5+x, 83+y, 40+x, 83+y, 35+x, 35+y);
                    curve.curveTo(25+x, 83+y, 60+x, 83+y, 55+x, 30+y);
                    curve.curveTo(58+x, 35+y, 60+x, 35+y, 66+x, 30+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 45+y, 4, 4);
                        g3d.fillOval(5+x, 30+y, 4, 4);
                        g3d.fillOval(10+x, 30+y, 4, 4);
                        g3d.fillOval(15+x, 30+y, 4, 4);
                        g3d.fillOval(5+x, 83+y, 4, 4);
                        g3d.fillOval(40+x, 83+y, 4, 4);
                        g3d.fillOval(35+x, 35+y, 4, 4);
                        g3d.fillOval(25+x, 83+y, 4, 4);
                        g3d.fillOval(60+x, 83+y, 4, 4);
                        g3d.fillOval(55+x, 30+y, 4, 4);
                        g3d.fillOval(58+x, 35+y, 4, 4);
                        g3d.fillOval(60+x, 35+y, 4, 4);
                        g3d.fillOval(66+x, 30+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(66+x, 75+y);
                    }
                    x = x + 66;
                }

                if("x".equals(letra)){
                    curve.moveTo(6+x, 70+y);
                    curve.curveTo(30+x, 75+y, 30+x, 30+y, 50+x, 30+y);
                    curve.moveTo(0+x, 45+y);
                    curve.curveTo(5+x, 30+y, 10+x, 30+y, 15+x, 30+y);
                    curve.curveTo(28+x, 30+y, 28+x, 80+y, 56+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(6+x, 70+y, 4, 4);
                        g3d.fillOval(30+x, 75+y, 4, 4);
                        g3d.fillOval(30+x, 30+y, 4, 4);
                        g3d.fillOval(50+x, 30+y, 4, 4);
                        g3d.fillOval(0+x, 45+y, 4, 4);
                        g3d.fillOval(5+x, 30+y, 4, 4);
                        g3d.fillOval(10+x, 30+y, 4, 4);
                        g3d.fillOval(15+x, 30+y, 4, 4);
                        g3d.fillOval(28+x, 30+y, 4, 4);
                        g3d.fillOval(28+x, 80+y, 4, 4);
                        g3d.fillOval(56+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(59+x, 75+y);
                    }
                    x = x + 56;
                }
                if("y".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(10+x, 70+y, 10+x, 35+y, 10+x, 40+y);
                    curve.curveTo(10+x, 83+y, 45+x, 83+y, 40+x, 40+y);
                    curve.curveTo(40+x, 120+y, 40+x, 125+y, 20+x, 120+y);
                    curve.curveTo(10+x, 100+y, 40+x, 80+y, 50+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 70+y, 4, 4);
                        g3d.fillOval(10+x, 35+y, 4, 4);
                        g3d.fillOval(10+x, 40+y, 4, 4);
                        g3d.fillOval(10+x, 83+y, 4, 4);
                        g3d.fillOval(45+x, 83+y, 4, 4);
                        g3d.fillOval(40+x, 40+y, 4, 4);
                        g3d.fillOval(40+x, 120+y, 4, 4);
                        g3d.fillOval(40+x, 125+y, 4, 4);
                        g3d.fillOval(20+x, 120+y, 4, 4);
                        g3d.fillOval(10+x, 100+y, 4, 4);
                        g3d.fillOval(40+x, 80+y, 4, 4);
                        g3d.fillOval(50+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
                    }
                    x = x + 50;
                }
                if("z".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(-5+x, 20+y, 55+x, 20+y, 20+x, 70+y); 
                    curve.curveTo(50+x, 90+y, 40+x, 125+y, 20+x, 120+y);
                    curve.curveTo(10+x, 100+y, 30+x, 80+y, 40+x, 70+y);
                    if (Puntos==true) {
                        g3d.fillOval(0+x, 70+y, 4, 4);
                        g3d.fillOval(-5+x, 20+y, 4, 4);
                        g3d.fillOval(55+x, 20+y, 4, 4);
                        g3d.fillOval(20+x, 70+y, 4, 4);
                        g3d.fillOval(50+x, 90+y, 4, 4);
                        g3d.fillOval(40+x, 125+y, 4, 4);
                        g3d.fillOval(20+x, 120+y, 4, 4);
                        g3d.fillOval(10+x, 100+y, 4, 4);
                        g3d.fillOval(30+x, 80+y, 4, 4);
                        g3d.fillOval(40+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
                    }
                    x = x + 40;
                }
                //MAYUSCULAS
                
                if ("A".equals(letra)){//Dibujar A
                    curve.moveTo(0+x,70+y);
                    curve.lineTo(25+x,0+y);
                    curve.moveTo(25+x,0+y);
                    curve.lineTo(50+x,70+y);
                    curve.curveTo(70+x,65+y,70+x,45+y,50+x,35+y);
                    curve.moveTo(50+x,35+y);
                    curve.curveTo(35+x,30+y,15+x,40+y,0+x,48+y);
                    curve.moveTo(0+x,48+y);
                    curve.curveTo(-11+x,48+y,-17+x,32+y,-8+x,20+y);
                    x=x+60;
                }
                if ("B".equals(letra)){//Dibujar B
                    curve.moveTo(20+x,70+y);
                    curve.lineTo(20+x,0+y);
                    curve.moveTo(20+x,0+y);
                    curve.curveTo(75+x,5+y,75+x,25+y,20+x,35+y);
                    curve.moveTo(20+x,35+y);
                    curve.curveTo(75+x,45+y,75+x,65+y,20+x,70+y);
                    curve.moveTo(20+x,70+y);
                    curve.curveTo(0+x,65+y,0+x,55+y,20+x,50+y);
                    curve.moveTo(20+x,50+y);
                    curve.curveTo(38+x,58+y,50+x,68+y,70+x,70+y); 
                    x=x+60;
                }
                
                if ("C".equals(letra)){//Dibujar C
                    curve.moveTo(30+x,0+y);
                    curve.curveTo(72+x,16+y,78+x,10+y,50+x,5+y);
                    curve.moveTo(50+x,5+y);
                    curve.curveTo(0+x,18+y,0+x,48+y,50+x,70+y);
                    curve.moveTo(50+x,70+y);
                    curve.lineTo(70+x,70+y);
                    x=x+60;
                }
                if ("D".equals(letra)){//Dibujar D
                    curve.moveTo(30+x,0+y);
                    curve.curveTo(22+x,18+y,28+x,55+y,20+x,70+y);
                    curve.moveTo(20+x,70+y);
                    curve.curveTo(2+x,62+y,10+x,50+y,35+x,70+y);
                    curve.moveTo(35+x,70+y);
                    curve.curveTo(90+x,48+y,90+x,28+y,30+x,0+y);
                    curve.moveTo(30+x,0+y);
                    curve.curveTo(5+x,5+y,9+x,24+y,20+x,10+y); 
                    x=x+60;
                }
                if ("E".equals(letra)){//Dibujar D
                    curve.moveTo(60+x,0+y);
                    curve.curveTo(48+x,8+y,53+x,19+y,60+x,9+y);
                    curve.moveTo(60+x,9+y);
                    curve.curveTo(30+x,0+y,15+x,23+y,50+x,35+y);
                    curve.moveTo(50+x,35+y);
                    curve.curveTo(18+x,42+y,20+x,65+y,70+x,70+y); 
                    x=x+60;
                }
                if ("F".equals(letra)){//Dibujar F
                    curve.moveTo(80+x,0+y);
                    curve.curveTo(63+x,9+y,27+x,2+y,10+x,10+y);
                    curve.moveTo(10+x,10+y);
                    curve.curveTo(5+x,25+y,12+x,28+y,20+x,18+y);
                    curve.moveTo(40+x,10+y);
                    curve.curveTo(30+x,30+y,30+x,65+y,25+x,80+y);
                    curve.moveTo(25+x,80+y);
                    curve.curveTo(12+x,90+y,8+x,68+y,20+x,60+y);  
                    curve.moveTo(25+x,42+y);
                    curve.lineTo(42+x,42+y);
                    curve.moveTo(42+x,40+y);
                    curve.lineTo(42+x,42+y);
                    x=x+60;
                }
                if ("G".equals(letra)){//Dibujar g
                    curve.moveTo(60+x,10+y);
                    curve.curveTo(36+x,3+y,21+x,18+y,20+x,40+y);
                    curve.moveTo(20+x,40+y);
                    curve.curveTo(35+x,75+y,55+x,75+y,70+x,40+y);
                    curve.moveTo(70+x,40+y);
                    curve.lineTo(55+x,40+y);
                    x=x+60;
                }
                
                if ("H".equals(letra)){//Dibujar H
                    curve.moveTo(30+x,0+y);
                    curve.lineTo(32+x,70+y);
                    curve.moveTo(60+x,0+y);
                    curve.lineTo(62+x,70+y);
                    curve.moveTo(60+x,70+y);
                    curve.curveTo(70+x,80+y,89+x,55+y,80+x,38+y);
                    curve.moveTo(80+x,38+y);
                    curve.curveTo(65+x,32+y,38+x,45+y,18+x,43+y);  
                    curve.moveTo(18+x,43+y);
                    curve.curveTo(9+x,35+y,12+x,12+y,25+x,23+y);
                    x=x+60;
                }
                if ("I".equals(letra)){//Dibujar i
                    curve.moveTo(20+x,5+y);
                    curve.curveTo(32+x,2+y,50+x,10+y,60+x,9+y);
                    curve.moveTo(60+x,9+y);
                    curve.curveTo(70+x,8+y,68+x,1+y,60+x,0+y);  
                    curve.moveTo(60+x,0+y);
                    curve.curveTo(45+x,4+y,45+x,48+y,40+x,60+y); 
                    curve.moveTo(40+x,60+y);
                    curve.curveTo(33+x,75+y,23+x,73+y,25+x,64+y); 
                    curve.moveTo(25+x,64+y);
                    curve.curveTo(41+x,68+y,59+x,70+y,70+x,70+y); 
                    x=x+60;
                }
                if ("J".equals(letra)){//Dibujar J
                    curve.moveTo(0+x, 20+y);
                    curve.curveTo(20+x, 5+y, 40+x, 30+y, 60+x, 20+y);
                    curve.curveTo(60+x, 15+y, 50+x, 5+y, 30+x, 20+y);
                    curve.curveTo(30+x, 20+y, 50+x, 50+y, 40+x, 90+y);
                    curve.curveTo(10+x, 90+y, 0+x, 70+y, 60+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(60+x, 70+y);
                    }
                    x=x+60;
                }
                if ("K".equals(letra)) {
                    curve.moveTo(0+x, 10+y);
                    curve.curveTo(0+x, 10+y, 6+x, 7+y, 10+x, 10+y);
                    curve.lineTo(10+x, 70+y);
                    curve.curveTo(7+x, 70+y, 5+x, 70+y, 0+x, 65+y);
                    curve.moveTo(40+x, 10+y);
                    curve.curveTo(30+x, 5+y, 20+x, 30+y, 10+x, 30+y);
                    curve.curveTo(10+x, 50+y, 25+x, 45+y, 30+x, 65+y);
                    curve.curveTo(30+x, 65+y, 32+x, 70+y, 40+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(40+x, 70+y);
                    }
                    x=x+40;
                }

                if ("L".equals(letra)){//L mayuscula
                    curve.moveTo(25+x, 10+y);
                    curve.curveTo(20+x, 0+y, 5+x, 0+y, 0+x, 10+y);
                    curve.curveTo(0+x, 15+y, 8+x, 40+y, 5+x, 65+y);
                    curve.curveTo(0+x, 80+y, 0+x, 40+y, 5+x, 65+y);
                    curve.curveTo(5+x, 65+y, 15+x, 75+y, 30+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(30+x, 70+y);
                    }
                    x=x+30;
                }
                if ("M".equals(letra)) {
                    curve.moveTo(0+x, 30+y);
                    curve.curveTo(5+x, 0+y, 20+x, 0+y, 25+x, 30+y);
                    curve.lineTo(25+x, 70+y);
                    curve.moveTo(25+x, 30+y);
                    curve.curveTo(30+x, 0+y, 45+x, 0+y, 50+x, 30+y);
                    curve.lineTo(50+x,70+y);
                    curve.moveTo(50+x, 30+y);
                    curve.curveTo(55+x, 0+y, 70+x, 0+y, 75+x, 30+y);
                    curve.lineTo(75+x, 65+y);
                    curve.curveTo(77+x, 70+y, 80+x, 70+y, 85+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(85+x, 70+y);
                    }
                    x=x+85;
                }
                if ("N".equals(letra)) {
                    curve.moveTo(0+x, 30+y);
                    curve.curveTo(5+x, 0+y, 20+x, 0+y, 25+x, 30+y);
                    curve.lineTo(25+x, 70+y);
                    curve.moveTo(25+x, 30+y);
                    curve.curveTo(30+x, 0+y, 45+x, 0+y, 50+x, 30+y);
                    curve.lineTo(50+x,65+y);
                    curve.curveTo(53+x, 70+y, 57+x, 70+y, 60+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(60+x, 70+y);
                    }
                    x=x+60;
                }
                if ("Ñ".equals(letra)) {
                    curve.moveTo(0+x, 30+y);
                    curve.curveTo(5+x, 0+y, 20+x, 0+y, 25+x, 30+y);
                    curve.lineTo(25+x, 70+y);
                    curve.moveTo(25+x, 30+y);
                    curve.curveTo(30+x, 0+y, 45+x, 0+y, 50+x, 30+y);
                    curve.lineTo(50+x,65+y);
                    curve.curveTo(53+x, 70+y, 57+x, 70+y, 60+x, 70+y);
                    curve.moveTo(10+x, 3+y);
                    curve.curveTo(20+x, -2+y, 30+x, 8+y, 40+x, 3+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(60+x, 70+y);
                    }
                    x=x+60;
                }
                if ("O".equals(letra)) {
                    curve.moveTo(40+x, 0+y);
                    curve.curveTo(0+x, 5+y, 0+x, 65+y, 40+x, 70+y);
                    curve.curveTo(80+x, 65+y, 80+x, 5+y, 40+x, 0+y);
                    curve.moveTo(18+x, 14+y);
                    curve.curveTo(40+x, 20+y, 60+x, 20+y, 80+x, 10+y);
                    curve.moveTo(65+x, 56+y);
                    curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(80+x, 70+y);
                    }
                    x=x+80;
                }
                if ("P".equals(letra)) {
                    curve.moveTo(5+x, 15+y);
                    curve.curveTo(10+x,15+y , 25+x,10+y, 20+x,7+y);
                    curve.curveTo(12+x, 5+y, 8+x, 10+y, 20+x, 10+y);
                    curve.curveTo(45+x, 10+y, 45+x, 35+y, 20+x, 40+y);
                    curve.lineTo(20+x, 7+y);
                    curve.lineTo(20+x, 70+y);
                    curve.curveTo(25+x, 70+y, 30+x, 75+y, 45+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(45+x, 70+y);
                    }
                    x=x+45;
                }

                if ("Q".equals(letra)) {
                    curve.moveTo(40+x, 0+y);
                    curve.curveTo(0+x, 5+y, 0+x, 65+y, 40+x, 70+y);
                    curve.curveTo(80+x, 65+y, 80+x, 5+y, 40+x, 0+y);
                    curve.moveTo(18+x, 14+y);
                    curve.curveTo(20+x, 30+y, 20+x, 50+y, 25+x, 50+y);
                    curve.curveTo(35+x, 40+y, 55+x, 40+y, 65+x, 56+y);
                    curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
                    if (Subr == true){
                        curve.moveTo(0+x, 70+y);
                        curve.lineTo(80+x, 70+y);
                    }
                    x=x+80;
                }
                if("R".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(20+x, 70+y, 5+x, 0+y, 5+x, 10+y);
                    curve.moveTo(-10+x, 10+y);
                    curve.curveTo(50+x, 0+y, 50+x, 35+y, 11+x, 40+y);
                    curve.moveTo(11+x, 40+y);
                    curve.curveTo(45+x, 45+y, 20+x, 70+y, 45+x, 70+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(45+x, 75+y);
                    }
                    x = x + 45;
                }
                if("S".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(15+x, 70+y, 25+x, 30+y, 20+x, 0+y);
                    curve.curveTo(80+x, 25+y, 60+x, 90+y, 30+x, 65+y);
                    curve.curveTo(35+x, 50+y, 45+x, 80+y, 70+x, 70+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(70+x, 75+y);
                    }
                    x = x + 70;
                }
                if("T".equals(letra)){
                    curve.moveTo(25+x, 70+y);
                    curve.curveTo(50+x, 70+y, 35+x, 0+y, 35+x, 5+y);
                    curve.moveTo(5+x, 20+y);
                    curve.curveTo(10+x, -10+y, 50+x, 15+y, 60+x, 0+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x = x + 60;
                }
                if("U".equals(letra)){
                    curve.moveTo(0+x, 10+y);
                    curve.curveTo(25+x, 0+y, 0+x, 74+y, 32+x, 70+y);
                    curve.moveTo(32+x, 70+y);
                    curve.curveTo(50+x, 74+y, 39+x, 15+y, 43+x, 10+y);
                    curve.curveTo(43+x, 40+y, 40+x, 75+y, 60+x, 70+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x = x + 60;
                }
                if("V".equals(letra)){
                    curve.moveTo(0+x, 25+y);
                    curve.curveTo(0+x, 5+y, 15+x, 5+y, 15+x, 10+y);
                    curve.curveTo(10+x, 90+y, 45+x, 90+y, 40+x, 10+y);
                    curve.curveTo(45+x, 15+y, 49+x, 15+y, 60+x, 10+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x = x + 60;
                }
                if("W".equals(letra)){
                    curve.moveTo(0+x, 25+y);
                    curve.curveTo(0+x, 5+y, 15+x, 5+y, 15+x, 10+y);
                    curve.curveTo(10+x, 90+y, 45+x, 90+y, 40+x, 10+y);
                    curve.curveTo(35+x, 90+y, 70+x, 90+y, 65+x, 10+y);
                    curve.curveTo(50+x, 10+y, 70+x, 20+y, 80+x, 10+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(80+x, 75+y);
                    }
                    x = x + 80;
                }
                if("X".equals(letra)){
                    curve.moveTo(0+x, 70+y);
                    curve.curveTo(30+x, 80+y, 25+x, 10+y, 55+x, 10+y);
                    curve.moveTo(0+x, 10+y);
                    curve.curveTo(25+x, 0+y, 25+x, 80+y, 55+x, 70+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
                    }
                    x = x + 55;
                }
                if("Y".equals(letra)){
                    curve.moveTo(0+x, 10+y);
                    curve.curveTo(25+x, 0+y, 0+x, 74+y, 32+x, 70+y);
                    curve.moveTo(32+x, 70+y);
                    curve.curveTo(50+x, 74+y, 39+x, 15+y, 43+x, 10+y);
                    curve.curveTo(43+x, 60+y, 50+x, 140+y, 28+x, 120+y);
                    curve.curveTo(25+x, 90+y, 32+x, 80+y, 55+x, 70+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
                    }
                    x = x + 55;
                }
                if("Z".equals(letra)){
                    curve.moveTo(5+x, 20+y);
                    curve.curveTo(10+x, -10+y, 50+x, 15+y, 60+x, 0+y);
                    curve.lineTo(5+x, 70+y);
                    curve.moveTo(18+x, 35+y);
                    curve.lineTo(48+x, 35+y);
                    curve.moveTo(5+x, 70+y);
                    curve.curveTo(10+x, 60+y, 50+x, 75+y, 60+x, 70+y);
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    if (Subr == true){
                        curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
                    }
                    x = x + 60;
                }

                //SIMBOLOS
                if("-".equals(letra)){
                    curve.moveTo(10+x, 50+y);
                    curve.lineTo(30+x, 50+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(10+x, 50+y, 4, 4);
                        g2d.fillOval(30+x, 50+y, 4, 4);
                    }
                    x = x + 40;
                }
                if("_".equals(letra)){
                    curve.moveTo(10+x, 70+y);
                    curve.lineTo(30+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(10+x, 70+y, 4, 4);
                        g2d.fillOval(30+x, 70+y, 4, 4);
                    }
                    x = x + 40;
                }
                if("(".equals(letra)){
                    curve.moveTo(15+x, 0+y);
                    curve.curveTo(5+x, 0+y, 5+x, 70+y, 15+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(15+x, 0+y, 4, 4);
                        g2d.fillOval(5+x, 0+y, 4, 4);
                        g2d.fillOval(5+x, 70+y, 4, 4);
                        g2d.fillOval(15+x, 70+y, 4, 4);
                    }
                    x = x + 30;
                }
                if(")".equals(letra)){
                    curve.moveTo(15+x, 0+y);
                    curve.curveTo(25+x, 0+y, 25+x, 70+y, 15+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(15+x, 0+y, 4, 4);
                        g2d.fillOval(25+x, 0+y, 4, 4);
                        g2d.fillOval(25+x, 70+y, 4, 4);
                        g2d.fillOval(15+x, 70+y, 4, 4);
                    }
                    x = x + 30;
                }
                if("[".equals(letra)){
                    curve.moveTo(25+x, 0+y);
                    curve.lineTo(10+x, 0+y);
                    curve.lineTo(10+x, 70+y);
                    curve.lineTo(25+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(25+x, 0+y, 4, 4);
                        g2d.fillOval(10+x, 0+y, 4, 4);
                        g2d.fillOval(10+x, 70+y, 4, 4);
                        g2d.fillOval(25+x, 70+y, 4, 4);
                    }
                    x = x + 30;
                } 
                if("{".equals(letra)){
                    curve.moveTo(25+x, 0+y);
                    curve.curveTo(10+x, 0+y, 15+x, 40+y, 5+x, 35+y);
                    curve.curveTo(20+x, 35+y, 10+x, 70+y, 25+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(25+x, 0+y, 4, 4);
                        g2d.fillOval(10+x, 0+y, 4, 4);
                        g2d.fillOval(15+x, 40+y, 4, 4);
                        g2d.fillOval(5+x, 35+y, 4, 4);
                        g2d.fillOval(20+x, 35+y, 4, 4);
                        g2d.fillOval(10+x, 70+y, 4, 4);
                        g2d.fillOval(25+x, 70+y, 4, 4);
                    }
                    x = x + 35;
                } 
                if("}".equals(letra)){
                    curve.moveTo(0+x, 0+y);
                    curve.curveTo(15+x, 0+y, 10+x, 40+y, 20+x, 35+y);
                    curve.curveTo(5+x, 35+y, 15+x, 70+y, 0+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 0+y, 4, 4);
                        g2d.fillOval(15+x, 0+y, 4, 4);
                        g2d.fillOval(10+x, 40+y, 4, 4);
                        g2d.fillOval(20+x, 35+y, 4, 4);
                        g2d.fillOval(5+x, 35+y, 4, 4);
                        g2d.fillOval(15+x, 70+y, 4, 4);
                        g2d.fillOval(0+x, 70+y, 4, 4);
                    }
                    x = x + 35;
                } 
                if("]".equals(letra)){
                    curve.moveTo(10+x, 0+y);
                    curve.lineTo(25+x, 0+y);
                    curve.lineTo(25+x, 70+y);
                    curve.lineTo(10+x, 70+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(10+x, 0+y, 4, 4);
                        g2d.fillOval(25+x, 0+y, 4, 4);
                        g2d.fillOval(25+x, 70+y, 4, 4);
                        g2d.fillOval(10+x, 70+y, 4, 4);
                    }
                    x = x + 30;
                }
                if("!".equals(letra)){ //falta punto del signo
                    curve.moveTo(25+x, 90+y);
                    curve.curveTo(20+x, 91+y, 20+x, 99+y, 25+x, 100+y);
                    curve.curveTo(30+x, 99+y, 30+x, 91+y, 25+x, 90+y);
                    curve.moveTo(25+x, 80+y);
                    curve.lineTo(25+x, 10+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(25+x, 90+y, 4, 4);
                        g2d.fillOval(20+x, 91+y, 4, 4);
                        g2d.fillOval(20+x, 99+y, 4, 4);
                        g2d.fillOval(25+x, 100+y, 4, 4);
                        g2d.fillOval(30+x, 99+y, 4, 4);
                        g2d.fillOval(30+x, 91+y, 4, 4);
                        g2d.fillOval(25+x, 90+y, 4, 4);
                        g2d.fillOval(25+x, 80+y, 4, 4);
                        g2d.fillOval(25+x, 10+y, 4, 4);
                    }
                    x = x + 40;
                }
                if("¡".equals(letra)){ //falta punto del signo
                    curve.moveTo(25+x, 10+y);
                    curve.curveTo(20+x, 11+y, 20+x, 19+y, 25+x, 20+y);
                    curve.curveTo(30+x,19+y, 30+x, 11+y, 25+x, 10+y);
                    curve.moveTo(25+x, 30+y);
                    curve.lineTo(25+x, 90+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(25+x, 10+y, 4, 4);
                        g2d.fillOval(20+x, 11+y, 4, 4);
                        g2d.fillOval(20+x, 19+y, 4, 4);
                        g2d.fillOval(25+x, 20+y, 4, 4);
                        g2d.fillOval(30+x, 19+y, 4, 4);
                        g2d.fillOval(30+x, 11+y, 4, 4);
                        g2d.fillOval(25+x, 10+y, 4, 4);
                        g2d.fillOval(25+x, 30+y, 4, 4);
                        g2d.fillOval(25+x, 90+y, 4, 4);
                    }
                    x = x + 40;
                }
                if("¿".equals(letra)){ //falta punto del signo
                    curve.moveTo(25+x, 10+y);
                    curve.curveTo(20+x, 11+y, 20+x, 19+y, 25+x, 20+y);
                    curve.curveTo(30+x,19+y, 30+x, 11+y, 25+x, 10+y);
                    curve.moveTo(25+x, 30+y);
                    curve.lineTo(25+x, 65+y);
                    curve.curveTo(-30+x, 90+y, 45+x, 140+y, 45+x, 90+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(25+x, 10+y, 4, 4);
                        g2d.fillOval(20+x, 11+y, 4, 4);
                        g2d.fillOval(20+x, 19+y, 4, 4);
                        g2d.fillOval(25+x, 20+y, 4, 4);
                        g2d.fillOval(30+x, 19+y, 4, 4);
                        g2d.fillOval(30+x, 11+y, 4, 4);
                        g2d.fillOval(25+x, 10+y, 4, 4);
                        g2d.fillOval(25+x, 30+y, 4, 4);
                        g2d.fillOval(25+x, 65+y, 4, 4);
                        g2d.fillOval(-30+x, 90+y, 4, 4);
                        g2d.fillOval(45+x, 140+y, 4, 4);
                        g2d.fillOval(45+x, 90+y, 4, 4);
                    }
                    x = x + 50;
                }
                if("?".equals(letra)){ //falta punto del signo
                    curve.moveTo(25+x, 100+y);
                    curve.curveTo(20+x, 101+y, 20+x, 109+y, 25+x, 110+y);
                    curve.curveTo(30+x, 109+y, 30+x, 101+y, 25+x, 100+y);
                    curve.moveTo(25+x, 90+y);
                    curve.lineTo(25+x, 65+y);
                    curve.curveTo(90+x, 50+y, 25+x, -20+y, 5+x, 30+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(25+x, 100+y, 4, 4);
                        g2d.fillOval(20+x, 101+y, 4, 4);
                        g2d.fillOval(20+x, 109+y, 4, 4);
                        g2d.fillOval(25+x, 110+y, 4, 4);
                        g2d.fillOval(30+x, 109+y, 4, 4);
                        g2d.fillOval(30+x, 101+y, 4, 4);
                        g2d.fillOval(25+x, 100+y, 4, 4);
                        g2d.fillOval(25+x, 90+y, 4, 4);
                        g2d.fillOval(25+x, 65+y, 4, 4);
                        g2d.fillOval(90+x, 50+y, 4, 4);
                        g2d.fillOval(25+x, -20+y, 4, 4);
                        g2d.fillOval(5+x, 30+y, 4, 4);
                    }
                    x = x + 50;
                }
                if(".".equals(letra)){
                    curve.moveTo(5+x, 65+y);
                    curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
                    curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 65+y, 4, 4);
                        g2d.fillOval(2+x, 67+y, 4, 4);
                        g2d.fillOval(2+x, 68+y, 4, 4);
                        g2d.fillOval(5+x, 70+y, 4, 4);
                        g2d.fillOval(7+x, 68+y, 4, 4);
                        g2d.fillOval(7+x, 67+y, 4, 4);
                        g2d.fillOval(5+x, 65+y, 4, 4);
                    }
                    x=x+50;
                }
                if("...".equals(letra)){
                    curve.moveTo(5+x, 65+y);
                    curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
                    curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
                    
                    curve.moveTo(15+x, 65+y);
                    curve.curveTo(12+x, 67+y, 12+x, 68+y, 15+x, 70+y);
                    curve.curveTo(17+x, 68+y, 17+x, 67+y, 15+x, 65+y);
                    
                    curve.moveTo(25+x, 65+y);
                    curve.curveTo(22+x, 67+y, 22+x, 68+y, 25+x, 70+y);
                    curve.curveTo(27+x, 68+y, 27+x, 67+y, 25+x, 65+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 65+y, 4, 4);
                        g2d.fillOval(2+x, 67+y, 4, 4);
                        g2d.fillOval(2+x, 68+y, 4, 4);
                        g2d.fillOval(5+x, 70+y, 4, 4);
                        g2d.fillOval(7+x, 68+y, 4, 4);
                        g2d.fillOval(7+x, 67+y, 4, 4);
                        g2d.fillOval(5+x, 65+y, 4, 4);
                        
                        g2d.fillOval(15+x, 65+y, 4, 4);
                        g2d.fillOval(12+x, 67+y, 4, 4);
                        g2d.fillOval(12+x, 68+y, 4, 4);
                        g2d.fillOval(15+x, 70+y, 4, 4);
                        g2d.fillOval(17+x, 68+y, 4, 4);
                        g2d.fillOval(17+x, 67+y, 4, 4);
                        g2d.fillOval(15+x, 65+y, 4, 4);
                        
                        g2d.fillOval(25+x, 65+y, 4, 4);
                        g2d.fillOval(22+x, 67+y, 4, 4);
                        g2d.fillOval(22+x, 68+y, 4, 4);
                        g2d.fillOval(25+x, 70+y, 4, 4);
                        g2d.fillOval(27+x, 68+y, 4, 4);
                        g2d.fillOval(27+x, 67+y, 4, 4);
                        g2d.fillOval(25+x, 65+y, 4, 4);
                    }
                    
                    x=x+50;
                }
                if(":".equals(letra)){
                    curve.moveTo(5+x, 65+y);
                    curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
                    curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
                    
                    curve.moveTo(5+x, 45+y);
                    curve.curveTo(2+x, 47+y, 2+x, 48+y, 5+x, 50+y);
                    curve.curveTo(7+x, 48+y, 7+x, 47+y, 5+x, 45+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 65+y, 4, 4);
                        g2d.fillOval(2+x, 67+y, 4, 4);
                        g2d.fillOval(2+x, 68+y, 4, 4);
                        g2d.fillOval(5+x, 70+y, 4, 4);
                        g2d.fillOval(7+x, 68+y, 4, 4);
                        g2d.fillOval(7+x, 67+y, 4, 4);
                        
                        g2d.fillOval(5+x, 45+y, 4, 4);
                        g2d.fillOval(2+x, 47+y, 4, 4);
                        g2d.fillOval(2+x, 48+y, 4, 4);
                        g2d.fillOval(5+x, 50+y, 4, 4);
                        g2d.fillOval(7+x, 48+y, 4, 4);
                        g2d.fillOval(7+x, 47+y, 4, 4);
                    }
                    x=x+50;
                }
                if(",".equals(letra)){
                    curve.moveTo(5+x,70+y);
                    curve.curveTo(6+x, 71+y, 3+x, 73+y, 2+x, 80+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 70+y, 4, 4);
                        g2d.fillOval(6+x, 71+y, 4, 4);
                        g2d.fillOval(3+x, 73+y, 4, 4);
                        g2d.fillOval(2+x, 80+y, 4, 4);
                    }
                    x=x+50;
                }
                if(";".equals(letra)){
                    curve.moveTo(5+x, 65+y);
                    curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
                    curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
                    curve.moveTo(5+x,75+y);
                    curve.curveTo(4+x, 76+y, 3+x, 78+y, 2+x, 80+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 65+y, 4, 4);
                        g2d.fillOval(2+x, 67+y, 4, 4);
                        g2d.fillOval(2+x, 68+y, 4, 4);
                        g2d.fillOval(5+x, 70+y, 4, 4);
                        g2d.fillOval(7+x, 68+y, 4, 4);
                        g2d.fillOval(7+x, 67+y, 4, 4);
                        g2d.fillOval(5+x, 65+y, 4, 4);
                        g2d.fillOval(5+x, 75+y, 4, 4);
                        g2d.fillOval(4+x, 76+y, 4, 4);
                        g2d.fillOval(3+x, 78+y, 4, 4);
                        g2d.fillOval(2+x, 80+y, 4, 4);
                    }
                    x=x+50;
                }
                if("'".equals(letra)){
                    curve.moveTo(5+x, 0+y);
                    curve.curveTo(4+x, 4+y, 2+x, 7+y, 0+x, 10+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 0+y, 4, 4);
                        g2d.fillOval(4+x, 4+y, 4, 4);
                        g2d.fillOval(2+x, 7+y, 4, 4);
                        g2d.fillOval(0+x, 10+y, 4, 4);
                    }
                    x=x+5;
                }
                if( "\"".equals(letra)){
                    curve.moveTo(5+x, 0+y);
                    curve.curveTo(4+x, 4+y, 2+x, 7+y, 0+x, 10+y);
                    curve.moveTo(10+x, 0+y);
                    curve.curveTo(9+x, 4+y, 7+x, 7+y, 5+x, 10+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(5+x, 0+y, 4, 4);
                        g2d.fillOval(4+x, 4+y, 4, 4);
                        g2d.fillOval(2+x, 7+y, 4, 4);
                        g2d.fillOval(0+x, 10+y, 4, 4);
                        g2d.fillOval(10+x, 0+y, 4, 4);
                        g2d.fillOval(9+x, 4+y, 4, 4);
                        g2d.fillOval(7+x, 7+y, 4, 4);
                        g2d.fillOval(5+x, 10+y, 4, 4);
                    }
                    x=x+5;
                }
                //comillas españolas
                if("<".equals(letra)){
                    curve.moveTo(15+x, 30+y);
                    curve.lineTo(0+x,40+y);
                    curve.lineTo(15+x,50+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(15+x, 30+y, 4, 4);
                        g2d.fillOval(0+x, 40+y, 4, 4);
                        g2d.fillOval(15+x, 50+y, 4, 4);
                    }
                    x=x+15;
                }
                if(">".equals(letra)){
                    curve.moveTo(0+x, 30+y);
                    curve.lineTo(15+x,40+y);
                    curve.lineTo(0+x,50+y);
                    
                    if (Puntos==true) {
                        g2d.fillOval(0+x, 30+y, 4, 4);
                        g2d.fillOval(15+x, 40+y, 4, 4);
                        g2d.fillOval(0+x, 50+y, 4, 4);
                    }
                    x=x+15;
                }
                if (" ".equals(letra)){//reconoce los espacios para hacer un salto entre letras
                    x = x + 50;
                }//validacio para poder escribir en negritas
                if("^N".contentEquals(letra)){
                    g2d.setStroke(new BasicStroke(3.0f));
                }
            }
            if (x>=1100){
                y = y+90;
                x = 0;
            }
        }
        g2d.draw(curve);//dibuja la letra en el JPanel dentro de la interfaz
    }//GEN-LAST:event_palabraKeyReleased

    public void apalabraKeyReleased(java.awt.event.KeyEvent evt) { // editable                                       
        palabraKeyReleased(evt);
    }
    
    private void palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabraActionPerformed

    private void coloresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coloresMousePressed
        
        // select color code 
        colorito = Color.BLACK;
        
        colorito = JColorChooser.showDialog(this,"select a color", colorito);
        
        if(colorito==null){
            colorito = Color.white;
           
        }
    }//GEN-LAST:event_coloresMousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Pcontrol;
    private javax.swing.JButton colores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton negrita;
    private javax.swing.JTextField palabra;
    public javax.swing.JRadioButton subrayado;
    // End of variables declaration//GEN-END:variables
}
