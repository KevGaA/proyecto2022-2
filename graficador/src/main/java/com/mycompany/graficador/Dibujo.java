//pruebas
package com.mycompany.graficador;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import javax.swing.JColorChooser;

public class Dibujo extends javax.swing.JFrame {
    
    public static Color colorito;
    private Graphics2D g2d;
    private Graphics2D g3d;
    int Xp;
    public static boolean Puntos=false;
    
    public Dibujo() {
        initComponents();
        Pcontrol1.setBackground(Color.white);
        colores.setBackground(Color.white);
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
        Pcontrol1 = new javax.swing.JButton();
        cursiva = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel1.setText("TRANSFORMADOR DE TEXTO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1270, 720));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1174, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

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

        Pcontrol1.setText("Puntos de control");
        Pcontrol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pcontrol1MousePressed(evt);
            }
        });

        cursiva.setText("Cursiva");

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
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pcontrol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(negrita, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subrayado)
                            .addComponent(cursiva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pcontrol1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subrayado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(negrita)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabraKeyReleased
        g2d = (Graphics2D)jPanel1.getGraphics();
        Path2D.Double curve = new Path2D.Double();
        jPanel1.update(g2d);
        g2d.setStroke(new BasicStroke(1.5f));
        boolean Subr=false,Negrita=false,Curs=false;
        
        int x=0,y=0;// posicion de las letras
        char aux;
        
        
        ArrayList<Path2D.Double> DibujoFinal = new ArrayList<>();
        ArrayList<Graphics2D> PuntosControl = new ArrayList<>();
        
        String text = palabra.getText();
        String textSeparado[]=text.split(" ");
        
        
        
        for (int i = 0; i < textSeparado.length; i++){
            System.out.println(textSeparado[i]);
            Negrita=false;
            Curs=false;
            Subr=false;
            
            for (int k = 0; k < textSeparado[i].length(); k++) {
                if (textSeparado[i].length()>1) {//funcion que detecta los carets y los modifica
                    if (textSeparado[i].charAt(0)=='^'){
                        if (textSeparado[i].charAt(1)=='N') {
                            Negrita=true;
                            textSeparado[i] = textSeparado[i].substring(2);
                        }if (textSeparado[i].charAt(1)=='S') {
                            Subr=true;
                            textSeparado[i] = textSeparado[i].substring(2);
                        }if (textSeparado[i].charAt(1)=='K') {
                            Curs=true;
                            textSeparado[i] = textSeparado[i].substring(2);
                        }
                    }
                }
                
                aux = textSeparado[i].charAt(k);
                String letra = Character.toString(aux);

                if (x<1100){
                    if (Negrita == true){
                        //g2d.setStroke(new BasicStroke(2f));//se enchanza en trazo para evitar letras incompletas
                    }
                    if (Puntos == true) {
                        Pcontrol1.setBackground(new java.awt.Color(255, 102, 102));
                        }
                    else{
                        Pcontrol1.setBackground(Color.white);
                    }
                    if (" ".equals(letra)){//listo
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(50+x, 75+y);
                        } 
                }
                    if ("a".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j <3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+70;
                    }
                    if ("b".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+40;
                    }
                    if ("c".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);

                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+50;
                    }
                    if ("d".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+55;
                    }
                    if ("e".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+50;
                    }

                    if ("f".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+40;
                    }

                    if ("g".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+50;
                    }
                    if ("h".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+50;
                    }

                    if ("i".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x=x+45;
                    }

                    if ("j".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos == true) {//puntos de control
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr==true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 40;
                    }
                    if("k".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));

                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));

                        }
                        x = x + 40;
                    }
                    if("l".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 35; 
                    }
                    if("m".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 65;
                    }
                    if("n".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x +50;
                    }
                    if("ñ".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 50;
                    }
                    if("o".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 50;
                    }
                    if("p".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x +45;
                    }
                    if("q".equals(letra)){//listo
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true){
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 45;
                    }
                    if("r".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 30;
                    }

                    if("s".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 50;
                    }
                    if("t".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 40;
                    }
                    if("u".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 55;
                    }
                    if("v".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 53;
                    }
                    if("w".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 4; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 66;
                    }

                    if("x".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 56;
                    }
                    if("y".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 50;
                    }
                    if("z".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            DibujoFinal.add(Dletras(letra,x,y));
                            DibujoFinal.add(Dsubrayado(letra,x,y));
                        }
                        x = x + 40;
                    }
                    if ("A".equals(letra)){//Dibujar A
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x = x + 60;
                    }
                    if ("B".equals(letra)){//Dibujar B
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }

                    if ("C".equals(letra)){//Dibujar C
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("D".equals(letra)){//Dibujar D
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("F".equals(letra)){//Dibujar F
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("G".equals(letra)){//Dibujar g
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }

                    if ("H".equals(letra)){//Dibujar H
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("I".equals(letra)){//Dibujar i
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("J".equals(letra)){//Dibujar J
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Curs==true) {

                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 20+y);
                            curve.curveTo(20+x, 5+y, 40+x, 30+y, 60+x, 20+y);
                            curve.curveTo(60+x, 15+y, 50+x, 5+y, 30+x, 20+y);
                            curve.curveTo(30+x, 20+y, 50+x, 50+y, 40+x, 90+y);
                            curve.curveTo(10+x, 90+y, 0+x, 70+y, 60+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("K".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 10+y);
                            curve.curveTo(0+x, 10+y, 6+x, 7+y, 10+x, 10+y);
                            curve.lineTo(10+x, 70+y);
                            curve.curveTo(7+x, 70+y, 5+x, 70+y, 0+x, 65+y);
                            curve.moveTo(40+x, 10+y);
                            curve.curveTo(30+x, 5+y, 20+x, 30+y, 10+x, 30+y);
                            curve.curveTo(10+x, 50+y, 25+x, 45+y, 30+x, 65+y);
                            curve.curveTo(30+x, 65+y, 32+x, 70+y, 40+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(40+x, 75+y);
                        }
                        x=x+40;
                    }

                    if ("L".equals(letra)){//L mayuscula
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(25+x, 10+y);
                            curve.curveTo(20+x, 0+y, 5+x, 0+y, 0+x, 10+y);
                            curve.curveTo(0+x, 15+y, 8+x, 40+y, 5+x, 65+y);
                            curve.curveTo(0+x, 80+y, 0+x, 40+y, 5+x, 65+y);
                            curve.curveTo(5+x, 65+y, 15+x, 75+y, 30+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(30+x, 75+y);
                        }
                        x=x+30;
                    }
                    if ("M".equals(letra)) {
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
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
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(85+x, 75+y);
                        }
                        x=x+85;
                    }
                    if ("N".equals(letra)) {
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 30+y);
                            curve.curveTo(5+x, 0+y, 20+x, 0+y, 25+x, 30+y);
                            curve.lineTo(25+x, 70+y);
                            curve.moveTo(25+x, 30+y);
                            curve.curveTo(30+x, 0+y, 45+x, 0+y, 50+x, 30+y);
                            curve.lineTo(50+x,65+y);
                            curve.curveTo(53+x, 70+y, 57+x, 70+y, 60+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("Ñ".equals(letra)) {
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 30+y);
                            curve.curveTo(5+x, 0+y, 20+x, 0+y, 25+x, 30+y);
                            curve.lineTo(25+x, 70+y);
                            curve.moveTo(25+x, 30+y);
                            curve.curveTo(30+x, 0+y, 45+x, 0+y, 50+x, 30+y);
                            curve.lineTo(50+x,65+y);
                            curve.curveTo(53+x, 70+y, 57+x, 70+y, 60+x, 70+y);
                            curve.moveTo(10+x, 3+y);
                            curve.curveTo(20+x, -2+y, 30+x, 8+y, 40+x, 3+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x=x+60;
                    }
                    if ("O".equals(letra)) {
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(40+x, 0+y);
                            curve.curveTo(0+x, 5+y, 0+x, 65+y, 40+x, 70+y);
                            curve.curveTo(80+x, 65+y, 80+x, 5+y, 40+x, 0+y);
                            curve.moveTo(18+x, 14+y);
                            curve.curveTo(40+x, 20+y, 60+x, 20+y, 80+x, 10+y);
                            curve.moveTo(65+x, 56+y);
                            curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(80+x, 75+y);
                        }
                        x=x+80;
                    }
                    if ("P".equals(letra)) {
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(5+x, 15+y);
                            curve.curveTo(10+x,15+y , 25+x,10+y, 20+x,7+y);
                            curve.curveTo(12+x, 5+y, 8+x, 10+y, 20+x, 10+y);
                            curve.curveTo(45+x, 10+y, 45+x, 35+y, 20+x, 40+y);
                            curve.lineTo(20+x, 7+y);
                            curve.lineTo(20+x, 70+y);
                            curve.curveTo(25+x, 70+y, 30+x, 75+y, 45+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(45+x, 75+y);
                        }
                        x=x+45;
                    }

                    if ("Q".equals(letra)) {
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(40+x, 0+y);
                            curve.curveTo(0+x, 5+y, 0+x, 65+y, 40+x, 70+y);
                            curve.curveTo(80+x, 65+y, 80+x, 5+y, 40+x, 0+y);
                            curve.moveTo(18+x, 14+y);
                            curve.curveTo(20+x, 30+y, 20+x, 50+y, 25+x, 50+y);
                            curve.curveTo(35+x, 40+y, 55+x, 40+y, 65+x, 56+y);
                            curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(80+x, 75+y);
                        }
                        x=x+80;
                    }
                    if("R".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(45+x, 75+y);
                        }
                        x = x + 45;
                    }
                    if("S".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(70+x, 75+y);
                        }
                        x = x + 70;
                    }
                    if("T".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x = x + 60;
                    }
                    if("U".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x = x + 60;
                    }
                    if("V".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x = x + 60;
                    }
                    if("W".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(80+x, 75+y);
                        }
                        x = x + 80;
                    }
                    if("X".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(55+x, 75+y);
                        }
                        x = x + 55;
                    }
                    if("Y".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(55+x, 75+y);
                        }
                        x = x + 55;
                    }
                    if("Z".equals(letra)){
                        if (Negrita==false && Curs==false && Subr==false) {
                            DibujoFinal.add(Dletras(letra,x,y));
                        }
                        if (Negrita == true) {
                            for (int j = 0; j < 3; j++) {
                                DibujoFinal.add(Dletras(letra,x,y));
                                x++;
                            }
                        }
                        if (Curs==true) {
                            DibujoFinal.add(Dcursivas(letra,x,y));
                        }
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        if (Subr == true){
                            curve.moveTo(0+x, 75+y);
                            curve.lineTo(60+x, 75+y);
                        }
                        x = x + 60;
                    }
                    //SIMBOLOS
                    if("-".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 40;
                    }
                    if("_".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 40;
                    }
                    if("(".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 30;
                    }
                    if(")".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 30;
                    }
                    if("[".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 30;
                    } 
                    if("{".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 35;
                    } 
                    if("}".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 35;
                    } 
                    if("]".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 30;
                    }
                    if("!".equals(letra)){ 
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 40;
                    }
                    if("¡".equals(letra)){ 
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 40;
                    }
                    if("¿".equals(letra)){ 
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 50;
                    }
                    if("?".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x = x + 50;
                    }
                    if(".".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+50;
                    }
                    if(":".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+50;
                    }
                    if(",".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+50;
                    }
                    if(";".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+50;
                    }
                    if("'".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+5;
                    }
                    if( "\"".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+5;
                    }
                    if("<".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+15;
                    }
                    if(">".equals(letra)){
                        DibujoFinal.add(Dletras(letra,x,y));
                        if (Puntos==true) {
                            Pcontrol(letra,x,y);
                        }
                        x=x+15;
                    }
                    if (" ".equals(letra)){
                        x = x + 50;
                    }
                    
                }
                if (x>1150) {
                    DibujoFinal.add(Dletras("-",x,y));
                }
                if (x>1070){
                    y = y+90;
                    x = 0;
                }
            }x=x+50;
        }
        
        g2d.setColor(colorito);
        for (int i = 0; i < DibujoFinal.size(); i++) {
            g2d.draw(DibujoFinal.get(i));
        }
        if(Puntos==true){
            for (int i = 0; i < PuntosControl.size(); i++) {
                g2d.draw((Shape) PuntosControl.get(i));//consultar de porque no se puede mostrar como tal y si o si debe usarse un shape
            }
        }
    }//GEN-LAST:event_palabraKeyReleased
    
    public Path2D.Double Dletras(String letra, int x, int y){
        Path2D.Double curve = new Path2D.Double();
        if ("a".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(10+x, 70+y, 20+x, 65+y, 20+x, 50+y);
            curve.moveTo(20+x, 50+y);
            curve.curveTo(30+x, 75+y, 50+x, 75+y, 60+x, 50+y);
            curve.moveTo(20+x, 50+y);
            curve.curveTo(30+x, 20+y, 50+x, 20+y, 60+x, 50+y);
            curve.moveTo(60+x, 50+y);
            curve.curveTo(55+x, 65+y, 60+x, 70+y, 70+x, 70+y);
        }
        if ("b".equals(letra)){
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
        }
        if ("c".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(12+x, 65+y, 16+x, 60+y, 20+x, 50+y);
            curve.moveTo(20+x, 50+y);
            curve.curveTo(23+x, 35+y, 35+x, 28+y, 50+x, 35+y);
            curve.moveTo(20+x, 50+y);
            curve.curveTo(23+x, 65+y, 30+x, 72+y, 55+x, 70+y);
            curve.moveTo(20+x, 50+y);
        }
        if ("d".equals(letra)){
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
        }
        if ("e".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(15+x, 69+y, 27+x, 57+y, 26+x, 43+y);
            curve.moveTo(26+x, 43+y);
            curve.curveTo(25+x, 30+y, 18+x, 30+y, 13+x, 43+y);
            curve.moveTo(13+x, 43+y);
            curve.curveTo(10+x, 55+y, 25+x, 68+y, 50+x, 70+y);
        }
        if ("f".equals(letra)){
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
        }
        if ("g".equals(letra)){
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
        }
        if ("h".equals(letra)){
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
        }
        if ("i".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(18+x, 65+y, 25+x, 58+y, 20+x, 45+y);
            curve.moveTo(20+x, 35+y);
            curve.curveTo(18+x, 36+y, 18+x, 39+y, 20+x, 40+y);
            curve.curveTo(22+x, 39+y, 22+x, 36+y, 20+x, 35+y);
            curve.moveTo(20+x, 45+y);
            curve.curveTo(13+x, 52+y, 20+x, 68+y, 45+x, 70+y);
        }
        if ("j".equals(letra)){
            curve.moveTo(25+x, 35+y);
            curve.curveTo(22+x, 36+y, 22+x, 44+y, 25+x, 45+y);
            curve.curveTo(28+x, 44+y, 28+x, 36+y, 25+x, 35+y);
            curve.moveTo(0+x, 70+y);
            curve.curveTo(15+x, 70+y, 15+x, 70+y, 25+x, 50+y);
            curve.lineTo(25+x, 110+y);
            curve.curveTo(0+x, 135+y, 0+x, 80+y, 40+x, 70+y);
        }
        if("k".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(25+x, 65+y, 25+x, 20+y, 20+x,15+y );
            curve.curveTo(15+x, 20+y, 15+x, 35+y, 20+x, 70+y);
            curve.moveTo(20+x, 48+y);
            curve.curveTo(40+x, 51+y, 40+x, 59+y, 25+x, 60+y);
            curve.curveTo(40+x, 59+y, 40+x, 69+y, 25+x, 70+y);
            curve.curveTo(20+x, 70+y, 30+x, 70+y, 40+x, 70+y);
        }
        if("l".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(25+x, 65+y, 25+x, 20+y, 20+x,15+y);
            curve.curveTo(5+x, 20+y, 5+x, 65+y, 35+x, 70+y);
        }
        if("m".equals(letra)){
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
        }
        if("ñ".equals(letra)){
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
        }
        if("o".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(4+x, 70+y, 8+x, 70+y, 13+x, 64+y);
            curve.moveTo(25+x, 40+y);
            curve.curveTo(5+x, 45+y, 5+x, 65+y, 25+x, 70+y);
            curve.curveTo(45+x, 65+y, 45+x, 45+y, 25+x, 40+y);
            curve.moveTo(13+x, 46+y);
            curve.curveTo(18+x, 50+y, 40+x, 50+y, 45+x, 45+y);
            curve.moveTo(37+x, 64+y);
            curve.curveTo(42+x, 70+y, 46+x, 70+y, 50+x, 70+y);
        }
        if("p".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(5+x, 75+y, 17+x, 47+y, 20+x, 40+y);
            curve.curveTo(45+x, 45+y, 45+x, 65+y, 20+x, 70+y);
            curve.lineTo(20+x, 40+y);
            curve.lineTo(20+x, 90+y);
            curve.moveTo(20+x, 70+y);
            curve.curveTo(25+x, 72+y, 40+x, 72+y, 45+x, 70+y);
        }
        if("q".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(4+x, 70+y, 8+x, 70+y, 10+x, 64+y);
            curve.moveTo(20+x, 40+y);
            curve.curveTo(0+x, 45+y, 0+x, 65+y, 20+x, 70+y);
            curve.curveTo(40+x, 65+y, 40+x, 45+y, 20+x, 40+y);
            curve.moveTo(35+x, 55+y);
            curve.lineTo(35+x, 90+y);
            curve.moveTo(35+x, 70+y);
            curve.curveTo(20+x, 85+y, 20+x, 60+y, 45+x, 70+y);
        }
        if("r".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(10+x, 65+y, 10+x, 35+y, 0+x, 30+y);
            curve.curveTo(0+x, 60+y, 40+x, 35+y, 30+x, 40+y);
            curve.curveTo(25+x, 35+y, 25+x, 65+y, 30+x, 70+y);
        }

        if("s".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(15+x, 70+y, 25+x, 30+y, 20+x, 30+y);
            curve.curveTo(40+x, 35+y, 50+x, 90+y, 25+x, 67+y);
            curve.curveTo(35+x, 60+y, 40+x, 80+y, 50+x, 70+y);
        }
        if("t".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(25+x, 70+y, 20+x, 20+y, 20+x, 0+y);
            curve.curveTo(20+x, 70+y, 20+x, 70+y, 40+x, 70+y);
            curve.moveTo(8+x, 25+y);
            curve.lineTo(32+x, 25+y);
        }
        if("u".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(15+x, 75+y, 15+x, 45+y, 15+x, 40+y);
            curve.curveTo(10+x, 83+y, 45+x, 83+y, 40+x, 40+y);
            curve.curveTo(40+x, 45+y, 40+x, 75+y, 55+x, 70+y);
        }
        if("v".equals(letra)){
            curve.moveTo(0+x, 45+y);
            curve.curveTo(5+x, 35+y, 10+x, 35+y, 15+x, 40+y);
            curve.curveTo(10+x, 83+y, 45+x, 83+y, 40+x, 40+y);
            curve.curveTo(45+x, 45+y, 49+x, 45+y, 53+x, 40+y);
        }
        if("w".equals(letra)){
            curve.moveTo(0+x, 45+y);
            curve.curveTo(5+x, 30+y, 10+x, 30+y, 15+x, 30+y);
            curve.curveTo(5+x, 83+y, 40+x, 83+y, 35+x, 35+y);
            curve.curveTo(25+x, 83+y, 60+x, 83+y, 55+x, 30+y);
            curve.curveTo(58+x, 35+y, 60+x, 35+y, 66+x, 30+y);
        }
        if("x".equals(letra)){
            curve.moveTo(6+x, 70+y);
            curve.curveTo(30+x, 75+y, 30+x, 30+y, 50+x, 30+y);
            curve.moveTo(0+x, 45+y);
            curve.curveTo(5+x, 30+y, 10+x, 30+y, 15+x, 30+y);
            curve.curveTo(28+x, 30+y, 28+x, 80+y, 56+x, 70+y);
        }
        if("y".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(10+x, 70+y, 10+x, 35+y, 10+x, 40+y);
            curve.curveTo(10+x, 83+y, 45+x, 83+y, 40+x, 40+y);
            curve.curveTo(40+x, 120+y, 40+x, 125+y, 20+x, 120+y);
            curve.curveTo(10+x, 100+y, 40+x, 80+y, 50+x, 70+y);
        }
        if("z".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(-5+x, 20+y, 55+x, 20+y, 20+x, 70+y); 
            curve.curveTo(50+x, 90+y, 40+x, 125+y, 20+x, 120+y);
            curve.curveTo(10+x, 100+y, 30+x, 80+y, 40+x, 70+y);
        }
        if ("A".equals(letra)){
            curve.moveTo(0+x,70+y);
            curve.lineTo(25+x,0+y);
            curve.moveTo(25+x,0+y);
            curve.lineTo(50+x,70+y);
            curve.curveTo(70+x,65+y,70+x,45+y,50+x,35+y);
            curve.moveTo(50+x,35+y);
            curve.curveTo(35+x,30+y,15+x,40+y,0+x,48+y);
            curve.moveTo(0+x,48+y);
            curve.curveTo(-11+x,48+y,-17+x,32+y,-8+x,20+y);
        }
        if ("B".equals(letra)){
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
        }
        if ("C".equals(letra)){
            curve.moveTo(30+x,0+y);
            curve.curveTo(72+x,16+y,78+x,10+y,50+x,5+y);
            curve.moveTo(50+x,5+y);
            curve.curveTo(0+x,18+y,0+x,48+y,50+x,70+y);
            curve.moveTo(50+x,70+y);
            curve.lineTo(70+x,70+y);
        }
        if ("D".equals(letra)){
            curve.moveTo(30+x,0+y);
            curve.curveTo(22+x,18+y,28+x,55+y,20+x,70+y);
            curve.moveTo(20+x,70+y);
            curve.curveTo(2+x,62+y,10+x,50+y,35+x,70+y);
            curve.moveTo(35+x,70+y);
            curve.curveTo(90+x,48+y,90+x,28+y,30+x,0+y);
            curve.moveTo(30+x,0+y);
            curve.curveTo(5+x,5+y,9+x,24+y,20+x,10+y); 
        }
        if ("E".equals(letra)){
            curve.moveTo(60+x,0+y);
            curve.curveTo(48+x,8+y,53+x,19+y,60+x,9+y);
            curve.moveTo(60+x,9+y);
            curve.curveTo(30+x,0+y,15+x,23+y,50+x,35+y);
            curve.moveTo(50+x,35+y);
            curve.curveTo(18+x,42+y,20+x,65+y,70+x,70+y);
        }
        if ("F".equals(letra)){
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
        }
        if ("G".equals(letra)){
            curve.moveTo(60+x,10+y);
            curve.curveTo(36+x,3+y,21+x,18+y,20+x,40+y);
            curve.moveTo(20+x,40+y);
            curve.curveTo(35+x,75+y,55+x,75+y,70+x,40+y);
            curve.moveTo(70+x,40+y);
            curve.lineTo(55+x,40+y);
        }
        if ("H".equals(letra)){
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
        }
        if ("I".equals(letra)){
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
        }
        if ("J".equals(letra)){
            curve.moveTo(0+x, 20+y);
            curve.curveTo(20+x, 5+y, 40+x, 30+y, 60+x, 20+y);
            curve.curveTo(60+x, 15+y, 50+x, 5+y, 30+x, 20+y);
            curve.curveTo(30+x, 20+y, 50+x, 50+y, 40+x, 90+y);
            curve.curveTo(10+x, 90+y, 0+x, 70+y, 60+x, 70+y);

        }
        if ("K".equals(letra)){
            curve.moveTo(0+x, 10+y);
            curve.curveTo(0+x, 10+y, 6+x, 7+y, 10+x, 10+y);
            curve.lineTo(10+x, 70+y);
            curve.curveTo(7+x, 70+y, 5+x, 70+y, 0+x, 65+y);
            curve.moveTo(40+x, 10+y);
            curve.curveTo(30+x, 5+y, 20+x, 30+y, 10+x, 30+y);
            curve.curveTo(10+x, 50+y, 25+x, 45+y, 30+x, 65+y);
            curve.curveTo(30+x, 65+y, 32+x, 70+y, 40+x, 70+y);
        }

        if ("L".equals(letra)){
            curve.moveTo(25+x, 10+y);
            curve.curveTo(20+x, 0+y, 5+x, 0+y, 0+x, 10+y);
            curve.curveTo(0+x, 15+y, 8+x, 40+y, 5+x, 65+y);
            curve.curveTo(0+x, 80+y, 0+x, 40+y, 5+x, 65+y);
            curve.curveTo(5+x, 65+y, 15+x, 75+y, 30+x, 70+y);
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
        }
        if ("N".equals(letra)) {
            curve.moveTo(0+x, 30+y);
            curve.curveTo(5+x, 0+y, 20+x, 0+y, 25+x, 30+y);
            curve.lineTo(25+x, 70+y);
            curve.moveTo(25+x, 30+y);
            curve.curveTo(30+x, 0+y, 45+x, 0+y, 50+x, 30+y);
            curve.lineTo(50+x,65+y);
            curve.curveTo(53+x, 70+y, 57+x, 70+y, 60+x, 70+y);
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
        }
        if ("O".equals(letra)) {
            curve.moveTo(40+x, 0+y);
            curve.curveTo(0+x, 5+y, 0+x, 65+y, 40+x, 70+y);
            curve.curveTo(80+x, 65+y, 80+x, 5+y, 40+x, 0+y);
            curve.moveTo(18+x, 14+y);
            curve.curveTo(40+x, 20+y, 60+x, 20+y, 80+x, 10+y);
            curve.moveTo(65+x, 56+y);
            curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
        }
        if ("P".equals(letra)) {
            curve.moveTo(5+x, 15+y);
            curve.curveTo(10+x,15+y , 25+x,10+y, 20+x,7+y);
            curve.curveTo(12+x, 5+y, 8+x, 10+y, 20+x, 10+y);
            curve.curveTo(45+x, 10+y, 45+x, 35+y, 20+x, 40+y);
            curve.lineTo(20+x, 7+y);
            curve.lineTo(20+x, 70+y);
            curve.curveTo(25+x, 70+y, 30+x, 75+y, 45+x, 70+y);
        }
        if ("Q".equals(letra)) {
            curve.moveTo(40+x, 0+y);
            curve.curveTo(0+x, 5+y, 0+x, 65+y, 40+x, 70+y);
            curve.curveTo(80+x, 65+y, 80+x, 5+y, 40+x, 0+y);
            curve.moveTo(18+x, 14+y);
            curve.curveTo(20+x, 30+y, 20+x, 50+y, 25+x, 50+y);
            curve.curveTo(35+x, 40+y, 55+x, 40+y, 65+x, 56+y);
            curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
        }
        if("R".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(20+x, 70+y, 5+x, 0+y, 5+x, 10+y);
            curve.moveTo(-10+x, 10+y);
            curve.curveTo(50+x, 0+y, 50+x, 35+y, 11+x, 40+y);
            curve.moveTo(11+x, 40+y);
            curve.curveTo(45+x, 45+y, 20+x, 70+y, 45+x, 70+y);
        }
        if("S".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(15+x, 70+y, 25+x, 30+y, 20+x, 0+y);
            curve.curveTo(80+x, 25+y, 60+x, 90+y, 30+x, 65+y);
            curve.curveTo(35+x, 50+y, 45+x, 80+y, 70+x, 70+y);
        }
        if("T".equals(letra)){
            curve.moveTo(25+x, 70+y);
            curve.curveTo(50+x, 70+y, 35+x, 0+y, 35+x, 5+y);
            curve.moveTo(5+x, 20+y);
            curve.curveTo(10+x, -10+y, 50+x, 15+y, 60+x, 0+y);
        }
        if("U".equals(letra)){
            curve.moveTo(0+x, 10+y);
            curve.curveTo(25+x, 0+y, 0+x, 74+y, 32+x, 70+y);
            curve.moveTo(32+x, 70+y);
            curve.curveTo(50+x, 74+y, 39+x, 15+y, 43+x, 10+y);
            curve.curveTo(43+x, 40+y, 40+x, 75+y, 60+x, 70+y);
        }
        if("V".equals(letra)){
            curve.moveTo(0+x, 25+y);
            curve.curveTo(0+x, 5+y, 15+x, 5+y, 15+x, 10+y);
            curve.curveTo(10+x, 90+y, 45+x, 90+y, 40+x, 10+y);
            curve.curveTo(45+x, 15+y, 49+x, 15+y, 60+x, 10+y);
        }
        if("W".equals(letra)){
            curve.moveTo(0+x, 25+y);
            curve.curveTo(0+x, 5+y, 15+x, 5+y, 15+x, 10+y);
            curve.curveTo(10+x, 90+y, 45+x, 90+y, 40+x, 10+y);
            curve.curveTo(35+x, 90+y, 70+x, 90+y, 65+x, 10+y);
            curve.curveTo(50+x, 10+y, 70+x, 20+y, 80+x, 10+y);
        }
        if("Y".equals(letra)){
            curve.moveTo(0+x, 10+y);
            curve.curveTo(25+x, 0+y, 0+x, 74+y, 32+x, 70+y);
            curve.moveTo(32+x, 70+y);
            curve.curveTo(50+x, 74+y, 39+x, 15+y, 43+x, 10+y);
            curve.curveTo(43+x, 60+y, 50+x, 140+y, 28+x, 120+y);
            curve.curveTo(25+x, 90+y, 32+x, 80+y, 55+x, 70+y);
        }
        if("Z".equals(letra)){
            curve.moveTo(5+x, 20+y);
            curve.curveTo(10+x, -10+y, 50+x, 15+y, 60+x, 0+y);
            curve.lineTo(5+x, 70+y);
            curve.moveTo(18+x, 35+y);
            curve.lineTo(48+x, 35+y);
            curve.moveTo(5+x, 70+y);
            curve.curveTo(10+x, 60+y, 50+x, 75+y, 60+x, 70+y);
        }
        if("-".equals(letra)){
            curve.moveTo(10+x, 50+y);
            curve.lineTo(30+x, 50+y);
        }
        if("_".equals(letra)){
            curve.moveTo(10+x, 70+y);
            curve.lineTo(30+x, 70+y);
        }
        if("(".equals(letra)){
            curve.moveTo(15+x, 0+y);
            curve.curveTo(5+x, 0+y, 5+x, 70+y, 15+x, 70+y);
        }
        if(")".equals(letra)){
            curve.moveTo(15+x, 0+y);
            curve.curveTo(25+x, 0+y, 25+x, 70+y, 15+x, 70+y);
        }
        if("[".equals(letra)){
            curve.moveTo(25+x, 0+y);
            curve.lineTo(10+x, 0+y);
            curve.lineTo(10+x, 70+y);
            curve.lineTo(25+x, 70+y);
        } 
        if("{".equals(letra)){
            curve.moveTo(25+x, 0+y);
            curve.curveTo(10+x, 0+y, 15+x, 40+y, 5+x, 35+y);
            curve.curveTo(20+x, 35+y, 10+x, 70+y, 25+x, 70+y);
        } 
        if("}".equals(letra)){
            curve.moveTo(0+x, 0+y);
            curve.curveTo(15+x, 0+y, 10+x, 40+y, 20+x, 35+y);
            curve.curveTo(5+x, 35+y, 15+x, 70+y, 0+x, 70+y);
        } 
        if("]".equals(letra)){
            curve.moveTo(10+x, 0+y);
            curve.lineTo(25+x, 0+y);
            curve.lineTo(25+x, 70+y);
            curve.lineTo(10+x, 70+y);
        }
        if("!".equals(letra)){
            curve.moveTo(25+x, 90+y);
            curve.curveTo(20+x, 91+y, 20+x, 99+y, 25+x, 100+y);
            curve.curveTo(30+x, 99+y, 30+x, 91+y, 25+x, 90+y);
            curve.moveTo(25+x, 80+y);
            curve.lineTo(25+x, 10+y);
        }
        if("¡".equals(letra)){
            curve.moveTo(25+x, 10+y);
            curve.curveTo(20+x, 11+y, 20+x, 19+y, 25+x, 20+y);
            curve.curveTo(30+x,19+y, 30+x, 11+y, 25+x, 10+y);
            curve.moveTo(25+x, 30+y);
            curve.lineTo(25+x, 90+y);
        }
        if("¿".equals(letra)){ //falta punto del signo
            curve.moveTo(25+x, 10+y);
            curve.curveTo(20+x, 11+y, 20+x, 19+y, 25+x, 20+y);
            curve.curveTo(30+x,19+y, 30+x, 11+y, 25+x, 10+y);
            curve.moveTo(25+x, 30+y);
            curve.lineTo(25+x, 65+y);
            curve.curveTo(-30+x, 90+y, 45+x, 140+y, 45+x, 90+y);
        }
        if("?".equals(letra)){
            curve.moveTo(25+x, 100+y);
            curve.curveTo(20+x, 101+y, 20+x, 109+y, 25+x, 110+y);
            curve.curveTo(30+x, 109+y, 30+x, 101+y, 25+x, 100+y);
            curve.moveTo(25+x, 90+y);
            curve.lineTo(25+x, 65+y);
            curve.curveTo(90+x, 50+y, 25+x, -20+y, 5+x, 30+y);
        }
        if(".".equals(letra)){
            curve.moveTo(5+x, 65+y);
            curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
            curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
        }
        if(":".equals(letra)){
            curve.moveTo(5+x, 65+y);
            curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
            curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
            curve.moveTo(5+x, 45+y);
            curve.curveTo(2+x, 47+y, 2+x, 48+y, 5+x, 50+y);
            curve.curveTo(7+x, 48+y, 7+x, 47+y, 5+x, 45+y);
        }
        if(",".equals(letra)){
            curve.moveTo(5+x,70+y);
            curve.curveTo(6+x, 71+y, 3+x, 73+y, 2+x, 80+y);
        }
        if(";".equals(letra)){
            curve.moveTo(5+x, 65+y);
            curve.curveTo(2+x, 67+y, 2+x, 68+y, 5+x, 70+y);
            curve.curveTo(7+x, 68+y, 7+x, 67+y, 5+x, 65+y);
            curve.moveTo(5+x,75+y);
            curve.curveTo(4+x, 76+y, 3+x, 78+y, 2+x, 80+y);
        }
        if("'".equals(letra)){
            curve.moveTo(5+x, 0+y);
            curve.curveTo(4+x, 4+y, 2+x, 7+y, 0+x, 10+y);
        }
        if( "\"".equals(letra)){
            curve.moveTo(5+x, 0+y);
            curve.curveTo(4+x, 4+y, 2+x, 7+y, 0+x, 10+y);
            curve.moveTo(10+x, 0+y);
            curve.curveTo(9+x, 4+y, 7+x, 7+y, 5+x, 10+y);
        }
        if("<".equals(letra)){
            curve.moveTo(15+x, 30+y);
            curve.lineTo(0+x,40+y);
            curve.lineTo(15+x,50+y);
        }
        if(">".equals(letra)){
            curve.moveTo(0+x, 30+y);
            curve.lineTo(15+x,40+y);
            curve.lineTo(0+x,50+y);
        }
    return curve;   
    }
    
    public Path2D.Double Dcursivas(String letra, int x, int y){
        Path2D.Double curve = new Path2D.Double();
        if("a".equals(letra)){
            
        }
        if("b".equals(letra)){
            
        }
        if("c".equals(letra)){
            
        }
        if("d".equals(letra)){
            
        }
        if("e".equals(letra)){
            
        }
        if("f".equals(letra)){
            
        }
        if("g".equals(letra)){
            
        }
        if("h".equals(letra)){
            
        }
        if("i".equals(letra)){
            
        }
        if("j".equals(letra)){
            curve.moveTo(35+x, 35+y);
            curve.curveTo(32+x, 36+y, 32+x, 44+y, 35+x, 45+y);
            curve.curveTo(38+x, 44+y, 38+x, 36+y, 35+x, 35+y);
            curve.moveTo(0+x, 70+y);
            curve.curveTo(20+x, 70+y, 20+x, 70+y, 35+x, 50+y);
            curve.lineTo(15+x, 110+y);
            curve.curveTo(-5+x, 135+y, -5+x, 80+y, 40+x, 70+y);
        }
        if("k".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(30+x, 65+y, 35+x, 20+y, 40+x,10+y );
            curve.curveTo(30+x, 10+y, 20+x, 35+y, 15+x, 70+y);
            curve.moveTo(17+x, 52+y);
            curve.curveTo(40+x, 51+y, 40+x, 59+y, 25+x, 60+y);
            curve.curveTo(40+x, 59+y, 40+x, 69+y, 25+x, 70+y);
            curve.curveTo(20+x, 70+y, 30+x, 70+y, 40+x, 70+y);
        }
        if("l".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(35+x, 65+y, 45+x, 20+y, 45+x,15+y);
            curve.curveTo(25+x, 20+y, 20+x, 70+y, 35+x, 70+y);
        }
        if("m".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(2+x, 70+y, 8+x, 70+y, 10+x, 64+y);
            curve.lineTo(15+x, 40+y);
            curve.curveTo(20+x, 35+y, 25+x, 35+y, 30+x, 40+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 40+y);
            curve.curveTo(35+x, 35+y, 40+x, 35+y, 45+x, 40+y);
            curve.lineTo(35+x, 70+y);
            curve.moveTo(45+x, 40+y);
            curve.curveTo(50+x, 35+y, 55+x, 35+y, 60+x, 40+y);
            curve.lineTo(50+x, 65+y);
            curve.curveTo(53+x, 70+y, 62+x, 70+y, 65+x, 70+y);
        }
        if("n".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(2+x, 70+y, 8+x, 70+y, 10+x, 64+y);
            curve.lineTo(15+x, 40+y);
            curve.curveTo(20+x, 35+y, 25+x, 35+y, 30+x, 40+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 40+y);
            curve.curveTo(35+x, 35+y, 40+x, 35+y, 45+x, 40+y);
            curve.lineTo(35+x, 65+y);
            curve.curveTo(40+x, 70+y, 45+x, 70+y, 50+x, 70+y);
        }
        if("ñ".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(2+x, 70+y, 8+x, 70+y, 10+x, 64+y);
            curve.lineTo(15+x, 40+y);
            curve.curveTo(20+x, 35+y, 25+x, 35+y, 30+x, 40+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 40+y);
            curve.curveTo(35+x, 35+y, 40+x, 35+y, 45+x, 40+y);
            curve.lineTo(35+x, 65+y);
            curve.curveTo(40+x, 70+y, 45+x, 70+y, 50+x, 70+y);
            curve.moveTo(20+x, 30+y);
            curve.curveTo(25+x, 25+y, 35+x, 35+y, 40+x, 30+y);
        }
        if("o".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(4+x, 70+y, 8+x, 70+y, 13+x, 64+y);
            curve.curveTo(20+x, 80+y, 40+x, 70+y, 45+x, 50+y);
            curve.curveTo(40+x, 40+y, 20+x, 35+y, 13+x, 64+y);
            curve.moveTo(20+x, 46+y);
            curve.curveTo(25+x, 50+y, 45+x, 50+y, 55+x, 45+y);
            curve.moveTo(37+x, 64+y);
            curve.curveTo(42+x, 70+y, 46+x, 70+y, 50+x, 70+y);
        }
        if("p".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(10+x, 70+y, 20+x, 47+y, 30+x, 40+y);
            curve.curveTo(45+x, 45+y, 45+x, 65+y, 17+x, 70+y);
            curve.lineTo(30+x, 40+y);
            curve.lineTo(10+x, 90+y);
            curve.moveTo(15+x, 70+y);
            curve.curveTo(25+x, 72+y, 40+x, 72+y, 45+x, 70+y);
        }
        if("q".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(4+x, 70+y, 8+x, 70+y, 13+x, 64+y);
            curve.curveTo(15+x, 70+y, 35+x, 70+y, 40+x, 50+y);
            curve.curveTo(35+x, 45+y, 20+x, 35+y, 13+x, 64+y);
            curve.moveTo(40+x, 55+y);
            curve.lineTo(20+x, 100+y);
            curve.moveTo(33+x, 70+y);
            curve.curveTo(20+x, 85+y, 20+x, 60+y, 45+x, 70+y);
        }
        if("r".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(14+x, 65+y, 14+x, 35+y, 10+x, 30+y);
            curve.curveTo(3+x, 60+y, 43+x, 35+y, 40+x, 40+y);
            curve.curveTo(30+x, 35+y, 25+x, 65+y, 30+x, 70+y);
        }
        if("s".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(25+x, 70+y, 35+x, 30+y, 30+x, 30+y);
            curve.curveTo(40+x, 35+y, 50+x, 90+y, 25+x, 67+y);
            curve.curveTo(35+x, 60+y, 40+x, 80+y, 50+x, 70+y);
        }
        if("t".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(25+x, 70+y, 20+x, 20+y, 35+x, 0+y);
            curve.curveTo(10+x, 70+y, 10+x, 70+y, 40+x, 70+y);
            curve.moveTo(8+x, 25+y);
            curve.lineTo(32+x, 25+y);
        }
        if("u".equals(letra)){
            curve.moveTo(0+x, 70+y);
            curve.curveTo(15+x, 75+y, 28+x, 45+y, 25+x, 40+y);
            curve.curveTo(5+x, 83+y, 45+x, 83+y, 55+x, 40+y);
            curve.curveTo(45+x, 45+y, 45+x, 75+y, 55+x, 70+y);
        }
        if("v".equals(letra)){
            curve.moveTo(0+x, 45+y);
            curve.curveTo(5+x, 35+y, 10+x, 35+y, 15+x, 40+y);
            curve.curveTo(-5+x, 83+y, 30+x, 83+y, 37+x, 40+y);
            curve.curveTo(45+x, 45+y, 49+x, 45+y, 48+x, 40+y);
        }
        if("w".equals(letra)){
            curve.moveTo(0+x, 45+y);
            curve.curveTo(5+x, 30+y, 10+x, 30+y, 15+x, 30+y);
            curve.curveTo(-10+x, 83+y, 25+x, 83+y, 35+x, 35+y);
            curve.curveTo(10+x, 83+y, 45+x, 83+y, 55+x, 30+y);
            curve.curveTo(58+x, 35+y, 60+x, 35+y, 66+x, 30+y);
        }
        if("x".equals(letra)){
            
        }
        if("y".equals(letra)){
            
        }
        if("z".equals(letra)){
            
        }
        if("A".equals(letra)){
            
        }
        if("B".equals(letra)){
            
        }
        if("C".equals(letra)){
            
        }
        if("D".equals(letra)){
            
        }
        if("E".equals(letra)){
            
        }
        if("F".equals(letra)){
            
        }
        if("G".equals(letra)){
            
        }
        if("H".equals(letra)){
            
        }
        if("I".equals(letra)){
            
        }
        if("J".equals(letra)){
            curve.moveTo(20+x, 20+y);
            curve.curveTo(40+x, 5+y, 60+x, 30+y, 80+x, 20+y);
            curve.curveTo(80+x, 15+y, 70+x, 5+y, 50+x, 20+y);
            curve.curveTo(50+x, 20+y, 40+x, 50+y, 20+x, 90+y);
            curve.curveTo(0+x, 100+y, 0+x, 70+y, 60+x, 70+y);
        }
        if("K".equals(letra)){
            curve.moveTo(15+x, 10+y);
            curve.curveTo(15+x, 10+y, 21+x, 7+y, 25+x, 10+y);
            curve.lineTo(10+x, 70+y);
            curve.curveTo(7+x, 70+y, 5+x, 70+y, 0+x, 65+y);
            curve.moveTo(55+x, 10+y);
            curve.curveTo(45+x, 5+y, 35+x, 30+y, 20+x, 30+y);
            curve.curveTo(25+x, 50+y, 40+x, 45+y, 45+x, 65+y);
            curve.curveTo(45+x, 65+y, 47+x, 70+y, 55+x, 70+y);
        }
        if("L".equals(letra)){
            curve.moveTo(35+x, 10+y);
            curve.curveTo(30+x, 0+y, 30+x, 0+y, 10+x, 65+y);
            curve.curveTo(5+x, 80+y, 5+x, 40+y, 10+x, 65+y);
            curve.curveTo(10+x, 65+y, 20+x, 75+y, 30+x, 70+y);
        }
        if("M".equals(letra)){
            curve.moveTo(5+x, 30+y);
            curve.curveTo(10+x, 0+y, 30+x, 0+y, 30+x, 30+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 30+y);
            curve.curveTo(35+x, 0+y, 55+x, 0+y, 55+x, 30+y);
            curve.lineTo(45+x,70+y);
            curve.moveTo(55+x, 30+y);
            curve.curveTo(60+x, 0+y, 80+x, 0+y, 80+x, 30+y);
            curve.lineTo(70+x, 65+y);
            curve.curveTo(77+x, 70+y, 80+x, 70+y, 85+x, 70+y);
        }
        if("N".equals(letra)){
            curve.moveTo(5+x, 30+y);
            curve.curveTo(10+x, 0+y, 30+x, 0+y, 30+x, 30+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 30+y);
            curve.curveTo(35+x, 0+y, 55+x, 0+y, 55+x, 30+y);
            curve.lineTo(45+x,65+y);
            curve.curveTo(50+x, 70+y, 57+x, 70+y, 60+x, 70+y);
        }
        if("Ñ".equals(letra)){
            curve.moveTo(5+x, 30+y);
            curve.curveTo(10+x, 0+y, 30+x, 0+y, 30+x, 30+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 30+y);
            curve.curveTo(35+x, 0+y, 55+x, 0+y, 55+x, 30+y);
            curve.lineTo(45+x,65+y);
            curve.curveTo(50+x, 70+y, 57+x, 70+y, 60+x, 70+y);
            curve.moveTo(15+x, 3+y);
            curve.curveTo(25+x, -2+y, 35+x, 8+y, 45+x, 3+y);
        }
        if("O".equals(letra)){
            curve.moveTo(60+x, 0+y);
            curve.curveTo(15+x, 5+y, -10+x, 65+y, 30+x, 70+y);
            curve.curveTo(55+x, 65+y, 115+x, 5+y, 60+x, 0+y);
            curve.moveTo(28+x, 14+y);
            curve.curveTo(50+x, 20+y, 70+x, 20+y, 90+x, 10+y);
            curve.moveTo(55+x, 56+y);
            curve.curveTo(60+x, 65+y, 70+x, 70+y, 80+x, 70+y);
        }
        if("P".equals(letra)){
            curve.moveTo(5+x, 15+y);
            curve.curveTo(10+x,15+y , 25+x,10+y, 20+x,7+y);
            curve.curveTo(12+x, 5+y, 8+x, 10+y, 20+x, 10+y);
            curve.curveTo(50+x, 10+y, 50+x, 35+y, 13+x, 40+y);
            curve.moveTo(20+x, 7+y);
            curve.lineTo(5+x, 70+y);
            curve.curveTo(25+x, 70+y, 30+x, 75+y, 45+x, 70+y);
        }
        if("Q".equals(letra)){
            curve.moveTo(60+x, 0+y);
            curve.curveTo(15+x, 5+y, -10+x, 65+y, 30+x, 70+y);
            curve.curveTo(55+x, 65+y, 115+x, 5+y, 60+x, 0+y);
            curve.moveTo(28+x, 14+y);
            curve.curveTo(20+x, 30+y, 20+x, 50+y, 25+x, 50+y);
            curve.curveTo(35+x, 40+y, 55+x, 40+y, 65+x, 56+y);
            curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
        }
        if("R".equals(letra)){
            
        }
        if("S".equals(letra)){
            
        }
        if("T".equals(letra)){
            
        }
        if("U".equals(letra)){
            
        }
        if("V".equals(letra)){
            
        }
        if("W".equals(letra)){
            
        }
        if("X".equals(letra)){
            
        }
        if("Y".equals(letra)){
            
        }
        if("Z".equals(letra)){
            
        }
                
        return curve;        
    }
    
    public Path2D.Double Dsubrayado(String letra, int x, int y){
        Path2D.Double curve = new Path2D.Double();
        if("a".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(70+x, 75+y);
        }
        if("b".equals(letra)){
            curve.moveTo(0+x, 75+y);
            curve.lineTo(60+x, 75+y);
        }
        if("c".equals(letra)){
            curve.moveTo(0+x, 75+y);
            curve.lineTo(60+x, 75+y);
        }
        if("d".equals(letra)){
            curve.moveTo(0+x, 75+y);
            curve.lineTo(60+x, 75+y);
        }
        if("e".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
        }
        if("f".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
        }
        if("g".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
        }
        if("h".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
        }
        if("i".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(60+x, 75+y);
        }
        if("j".equals(letra)){                     
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);

        }
        if("k".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
        }
        if("l".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(35+x, 75+y);
        }
        if("m".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(65+x, 75+y);
        }
        if("n".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
            
        }
        if("ñ".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
            
        }
        if("o".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
        }
        if("p".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(45+x, 75+y);
        }
        if("q".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(45+x, 75+y);
        }
        if("r".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
        }
        if("s".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(50+x, 75+y);
        }
        if("t".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
        }
        if("u".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
        }
        if("v".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
        }
        if("w".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(66+x, 75+y);
        }
        if("x".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(59+x, 75+y);
        }
        if("y".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(55+x, 75+y);
        }
        if("z".equals(letra)){
            curve.moveTo(0+x, 75+y);
                        curve.lineTo(40+x, 75+y);
        }
        if("A".equals(letra)){
            
        }
        if("B".equals(letra)){
            
        }
        if("C".equals(letra)){
            
        }
        if("D".equals(letra)){
            
        }
        if("E".equals(letra)){
            
        }
        if("F".equals(letra)){
            
        }
        if("G".equals(letra)){
            
        }
        if("H".equals(letra)){
            
        }
        if("I".equals(letra)){
            
        }
        if("J".equals(letra)){
            curve.moveTo(20+x, 20+y);
            curve.curveTo(40+x, 5+y, 60+x, 30+y, 80+x, 20+y);
            curve.curveTo(80+x, 15+y, 70+x, 5+y, 50+x, 20+y);
            curve.curveTo(50+x, 20+y, 40+x, 50+y, 20+x, 90+y);
            curve.curveTo(0+x, 100+y, 0+x, 70+y, 60+x, 70+y);
        }
        if("K".equals(letra)){
            curve.moveTo(15+x, 10+y);
            curve.curveTo(15+x, 10+y, 21+x, 7+y, 25+x, 10+y);
            curve.lineTo(10+x, 70+y);
            curve.curveTo(7+x, 70+y, 5+x, 70+y, 0+x, 65+y);
            curve.moveTo(55+x, 10+y);
            curve.curveTo(45+x, 5+y, 35+x, 30+y, 20+x, 30+y);
            curve.curveTo(25+x, 50+y, 40+x, 45+y, 45+x, 65+y);
            curve.curveTo(45+x, 65+y, 47+x, 70+y, 55+x, 70+y);
        }
        if("L".equals(letra)){
            curve.moveTo(35+x, 10+y);
            curve.curveTo(30+x, 0+y, 30+x, 0+y, 10+x, 65+y);
            curve.curveTo(5+x, 80+y, 5+x, 40+y, 10+x, 65+y);
            curve.curveTo(10+x, 65+y, 20+x, 75+y, 30+x, 70+y);
        }
        if("M".equals(letra)){
            curve.moveTo(5+x, 30+y);
            curve.curveTo(10+x, 0+y, 30+x, 0+y, 30+x, 30+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 30+y);
            curve.curveTo(35+x, 0+y, 55+x, 0+y, 55+x, 30+y);
            curve.lineTo(45+x,70+y);
            curve.moveTo(55+x, 30+y);
            curve.curveTo(60+x, 0+y, 80+x, 0+y, 80+x, 30+y);
            curve.lineTo(70+x, 65+y);
            curve.curveTo(77+x, 70+y, 80+x, 70+y, 85+x, 70+y);
        }
        if("N".equals(letra)){
            curve.moveTo(5+x, 30+y);
            curve.curveTo(10+x, 0+y, 30+x, 0+y, 30+x, 30+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 30+y);
            curve.curveTo(35+x, 0+y, 55+x, 0+y, 55+x, 30+y);
            curve.lineTo(45+x,65+y);
            curve.curveTo(50+x, 70+y, 57+x, 70+y, 60+x, 70+y);
        }
        if("Ñ".equals(letra)){
            curve.moveTo(5+x, 30+y);
            curve.curveTo(10+x, 0+y, 30+x, 0+y, 30+x, 30+y);
            curve.lineTo(20+x, 70+y);
            curve.moveTo(30+x, 30+y);
            curve.curveTo(35+x, 0+y, 55+x, 0+y, 55+x, 30+y);
            curve.lineTo(45+x,65+y);
            curve.curveTo(50+x, 70+y, 57+x, 70+y, 60+x, 70+y);
            curve.moveTo(15+x, 3+y);
            curve.curveTo(25+x, -2+y, 35+x, 8+y, 45+x, 3+y);
        }
        if("O".equals(letra)){
            curve.moveTo(60+x, 0+y);
            curve.curveTo(15+x, 5+y, -10+x, 65+y, 30+x, 70+y);
            curve.curveTo(55+x, 65+y, 115+x, 5+y, 60+x, 0+y);
            curve.moveTo(28+x, 14+y);
            curve.curveTo(50+x, 20+y, 70+x, 20+y, 90+x, 10+y);
            curve.moveTo(55+x, 56+y);
            curve.curveTo(60+x, 65+y, 70+x, 70+y, 80+x, 70+y);
        }
        if("P".equals(letra)){
            curve.moveTo(5+x, 15+y);
            curve.curveTo(10+x,15+y , 25+x,10+y, 20+x,7+y);
            curve.curveTo(12+x, 5+y, 8+x, 10+y, 20+x, 10+y);
            curve.curveTo(50+x, 10+y, 50+x, 35+y, 13+x, 40+y);
            curve.moveTo(20+x, 7+y);
            curve.lineTo(5+x, 70+y);
            curve.curveTo(25+x, 70+y, 30+x, 75+y, 45+x, 70+y);
        }
        if("Q".equals(letra)){
            curve.moveTo(60+x, 0+y);
            curve.curveTo(15+x, 5+y, -10+x, 65+y, 30+x, 70+y);
            curve.curveTo(55+x, 65+y, 115+x, 5+y, 60+x, 0+y);
            curve.moveTo(28+x, 14+y);
            curve.curveTo(20+x, 30+y, 20+x, 50+y, 25+x, 50+y);
            curve.curveTo(35+x, 40+y, 55+x, 40+y, 65+x, 56+y);
            curve.curveTo(70+x, 65+y, 75+x, 70+y, 80+x, 70+y);
        }
        if("R".equals(letra)){
            
        }
        if("S".equals(letra)){
            
        }
        if("T".equals(letra)){
            
        }
        if("U".equals(letra)){
            
        }
        if("V".equals(letra)){
            
        }
        if("W".equals(letra)){
            
        }
        if("X".equals(letra)){
            
        }
        if("Y".equals(letra)){
            
        }
        if("Z".equals(letra)){
            
        }
        
        
        return curve;
    }
    
    public Graphics2D Pcontrol(String letra,int x, int y) {
        g3d = (Graphics2D)jPanel1.getGraphics();
        g3d.setColor(Color.RED);

        if ("a".equals(letra)){
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
        if ("b".equals(letra)){//listo

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
        }
        if ("c".equals(letra)){//listo

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
        }
        if ("d".equals(letra)){//listo
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
            x=x+55;
        }
        if ("e".equals(letra)){//listo
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
        }
        if ("f".equals(letra)){//listo
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
        }
        if ("g".equals(letra)){//listo
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
        }
        if ("h".equals(letra)){//listo
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
        }
        if ("i".equals(letra)){//listo
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
        }
        if ("j".equals(letra)){//listo

            if (Puntos == true) {//puntos de control
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
        }
        if("k".equals(letra)){//listo

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
                g3d.fillOval(40+x, 70+y, 4, 4);
            }
        }
        if("l".equals(letra)){//listo
            if (Puntos == true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 65+y, 4, 4);
                g3d.fillOval(25+x, 20+y, 4, 4);
                g3d.fillOval(20+x, 15+y, 4, 4);
                g3d.fillOval(5+x, 20+y, 4, 4);
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(35+x, 70+y, 4, 4);
            }
        }
        if("m".equals(letra)){//listo
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
        }
        if("n".equals(letra)){
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
        }
        if("ñ".equals(letra)){//listo
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
        }
        if("o".equals(letra)){//listo
            if (Puntos == true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(4+x, 70+y, 4, 4);
                g3d.fillOval(8+x, 70+y, 4, 4);
                g3d.fillOval(13+x, 64+y, 4, 4);
                g3d.fillOval(25+x, 40+y, 4, 4);
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(45+x, 45+y, 4, 4);
                g3d.fillOval(25+x, 40+y, 4, 4);
                g3d.fillOval(13+x, 46+y, 4, 4);
                g3d.fillOval(18+x, 50+y, 4, 4);
                g3d.fillOval(40+x, 50+y, 4, 4);
                g3d.fillOval(37+x, 64+y, 4, 4);
                g3d.fillOval(42+x, 70+y, 4, 4);
                g3d.fillOval(46+x, 70+y, 4, 4);
                g3d.fillOval(50+x, 70+y, 4, 4);                        
            }
        }
        if("p".equals(letra)){//listo
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(5+x, 75+y, 4, 4);
                g3d.fillOval(17+x, 47+y, 4, 4);
                g3d.fillOval(20+x, 40+y, 4, 4);
                g3d.fillOval(45+x, 45+y, 4, 4);
                g3d.fillOval(45+x, 60+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(20+x, 90+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 72+y, 4, 4);
                g3d.fillOval(40+x, 72+y, 4, 4);
                g3d.fillOval(45+x, 70+y, 4, 4);
            }
        }
        if("q".equals(letra)){//listo
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(4+x, 70+y, 4, 4);
                g3d.fillOval(8+x, 70+y, 4, 4);
                g3d.fillOval(10+x, 64+y, 4, 4);
                g3d.fillOval(20+x, 40+y, 4, 4);
                g3d.fillOval(0+x, 45+y, 4, 4);
                g3d.fillOval(0+x, 65+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(40+x, 65+y, 4, 4);
                g3d.fillOval(40+x, 45+y, 4, 4);
                g3d.fillOval(20+x, 40+y, 4, 4);
                g3d.fillOval(35+x, 55+y, 4, 4);
                g3d.fillOval(35+x, 90+y, 4, 4);
                g3d.fillOval(35+x, 70+y, 4, 4);
                g3d.fillOval(20+x, 85+y, 4, 4);
                g3d.fillOval(20+x, 60+y, 4, 4);
                g3d.fillOval(45+x, 70+y, 4, 4);
            }
        }
        if("r".equals(letra)){
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
        }
        if("s".equals(letra)){
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
        }
        if("t".equals(letra)){
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
        }
        if("u".equals(letra)){
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
        }
        if("v".equals(letra)){
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
        }
        if("w".equals(letra)){
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
        }
        if("x".equals(letra)){
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
        }
        if("y".equals(letra)){
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
        }
        if("z".equals(letra)){
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
        }
        if ("A".equals(letra)){//Dibujar A
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(50+x, 70+y, 4, 4);
                g3d.fillOval(70+x, 65+y, 4, 4);
                g3d.fillOval(70+x, 45+y, 4, 4);
                g3d.fillOval(50+x, 35+y, 4, 4);
                g3d.fillOval(35+x, 30+y, 4, 4);
                g3d.fillOval(15+x, 40+y, 4, 4);
                g3d.fillOval(0+x, 48+y, 4, 4);
                g3d.fillOval(-11+x, 48+y, 4, 4);
                g3d.fillOval(-17+x, 32+y, 4, 4);
                g3d.fillOval(-8+x, 20+y, 4, 4);

            }
        }
        if ("B".equals(letra)){//Dibujar B
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(50+x, 70+y, 4, 4);
                g3d.fillOval(70+x, 65+y, 4, 4);
                g3d.fillOval(70+x, 45+y, 4, 4);
                g3d.fillOval(50+x, 35+y, 4, 4);
                g3d.fillOval(35+x, 30+y, 4, 4);
                g3d.fillOval(15+x, 40+y, 4, 4);
                g3d.fillOval(0+x, 48+y, 4, 4);
                g3d.fillOval(-11+x, 48+y, 4, 4);
                g3d.fillOval(-17+x, 32+y, 4, 4);
                g3d.fillOval(-8+x, 20+y, 4, 4);    
            }
        }
        if ("C".equals(letra)){//Dibujar C
            if (Puntos==true) {
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(72+x, 16+y, 4, 4);
                g3d.fillOval(78+x, 10+y, 4, 4);
                g3d.fillOval(50+x, 5+y, 4, 4);
                g3d.fillOval(0+x, 18+y, 4, 4);
                g3d.fillOval(0+x, 48+y, 4, 4);
                g3d.fillOval(50+x, 70+y, 4, 4);
                g3d.fillOval(70+x, 70+y, 4, 4);
            }
        }        
        if ("D".equals(letra)){//Dibujar D
            if (Puntos==true) {
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(22+x, 18+y, 4, 4);
                g3d.fillOval(28+x, 55+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(2+x, 62+y, 4, 4);
                g3d.fillOval(10+x, 50+y, 4, 4);
                g3d.fillOval(35+x, 70+y, 4, 4);
                g3d.fillOval(90+x, 48+y, 4, 4);
                g3d.fillOval(90+x, 28+y, 4, 4);
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(5+x, 5+y, 4, 4);
                g3d.fillOval(9+x, 24+y, 4, 4);
                g3d.fillOval(20+x, 10+y, 4, 4);
            }
        }
        if ("E".equals(letra)){//Dibujar D
            if (Puntos==true) {
                g3d.fillOval(60+x, 0+y, 4, 4);
                g3d.fillOval(48+x, 8+y, 4, 4);
                g3d.fillOval(53+x, 19+y, 4, 4);
                g3d.fillOval(60+x, 9+y, 4, 4);
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(15+x, 23+y, 4, 4);
                g3d.fillOval(50+x, 35+y, 4, 4);
                g3d.fillOval(18+x, 42+y, 4, 4);
                g3d.fillOval(20+x, 65+y, 4, 4);
                g3d.fillOval(70+x, 70+y, 4, 4);
            }
        }
        if ("F".equals(letra)){//Dibujar F
            if (Puntos==true) {
                g3d.fillOval(80+x, 0+y, 4, 4);
                g3d.fillOval(63+x, 9+y, 4, 4);
                g3d.fillOval(27+x, 2+y, 4, 4);
                g3d.fillOval(10+x, 10+y, 4, 4);
                g3d.fillOval(5+x, 25+y, 4, 4);
                g3d.fillOval(12+x, 28+y, 4, 4);
                g3d.fillOval(20+x, 18+y, 4, 4);
                g3d.fillOval(40+x, 10+y, 4, 4);
                g3d.fillOval(30+x, 30+y, 4, 4);
                g3d.fillOval(30+x, 65+y, 4, 4);
                g3d.fillOval(25+x, 80+y, 4, 4);
                g3d.fillOval(12+x, 90+y, 4, 4);
                g3d.fillOval(8+x, 68+y, 4, 4);
                g3d.fillOval(20+x, 60+y, 4, 4);
                g3d.fillOval(25+x, 42+y, 4, 4);
                g3d.fillOval(42+x, 42+y, 4, 4);
                g3d.fillOval(42+x, 40+y, 4, 4);
                g3d.fillOval(42+x, 42+y, 4, 4);
            }
        }
        if ("G".equals(letra)){//Dibujar g
            if (Puntos==true) {
                g3d.fillOval(60+x, 10+y, 4, 4);
                g3d.fillOval(36+x, 3+y, 4, 4);
                g3d.fillOval(21+x, 18+y, 4, 4);
                g3d.fillOval(20+x, 40+y, 4, 4);
                g3d.fillOval(35+x, 75+y, 4, 4);
                g3d.fillOval(55+x, 75+y, 4, 4);
                g3d.fillOval(70+x, 40+y, 4, 4);
                g3d.fillOval(55+x, 40+y, 4, 4);
            }
        }

        if ("H".equals(letra)){//Dibujar H

            if (Puntos==true) {
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(32+x, 70+y, 4, 4);
                g3d.fillOval(60+x, 0+y, 4, 4);
                g3d.fillOval(62+x, 70+y, 4, 4);
                g3d.fillOval(60+x, 70+y, 4, 4);
                g3d.fillOval(70+x, 80+y, 4, 4);
                g3d.fillOval(89+x, 55+y, 4, 4);
                g3d.fillOval(80+x, 38+y, 4, 4);
                g3d.fillOval(65+x, 32+y, 4, 4);
                g3d.fillOval(38+x, 45+y, 4, 4);
                g3d.fillOval(18+x, 43+y, 4, 4);
                g3d.fillOval(9+x, 35+y, 4, 4);
                g3d.fillOval(12+x, 12+y, 4, 4);
                g3d.fillOval(25+x, 23+y, 4, 4);
            }

        }
        if ("I".equals(letra)){//Dibujar i

            if (Puntos==true) {
                g3d.fillOval(20+x, 5+y, 4, 4);
                g3d.fillOval(32+x, 2+y, 4, 4);
                g3d.fillOval(50+x, 10+y, 4, 4);
                g3d.fillOval(60+x, 9+y, 4, 4);
                g3d.fillOval(70+x, 8+y, 4, 4);
                g3d.fillOval(68+x, 1+y, 4, 4);
                g3d.fillOval(60+x, 0+y, 4, 4);
                g3d.fillOval(45+x, 4+y, 4, 4);
                g3d.fillOval(45+x, 48+y, 4, 4);
                g3d.fillOval(40+x, 60+y, 4, 4);
                g3d.fillOval(33+x, 75+y, 4, 4);
                g3d.fillOval(23+x, 73+y, 4, 4);
                g3d.fillOval(25+x, 64+y, 4, 4);
                g3d.fillOval(41+x, 68+y, 4, 4);
                g3d.fillOval(59+x, 70+y, 4, 4);
                g3d.fillOval(70+x, 70+y, 4, 4);
            }

        }
        if ("J".equals(letra)){//Dibujar J

            if (Puntos==true) {
                g3d.fillOval(0+x, 20+y, 4, 4);
                g3d.fillOval(20+x, 5+y, 4, 4);
                g3d.fillOval(40+x, 30+y, 4, 4);
                g3d.fillOval(60+x, 20+y, 4, 4);
                g3d.fillOval(60+x, 15+y, 4, 4);
                g3d.fillOval(50+x, 5+y, 4, 4);
                g3d.fillOval(30+x, 20+y, 4, 4);
                g3d.fillOval(50+x, 50+y, 4, 4);
                g3d.fillOval(40+x, 90+y, 4, 4);
                g3d.fillOval(10+x, 90+y, 4, 4);
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(60+x, 70+y, 4, 4);
            }

        }
        if ("K".equals(letra)){

            if (Puntos==true) {
                g3d.fillOval(0+x, 10+y, 4, 4);
                g3d.fillOval(6+x, 7+y, 4, 4);
                g3d.fillOval(10+x, 10+y, 4, 4);
                g3d.fillOval(10+x, 70+y, 4, 4);
                g3d.fillOval(7+x, 70+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(0+x, 65+y, 4, 4);
                g3d.fillOval(40+x, 10+y, 4, 4);
                g3d.fillOval(30+x, 5+y, 4, 4);
                g3d.fillOval(20+x, 30+y, 4, 4);
                g3d.fillOval(10+x, 30+y, 4, 4);
                g3d.fillOval(10+x, 50+y, 4, 4);
                g3d.fillOval(25+x, 45+y, 4, 4);
                g3d.fillOval(30+x, 65+y, 4, 4);
                g3d.fillOval(30+x, 65+y, 4, 4);
                g3d.fillOval(32+x, 70+y, 4, 4);
                g3d.fillOval(40+x, 70+y, 4, 4);
            }

        }

        if ("L".equals(letra)){//L mayuscula

            if (Puntos==true) {
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(20+x, 0+y, 4, 4);
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(0+x, 10+y, 4, 4);
                g3d.fillOval(0+x, 15+y, 4, 4);
                g3d.fillOval(8+x, 40+y, 4, 4);
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(0+x, 80+y, 4, 4);
                g3d.fillOval(0+x, 40+y, 4, 4);
                g3d.fillOval(15+x, 75+y, 4, 4);
                g3d.fillOval(30+x, 70+y, 4, 4);
            }

        }
        if ("M".equals(letra)) {

            if (Puntos==true) {
                g3d.fillOval(0+x, 30+y, 4, 4);
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(20+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(45+x, 0+y, 4, 4);
                g3d.fillOval(50+x, 30+y, 4, 4);
                g3d.fillOval(50+x, 70+y, 4, 4);
                g3d.fillOval(50+x, 30+y, 4, 4);
                g3d.fillOval(55+x, 0+y, 4, 4);
                g3d.fillOval(70+x, 0+y, 4, 4);
                g3d.fillOval(75+x, 30+y, 4, 4);
                g3d.fillOval(75+x, 65+y, 4, 4);
                g3d.fillOval(77+x, 70+y, 4, 4);
                g3d.fillOval(80+x, 70+y, 4, 4);
                g3d.fillOval(85+x, 70+y, 4, 4);
            }

        }
        if ("N".equals(letra)) {

            if (Puntos==true) {
                g3d.fillOval(0+x, 30+y, 4, 4);
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(20+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(45+x, 0+y, 4, 4);
                g3d.fillOval(50+x, 30+y, 4, 4);
                g3d.fillOval(50+x, 65+y, 4, 4);
                g3d.fillOval(53+x, 70+y, 4, 4);
                g3d.fillOval(57+x, 70+y, 4, 4);
                g3d.fillOval(60+x, 70+y, 4, 4);
            }

        }
        if ("Ñ".equals(letra)) {

            if (Puntos==true) {
                g3d.fillOval(0+x, 30+y, 4, 4);
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(20+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(30+x, 0+y, 4, 4);
                g3d.fillOval(45+x, 0+y, 4, 4);
                g3d.fillOval(50+x, 30+y, 4, 4);
                g3d.fillOval(50+x, 65+y, 4, 4);
                g3d.fillOval(53+x, 70+y, 4, 4);
                g3d.fillOval(57+x, 70+y, 4, 4);
                g3d.fillOval(60+x, 70+y, 4, 4);
                g3d.fillOval(10+x, 3+y, 4, 4);
                g3d.fillOval(20+x, -2+y, 4, 4);
                g3d.fillOval(30+x, 8+y, 4, 4);
                g3d.fillOval(40+x, 3+y, 4, 4);   
            }

        }
        if ("O".equals(letra)) {

            if (Puntos==true) {
                g3d.fillOval(40+x, 0+y, 4, 4);
                g3d.fillOval(0+x, 5+y, 4, 4);
                g3d.fillOval(0+x, 65+y, 4, 4);
                g3d.fillOval(40+x, 70+y, 4, 4);
                g3d.fillOval(80+x, 65+y, 4, 4);
                g3d.fillOval(80+x, 5+y, 4, 4);
                g3d.fillOval(40+x, 0+y, 4, 4);
                g3d.fillOval(18+x, 14+y, 4, 4);
                g3d.fillOval(40+x, 20+y, 4, 4);
                g3d.fillOval(60+x, 20+y, 4, 4);
                g3d.fillOval(80+x, 10+y, 4, 4);
                g3d.fillOval(65+x, 56+y, 4, 4);
                g3d.fillOval(70+x, 65+y, 4, 4);
                g3d.fillOval(75+x, 70+y, 4, 4);
                g3d.fillOval(80+x, 70+y, 4, 4);
            }

        }
        if ("P".equals(letra)) {
            if (Puntos==true) {
                g3d.fillOval(5+x, 15+y, 4, 4);
                g3d.fillOval(10+x, 15+y, 4, 4);
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(20+x, 7+y, 4, 4);
                g3d.fillOval(12+x, 5+y, 4, 4);
                g3d.fillOval(8+x, 10+y, 4, 4);
                g3d.fillOval(20+x, 10+y, 4, 4);
                g3d.fillOval(45+x, 10+y, 4, 4);
                g3d.fillOval(45+x, 35+y, 4, 4);
                g3d.fillOval(20+x, 40+y, 4, 4);
                g3d.fillOval(20+x, 7+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(30+x, 75+y, 4, 4);
                g3d.fillOval(45+x, 70+y, 4, 4);
            }
        }
        if ("Q".equals(letra)) {
            if (Puntos==true) {
                g3d.fillOval(40+x, 0+y, 4, 4);
                g3d.fillOval(0+x, 5+y, 4, 4);
                g3d.fillOval(0+x, 65+y, 4, 4);
                g3d.fillOval(40+x, 70+y, 4, 4);
                g3d.fillOval(80+x, 65+y, 4, 4);
                g3d.fillOval(80+x, 5+y, 4, 4);
                g3d.fillOval(40+x, 0+y, 4, 4);
                g3d.fillOval(18+x, 14+y, 4, 4);
                g3d.fillOval(20+x, 30+y, 4, 4);
                g3d.fillOval(20+x, 50+y, 4, 4);
                g3d.fillOval(25+x, 50+y, 4, 4);
                g3d.fillOval(35+x, 40+y, 4, 4);
                g3d.fillOval(55+x, 40+y, 4, 4);
                g3d.fillOval(65+x, 56+y, 4, 4);
                g3d.fillOval(70+x, 65+y, 4, 4);
                g3d.fillOval(75+x, 70+y, 4, 4);
                g3d.fillOval(80+x, 70+y, 4, 4);
            }
        }
        if("R".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(5+x, 10+y, 4, 4);
                g3d.fillOval(-10+x, 10+y, 4, 4);
                g3d.fillOval(50+x, 0+y, 4, 4);
                g3d.fillOval(50+x, 35+y, 4, 4);
                g3d.fillOval(11+x, 40+y, 4, 4);
                g3d.fillOval(45+x, 45+y, 4, 4);
                g3d.fillOval(20+x, 70+y, 4, 4);
                g3d.fillOval(45+x, 70+y, 4, 4);
            }
        }
        if("S".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(15+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(20+x, 0+y, 4, 4);
                g3d.fillOval(80+x, 25+y, 4, 4);
                g3d.fillOval(60+x, 90+y, 4, 4);
                g3d.fillOval(30+x, 65+y, 4, 4);
                g3d.fillOval(35+x, 50+y, 4, 4);
                g3d.fillOval(45+x, 80+y, 4, 4);
                g3d.fillOval(70+x, 70+y, 4, 4);
            }
        }
        if("T".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(50+x, 70+y, 4, 4);
                g3d.fillOval(35+x, 0+y, 4, 4);
                g3d.fillOval(35+x, 5+y, 4, 4);
                g3d.fillOval(5+x, 20+y, 4, 4);
                g3d.fillOval(10+x, -10+y, 4, 4);
                g3d.fillOval(50+x, 15+y, 4, 4);
                g3d.fillOval(60+x, 0+y, 4, 4);
            }
        }
        if("U".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 10+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(0+x, 74+y, 4, 4);
                g3d.fillOval(32+x, 70+y, 4, 4);
                g3d.fillOval(50+x, 74+y, 4, 4);
                g3d.fillOval(39+x, 15+y, 4, 4);
                g3d.fillOval(43+x, 10+y, 4, 4);
                g3d.fillOval(43+x, 40+y, 4, 4);
                g3d.fillOval(40+x, 75+y, 4, 4);
                g3d.fillOval(60+x, 70+y, 4, 4);
            }
        }
        if("V".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 25+y, 4, 4);
                g3d.fillOval(0+x, 5+y, 4, 4);
                g3d.fillOval(15+x, 5+y, 4, 4);
                g3d.fillOval(15+x, 10+y, 4, 4);
                g3d.fillOval(10+x, 90+y, 4, 4);
                g3d.fillOval(45+x, 90+y, 4, 4);
                g3d.fillOval(40+x, 10+y, 4, 4);
                g3d.fillOval(45+x, 15+y, 4, 4);
                g3d.fillOval(49+x, 15+y, 4, 4);
                g3d.fillOval(60+x, 10+y, 4, 4);
            }

        }
        if("W".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 25+y, 4, 4);
                g3d.fillOval(0+x, 5+y, 4, 4);
                g3d.fillOval(15+x, 5+y, 4, 4);
                g3d.fillOval(15+x, 10+y, 4, 4);
                g3d.fillOval(10+x, 90+y, 4, 4);
                g3d.fillOval(45+x, 90+y, 4, 4);
                g3d.fillOval(40+x, 10+y, 4, 4);
                g3d.fillOval(35+x, 90+y, 4, 4);
                g3d.fillOval(70+x, 90+y, 4, 4);
                g3d.fillOval(65+x, 10+y, 4, 4);
                g3d.fillOval(50+x, 10+y, 4, 4);
                g3d.fillOval(70+x, 20+y, 4, 4);
                g3d.fillOval(80+x, 10+y, 4, 4);
            }
        }
        if("X".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 70+y, 4, 4);
                g3d.fillOval(30+x, 80+y, 4, 4);
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(55+x, 10+y, 4, 4);
                g3d.fillOval(0+x, 10+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 80+y, 4, 4);
                g3d.fillOval(55+x, 70+y, 4, 4);
            }
        }
        if("Y".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 10+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(0+x, 74+y, 4, 4);
                g3d.fillOval(32+x, 70+y, 4, 4);
                g3d.fillOval(50+x, 74+y, 4, 4);
                g3d.fillOval(39+x, 15+y, 4, 4);
                g3d.fillOval(43+x, 10+y, 4, 4);
                g3d.fillOval(43+x, 60+y, 4, 4);
                g3d.fillOval(50+x, 140+y, 4, 4);
                g3d.fillOval(28+x, 120+y, 4, 4);
                g3d.fillOval(25+x, 90+y, 4, 4);
                g3d.fillOval(32+x, 80+y, 4, 4);
                g3d.fillOval(55+x, 70+y, 4, 4);
            }
        }
        if("Z".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(5+x, 20+y, 4, 4);
                g3d.fillOval(10+x, -10+y, 4, 4);
                g3d.fillOval(50+x, 15+y, 4, 4);
                g3d.fillOval(60+x, 0+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(18+x, 35+y, 4, 4);
                g3d.fillOval(48+x, 35+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(10+x, 60+y, 4, 4);
                g3d.fillOval(50+x, 75+y, 4, 4);
                g3d.fillOval(60+x, 70+y, 4, 4);
            }
        }
        if("-".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(10+x, 50+y, 4, 4);
                g3d.fillOval(30+x, 50+y, 4, 4);
            }
        }
        if("_".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(10+x, 70+y, 4, 4);
                g3d.fillOval(30+x, 70+y, 4, 4);
            }
        }
        if("(".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(15+x, 0+y, 4, 4);
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(15+x, 70+y, 4, 4);
            }
        }
        if(")".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(15+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(15+x, 70+y, 4, 4);
            }
        }
        if("[".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(10+x, 0+y, 4, 4);
                g3d.fillOval(10+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
            }
        } 
        if("{".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(10+x, 0+y, 4, 4);
                g3d.fillOval(15+x, 40+y, 4, 4);
                g3d.fillOval(5+x, 35+y, 4, 4);
                g3d.fillOval(20+x, 35+y, 4, 4);
                g3d.fillOval(10+x, 70+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
            }
        } 
        if("}".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 0+y, 4, 4);
                g3d.fillOval(15+x, 0+y, 4, 4);
                g3d.fillOval(10+x, 40+y, 4, 4);
                g3d.fillOval(20+x, 35+y, 4, 4);
                g3d.fillOval(5+x, 35+y, 4, 4);
                g3d.fillOval(15+x, 70+y, 4, 4);
                g3d.fillOval(0+x, 70+y, 4, 4);
            }
        } 
        if("]".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(10+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 0+y, 4, 4);
                g3d.fillOval(25+x, 70+y, 4, 4);
                g3d.fillOval(10+x, 70+y, 4, 4);
            }
        }
        if("!".equals(letra)){ //falta punto del signo
            if (Puntos==true) {
                g3d.fillOval(25+x, 90+y, 4, 4);
                g3d.fillOval(20+x, 91+y, 4, 4);
                g3d.fillOval(20+x, 99+y, 4, 4);
                g3d.fillOval(25+x, 100+y, 4, 4);
                g3d.fillOval(30+x, 99+y, 4, 4);
                g3d.fillOval(30+x, 91+y, 4, 4);
                g3d.fillOval(25+x, 90+y, 4, 4);
                g3d.fillOval(25+x, 80+y, 4, 4);
                g3d.fillOval(25+x, 10+y, 4, 4);
            }
        }
        if("¡".equals(letra)){ //falta punto del signo
            if (Puntos==true) {
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(20+x, 11+y, 4, 4);
                g3d.fillOval(20+x, 19+y, 4, 4);
                g3d.fillOval(25+x, 20+y, 4, 4);
                g3d.fillOval(30+x, 19+y, 4, 4);
                g3d.fillOval(30+x, 11+y, 4, 4);
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(25+x, 90+y, 4, 4);
            }
        }
        if("¿".equals(letra)){ //falta punto del signo
            if (Puntos==true) {
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(20+x, 11+y, 4, 4);
                g3d.fillOval(20+x, 19+y, 4, 4);
                g3d.fillOval(25+x, 20+y, 4, 4);
                g3d.fillOval(30+x, 19+y, 4, 4);
                g3d.fillOval(30+x, 11+y, 4, 4);
                g3d.fillOval(25+x, 10+y, 4, 4);
                g3d.fillOval(25+x, 30+y, 4, 4);
                g3d.fillOval(25+x, 65+y, 4, 4);
                g3d.fillOval(-30+x, 90+y, 4, 4);
                g3d.fillOval(45+x, 140+y, 4, 4);
                g3d.fillOval(45+x, 90+y, 4, 4);
            }
        }
        if("?".equals(letra)){ //falta punto del signo
            if (Puntos==true) {
                g3d.fillOval(25+x, 100+y, 4, 4);
                g3d.fillOval(20+x, 101+y, 4, 4);
                g3d.fillOval(20+x, 109+y, 4, 4);
                g3d.fillOval(25+x, 110+y, 4, 4);
                g3d.fillOval(30+x, 109+y, 4, 4);
                g3d.fillOval(30+x, 101+y, 4, 4);
                g3d.fillOval(25+x, 100+y, 4, 4);
                g3d.fillOval(25+x, 90+y, 4, 4);
                g3d.fillOval(25+x, 65+y, 4, 4);
                g3d.fillOval(90+x, 50+y, 4, 4);
                g3d.fillOval(25+x, -20+y, 4, 4);
                g3d.fillOval(5+x, 30+y, 4, 4);
            }
        }
        if(".".equals(letra)){

            if (Puntos==true) {
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(2+x, 67+y, 4, 4);
                g3d.fillOval(2+x, 68+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(7+x, 68+y, 4, 4);
                g3d.fillOval(7+x, 67+y, 4, 4);
                g3d.fillOval(5+x, 65+y, 4, 4);
            }
        }
        if(":".equals(letra)){

            if (Puntos==true) {
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(2+x, 67+y, 4, 4);
                g3d.fillOval(2+x, 68+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(7+x, 68+y, 4, 4);
                g3d.fillOval(7+x, 67+y, 4, 4);

                g3d.fillOval(5+x, 45+y, 4, 4);
                g3d.fillOval(2+x, 47+y, 4, 4);
                g3d.fillOval(2+x, 48+y, 4, 4);
                g3d.fillOval(5+x, 50+y, 4, 4);
                g3d.fillOval(7+x, 48+y, 4, 4);
                g3d.fillOval(7+x, 47+y, 4, 4);
            }
        }
        if(",".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(6+x, 71+y, 4, 4);
                g3d.fillOval(3+x, 73+y, 4, 4);
                g3d.fillOval(2+x, 80+y, 4, 4);
            }
        }
        if(";".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(2+x, 67+y, 4, 4);
                g3d.fillOval(2+x, 68+y, 4, 4);
                g3d.fillOval(5+x, 70+y, 4, 4);
                g3d.fillOval(7+x, 68+y, 4, 4);
                g3d.fillOval(7+x, 67+y, 4, 4);
                g3d.fillOval(5+x, 65+y, 4, 4);
                g3d.fillOval(5+x, 75+y, 4, 4);
                g3d.fillOval(4+x, 76+y, 4, 4);
                g3d.fillOval(3+x, 78+y, 4, 4);
                g3d.fillOval(2+x, 80+y, 4, 4);
            }
        }
        if("'".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(4+x, 4+y, 4, 4);
                g3d.fillOval(2+x, 7+y, 4, 4);
                g3d.fillOval(0+x, 10+y, 4, 4);
            }
        }
        if( "\"".equals(letra)){

            if (Puntos==true) {
                g3d.fillOval(5+x, 0+y, 4, 4);
                g3d.fillOval(4+x, 4+y, 4, 4);
                g3d.fillOval(2+x, 7+y, 4, 4);
                g3d.fillOval(0+x, 10+y, 4, 4);
                g3d.fillOval(10+x, 0+y, 4, 4);
                g3d.fillOval(9+x, 4+y, 4, 4);
                g3d.fillOval(7+x, 7+y, 4, 4);
                g3d.fillOval(5+x, 10+y, 4, 4);
            }
        }
        if("<".equals(letra)){

            if (Puntos==true) {
                g3d.fillOval(15+x, 30+y, 4, 4);
                g3d.fillOval(0+x, 40+y, 4, 4);
                g3d.fillOval(15+x, 50+y, 4, 4);
            }
        }
        if(">".equals(letra)){
            if (Puntos==true) {
                g3d.fillOval(0+x, 30+y, 4, 4);
                g3d.fillOval(15+x, 40+y, 4, 4);
                g3d.fillOval(0+x, 50+y, 4, 4);
            }
        }
        return g3d;
    }
    
    
    
    private void coloresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coloresMousePressed
        if(colorito==null){
            colorito = Color.white; 
        }else{
            colorito = JColorChooser.showDialog(this,"select a color", colorito);

        }
    }//GEN-LAST:event_coloresMousePressed

    private void Pcontrol1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pcontrol1MousePressed
        if(Xp%2==0){
            Puntos=true;
            Xp++;
        }
        else{
            Puntos=false;
            Xp++;
        }
    }//GEN-LAST:event_Pcontrol1MousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pcontrol1;
    public static javax.swing.JButton colores;
    private javax.swing.JRadioButton cursiva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton negrita;
    private javax.swing.JTextField palabra;
    public javax.swing.JRadioButton subrayado;
    // End of variables declaration//GEN-END:variables
}
