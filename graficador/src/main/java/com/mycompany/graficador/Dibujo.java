package com.mycompany.graficador;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import javax.swing.JColorChooser;

public class Dibujo extends javax.swing.JFrame {

    public static Color colorito;
    private Graphics2D g2d;
    private Graphics2D g3d;
    int Xp, xpos, ypos, G, Gtotal;
    double T;
    int t;
    
    public static boolean Puntos = false;
    
    
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
        Pcontrol1 = new javax.swing.JButton();
        yslider = new javax.swing.JSlider();
        xslider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
            .addGap(0, 0, Short.MAX_VALUE)
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

        Pcontrol1.setText("Puntos de control");
        Pcontrol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pcontrol1MousePressed(evt);
            }
        });
        Pcontrol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pcontrol1ActionPerformed(evt);
            }
        });

        yslider.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        yslider.setMajorTickSpacing(250);
        yslider.setMaximum(1000);
        yslider.setPaintLabels(true);
        yslider.setValue(0);
        yslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ysliderStateChanged(evt);
            }
        });

        xslider.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        xslider.setMajorTickSpacing(250);
        xslider.setMaximum(1000);
        xslider.setPaintLabels(true);
        xslider.setValue(0);
        xslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xsliderStateChanged(evt);
            }
        });

        jLabel3.setText("Eje X");

        jLabel4.setText("Eje Y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(Pcontrol1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(colores))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yslider, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xslider, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(162, 162, 162))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pcontrol1)
                    .addComponent(colores)
                    .addComponent(yslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabraKeyReleased
        g2d = (Graphics2D) jPanel1.getGraphics();
        Path2D.Double curve = new Path2D.Double();
        AffineTransform reset = g2d.getTransform();
        jPanel1.update(g2d);
        g2d.setColor(colorito);
        
        boolean Subr = false, Negrita = false, Curs = false;
        double x = 0, y = 15, yrev=165, xrev=200;// posicion de las letras
        int ancho;
        char aux;
        t=1;

        ArrayList<Path2D.Double> DibujoFinal = new ArrayList<>();
        ArrayList<Graphics2D> PuntosControl = new ArrayList<>();
        
        String text = palabra.getText();
        text = text.replace(" ", " ☺");
        String textSeparado[] = text.split("☺");
        
        for (int i = 0; i < textSeparado.length; i++) {
            g2d.setStroke(new BasicStroke(1f));
            System.out.println(textSeparado[i]);
            g2d.translate(xpos, ypos);
            
            Negrita=false;
            Curs=false;
            Subr=false;
            T = 1;
            
            //parseo
            if (textSeparado[i].length() > 1) {
                if (textSeparado[i].charAt(0) == '^' || textSeparado[i].charAt(0) == '+') {
                    if (textSeparado[i].charAt(1) == 'N') {
                        Negrita = true;
                        g2d.setStroke(new BasicStroke(2f));
                        if (textSeparado[i].charAt(2) == '+') {
                            if (textSeparado[i].charAt(3) == 'K') {
                                Curs = true;
                                if (textSeparado[i].charAt(4) == '+') {
                                    if (textSeparado[i].charAt(5) == 'S') {
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(6);
                                    }
                                }else{
                                    textSeparado[i] = textSeparado[i].substring(4);
                                }
                            }
                            if (textSeparado[i].charAt(3) == 'S') {
                                Subr = true;
                                if (textSeparado[i].charAt(4) == '+') {
                                    if (textSeparado[i].charAt(5) == 'K') {
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(6);
                                    }
                                }else{
                                    textSeparado[i] = textSeparado[i].substring(4);
                                }
                            }
                        }else{
                            textSeparado[i] = textSeparado[i].substring(2);
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'S') {
                        Subr = true;
                        if (textSeparado[i].charAt(2) == '+') {
                            if (textSeparado[i].charAt(3) == 'K') {
                                Curs = true;
                                if (textSeparado[i].charAt(4) == '+') {
                                    if (textSeparado[i].charAt(5) == 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(6);
                                    }
                                }else{
                                    textSeparado[i] = textSeparado[i].substring(4);
                                }
                            }
                            if (textSeparado[i].charAt(3) == 'N') {
                                Negrita = true;
                                g2d.setStroke(new BasicStroke(2f));
                                if (textSeparado[i].charAt(4) == '+') {
                                    if (textSeparado[i].charAt(5) == 'K') {
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(6);
                                    }
                                }else{
                                    textSeparado[i] = textSeparado[i].substring(4);
                                }
                            }
                        }else{
                            textSeparado[i] = textSeparado[i].substring(2);
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'K') {
                        Curs = true;
                        if (textSeparado[i].charAt(2) == '+') {
                            if (textSeparado[i].charAt(3) == 'N') {
                                Negrita = true;
                                g2d.setStroke(new BasicStroke(2f));
                                if (textSeparado[i].charAt(4) == '+') {
                                    if (textSeparado[i].charAt(5) == 'S') {
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(6);
                                    }
                                }else{
                                    textSeparado[i] = textSeparado[i].substring(4);
                                }
                            }
                            if (textSeparado[i].charAt(3) == 'S') {
                                Subr = true;
                                if (textSeparado[i].charAt(4) == '+') {
                                    if (textSeparado[i].charAt(5) == 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(6);
                                    }
                                }else{
                                    textSeparado[i] = textSeparado[i].substring(4);
                                }
                            }
                        }else{
                            textSeparado[i] = textSeparado[i].substring(2);
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'T') {
                        T = Character.getNumericValue(textSeparado[i].charAt(2));
                        if (T == 1) {
                            t=1;
                            T = 1.1;
                            g2d.translate(-40, -10);
                            x = x + 10;
                            textSeparado[i] = textSeparado[i].substring(3);
                            if (textSeparado[i].charAt(0)== '+'){
                                if (textSeparado[i].charAt(1)== 'N') {
                                    Negrita = true;
                                    g2d.setStroke(new BasicStroke(2f));
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'S') {
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'S') {
                                    Subr = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'K') {
                                    Curs = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'S'){
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (T == 2) {
                            t=2;
                            T = 1.2;
                            g2d.translate(-80, -20);
                            x = x +20;
                            textSeparado[i] = textSeparado[i].substring(3);
                            if (textSeparado[i].charAt(0)== '+'){
                                if (textSeparado[i].charAt(1)== 'N') {
                                    Negrita = true;
                                    g2d.setStroke(new BasicStroke(2f));
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'S') {
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'S') {
                                    Subr = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'K') {
                                    Curs = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'S'){
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (T == 3) {
                            t=3;
                            T = 1.3;
                            g2d.translate(-140, -30);
                            x = x +50;
                            textSeparado[i] = textSeparado[i].substring(3);
                            if (textSeparado[i].charAt(0)== '+'){
                                if (textSeparado[i].charAt(1)== 'N') {
                                    Negrita = true;
                                    g2d.setStroke(new BasicStroke(2f));
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'S') {
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'S') {
                                    Subr = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'K') {
                                    Curs = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'S'){
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (T == 4) {
                            t=4;
                            T = 1.4;
                            g2d.translate(-200, -40);
                            x = x + 70;
                            textSeparado[i] = textSeparado[i].substring(3);
                            if (textSeparado[i].charAt(0)== '+'){
                                if (textSeparado[i].charAt(1)== 'N') {
                                    Negrita = true;
                                    g2d.setStroke(new BasicStroke(2f));
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'S') {
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'S') {
                                    Subr = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'K') {
                                    Curs = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'S'){
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (T == 5) {
                            t=5;
                            T = 1.5;
                            g2d.translate(-270, -50);
                            x = x + 110;
                            textSeparado[i] = textSeparado[i].substring(3);
                            if (textSeparado[i].charAt(0)== '+'){
                                if (textSeparado[i].charAt(1)== 'N') {
                                    Negrita = true;
                                    g2d.setStroke(new BasicStroke(2f));
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'S') {
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'S') {
                                    Subr = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'K') {
                                                    Curs = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'K'){
                                            Curs = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }if (textSeparado[i].charAt(1)== 'K') {
                                    Curs = true;
                                    textSeparado[i] = textSeparado[i].substring(2);
                                    if (textSeparado[i].charAt(0)== '+') {
                                        if (textSeparado[i].charAt(1)== 'N') {
                                            Negrita = true;
                                            g2d.setStroke(new BasicStroke(2f));
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'S') {
                                                    Subr = true;
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                        if (textSeparado[i].charAt(1)== 'S'){
                                            Subr = true;
                                            textSeparado[i] = textSeparado[i].substring(2);
                                            if (textSeparado[i].charAt(0)== '+') {
                                                if (textSeparado[i].charAt(1)== 'N') {
                                                    Negrita = true;
                                                    g2d.setStroke(new BasicStroke(2f));
                                                    textSeparado[i] = textSeparado[i].substring(2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'R') {//funcion que detecta la posicion exacta de donde se quiere invertir la frase
                        String[] auxtext2 = new String[(textSeparado.length)-i];
                        textSeparado[i] = textSeparado[i].substring(2);
                        for (int j = i; j <= textSeparado.length-1; j++) {
                            auxtext2[j-i] = textSeparado[j]; 
                        }
                        auxtext2 = reverse(auxtext2);
                        for (int j = i; j <= textSeparado.length-1; j++) {
                            textSeparado[j]=auxtext2[j-i];
                        }
                        if (textSeparado[i].charAt(0)== '+'){
                            if (textSeparado[i].charAt(1)== 'N') {
                                Negrita = true;
                                g2d.setStroke(new BasicStroke(2f));
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'S') {
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'S') {
                                Subr = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'K') {
                                Curs = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'S'){
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'a') {
                        String a = "0";//evita que marque error al intentar inclinar la frase entera
                        int l;
                        for (int j = 0; j < 4; j++) {
                            if ((textSeparado[i].charAt(j+2))=='1'||(textSeparado[i].charAt(j+2))=='2'||(textSeparado[i].charAt(j+2))=='3'
                                || (textSeparado[i].charAt(j+2))=='4'||(textSeparado[i].charAt(j+2))=='5'||(textSeparado[i].charAt(j+2))=='6'
                                ||(textSeparado[i].charAt(j+2))=='7'||(textSeparado[i].charAt(j+2))=='8'||(textSeparado[i].charAt(j+2))=='9'
                                ||(textSeparado[i].charAt(j+2))=='0'){
                                a = a + (textSeparado[i].charAt(j+2));
                            }
                        }
                        l = a.length();
                        G = Integer.parseInt(a);
                        g2d.rotate(Math.toRadians(G), x, 70+y);
                        textSeparado[i] = textSeparado[i].substring(l+1);
                        if (textSeparado[i].charAt(0)== '+'){
                            if (textSeparado[i].charAt(1)== 'N') {
                                Negrita = true;
                                g2d.setStroke(new BasicStroke(2f));
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'S') {
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'S') {
                                Subr = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'K') {
                                Curs = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'S'){
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'A') {
                        String a = "0";//evita que marque error al intentar inclinar la frase entera
                        int l;
                        for (int j = 0; j < 4; j++) {
                            if ((textSeparado[i].charAt(j+2))=='1'||(textSeparado[i].charAt(j+2))=='2'||(textSeparado[i].charAt(j+2))=='3'
                                || (textSeparado[i].charAt(j+2))=='4'||(textSeparado[i].charAt(j+2))=='5'||(textSeparado[i].charAt(j+2))=='6'
                                ||(textSeparado[i].charAt(j+2))=='7'||(textSeparado[i].charAt(j+2))=='8'||(textSeparado[i].charAt(j+2))=='9'
                                ||(textSeparado[i].charAt(j+2))=='0'){
                                a = a + (textSeparado[i].charAt(j+2));
                            }
                        }
                        l = a.length();
                        Gtotal = Integer.parseInt(a);
                        textSeparado[i] = textSeparado[i].substring(l+1);
                    }
                    if (textSeparado[i].charAt(1) == 'X') {
                        g2d.translate(0, yrev);//(150+y)
                        g2d.scale(1, -1);
                        textSeparado[i] = textSeparado[i].substring(2);
                        if (textSeparado[i].charAt(0)== '+'){
                            if (textSeparado[i].charAt(1)== 'N') {
                                Negrita = true;
                                g2d.setStroke(new BasicStroke(2f));
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'S') {
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'S') {
                                Subr = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'K') {
                                Curs = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'S'){
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (textSeparado[i].charAt(1) == 'Y') {
                        g2d.scale(-1, 1);
                        g2d.translate(-(xrev*2)-300, 0);
                        textSeparado[i] = textSeparado[i].substring(2);
                        if (textSeparado[i].charAt(0)== '+'){
                            if (textSeparado[i].charAt(1)== 'N') {
                                Negrita = true;
                                g2d.setStroke(new BasicStroke(2f));
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'S') {
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'S') {
                                Subr = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'K') {
                                                Curs = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'K'){
                                        Curs = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }if (textSeparado[i].charAt(1)== 'K') {
                                Curs = true;
                                textSeparado[i] = textSeparado[i].substring(2);
                                if (textSeparado[i].charAt(0)== '+') {
                                    if (textSeparado[i].charAt(1)== 'N') {
                                        Negrita = true;
                                        g2d.setStroke(new BasicStroke(2f));
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'S') {
                                                Subr = true;
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                    if (textSeparado[i].charAt(1)== 'S'){
                                        Subr = true;
                                        textSeparado[i] = textSeparado[i].substring(2);
                                        if (textSeparado[i].charAt(0)== '+') {
                                            if (textSeparado[i].charAt(1)== 'N') {
                                                Negrita = true;
                                                g2d.setStroke(new BasicStroke(2f));
                                                textSeparado[i] = textSeparado[i].substring(2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                g2d.rotate(Math.toRadians(Gtotal));
            }
            
            
            for (int k = 0; k < textSeparado[i].length(); k++) {
                aux = textSeparado[i].charAt(k);
                String letra = Character.toString(aux); 
                if (x > 1130) {
                    if (" ".equals(letra) ||"-".equals(letra) || "_".equals(letra) || "(".equals(letra) ||")".equals(letra) || "[".equals(letra) || "]".equals(letra) || "{".equals(letra)
                        || "}".equals(letra) || "?".equals(letra) || "¿".equals(letra) || "¡".equals(letra) || "!".equals(letra) || "'".equals(letra) || "\"".equals(letra) || ".".equals(letra) 
                        || ":".equals(letra)|| ";".equals(letra) || ",".equals(letra) || "<".equals(letra) || ">".equals(letra)){
                        x = 0;
                        y = y + 90;
                        yrev = yrev + 180;
                    }else{
                        curve.moveTo((10+x)*T, (50+y)*T);
                        curve.lineTo((30+x)*T, (50+y)*T);
                        g2d.draw(curve);
                        x = 0;
                        y = y + 90;
                        yrev = yrev + 180;
                    }
                }
                if (x <= 1130) {
                    
                    if ("a".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 70;
                        
                    }
                    if ("á".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 70;
                    }
                    if ("b".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }
                    if ("c".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if ("d".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 55;
                    }
                    if ("e".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if ("é".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }

                    if ("f".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }

                    if ("g".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("h".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }

                    if ("i".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 45;
                    }
                    if ("í".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 45;
                    }

                    if ("j".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 40;
                    }
                    if ("k".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 40;
                    }
                    if ("l".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 35;
                    }
                    if ("m".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 65;
                    }
                    if ("n".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("ñ".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("o".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("ó".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("p".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 45;
                    }
                    if ("q".equals(letra)) {//listo
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 45;
                    }
                    if ("r".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 30;
                    }

                    if ("s".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("t".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 40;
                    }
                    if ("u".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 55;
                    }
                    if ("ú".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 55;
                    }
                    if ("v".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 53;
                    }
                    if ("w".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 66;
                    }

                    if ("x".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 56;
                    }
                    if ("y".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 50;
                    }
                    if ("z".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            PuntosControl.add(Pcontrol(letra, x, y, T));
                        }
                        x = x + 40;
                    }
                    if ("A".equals(letra)) {//Dibujar A
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("Á".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("B".equals(letra)) {//Dibujar B
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }

                    if ("C".equals(letra)) {//Dibujar C
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("D".equals(letra)) {//Dibujar D
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("E".equals(letra)) {//Dibujar D
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("É".equals(letra)) {//Dibujar D
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("F".equals(letra)) {//Dibujar F
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("G".equals(letra)) {//Dibujar g
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }

                    if ("H".equals(letra)) {//Dibujar H
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("I".equals(letra)) {//Dibujar i
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("Í".equals(letra)) {//Dibujar i
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("J".equals(letra)) {//Dibujar J
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("K".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }

                    if ("L".equals(letra)) {//L mayuscula
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 30;
                    }
                    if ("M".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 85;
                    }
                    if ("N".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("Ñ".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("O".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 80;
                    }
                    if ("Ó".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 80;
                    }
                    if ("P".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 45;
                    }

                    if ("Q".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 80;
                    }
                    if ("R".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 45;
                    }
                    if ("S".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 70;
                    }
                    if ("T".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("U".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("Ú".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("V".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    if ("W".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 80;
                    }
                    if ("X".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 55;
                    }
                    if ("Y".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 55;
                    }
                    if ("Z".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Curs == true) {
                            if (Subr == false) {
                                DibujoFinal.add(Dcursivas(letra, x, y, T));
                            }
                            if (Subr == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubc(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 60;
                    }
                    //SIMBOLOS
                    if ("-".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }
                    if ("_".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }
                    if ("(".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 30;
                    }
                    if (")".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 30;
                    }
                    if ("[".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 30;
                    }
                    if ("{".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 35;
                    }
                    if ("}".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 35;
                    }
                    if ("]".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 30;
                    }
                    if ("!".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }
                    if ("¡".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 40;
                    }
                    if ("¿".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if ("?".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if (".".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if (":".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if (",".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if (";".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 50;
                    }
                    if ("'".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 5;
                    }
                    if ("\"".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 5;
                    }
                    if ("<".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 15;
                    }
                    if (">".equals(letra)) {
                        if (Curs == false && Subr == false) {
                            DibujoFinal.add(Dletras(letra, x, y, T));
                        }
                        if (Subr == true) {
                            if (Curs == false) {
                                DibujoFinal.add(Dsubrayado(letra, x, y, T));
                            }
                            if (Curs == true) {
                                DibujoFinal.add(Dsubrayado(letra, x,y ,T));
                            }
                        }
                        if (Puntos == true) {
                            Pcontrol(letra, x, y, T);
                        }
                        x = x + 15;
                    }
                    if (" ".equals(letra)) {
                        DibujoFinal.add(Dletras(letra, x, y, T));                        
                        x = x + 50;
                    }
                }
                xrev = x;
                ancho = DibujoFinal.size()-1;
                g2d.draw(DibujoFinal.get(ancho));
            }
            
            g2d.setTransform(reset);
        }
        
        
        if (Puntos == true) {
            for (int i = 0; i < PuntosControl.size(); i++) {
                g2d.draw((Shape) PuntosControl.get(i));
            }
        }
    }//GEN-LAST:event_palabraKeyReleased
    
    public Path2D.Double Dletras(String letra, double x, double y, double T) {
        Path2D.Double curve = new Path2D.Double();
        if (" ".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.moveTo((50+x)*T, (70+y)*T);
        }
        if ("a".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (20+x)*T, (65+y)*T, (20+x)*T, (50+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((30+x)*T, (75+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (50+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((30+x)*T, (20+y)*T, (50+x)*T, (20+y)*T, (60+x)*T, (50+y)*T);
            curve.moveTo((60+x)*T, (50+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (60+x)*T, (70+y)*T, (70+x)*T, (70+y)*T);  
        }
        if ("á".equals(letra)){
            curve.moveTo(0+x*T, 70+y*T);
            curve.curveTo(10+x*T, 70+y*T, 20+x*T, 65+y*T, 20+x*T, 50+y*T);
            curve.moveTo(20+x*T, 50+y*T);
            curve.curveTo(30+x*T, 75+y*T, 50+x*T, 75+y*T, 60+x*T, 50+y*T);
            curve.moveTo(20+x*T, 50+y*T);
            curve.curveTo(30+x*T, 20+y*T, 50+x*T, 20+y*T, 60+x*T, 50+y*T);
            curve.moveTo(60+x*T, 50+y*T);
            curve.curveTo(55+x*T, 65+y*T, 60+x*T, 70+y*T, 70+x*T, 70+y*T);
            curve.moveTo(40+x*T,20+y*T);
            curve.lineTo(50+x*T, 10+y*T);
        }
        if ("b".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((17+x)*T, (68+y)*T, (30+x)*T, (48+y)*T, (23+x)*T, (25+y)*T);
            curve.moveTo((23+x)*T, (25+y)*T);
            curve.curveTo((22+x)*T, (19+y)*T, (18+x)*T, (19+y)*T, (18+x)*T, (25+y)*T);
            curve.moveTo((18+x)*T, (25+y)*T);
            curve.curveTo((10+x)*T, (35+y)*T, (10+x)*T, (55+y)*T, (18+x)*T, (68+y)*T);
            curve.moveTo((18+x)*T, (68+y)*T);
            curve.curveTo((20+x)*T, (75+y)*T, (20+x)*T, (70+y)*T, (30+x)*T, (65+y)*T);
            curve.moveTo((30+x)*T, (65+y)*T);
            curve.curveTo((32+x)*T, (63+y)*T, (33+x)*T, (59+y)*T, (32+x)*T, (55+y)*T);
            curve.moveTo((32+x)*T, (55+y)*T);
            curve.lineTo((40+x)*T, (55+y)*T);
        }
        if ("c".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((12+x)*T, (65+y)*T, (16+x)*T, (60+y)*T, (20+x)*T, (50+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((23+x)*T, (35+y)*T, (35+x)*T, (28+y)*T, (50+x)*T, (35+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((23+x)*T, (65+y)*T, (30+x)*T, (72+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
        }
        if ("d".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (69+y)*T, (13+x)*T, (65+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (40+y)*T, (38+x)*T, (40+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.lineTo((40+x)*T, (10+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (75+y)*T, (35+x)*T, (75+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.curveTo((40+x)*T, (65+y)*T, (45+x)*T, (72+y)*T, (55+x)*T, (70+y)*T);
        }
        if ("e".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (69+y)*T, (27+x)*T, (57+y)*T, (26+x)*T, (43+y)*T);
            curve.moveTo((26+x)*T, (43+y)*T);
            curve.curveTo((25+x)*T, (30+y)*T, (18+x)*T, (30+y)*T, (13+x)*T, (43+y)*T);
            curve.moveTo((13+x)*T, (43+y)*T);
            curve.curveTo((10+x)*T, (55+y)*T, (25+x)*T, (68+y)*T, (50+x)*T, (70+y)*T);
        }

        if ("é".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (69+y)*T, (27+x)*T, (57+y)*T, (26+x)*T, (43+y)*T);
            curve.moveTo((26+x)*T, (43+y)*T);
            curve.curveTo((25+x)*T, (30+y)*T, (18+x)*T, (30+y)*T, (13+x)*T, (43+y)*T);
            curve.moveTo((13+x)*T, (43+y)*T);
            curve.curveTo((10+x)*T, (55+y)*T, (25+x)*T, (68+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T,(20+y)*T);
            curve.lineTo((35+x)*T, (10+y)*T);
        }
        if ("f".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (65+y)*T, (30+x)*T, (50+y)*T, (20+x)*T, (20+y)*T);
            curve.curveTo((15+x)*T, (15+y)*T, (15+x)*T, (30+y)*T, (10+x)*T, (35+y)*T);
            curve.curveTo((8+x)*T, (52+y)*T, (8+x)*T, (75+y)*T, (10+x)*T, (90+y)*T);
            curve.moveTo((10+x)*T, (90+y)*T);
            curve.curveTo((12+x)*T, (98+y)*T, (18+x)*T, (98+y)*T, (20+x)*T, (90+y)*T);
            curve.moveTo((20+x)*T, (90+y)*T);
            curve.curveTo((25+x)*T, (75+y)*T, (18+x)*T, (53+y)*T, (10+x)*T, (60+y)*T);
            curve.moveTo((10+x)*T, (60+y)*T);
            curve.curveTo((15+x)*T, (74+y)*T, (20+x)*T, (75+y)*T, (40+x)*T, (70+y)*T);
        }
        if ("g".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (73+y)*T, (16+x)*T, (58+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((25+x)*T, (40+y)*T, (35+x)*T, (40+y)*T,(40+x)*T , (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.curveTo((35+x)*T, (75+y)*T, (25+x)*T, (75+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.lineTo((40+x)*T, (90+y)*T);
            curve.moveTo((40+x)*T, (90+y)*T);
            curve.curveTo((40+x)*T, (105+y)*T, (25+x)*T, (120+y)*T, (10+x)*T, (100+y)*T);
            curve.moveTo((10+x)*T, (100+y)*T);
            curve.curveTo((25+x)*T, (82+y)*T, (35+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
        }
        if ("h".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (60+y)*T, (28+x)*T, (42+y)*T, (30+x)*T, (28+y)*T);
            curve.moveTo((15+x)*T, (28+y)*T);
            curve.lineTo((15+x)*T , (70+y)*T);
            curve.moveTo((30+x)*T, (28+y)*T);
            curve.curveTo((25+x)*T, (12+y)*T, (22+x)*T, (12+y)*T, (15+x)*T, (28+y)*T);
            curve.moveTo((15+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (48+y)*T, (32+x)*T, (48+y)*T, (35+x)*T, (62+y)*T);
            curve.moveTo((35+x)*T, (62+y)*T);
            curve.curveTo((35+x)*T, (72+y)*T, (40+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
        }
        if ("i".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (65+y)*T, (25+x)*T, (58+y)*T, (20+x)*T, (45+y)*T);
            curve.moveTo((20+x)*T, (35+y)*T);
            curve.curveTo((18+x)*T, (36+y)*T, (18+x)*T, (39+y)*T, (20+x)*T, (40+y)*T);
            curve.curveTo((22+x)*T, (39+y)*T, (22+x)*T, (36+y)*T, (20+x)*T, (35+y)*T);
            curve.moveTo((20+x)*T, (45+y)*T);
            curve.curveTo((13+x)*T, (52+y)*T, (20+x)*T, (68+y)*T, (45+x)*T, (70+y)*T);
        }
        if ("í".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (65+y)*T, (25+x)*T, (58+y)*T, (20+x)*T, (45+y)*T);
            curve.moveTo((20+x)*T, (45+y)*T);
            curve.curveTo((13+x)*T, (52+y)*T, (20+x)*T, (68+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T,(35+y)*T);
            curve.lineTo((30+x)*T, (25+y)*T);
        }
        if ("j".equals(letra)){
            curve.moveTo((25+x)*T, (35+y)*T);
            curve.curveTo((22+x)*T, (36+y)*T, (22+x)*T, (44+y)*T, (25+x)*T, (45+y)*T);
            curve.curveTo((28+x)*T, (44+y)*T, (28+x)*T, (36+y)*T, (25+x)*T, (35+y)*T);
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (15+x)*T, (70+y)*T, (25+x)*T, (50+y)*T);
            curve.lineTo((25+x)*T, (110+y)*T);
            curve.curveTo((0+x)*T, (135+y)*T, (0+x)*T, (80+y)*T, (40+x)*T, (70+y)*T);
        }
        if("k".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (65+y)*T, (25+x)*T, (20+y)*T, (20+x)*T, (15+y)*T );
            curve.curveTo((15+x)*T, (20+y)*T, (15+x)*T, (35+y)*T, (20+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T, (48+y)*T);
            curve.curveTo((40+x)*T, (51+y)*T, (40+x)*T, (59+y)*T, (25+x)*T, (60+y)*T);
            curve.curveTo((40+x)*T, (59+y)*T, (40+x)*T, (69+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (30+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
        }
        if("l".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (65+y)*T, (25+x)*T, (20+y)*T, (20+x)*T, (15+y)*T);
            curve.curveTo((5+x)*T, (20+y)*T, (5+x)*T, (65+y)*T, (35+x)*T, (70+y)*T);
        }
        if("m".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((10+x)*T, (40+y)*T);
            curve.curveTo((15+x)*T, (35+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.lineTo((40+x)*T, (70+y)*T);
            curve.moveTo((40+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (35+y)*T, (45+x)*T, (35+y)*T, (55+x)*T, (40+y)*T);
            curve.lineTo((55+x)*T, (64+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (62+x)*T, (70+y)*T, (65+x)*T, (70+y)*T);
        }
        if("n".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((10+x)*T, (40+y)*T);
            curve.curveTo((15+x)*T, (35+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.lineTo((40+x)*T, (64+y)*T);
            curve.curveTo((43+x)*T, (70+y)*T, (47+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
        }
        if("ñ".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((10+x)*T, (40+y)*T);
            curve.curveTo((15+x)*T, (35+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.lineTo((40+x)*T, (64+y)*T);
            curve.curveTo((43+x)*T, (70+y)*T, (47+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((15+x)*T, (30+y)*T);
            curve.curveTo((20+x)*T, (25+y)*T, (30+x)*T, (35+y)*T, (35+x)*T, (30+y)*T);
        }
        if("o".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (45+y)*T, (5+x)*T, (65+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((45+x)*T, (65+y)*T, (45+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.moveTo((13+x)*T, (46+y)*T);
            curve.curveTo((18+x)*T, (50+y)*T, (40+x)*T, (50+y)*T, (45+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
        }
        if("ó".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (45+y)*T, (5+x)*T, (65+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((45+x)*T, (65+y)*T, (45+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.moveTo((13+x)*T, (46+y)*T);
            curve.curveTo((18+x)*T, (50+y)*T, (40+x)*T, (50+y)*T, (45+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(20+y)*T);
            curve.lineTo((40+x)*T, (10+y)*T);
        }
        if("p".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((5+x)*T, (75+y)*T, (17+x)*T, (47+y)*T, (20+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (65+y)*T, (20+x)*T, (70+y)*T);
            curve.lineTo((20+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (90+y)*T);
            curve.moveTo((20+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (72+y)*T, (40+x)*T, (72+y)*T, (45+x)*T, (70+y)*T);
        }
        if("q".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.moveTo((20+x)*T, (40+y)*T);
            curve.curveTo((0+x)*T, (45+y)*T, (0+x)*T, (65+y)*T, (20+x)*T, (70+y)*T);
            curve.curveTo((40+x)*T, (65+y)*T, (40+x)*T, (45+y)*T, (20+x)*T, (40+y)*T);
            curve.moveTo((35+x)*T, (55+y)*T);
            curve.lineTo((35+x)*T, (90+y)*T);
            curve.moveTo((35+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (85+y)*T, (20+x)*T, (60+y)*T, (45+x)*T, (70+y)*T);
        }
        if ("r".equals(letra)) {
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (65+y)*T, (10+x)*T, (35+y)*T, (0+x)*T, (30+y)*T);
            curve.curveTo((0+x)*T, (60+y)*T, (40+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.curveTo((25+x)*T, (35+y)*T, (25+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
        }
        if("s".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (25+x)*T, (30+y)*T, (20+x)*T, (30+y)*T);
            curve.curveTo((40+x)*T, (35+y)*T, (50+x)*T, (90+y)*T, (25+x)*T, (67+y)*T);
            curve.curveTo((35+x)*T, (60+y)*T, (40+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
        }
        if("t".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (20+x)*T, (20+y)*T, (20+x)*T, (0+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((8+x)*T, (25+y)*T);
            curve.lineTo((32+x)*T, (25+y)*T);
        }
        if("u".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (15+x)*T, (45+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((40+x)*T, (45+y)*T, (40+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
        }
        if("ú".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (15+x)*T, (45+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((40+x)*T, (45+y)*T, (40+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(20+y)*T);
            curve.lineTo((40+x)*T, (10+y)*T);
        }
        if("v".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (35+y)*T, (10+x)*T, (35+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (49+x)*T, (45+y)*T, (53+x)*T, (40+y)*T);
        }
        if("w".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (30+y)*T, (10+x)*T, (30+y)*T, (15+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (83+y)*T, (40+x)*T, (83+y)*T, (35+x)*T, (35+y)*T);
            curve.curveTo((25+x)*T, (83+y)*T, (60+x)*T, (83+y)*T, (55+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (35+y)*T, (60+x)*T, (35+y)*T, (66+x)*T, (30+y)*T);
        }
        if("x".equals(letra)){
            curve.moveTo((6+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (75+y)*T, (30+x)*T, (30+y)*T, (50+x)*T, (30+y)*T);
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (30+y)*T, (10+x)*T, (30+y)*T, (15+x)*T, (30+y)*T);
            curve.curveTo((28+x)*T, (30+y)*T, (28+x)*T, (80+y)*T, (56+x)*T, (70+y)*T);
        }
        if ("y".equals(letra)) {
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (10+x)*T, (35+y)*T, (10+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((40+x)*T, (120+y)*T, (40+x)*T, (125+y)*T, (20+x)*T, (120+y)*T);
            curve.curveTo((10+x)*T, (100+y)*T, (40+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
        }
        if("z".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((-5+x)*T, (20+y)*T, (55+x)*T, (20+y)*T, (20+x)*T, (70+y)*T); 
            curve.curveTo((50+x)*T, (90+y)*T, (40+x)*T, (125+y)*T, (20+x)*T, (120+y)*T);
            curve.curveTo((10+x)*T, (100+y)*T, (30+x)*T, (80+y)*T, (40+x)*T, (70+y)*T);
        }
        if ("A".equals(letra)){
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((25+x)*T,(0+y)*T);
            curve.moveTo((25+x)*T,(0+y)*T);
            curve.lineTo((50+x)*T,(70+y)*T);
            curve.curveTo((70+x)*T,(65+y)*T,(70+x)*T,(45+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((35+x)*T,(30+y)*T,(15+x)*T,(40+y)*T,(0+x)*T,(48+y)*T);
            curve.moveTo((0+x)*T,(48+y)*T);
            curve.curveTo((-11+x)*T,(48+y)*T,(-17+x)*T,(32+y)*T,(-8+x)*T,(20+y)*T);
        }
        if ("Á".equals(letra)){
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((25+x)*T,(0+y)*T);
            curve.moveTo((25+x)*T,(0+y)*T);
            curve.lineTo((50+x)*T,(70+y)*T);
            curve.curveTo((70+x)*T,(65+y)*T,(70+x)*T,(45+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((35+x)*T,(30+y)*T,(15+x)*T,(40+y)*T,(0+x)*T,(48+y)*T);
            curve.moveTo((0+x)*T,(48+y)*T);
            curve.curveTo((-11+x)*T,(48+y)*T,(-17+x)*T,(32+y)*T,(-8+x)*T,(20+y)*T);
            curve.moveTo((25+x)*T,(-5+y)*T);
            curve.lineTo((35+x)*T,( -15+y)*T);
        }
        if ("B".equals(letra)){
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.lineTo((20+x)*T,(0+y)*T);
            curve.moveTo((20+x)*T,(0+y)*T);
            curve.curveTo((75+x)*T,(5+y)*T,(75+x)*T,(25+y)*T,(20+x)*T,(35+y)*T);
            curve.moveTo((20+x)*T,(35+y)*T);
            curve.curveTo((75+x)*T,(45+y)*T,(75+x)*T,(65+y)*T,(20+x)*T,(70+y)*T);
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.curveTo((0+x)*T,(65+y)*T,(0+x)*T,(55+y)*T,(20+x)*T,(50+y)*T);
            curve.moveTo((20+x)*T,(50+y)*T);
            curve.curveTo((38+x)*T,(58+y)*T,(50+x)*T,(68+y)*T,(70+x)*T,(70+y)*T); 
        }
        if ("C".equals(letra)){
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.curveTo((72+x)*T,(16+y)*T,(78+x)*T,(10+y)*T,(50+x)*T,(5+y)*T);
            curve.moveTo((50+x)*T,(5+y)*T);
            curve.curveTo((0+x)*T,(18+y)*T,(0+x)*T,(48+y)*T,(50+x)*T,(70+y)*T);
            curve.moveTo((50+x)*T,(70+y)*T);
            curve.lineTo((70+x)*T,(70+y)*T);
        }
        if ("D".equals(letra)){
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.curveTo((22+x)*T,(18+y)*T,(28+x)*T,(55+y)*T,(20+x)*T,(70+y)*T);
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.curveTo((2+x)*T,(62+y)*T,(10+x)*T,(50+y)*T,(35+x)*T,(70+y)*T);
            curve.moveTo((35+x)*T,(70+y)*T);
            curve.curveTo((90+x)*T,(48+y)*T,(90+x)*T,(28+y)*T,(30+x)*T,(0+y)*T);
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.curveTo((5+x)*T,(5+y)*T,(9+x)*T,(24+y)*T,(20+x)*T,(10+y)*T); 
        }
        if ("E".equals(letra)){
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((48+x)*T,(8+y)*T,(53+x)*T,(19+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((30+x)*T,(0+y)*T,(15+x)*T,(23+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((18+x)*T,(42+y)*T,(20+x)*T,(65+y)*T,(70+x)*T,(70+y)*T);
        }
        if ("É".equals(letra)){
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((48+x)*T,(8+y)*T,(53+x)*T,(19+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((30+x)*T,(0+y)*T,(15+x)*T,(23+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((18+x)*T,(42+y)*T,(20+x)*T,(65+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((45+x)*T,(-5+y)*T);
            curve.lineTo((55+x)*T, (-15+y)*T);
        }
        if ("F".equals(letra)){
            curve.moveTo((80+x)*T,(0+y)*T);
            curve.curveTo((63+x)*T,(9+y)*T,(27+x)*T,(2+y)*T,(10+x)*T,(10+y)*T);
            curve.moveTo((10+x)*T,(10+y)*T);
            curve.curveTo((5+x)*T,(25+y)*T,(12+x)*T,(28+y)*T,(20+x)*T,(18+y)*T);
            curve.moveTo((40+x)*T,(10+y)*T);
            curve.curveTo((30+x)*T,(30+y)*T,(30+x)*T,(65+y)*T,(25+x)*T,(80+y)*T);
            curve.moveTo((25+x)*T,(80+y)*T);
            curve.curveTo((12+x)*T,(90+y)*T,(8+x)*T,(68+y)*T,(20+x)*T,(60+y)*T);  
            curve.moveTo((25+x)*T,(42+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
            curve.moveTo((42+x)*T,(40+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
        }
        if ("G".equals(letra)){
            curve.moveTo((60+x)*T,(10+y)*T);
            curve.curveTo((36+x)*T,(3+y)*T,(21+x)*T,(18+y)*T,(20+x)*T,(40+y)*T);
            curve.moveTo((20+x)*T,(40+y)*T);
            curve.curveTo((35+x)*T,(75+y)*T,(55+x)*T,(75+y)*T,(70+x)*T,(40+y)*T);
            curve.moveTo((70+x)*T,(40+y)*T);
            curve.lineTo((55+x)*T,(40+y)*T);
        }
        if ("H".equals(letra)){
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.lineTo((32+x)*T,(70+y)*T);
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.lineTo((62+x)*T,(70+y)*T);
            curve.moveTo((60+x)*T,(70+y)*T);
            curve.curveTo((70+x)*T,(80+y)*T,(89+x)*T,(55+y)*T,(80+x)*T,(38+y)*T);
            curve.moveTo((80+x)*T,(38+y)*T);
            curve.curveTo((65+x)*T,(32+y)*T,(38+x)*T,(45+y)*T,(18+x)*T,(43+y)*T);  
            curve.moveTo((18+x)*T,(43+y)*T);
            curve.curveTo((9+x)*T,(35+y)*T,(12+x)*T,(12+y)*T,(25+x)*T,(23+y)*T);
        }
        if ("I".equals(letra)){
            curve.moveTo((20+x)*T,(5+y)*T);
            curve.curveTo((32+x)*T,(2+y)*T,(50+x)*T,(10+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((70+x)*T,(8+y)*T,(68+x)*T,(1+y)*T,(60+x)*T,(0+y)*T);  
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((45+x)*T,(4+y)*T,(45+x)*T,(48+y)*T,(40+x)*T,(60+y)*T); 
            curve.moveTo((40+x)*T,(60+y)*T);
            curve.curveTo((33+x)*T,(75+y)*T,(23+x)*T,(73+y)*T,(25+x)*T,(64+y)*T); 
            curve.moveTo((25+x)*T,(64+y)*T);
            curve.curveTo((41+x)*T,(68+y)*T,(59+x)*T,(70+y)*T,(70+x)*T,(70+y)*T);
        }
        if ("Í".equals(letra)){
            curve.moveTo((20+x)*T,(5+y)*T);
            curve.curveTo((32+x)*T,(2+y)*T,(50+x)*T,(10+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((70+x)*T,(8+y)*T,(68+x)*T,(1+y)*T,(60+x)*T,(0+y)*T);  
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((45+x)*T,(4+y)*T,(45+x)*T,(48+y)*T,(40+x)*T,(60+y)*T); 
            curve.moveTo((40+x)*T,(60+y)*T);
            curve.curveTo((33+x)*T,(75+y)*T,(23+x)*T,(73+y)*T,(25+x)*T,(64+y)*T); 
            curve.moveTo((25+x)*T,(64+y)*T);
            curve.curveTo((41+x)*T,(68+y)*T,(59+x)*T,(70+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((50+x)*T,(-5+y)*T);
            curve.lineTo((60+x)*T, (-15+y)*T);
        }
        if ("J".equals(letra)){
            curve.moveTo((0+x)*T, (20+y)*T);
            curve.curveTo((20+x)*T, (5+y)*T, (40+x)*T, (30+y)*T, (60+x)*T, (20+y)*T);
            curve.curveTo((60+x)*T, (15+y)*T, (50+x)*T, (5+y)*T, (30+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T, (20+y)*T, (50+x)*T, (50+y)*T, (40+x)*T, (90+y)*T);
            curve.curveTo((10+x)*T, (90+y)*T, (0+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
        }
        if ("K".equals(letra)) {
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((0+x)*T, (10+y)*T, (6+x)*T, (7+y)*T, (10+x)*T, (10+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (70+y)*T, (5+x)*T, (70+y)*T, (0+x)*T, (65+y)*T);
            curve.moveTo((40+x)*T, (10+y)*T);
            curve.curveTo((30+x)*T, (5+y)*T, (20+x)*T, (30+y)*T, (10+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (50+y)*T, (25+x)*T, (45+y)*T, (30+x)*T, (65+y)*T);
            curve.curveTo((30+x)*T, (65+y)*T, (32+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
        }

        if ("L".equals(letra)) {
            curve.moveTo((25+x)*T, (10+y)*T);
            curve.curveTo((20+x)*T, (0+y)*T, (5+x)*T, (0+y)*T, (0+x)*T, (10+y)*T);
            curve.curveTo((0+x)*T, (15+y)*T, (8+x)*T, (40+y)*T, (5+x)*T, (65+y)*T);
            curve.curveTo((0+x)*T, (80+y)*T, (0+x)*T, (40+y)*T, (5+x)*T, (65+y)*T);
            curve.curveTo((5+x)*T, (65+y)*T, (15+x)*T, (75+y)*T, (30+x)*T, (70+y)*T);
        }
        if ("M".equals(letra)) {
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.curveTo((30+x)*T,( 0+y)*T, (45+x)*T, (0+y)*T, (50+x)*T, (30+y)*T);
            curve.lineTo((50+x)*T,(70+y)*T);
            curve.moveTo((50+x)*T, (30+y)*T);
            curve.curveTo((55+x)*T,( 0+y)*T, (70+x)*T, (0+y)*T, (75+x)*T, (30+y)*T);
            curve.lineTo((75+x)*T, (65+y)*T);
            curve.curveTo((77+x)*T,( 70+y)*T, (80+x)*T,( 70+y)*T, (85+x)*T, (70+y)*T);
        }
        if ("N".equals(letra)) {
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.curveTo((30+x)*T, (0+y)*T, (45+x)*T, (0+y)*T, (50+x)*T, (30+y)*T);
            curve.lineTo((50+x)*T,(65+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
        }
        if ("Ñ".equals(letra)) {
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.curveTo((30+x)*T, (0+y)*T, (45+x)*T, (0+y)*T, (50+x)*T, (30+y)*T);
            curve.lineTo((50+x)*T,(65+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((10+x)*T, (3+y)*T);
            curve.curveTo((20+x)*T, (-2+y)*T, (30+x)*T, (8+y)*T, (40+x)*T, (3+y)*T);
        }
        if ("O".equals(letra)) {
            curve.moveTo((40+x)*T, (0+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (0+x)*T, (65+y)*T, (40+x)*T, (70+y)*T);
            curve.curveTo((80+x)*T, (65+y)*T, (80+x)*T, (5+y)*T, (40+x)*T, (0+y)*T);
            curve.moveTo((18+x)*T, (14+y)*T);
            curve.curveTo((40+x)*T, (20+y)*T, (60+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
            curve.moveTo((65+x)*T, (56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
        }
        if ("Ó".equals(letra)) {
            curve.moveTo((40+x)*T, (0+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (0+x)*T, (65+y)*T, (40+x)*T, (70+y)*T);
            curve.curveTo((80+x)*T, (65+y)*T, (80+x)*T, (5+y)*T, (40+x)*T, (0+y)*T);
            curve.moveTo((18+x)*T, (14+y)*T);
            curve.curveTo((40+x)*T, (20+y)*T, (60+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
            curve.moveTo((65+x)*T, (56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((40+x)*T,(-5+y)*T);
            curve.lineTo((50+x)*T, (-15+y)*T);
        }
        if ("P".equals(letra)) {
            curve.moveTo((5+x)*T, (15+y)*T);
            curve.curveTo((10+x)*T,(15+y)*T , (25+x)*T,(10+y)*T, (20+x)*T,(7+y)*T);
            curve.curveTo((12+x)*T, (5+y)*T, (8+x)*T, (10+y)*T, (20+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (10+y)*T, (45+x)*T, (35+y)*T, (20+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (7+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (30+x)*T, (75+y)*T, (45+x)*T, (70+y)*T);
        }
        if ("Q".equals(letra)) {
            curve.moveTo((40+x)*T, (0+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (0+x)*T, (65+y)*T, (40+x)*T, (70+y)*T);
            curve.curveTo((80+x)*T, (65+y)*T, (80+x)*T, (5+y)*T, (40+x)*T, (0+y)*T);
            curve.moveTo((18+x)*T, (14+y)*T);
            curve.curveTo((20+x)*T, (30+y)*T, (20+x)*T, (50+y)*T, (25+x)*T, (50+y)*T);
            curve.curveTo((35+x)*T, (40+y)*T, (55+x)*T, (40+y)*T, (65+x)*T, (56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
        }
        if("R".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (5+x)*T, (0+y)*T, (5+x)*T, (10+y)*T);
            curve.moveTo((-10+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (0+y)*T, (50+x)*T, (35+y)*T, (11+x)*T, (40+y)*T);
            curve.moveTo((11+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (20+x)*T, (70+y)*T, (45+x)*T, (70+y)*T);
        }
        if("S".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (25+x)*T, (30+y)*T, (20+x)*T, (0+y)*T);
            curve.curveTo((80+x)*T, (25+y)*T, (60+x)*T, (90+y)*T, (30+x)*T, (65+y)*T);
            curve.curveTo((35+x)*T, (50+y)*T, (45+x)*T, (80+y)*T, (70+x)*T, (70+y)*T);
        }
        if("T".equals(letra)){
            curve.moveTo((25+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (35+x)*T, (0+y)*T, (35+x)*T, (5+y)*T);
            curve.moveTo((5+x)*T, (20+y)*T);
            curve.curveTo((10+x)*T, (-10+y)*T, (50+x)*T, (15+y)*T, (60+x)*T, (0+y)*T);
        }
        if("U".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (32+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (74+y)*T, (39+x)*T, (15+y)*T, (43+x)*T, (10+y)*T);
            curve.curveTo((43+x)*T, (40+y)*T, (40+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
        }
        if("Ú".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (32+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (74+y)*T, (39+x)*T, (15+y)*T, (43+x)*T, (10+y)*T);
            curve.curveTo((43+x)*T, (40+y)*T, (40+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(-5+y)*T);
            curve.lineTo((40+x)*T, (-15+y)*T);
        }
        if("V".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((10+x)*T, (90+y)*T, (45+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (15+y)*T, (49+x)*T, (15+y)*T, (60+x)*T, (10+y)*T);
        }
        if("W".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((10+x)*T, (90+y)*T, (45+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((35+x)*T, (90+y)*T, (70+x)*T, (90+y)*T, (65+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (10+y)*T, (70+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
        }
        if("X".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (80+y)*T, (25+x)*T, (10+y)*T, (55+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (25+x)*T, (80+y)*T, (55+x)*T, (70+y)*T);
        }
        if("Y".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (32+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (74+y)*T, (39+x)*T, (15+y)*T, (43+x)*T, (10+y)*T);
            curve.curveTo((43+x)*T, (60+y)*T, (50+x)*T, (140+y)*T, (28+x)*T, (120+y)*T);
            curve.curveTo((25+x)*T, (90+y)*T, (32+x)*T, (80+y)*T, (55+x)*T, (70+y)*T);
        }
        if("Z".equals(letra)){
            curve.moveTo((5+x)*T, (20+y)*T);
            curve.curveTo((10+x)*T, (-10+y)*T, (50+x)*T, (15+y)*T, (60+x)*T, (0+y)*T);
            curve.lineTo((5+x)*T, (70+y)*T);
            curve.moveTo((18+x)*T, (35+y)*T);
            curve.lineTo((48+x)*T, (35+y)*T);
            curve.moveTo((5+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (60+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
        }
        if("-".equals(letra)){
            curve.moveTo((10+x)*T, (50+y)*T);
            curve.lineTo((30+x)*T, (50+y)*T);
        }
        if("_".equals(letra)){
            curve.moveTo((10+x)*T, (70+y)*T);
            curve.lineTo((30+x)*T, (70+y)*T);
        }
        if("(".equals(letra)){
            curve.moveTo((15+x)*T, (0+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (5+x)*T, (70+y)*T, (15+x)*T, (70+y)*T);
        }
        if(")".equals(letra)){
            curve.moveTo((15+x)*T, (0+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (25+x)*T, (70+y)*T, (15+x)*T, (70+y)*T);
        }
        if("[".equals(letra)){
            curve.moveTo((25+x)*T, (0+y)*T);
            curve.lineTo((10+x)*T, (0+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
        } 
        if("{".equals(letra)){
            curve.moveTo((25+x)*T, (0+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (15+x)*T, (40+y)*T, (5+x)*T, (35+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (10+x)*T, (70+y)*T, (25+x)*T, (70+y)*T);
        } 
        if("}".equals(letra)){
            curve.moveTo((0+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (0+y)*T, (10+x)*T, (40+y)*T, (20+x)*T, (35+y)*T);
            curve.curveTo((5+x)*T, (35+y)*T, (15+x)*T, (70+y)*T, (0+x)*T, (70+y)*T);
        } 
        if("]".equals(letra)){
            curve.moveTo((10+x)*T, (0+y)*T);
            curve.lineTo((25+x)*T, (0+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
        }
        if("!".equals(letra)){
            curve.moveTo((25+x)*T, (90+y)*T);
            curve.curveTo((20+x)*T,( 91+y)*T, (20+x)*T, (99+y)*T, (25+x)*T, (100+y)*T);
            curve.curveTo((30+x)*T, (99+y)*T, (30+x)*T, (91+y)*T, (25+x)*T, (90+y)*T);
            curve.moveTo((25+x)*T, (80+y)*T);
            curve.lineTo((25+x)*T, (10+y)*T);
        }
        if("¡".equals(letra)){
            curve.moveTo((25+x)*T, (10+y)*T);
            curve.curveTo((20+x)*T, (11+y)*T, (20+x)*T, (19+y)*T, (25+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T,(19+y)*T, (30+x)*T, (11+y)*T, (25+x)*T, (10+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (90+y)*T);
        }
        if("¿".equals(letra)){ 
            curve.moveTo((25+x)*T, (10+y)*T);
            curve.curveTo((20+x)*T, (11+y)*T, (20+x)*T, (19+y)*T, (25+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T,(19+y)*T, (30+x)*T, (11+y)*T, (25+x)*T, (10+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (65+y)*T);
            curve.curveTo((-30+x)*T, (90+y)*T, (45+x)*T, (140+y)*T, (45+x)*T, (90+y)*T);
        }
        if("?".equals(letra)){
            curve.moveTo((25+x)*T, (100+y)*T);
            curve.curveTo((20+x)*T, (101+y)*T, (20+x)*T, (109+y)*T, (25+x)*T, (110+y)*T);
            curve.curveTo((30+x)*T, (109+y)*T, (30+x)*T, (101+y)*T, (25+x)*T, (100+y)*T);
            curve.moveTo((25+x)*T, (90+y)*T);
            curve.lineTo((25+x)*T, (65+y)*T);
            curve.curveTo((90+x)*T, (50+y)*T, (25+x)*T, (-20+y)*T, (5+x)*T, (30+y)*T);
        }
        if(".".equals(letra)){
            curve.moveTo((5+x)*T, (65+y)*T);
            curve.curveTo((2+x)*T, (67+y)*T, (2+x)*T, (68+y)*T, (5+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (68+y)*T, (7+x)*T, (67+y)*T, (5+x)*T, (65+y)*T);
        }
        if(":".equals(letra)){
            curve.moveTo((5+x)*T, (65+y)*T);
            curve.curveTo((2+x)*T, (67+y)*T, (2+x)*T, (68+y)*T, (5+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (68+y)*T, (7+x)*T, (67+y)*T, (5+x)*T, (65+y)*T);
            curve.moveTo((5+x)*T, (45+y)*T);
            curve.curveTo((2+x)*T, (47+y)*T, (2+x)*T, (48+y)*T, (5+x)*T, (50+y)*T);
            curve.curveTo((7+x)*T, (48+y)*T, (7+x)*T, (47+y)*T, (5+x)*T, (45+y)*T);
        }
        if(",".equals(letra)){
            curve.moveTo((5+x)*T,(70+y)*T);
            curve.curveTo((6+x)*T, (71+y)*T, (3+x)*T, (73+y)*T, (2+x)*T, (80+y)*T);
        }
        if(";".equals(letra)){
            curve.moveTo((5+x)*T, (65+y)*T);
            curve.curveTo((2+x)*T, (67+y)*T, (2+x)*T, (68+y)*T, (5+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (68+y)*T, (7+x)*T, (67+y)*T, (5+x)*T, (65+y)*T);
            curve.moveTo((5+x)*T,(75+y)*T);
            curve.curveTo((4+x)*T, (76+y)*T, (3+x)*T, (78+y)*T, (2+x)*T, (80+y)*T);
        }
        if("'".equals(letra)){
            curve.moveTo((5+x)*T, (0+y)*T);
            curve.curveTo((4+x)*T, (4+y)*T, (2+x)*T, (7+y)*T, (0+x)*T, (10+y)*T);
        }
        if( "\"".equals(letra)){
            curve.moveTo((5+x)*T, (0+y)*T);
            curve.curveTo((4+x)*T, (4+y)*T, (2+x)*T, (7+y)*T, (0+x)*T, (10+y)*T);
            curve.moveTo((10+x)*T, (0+y)*T);
            curve.curveTo((9+x)*T, (4+y)*T, (7+x)*T, (7+y)*T, (5+x)*T, (10+y)*T);
        }
        if("<".equals(letra)){
            curve.moveTo((15+x)*T, (30+y)*T);
            curve.lineTo((0+x)*T,(40+y)*T);
            curve.lineTo((15+x)*T,(50+y)*T);
        }
        if(">".equals(letra)){
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.lineTo((15+x)*T,(40+y)*T);
            curve.lineTo((0+x)*T,(50+y)*T);
        }
        return curve;
    }

    public Path2D.Double Dcursivas(String letra, double x, double y, double T) {
        Path2D.Double curve = new Path2D.Double();

        if("a".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (71+y)*T, (23+x)*T, (67+y)*T, (40+x)*T, (30+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (24+y)*T, (72+x)*T, (32+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (75+y)*T, (40+x)*T, (90+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((70+x)*T, (50+y)*T);
            curve.curveTo((52+x)*T, (72+y)*T, (58+x)*T, (78+y)*T, (70+x)*T, (70+y)*T);
        }
        if("á".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (71+y)*T, (23+x)*T, (67+y)*T, (40+x)*T, (30+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (24+y)*T, (72+x)*T, (32+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (75+y)*T, (40+x)*T, (90+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((70+x)*T, (50+y)*T);
            curve.curveTo((52+x)*T, (72+y)*T, (58+x)*T, (78+y)*T, (70+x)*T, (70+y)*T);
            curve.moveTo(62+x*T,13+y*T);
            curve.lineTo(90+x*T,0+y*T);
        }
        if("b".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (41+y)*T, (45+x)*T, (23+y)*T, (33+x)*T, (23+y)*T);
            curve.moveTo((33+x)*T, (23+y)*T);
            curve.curveTo((21+x)*T, (28+y)*T, (12+x)*T, (45+y)*T, (11+x)*T, (62+y)*T);
            curve.moveTo((11+x)*T, (62+y)*T);
            curve.curveTo((15+x)*T, (73+y)*T, (22+x)*T, (68+y)*T, (25+x)*T, (55+y)*T);
            curve.moveTo((25+x)*T, (55+y)*T);
            curve.curveTo((31+x)*T, (53+y)*T, (36+x)*T, (52+y)*T, (42+x)*T, (53+y)*T);
            curve.moveTo((42+x)*T, (53+y)*T);
            curve.lineTo((42+x)*T, (70+y)*T);
        }
        if("c".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((13+x)*T, (58+y)*T, (38+x)*T, (33+y)*T, (60+x)*T, (30+y)*T);
            curve.moveTo((60+x)*T, (30+y)*T);
            curve.curveTo((3+x)*T, (48+y)*T, (3+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
        }
        if("d".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (69+y)*T, (13+x)*T, (65+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (40+y)*T, (38+x)*T, (40+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((70+x)*T, (10+y)*T);
            curve.curveTo((30+x)*T, (65+y)*T, (33+x)*T, (74+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (75+y)*T, (35+x)*T, (75+y)*T, (40+x)*T, (55+y)*T);
        }
        if("e".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (62+y)*T, (36+x)*T, (49+y)*T, (45+x)*T, (35+y)*T);
            curve.moveTo((45+x)*T, (35+y)*T);
            curve.curveTo((47+x)*T, (31+y)*T, (42+x)*T, (28+y)*T, (35+x)*T, (32+y)*T);
            curve.moveTo((35+x)*T, (32+y)*T);
            curve.curveTo((18+x)*T, (47+y)*T, (10+x)*T, (65+y)*T, (50+x)*T, (70+y)*T);
        }
        if("é".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (62+y)*T, (36+x)*T, (49+y)*T, (45+x)*T, (35+y)*T);
            curve.moveTo((45+x)*T, (35+y)*T);
            curve.curveTo((47+x)*T, (31+y)*T, (42+x)*T, (28+y)*T, (35+x)*T, (32+y)*T);
            curve.moveTo((35+x)*T, (32+y)*T);
            curve.curveTo((18+x)*T, (47+y)*T, (10+x)*T, (65+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo(62+x*T,13+y*T);
            curve.lineTo(90+x*T,0+y*T);
        }
        if("f".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((16+x)*T, (63+y)*T, (36+x)*T, (52+y)*T, (48+x)*T, (36+y)*T);
            curve.moveTo((48+x)*T, (36+y)*T);
            curve.curveTo((52+x)*T,( 31+y)*T, (50+x)*T, (28+y)*T, (42+x)*T, (32+y)*T);
            curve.moveTo((42+x)*T, (32+y)*T);
            curve.curveTo((20+x)*T, (52+y)*T, (5+x)*T, (75+y)*T, (3+x)*T, (90+y)*T);
            curve.moveTo((3+x)*T, (90+y)*T);
            curve.curveTo((3+x)*T, (100+y)*T, (13+x)*T, (90+y)*T, (23+x)*T, (70+y)*T);
            curve.moveTo((23+x)*T, (70+y)*T);
            curve.curveTo((22+x)*T, (64+y)*T, (18+x)*T, (64+y)*T, (12+x)*T, (69+y)*T);
            curve.moveTo((12+x)*T, (69+y)*T);
            curve.curveTo((21+x)*T, (72+y)*T, (35+x)*T, (72+y)*T, (50+x)*T, (70+y)*T);
        }
        if("g".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((11+x)*T,(71+y)*T, (17+x)*T, (68+y)*T, (20+x)*T, (60+y)*T);
            curve.moveTo((20+x)*T, (60+y)*T);
            curve.curveTo((22+x)*T, (73+y)*T, (34+x)*T, (73+y)*T,(43+x)*T , (60+y)*T);
            curve.moveTo((43+x)*T, (60+y)*T);
            curve.curveTo((43+x)*T, (43+y)*T, (33+x)*T, (43+y)*T, (20+x)*T, (60+y)*T);
            curve.moveTo((43+x)*T, (60+y)*T);
            curve.curveTo((35+x)*T, (85+y)*T, (22+x)*T, (96+y)*T, (5+x)*T, (98+y)*T);
            curve.moveTo((5+x)*T, (98+y)*T);
            curve.curveTo((0+x)*T, (96+y)*T, (0+x)*T, (92+y)*T, (3+x)*T, (90+y)*T);
            curve.moveTo((3+x)*T, (90+y)*T);
            curve.curveTo((18+x)*T, (80+y)*T, (28+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
        }
        if("h".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (63+y)*T, (28+x)*T, (56+y)*T, (38+x)*T, (20+y)*T);
            curve.moveTo((38+x)*T, (20+y)*T);
            curve.curveTo((41+x)*T, (18+y)*T, (39+x)*T, (16+y)*T, (34+x)*T, (20+y)*T);
            curve.moveTo((34+x)*T, (20+y)*T);
            curve.curveTo((23+x)*T, (48+y)*T, (18+x)*T, (56+y)*T, (12+x)*T, (70+y)*T);
            curve.moveTo((12+x)*T, (70+y)*T);
            curve.curveTo((22+x)*T, (56+y)*T, (30+x)*T, (53+y)*T, (35+x)*T, (58+y)*T);
            curve.moveTo((35+x)*T, (58+y)*T);
            curve.curveTo((28+x)*T, (63+y)*T, (25+x)*T, (72+y)*T, (50+x)*T, (70+y)*T);
        }
        if("i".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (58+y)*T, (29+x)*T, (48+y)*T, (45+x)*T,(30+y)*T);
            curve.moveTo((45+x)*T, (30+y)*T);
            curve.curveTo((20+x)*T, (52+y)*T, (10+x)*T, (66+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((50+x)*T, (22+y)*T);
            curve.curveTo((52+x)*T, (24+y)*T, (54+x)*T, (24+y)*T, (50+x)*T, (23+y)*T);
        }
        if("í".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (58+y)*T, (29+x)*T, (48+y)*T, (45+x)*T,(30+y)*T);
            curve.moveTo((45+x)*T, (30+y)*T);
            curve.curveTo((20+x)*T, (52+y)*T, (10+x)*T, (66+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((50+x)*T, (22+y)*T);
            curve.curveTo((52+x)*T, (24+y)*T, (54+x)*T, (24+y)*T, (50+x)*T, (23+y)*T);
            curve.moveTo(62+x*T,13+y*T);
            curve.lineTo(90+x*T,0+y*T);
        }
        if("j".equals(letra)){
            curve.moveTo((35+x)*T, (35+y)*T);
            curve.curveTo((32+x)*T, (36+y)*T, (32+x)*T, (44+y)*T, (35+x)*T, (45+y)*T);
            curve.curveTo((38+x)*T, (44+y)*T, (38+x)*T, (36+y)*T, (35+x)*T, (35+y)*T);
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (70+y)*T, (35+x)*T, (50+y)*T);
            curve.lineTo((15+x)*T, (110+y)*T);
            curve.curveTo((-5+x)*T, (135+y)*T, (-5+x)*T, (80+y)*T, (40+x)*T, (70+y)*T);
        }
        if("k".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (65+y)*T, (35+x)*T, (20+y)*T, (40+x)*T,(10+y)*T );
            curve.curveTo((30+x)*T, (10+y)*T, (20+x)*T, (35+y)*T, (15+x)*T, (70+y)*T);
            curve.moveTo((17+x)*T, (52+y)*T);
            curve.curveTo((40+x)*T, (51+y)*T, (40+x)*T, (59+y)*T, (25+x)*T, (60+y)*T);
            curve.curveTo((40+x)*T, (59+y)*T, (40+x)*T, (69+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (30+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
        }
        if("l".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (65+y)*T, (45+x)*T, (20+y)*T, (45+x)*T,(15+y)*T);
            curve.curveTo((25+x)*T, (20+y)*T, (20+x)*T, (70+y)*T, (35+x)*T, (70+y)*T);
        }
        if("m".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((15+x)*T, (40+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (25+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (40+y)*T);
            curve.curveTo((35+x)*T, (35+y)*T, (40+x)*T, (35+y)*T, (45+x)*T, (40+y)*T);
            curve.lineTo((35+x)*T, (70+y)*T);
            curve.moveTo((45+x)*T, (40+y)*T);
            curve.curveTo((50+x)*T, (35+y)*T, (55+x)*T, (35+y)*T, (60+x)*T, (40+y)*T);
            curve.lineTo((50+x)*T, (65+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (62+x)*T, (70+y)*T, (65+x)*T, (70+y)*T);
        }
        if("n".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((15+x)*T, (40+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (25+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (40+y)*T);
            curve.curveTo((35+x)*T, (35+y)*T, (40+x)*T, (35+y)*T, (45+x)*T, (40+y)*T);
            curve.lineTo((35+x)*T, (65+y)*T);
            curve.curveTo((40+x)*T, (70+y)*T, (45+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
        }
        if("ñ".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((15+x)*T, (40+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (25+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (40+y)*T);
            curve.curveTo((35+x)*T, (35+y)*T, (40+x)*T, (35+y)*T, (45+x)*T, (40+y)*T);
            curve.lineTo((35+x)*T, (65+y)*T);
            curve.curveTo((40+x)*T, (70+y)*T, (45+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T, (30+y)*T);
            curve.curveTo((25+x)*T, (25+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (30+y)*T);
        }
        if("o".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.curveTo((20+x)*T, (80+y)*T, (40+x)*T, (70+y)*T, (45+x)*T, (50+y)*T);
            curve.curveTo((40+x)*T, (40+y)*T, (20+x)*T, (35+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((20+x)*T, (46+y)*T);
            curve.curveTo((25+x)*T, (50+y)*T, (45+x)*T, (50+y)*T, (55+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
        }
        if("ó".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.curveTo((20+x)*T, (80+y)*T, (40+x)*T, (70+y)*T, (45+x)*T, (50+y)*T);
            curve.curveTo((40+x)*T, (40+y)*T, (20+x)*T, (35+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((20+x)*T, (46+y)*T);
            curve.curveTo((25+x)*T, (50+y)*T, (45+x)*T, (50+y)*T, (55+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((35+x)*T,(20+y)*T);
            curve.lineTo((45+x)*T, (10+y)*T);
        }
        if("p".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (20+x)*T, (47+y)*T, (30+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (65+y)*T, (17+x)*T, (70+y)*T);
            curve.lineTo((30+x)*T, (40+y)*T);
            curve.lineTo((10+x)*T, (90+y)*T);
            curve.moveTo((15+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (72+y)*T, (40+x)*T, (72+y)*T, (45+x)*T, (70+y)*T);
        }
        if("q".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (35+x)*T, (70+y)*T, (40+x)*T, (50+y)*T);
            curve.curveTo((35+x)*T, (45+y)*T, (20+x)*T, (35+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.lineTo((20+x)*T, (100+y)*T);
            curve.moveTo((33+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (85+y)*T, (20+x)*T, (60+y)*T, (45+x)*T, (70+y)*T);
        }
        
        if("r".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((14+x)*T, (65+y)*T, (14+x)*T, (35+y)*T, (10+x)*T, (30+y)*T);
            curve.curveTo((3+x)*T, (60+y)*T, (43+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (25+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
        }
        if("s".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (35+x)*T, (30+y)*T, (30+x)*T, (30+y)*T);
            curve.curveTo((40+x)*T, (35+y)*T, (50+x)*T, (90+y)*T, (25+x)*T, (67+y)*T);
            curve.curveTo((35+x)*T, (60+y)*T, (40+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
        }
        if("t".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (20+x)*T, (20+y)*T, (35+x)*T, (0+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (10+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((8+x)*T, (25+y)*T);
            curve.lineTo((32+x)*T, (25+y)*T);
        }
        if("u".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (28+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (55+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
        }
        if("ú".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (28+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (55+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((35+x)*T,(20+y)*T);
            curve.lineTo((45+x)*T, (10+y)*T);
        }
        if("v".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (35+y)*T, (10+x)*T, (35+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((-5+x)*T, (83+y)*T, (30+x)*T, (83+y)*T, (37+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (49+x)*T, (45+y)*T, (48+x)*T, (40+y)*T);
        }
        if("w".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (30+y)*T, (10+x)*T, (30+y)*T, (15+x)*T, (30+y)*T);
            curve.curveTo((-10+x)*T, (83+y)*T, (25+x)*T, (83+y)*T, (35+x)*T, (35+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (55+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (35+y)*T, (60+x)*T, (35+y)*T, (66+x)*T, (30+y)*T);
        }
        if("x".equals(letra)){
            curve.moveTo((6+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (75+y)*T, (35+x)*T, (30+y)*T, (54+x)*T, (30+y)*T);
            curve.moveTo((10+x)*T, (45+y)*T);
            curve.curveTo((15+x)*T, (30+y)*T, (20+x)*T, (30+y)*T, (25+x)*T, (30+y)*T);
            curve.curveTo((28+x)*T, (30+y)*T, (28+x)*T, (80+y)*T, (54+x)*T, (70+y)*T);
        }
        if("y".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.curveTo((0+x)*T, (83+y)*T, (35+x)*T, (83+y)*T, (50+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (120+y)*T, (30+x)*T, (125+y)*T, (10+x)*T, (120+y)*T);
            curve.curveTo((0+x)*T, (100+y)*T, (30+x)*T, (80+y)*T, (60+x)*T, (70+y)*T);
        }
        if("z".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (20+y)*T, (65+x)*T, (20+y)*T, (25+x)*T, (70+y)*T); 
            curve.curveTo((35+x)*T, (90+y)*T, (25+x)*T, (125+y)*T, (5+x)*T, (120+y)*T);
            curve.curveTo((0+x)*T, (100+y)*T, (20+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
        }
       
        if("A".equals(letra)){
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.lineTo((30+x)*T,(70+y)*T);
            curve.moveTo((30+x)*T,(70+y)*T);
            curve.curveTo((45+x)*T,(75+y)*T,(58+x)*T,(71+y)*T,(60+x)*T,(55+y)*T);
            curve.moveTo((60+x)*T,(55+y)*T);
            curve.curveTo((62+x)*T,(49+y)*T,(58+x)*T,(48+y)*T,(50+x)*T,(53+y)*T);
            curve.moveTo((50+x)*T,(53+y)*T);
            curve.curveTo((26+x)*T,(56+y)*T,(22+x)*T,(51+y)*T,(26+x)*T,(30+y)*T);
        }
        if ("Á".equals(letra)) {
            curve.moveTo((60+x)*T,(13+y)*T);
            curve.lineTo((80+x)*T,(3+y)*T);
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.lineTo((30+x)*T,(70+y)*T);
            curve.moveTo((30+x)*T,(70+y)*T);
            curve.curveTo((45+x)*T,(75+y)*T,(58+x)*T,(71+y)*T,(60+x)*T,(55+y)*T);
            curve.moveTo((60+x)*T,(55+y)*T);
            curve.curveTo((62+x)*T,(49+y)*T,(58+x)*T,(48+y)*T,(50+x)*T,(53+y)*T);
            curve.moveTo((50+x)*T,(53+y)*T);
            curve.curveTo((26+x)*T,(56+y)*T,(22+x)*T,(51+y)*T,(26+x)*T,(30+y)*T);

        }
        if ("B".equals(letra)) {
            curve.moveTo((10+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.curveTo((79+x)*T,(28+y)*T,(72+x)*T,(45+y)*T,(36+x)*T,(43+y)*T);
            curve.moveTo((36+x)*T,(43+y)*T);
            curve.curveTo((78+x)*T,(54+y)*T,(73+x)*T,(68+y)*T,(20+x)*T,(70+y)*T);
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.curveTo((0+x)*T,(65+y)*T,(0+x)*T,(55+y)*T,(20+x)*T,(50+y)*T);
            curve.moveTo((20+x)*T,(50+y)*T);
            curve.curveTo((38+x)*T,(58+y)*T,(50+x)*T,(68+y)*T,(70+x)*T,(70+y)*T); 
        }
        if ("C".equals(letra)) {
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.curveTo((36+x)*T,(25+y)*T,(25+x)*T,(35+y)*T,(15+x)*T,(55+y)*T);
            curve.moveTo((15+x)*T,(55+y)*T);
            curve.curveTo((15+x)*T,(64+y)*T,(22+x)*T,(72+y)*T,(70+x)*T,(70+y)*T);
        }
        if ("D".equals(letra)) {
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.lineTo((16+x)*T,(70+y)*T);
            curve.curveTo((5+x)*T,(75+y)*T,(3+x)*T,(70+y)*T,(16+x)*T,(61+y)*T);
            curve.moveTo((16+x)*T,(61+y)*T);
            curve.curveTo((21+x)*T,(61+y)*T,(28+x)*T,(65+y)*T,(32+x)*T,(70+y)*T);
            curve.moveTo((32+x)*T,(70+y)*T);
            curve.curveTo((79+x)*T,(54+y)*T,(85+x)*T,(30+y)*T,(58+x)*T,(20+y)*T);
            curve.moveTo((58+x)*T,(20+y)*T);
            curve.curveTo((41+x)*T,(21+y)*T,(36+x)*T,(28+y)*T,(42+x)*T,(28+y)*T);
        }
        if ("E".equals(letra)) {
            curve.moveTo((50+x)*T,(15+y)*T);
            curve.curveTo((53+x)*T,(23+y)*T,(60+x)*T,(25+y)*T,(70+x)*T,(20+y)*T);
            curve.moveTo((70+x)*T,(20+y)*T);
            curve.curveTo((39+x)*T,(26+y)*T,(38+x)*T,(33+y)*T,(60+x)*T,(40+y)*T);
            curve.moveTo((60+x)*T,(40+y)*T);
            curve.curveTo((10+x)*T,(55+y)*T,(8+x)*T,(66+y)*T,(70+x)*T,(70+y)*T);
        }
        if ("É".equals(letra)) {
            curve.moveTo((50+x)*T,(15+y)*T);
            curve.curveTo((53+x)*T,(23+y)*T,(60+x)*T,(25+y)*T,(70+x)*T,(20+y)*T);
            curve.moveTo((70+x)*T,(20+y)*T);
            curve.curveTo((39+x)*T,(26+y)*T,(38+x)*T,(33+y)*T,(60+x)*T,(40+y)*T);
            curve.moveTo((60+x)*T,(40+y)*T);
            curve.curveTo((10+x)*T,(55+y)*T,(8+x)*T,(66+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((65+x)*T,(12+y)*T);
            curve.lineTo((83+x)*T,(0+y)*T);
        }
        if ("F".equals(letra)) {
            curve.moveTo((9+x)*T,(61+y)*T);
            curve.curveTo((1+x)*T,(72+y)*T,(3+x)*T,(75+y)*T,(15+x)*T,(68+y)*T);
            curve.moveTo((15+x)*T,(68+y)*T);
            curve.lineTo((55+x)*T,(20+y)*T);
            curve.moveTo((25+x)*T,(20+y)*T);
            curve.curveTo((14+x)*T,(25+y)*T,(13+x)*T,(21+y)*T,(23+x)*T,(15+y)*T);
            curve.moveTo((23+x)*T,(15+y)*T);
            curve.curveTo((48+x)*T,(15+y)*T,(63+x)*T,(24+y)*T,(80+x)*T,(20+y)*T);  
            curve.moveTo((25+x)*T,(42+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
            curve.moveTo((42+x)*T,(40+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
        }
        if ("G".equals(letra)) {
            curve.moveTo((70+x)*T,(10+y)*T);
            curve.curveTo((45+x)*T,(10+y)*T,(28+x)*T,(18+y)*T,(20+x)*T,(40+y)*T);
            curve.moveTo((20+x)*T,(40+y)*T);
            curve.curveTo((35+x)*T,(75+y)*T,(55+x)*T,(75+y)*T,(70+x)*T,(40+y)*T);
            curve.moveTo((70+x)*T,(40+y)*T);
            curve.lineTo((55+x)*T,(40+y)*T);
        }
        if ("H".equals(letra)) {
            curve.moveTo((50+x)*T,(0+y)*T);
            curve.lineTo((10+x)*T,(70+y)*T);
            curve.moveTo((70+x)*T,(0+y)*T);
            curve.lineTo((30+x)*T,(70+y)*T);
            curve.moveTo((30+x)*T,(70+y)*T);
            curve.curveTo((56+x)*T,(63+y)*T,(63+x)*T,(50+y)*T,(58+x)*T,(48+y)*T);
            curve.moveTo((58+x)*T,(48+y)*T);
            curve.curveTo((46+x)*T,(40+y)*T,(9+x)*T,(43+y)*T,(20+x)*T,(19+y)*T);
        }
        if ("I".equals(letra)) {
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((40+x)*T,(20+y)*T);
            curve.lineTo((76+x)*T,(20+y)*T);
            curve.moveTo((10+x)*T,(70+y)*T);
            curve.lineTo((35+x)*T,(70+y)*T);
        }
        if ("Í".equals(letra)) {
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((40+x)*T,(20+y)*T);
            curve.lineTo((76+x)*T,(20+y)*T);
            curve.moveTo((10+x)*T,(70+y)*T);
            curve.lineTo((35+x)*T,(70+y)*T);
            curve.moveTo((62+x)*T,(13+y)*T);
            curve.lineTo((90+x)*T,(0+y)*T);
        }
        if("J".equals(letra)){
            curve.moveTo((20+x)*T, (20+y)*T);
            curve.curveTo((40+x)*T, (5+y)*T, (60+x)*T, (30+y)*T, (80+x)*T, (20+y)*T);
            curve.curveTo((80+x)*T, (15+y)*T, (70+x)*T, (5+y)*T, (50+x)*T, (20+y)*T);
            curve.curveTo((50+x)*T, (20+y)*T, (40+x)*T, (50+y)*T, (20+x)*T, (90+y)*T);
            curve.curveTo((0+x)*T, (100+y)*T, (0+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
        }
        if("K".equals(letra)){
            curve.moveTo((15+x)*T, (10+y)*T);
            curve.curveTo((15+x)*T, (10+y)*T, (21+x)*T, (7+y)*T, (25+x)*T, (10+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (70+y)*T, (5+x)*T, (70+y)*T, (0+x)*T, (65+y)*T);
            curve.moveTo((55+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (5+y)*T, (35+x)*T, (30+y)*T, (20+x)*T, (30+y)*T);
            curve.curveTo((25+x)*T, (50+y)*T, (40+x)*T, (45+y)*T, (45+x)*T, (65+y)*T);
            curve.curveTo((45+x)*T, (65+y)*T, (47+x)*T, (70+y)*T, (55+x)*T, (70+y)*T);
        }
        if("L".equals(letra)){
            curve.moveTo((35+x)*T, (10+y)*T);
            curve.curveTo((30+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (10+x)*T, (65+y)*T);
            curve.curveTo((5+x)*T, (80+y)*T, (5+x)*T, (40+y)*T, (10+x)*T, (65+y)*T);
            curve.curveTo((10+x)*T, (65+y)*T, (20+x)*T, (75+y)*T, (30+x)*T, (70+y)*T);
        }
        if("M".equals(letra)){
            curve.moveTo((5+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (30+x)*T, (30+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (30+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (55+x)*T, (0+y)*T, (55+x)*T, (30+y)*T);
            curve.lineTo((45+x)*T,(70+y)*T);
            curve.moveTo((55+x)*T, (30+y)*T);
            curve.curveTo((60+x)*T, (0+y)*T, (80+x)*T,( 0+y)*T, (80+x)*T, (30+y)*T);
            curve.lineTo((70+x)*T, (65+y)*T);
            curve.curveTo((77+x)*T, (70+y)*T, (80+x)*T, (70+y)*T, (85+x)*T, (70+y)*T);
        }
        if("N".equals(letra)){
            curve.moveTo((5+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (30+x)*T, (30+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (30+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (55+x)*T, (0+y)*T, (55+x)*T, (30+y)*T);
            curve.lineTo((45+x)*T,(65+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
        }
        if("Ñ".equals(letra)){
            curve.moveTo((5+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (30+x)*T, (30+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (30+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (55+x)*T, (0+y)*T, (55+x)*T, (30+y)*T);
            curve.lineTo((45+x)*T,(65+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((15+x)*T, (3+y)*T);
            curve.curveTo((25+x)*T, (-2+y)*T, (35+x)*T, (8+y)*T, (45+x)*T, (3+y)*T);
        }
        if("O".equals(letra)){
            curve.moveTo((60+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (5+y)*T, (-10+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (115+x)*T, (5+y)*T,(60+x)*T, (0+y)*T);
            curve.moveTo((28+x)*T, (14+y)*T);
            curve.curveTo((50+x)*T, (20+y)*T, (70+x)*T, (20+y)*T, (90+x)*T, (10+y)*T);
            curve.moveTo((55+x)*T, (56+y)*T);
            curve.curveTo((60+x)*T, (65+y)*T, (70+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
        }
        if("Ó".equals(letra)){
            curve.moveTo((60+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (5+y)*T, (-10+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (115+x)*T, (5+y)*T, (60+x)*T, (0+y)*T);
            curve.moveTo((28+x)*T, (14+y)*T);
            curve.curveTo((50+x)*T, (20+y)*T, (70+x)*T, (20+y)*T, (90+x)*T, (10+y)*T);
            curve.moveTo((55+x)*T, (56+y)*T);
            curve.curveTo((60+x)*T, (65+y)*T, (70+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((40+x)*T,(-5+y)*T);
            curve.lineTo((50+x)*T, (-15+y)*T);
        }
        if("P".equals(letra)){
            curve.moveTo((5+x)*T, (15+y)*T);
            curve.curveTo((10+x)*T,(15+y)*T , (25+x)*T,(10+y)*T, (20+x)*T,(7+y)*T);
            curve.curveTo((12+x)*T, (5+y)*T, (8+x)*T, (10+y)*T,( 20+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (10+y)*T, (50+x)*T, (35+y)*T, (13+x)*T, (40+y)*T);
            curve.moveTo((20+x)*T, (7+y)*T);
            curve.lineTo((5+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (30+x)*T, (75+y)*T, (45+x)*T, (70+y)*T);
        }
        if("Q".equals(letra)){
            curve.moveTo((60+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (5+y)*T, (-10+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (115+x)*T,(5+y)*T, (60+x)*T, (0+y)*T);
            curve.moveTo((28+x)*T, (14+y)*T);
            curve.curveTo((20+x)*T, (30+y)*T, (20+x)*T, (50+y)*T, (25+x)*T, (50+y)*T);
            curve.curveTo((35+x)*T, (40+y)*T, (55+x)*T, (40+y)*T, (65+x)*T,(56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T,(70+y)*T, (80+x)*T, (70+y)*T);
        }
        if("R".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (10+y)*T);
            curve.moveTo((10+x)*T, (10+y)*T);
            curve.curveTo((60+x)*T, (0+y)*T, (60+x)*T, (45+y)*T, (15+x)*T, (40+y)*T);
            curve.moveTo((11+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (20+x)*T, (70+y)*T, (45+x)*T, (70+y)*T);
        }
        if("S".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (40+x)*T, (30+y)*T, (40+x)*T, (0+y)*T);
            curve.curveTo((80+x)*T, (25+y)*T, (60+x)*T, (90+y)*T, (25+x)*T, (65+y)*T);
            curve.curveTo((35+x)*T, (50+y)*T, (45+x)*T, (80+y)*T, (70+x)*T, (70+y)*T);
        }
        if("T".equals(letra)){
            curve.moveTo((25+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (50+x)*T, (0+y)*T, (60+x)*T, (5+y)*T);
            curve.moveTo((25+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T, (-10+y)*T, (70+x)*T, (15+y)*T, (80+x)*T, (0+y)*T);
        }
        if("U".equals(letra)){
            curve.moveTo((30+x)*T, (10+y)*T);
            curve.curveTo((55+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (42+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((60+x)*T, (74+y)*T, (53+x)*T, (15+y)*T, (63+x)*T, (10+y)*T);
            curve.curveTo((53+x)*T, (40+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
        }
        if("Ú".equals(letra)){
            curve.moveTo((30+x)*T, (10+y)*T);
            curve.curveTo((55+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (42+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((60+x)*T, (74+y)*T, (53+x)*T, (15+y)*T, (63+x)*T, (10+y)*T);
            curve.curveTo((53+x)*T, (40+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(-5+y)*T);
            curve.lineTo((40+x)*T, (-15+y)*T);
        }
        if("V".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((-30+x)*T, (90+y)*T, (20+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (15+y)*T, (48+x)*T, (15+y)*T, (50+x)*T, (10+y)*T);
        }
        if("W".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((-30+x)*T, (90+y)*T, (20+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((-5+x)*T, (90+y)*T, (50+x)*T, (90+y)*T, (65+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (10+y)*T, (70+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
        }
        if("X".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (80+y)*T, (40+x)*T, (10+y)*T, (70+x)*T, (10+y)*T);
            curve.moveTo((20+x)*T, (10+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (35+x)*T, (80+y)*T, (55+x)*T, (70+y)*T);
        }
        if("Y".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (-35+x)*T, (74+y)*T, (5+x)*T, (70+y)*T);
            curve.moveTo((5+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (74+y)*T, (20+x)*T, (15+y)*T, (35+x)*T, (10+y)*T);
            curve.curveTo((11+x)*T, (60+y)*T, (15+x)*T, (140+y)*T, (-10+x)*T, (120+y)*T);
            curve.curveTo((-10+x)*T, (90+y)*T, (20+x)*T, (80+y)*T, (35+x)*T, (70+y)*T);
        }
        if("Z".equals(letra)){
            curve.moveTo((30+x)*T, (20+y)*T);
            curve.curveTo((35+x)*T, (-10+y)*T, (75+x)*T, (15+y)*T, (85+x)*T, (0+y)*T);
            curve.lineTo((6+x)*T, (70+y)*T);
            curve.moveTo((28+x)*T, (35+y)*T);
            curve.lineTo((60+x)*T, (35+y)*T);
            curve.moveTo((6+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (60+y)*T, (50+x)*T, (75+y)*T, (70+x)*T, (70+y)*T);
        }
        return curve;
    }

    public Path2D.Double Dsubrayado(String letra, double x, double y, double T) {
        Path2D.Double curve = new Path2D.Double();
        if (" ".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.moveTo((50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("a".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (20+x)*T, (65+y)*T, (20+x)*T, (50+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((30+x)*T, (75+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (50+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((30+x)*T, (20+y)*T, (50+x)*T, (20+y)*T, (60+x)*T, (50+y)*T);
            curve.moveTo((60+x)*T, (50+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (60+x)*T, (70+y)*T, (70+x)*T, (70+y)*T);  
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((70+x)*T, (75+y)*T);
        }
        if("á".equals(letra)){
            curve.moveTo(0+x*T, 70+y*T);
            curve.curveTo(10+x*T, 70+y*T, 20+x*T, 65+y*T, 20+x*T, 50+y*T);
            curve.moveTo(20+x*T, 50+y*T);
            curve.curveTo(30+x*T, 75+y*T, 50+x*T, 75+y*T, 60+x*T, 50+y*T);
            curve.moveTo(20+x*T, 50+y*T);
            curve.curveTo(30+x*T, 20+y*T, 50+x*T, 20+y*T, 60+x*T, 50+y*T);
            curve.moveTo(60+x*T, 50+y*T);
            curve.curveTo(55+x*T, 65+y*T, 60+x*T, 70+y*T, 70+x*T, 70+y*T);
            curve.moveTo(40+x*T,20+y*T);
            curve.lineTo(50+x*T, 10+y*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((70+x)*T, (75+y)*T);
        }
        if("b".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((17+x)*T, (68+y)*T, (30+x)*T, (48+y)*T, (23+x)*T, (25+y)*T);
            curve.moveTo((23+x)*T, (25+y)*T);
            curve.curveTo((22+x)*T, (19+y)*T, (18+x)*T, (19+y)*T, (18+x)*T, (25+y)*T);
            curve.moveTo((18+x)*T, (25+y)*T);
            curve.curveTo((10+x)*T, (35+y)*T, (10+x)*T, (55+y)*T, (18+x)*T, (68+y)*T);
            curve.moveTo((18+x)*T, (68+y)*T);
            curve.curveTo((20+x)*T, (75+y)*T, (20+x)*T, (70+y)*T, (30+x)*T, (65+y)*T);
            curve.moveTo((30+x)*T, (65+y)*T);
            curve.curveTo((32+x)*T, (63+y)*T, (33+x)*T, (59+y)*T, (32+x)*T, (55+y)*T);
            curve.moveTo((32+x)*T, (55+y)*T);
            curve.lineTo((40+x)*T, (55+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("c".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((12+x)*T, (65+y)*T, (16+x)*T, (60+y)*T, (20+x)*T, (50+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((23+x)*T, (35+y)*T, (35+x)*T, (28+y)*T, (50+x)*T, (35+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.curveTo((23+x)*T, (65+y)*T, (30+x)*T, (72+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T, (50+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("d".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (69+y)*T, (13+x)*T, (65+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (40+y)*T, (38+x)*T, (40+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.lineTo((40+x)*T, (10+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (75+y)*T, (35+x)*T, (75+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.curveTo((40+x)*T, (65+y)*T, (45+x)*T, (72+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("e".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (69+y)*T, (27+x)*T, (57+y)*T, (26+x)*T, (43+y)*T);
            curve.moveTo((26+x)*T, (43+y)*T);
            curve.curveTo((25+x)*T, (30+y)*T, (18+x)*T, (30+y)*T, (13+x)*T, (43+y)*T);
            curve.moveTo((13+x)*T, (43+y)*T);
            curve.curveTo((10+x)*T, (55+y)*T, (25+x)*T, (68+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("é".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (69+y)*T, (27+x)*T, (57+y)*T, (26+x)*T, (43+y)*T);
            curve.moveTo((26+x)*T, (43+y)*T);
            curve.curveTo((25+x)*T, (30+y)*T, (18+x)*T, (30+y)*T, (13+x)*T, (43+y)*T);
            curve.moveTo((13+x)*T, (43+y)*T);
            curve.curveTo((10+x)*T, (55+y)*T, (25+x)*T, (68+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T,(20+y)*T);
            curve.lineTo((35+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("f".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (65+y)*T, (30+x)*T, (50+y)*T, (20+x)*T, (20+y)*T);
            curve.curveTo((15+x)*T, (15+y)*T, (15+x)*T, (30+y)*T, (10+x)*T, (35+y)*T);
            curve.curveTo((8+x)*T, (52+y)*T, (8+x)*T, (75+y)*T, (10+x)*T, (90+y)*T);
            curve.moveTo((10+x)*T, (90+y)*T);
            curve.curveTo((12+x)*T, (98+y)*T, (18+x)*T, (98+y)*T, (20+x)*T, (90+y)*T);
            curve.moveTo((20+x)*T, (90+y)*T);
            curve.curveTo((25+x)*T, (75+y)*T, (18+x)*T, (53+y)*T, (10+x)*T, (60+y)*T);
            curve.moveTo((10+x)*T, (60+y)*T);
            curve.curveTo((15+x)*T, (74+y)*T, (20+x)*T, (75+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("g".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (73+y)*T, (16+x)*T, (58+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((25+x)*T, (40+y)*T, (35+x)*T, (40+y)*T,(40+x)*T , (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.curveTo((35+x)*T, (75+y)*T, (25+x)*T, (75+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.lineTo((40+x)*T, (90+y)*T);
            curve.moveTo((40+x)*T, (90+y)*T);
            curve.curveTo((40+x)*T, (105+y)*T, (25+x)*T, (120+y)*T, (10+x)*T, (100+y)*T);
            curve.moveTo((10+x)*T, (100+y)*T);
            curve.curveTo((25+x)*T, (82+y)*T, (35+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("h".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (60+y)*T, (28+x)*T, (42+y)*T, (30+x)*T, (28+y)*T);
            curve.moveTo((15+x)*T, (28+y)*T);
            curve.lineTo((15+x)*T , (70+y)*T);
            curve.moveTo((30+x)*T, (28+y)*T);
            curve.curveTo((25+x)*T, (12+y)*T, (22+x)*T, (12+y)*T, (15+x)*T, (28+y)*T);
            curve.moveTo((15+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (48+y)*T, (32+x)*T, (48+y)*T, (35+x)*T, (62+y)*T);
            curve.moveTo((35+x)*T, (62+y)*T);
            curve.curveTo((35+x)*T, (72+y)*T, (40+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("i".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (65+y)*T, (25+x)*T, (58+y)*T, (20+x)*T, (45+y)*T);
            curve.moveTo((20+x)*T, (35+y)*T);
            curve.curveTo((18+x)*T, (36+y)*T, (18+x)*T, (39+y)*T, (20+x)*T, (40+y)*T);
            curve.curveTo((22+x)*T, (39+y)*T, (22+x)*T, (36+y)*T, (20+x)*T, (35+y)*T);
            curve.moveTo((20+x)*T, (45+y)*T);
            curve.curveTo((13+x)*T, (52+y)*T, (20+x)*T, (68+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("í".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (65+y)*T, (25+x)*T, (58+y)*T, (20+x)*T, (45+y)*T);
            curve.moveTo((20+x)*T, (45+y)*T);
            curve.curveTo((13+x)*T, (52+y)*T, (20+x)*T, (68+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T,(35+y)*T);
            curve.lineTo((30+x)*T, (25+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("j".equals(letra)){  
            curve.moveTo((25+x)*T, (35+y)*T);
            curve.curveTo((22+x)*T, (36+y)*T, (22+x)*T, (44+y)*T, (25+x)*T, (45+y)*T);
            curve.curveTo((28+x)*T, (44+y)*T, (28+x)*T, (36+y)*T, (25+x)*T, (35+y)*T);
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (15+x)*T, (70+y)*T, (25+x)*T, (50+y)*T);
            curve.lineTo((25+x)*T, (110+y)*T);
            curve.curveTo((0+x)*T, (135+y)*T, (0+x)*T, (80+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("k".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (65+y)*T, (25+x)*T, (20+y)*T, (20+x)*T, (15+y)*T );
            curve.curveTo((15+x)*T, (20+y)*T, (15+x)*T, (35+y)*T, (20+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T, (48+y)*T);
            curve.curveTo((40+x)*T, (51+y)*T, (40+x)*T, (59+y)*T, (25+x)*T, (60+y)*T);
            curve.curveTo((40+x)*T, (59+y)*T, (40+x)*T, (69+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (30+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("l".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (65+y)*T, (25+x)*T, (20+y)*T, (20+x)*T, (15+y)*T);
            curve.curveTo((5+x)*T, (20+y)*T, (5+x)*T, (65+y)*T, (35+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((35+x)*T,( 75+y)*T);
        }
        if("m".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((10+x)*T, (40+y)*T);
            curve.curveTo((15+x)*T, (35+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.lineTo((40+x)*T, (70+y)*T);
            curve.moveTo((40+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (35+y)*T, (45+x)*T, (35+y)*T, (55+x)*T, (40+y)*T);
            curve.lineTo((55+x)*T, (64+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (62+x)*T, (70+y)*T, (65+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((65+x)*T, (75+y)*T);
        }
        if("n".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((10+x)*T, (40+y)*T);
            curve.curveTo((15+x)*T, (35+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.lineTo((40+x)*T, (64+y)*T);
            curve.curveTo((43+x)*T, (70+y)*T, (47+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
            
        }
        if("ñ".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((10+x)*T, (40+y)*T);
            curve.curveTo((15+x)*T, (35+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.lineTo((40+x)*T, (64+y)*T);
            curve.curveTo((43+x)*T, (70+y)*T, (47+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((15+x)*T, (30+y)*T);
            curve.curveTo((20+x)*T, (25+y)*T, (30+x)*T, (35+y)*T, (35+x)*T, (30+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("o".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (45+y)*T, (5+x)*T, (65+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((45+x)*T, (65+y)*T, (45+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.moveTo((13+x)*T, (46+y)*T);
            curve.curveTo((18+x)*T, (50+y)*T, (40+x)*T, (50+y)*T, (45+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("ó".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (45+y)*T, (5+x)*T, (65+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((45+x)*T, (65+y)*T, (45+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.moveTo((13+x)*T, (46+y)*T);
            curve.curveTo((18+x)*T, (50+y)*T, (40+x)*T, (50+y)*T, (45+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(20+y)*T);
            curve.lineTo((40+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((50+x)*T,( 75+y)*T);
        }
        if("p".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((5+x)*T, (75+y)*T, (17+x)*T, (47+y)*T, (20+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (65+y)*T, (20+x)*T, (70+y)*T);
            curve.lineTo((20+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (90+y)*T);
            curve.moveTo((20+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (72+y)*T, (40+x)*T, (72+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T, (75+y)*T);
        }
        if("q".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.moveTo((20+x)*T, (40+y)*T);
            curve.curveTo((0+x)*T, (45+y)*T, (0+x)*T, (65+y)*T, (20+x)*T, (70+y)*T);
            curve.curveTo((40+x)*T, (65+y)*T, (40+x)*T, (45+y)*T, (20+x)*T, (40+y)*T);
            curve.moveTo((35+x)*T, (55+y)*T);
            curve.lineTo((35+x)*T, (90+y)*T);
            curve.moveTo((35+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (85+y)*T, (20+x)*T, (60+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T, (75+y)*T);
        }
        if("r".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (65+y)*T, (10+x)*T, (35+y)*T, (0+x)*T, (30+y)*T);
            curve.curveTo((0+x)*T, (60+y)*T, (40+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.curveTo((25+x)*T, (35+y)*T, (25+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("s".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (25+x)*T, (30+y)*T, (20+x)*T, (30+y)*T);
            curve.curveTo((40+x)*T, (35+y)*T, (50+x)*T, (90+y)*T, (25+x)*T, (67+y)*T);
            curve.curveTo((35+x)*T, (60+y)*T, (40+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("t".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (20+x)*T, (20+y)*T, (20+x)*T, (0+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((8+x)*T, (25+y)*T);
            curve.lineTo((32+x)*T, (25+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("u".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (15+x)*T, (45+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((40+x)*T, (45+y)*T, (40+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("ú".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (15+x)*T, (45+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((40+x)*T, (45+y)*T, (40+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(20+y)*T);
            curve.lineTo((40+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("v".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (35+y)*T, (10+x)*T, (35+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (49+x)*T, (45+y)*T, (53+x)*T, (40+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((55+x)*T,( 75+y)*T);
        }
        if("w".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (30+y)*T, (10+x)*T, (30+y)*T, (15+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (83+y)*T, (40+x)*T, (83+y)*T, (35+x)*T, (35+y)*T);
            curve.curveTo((25+x)*T, (83+y)*T, (60+x)*T, (83+y)*T, (55+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (35+y)*T, (60+x)*T, (35+y)*T, (66+x)*T, (30+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((66+x)*T,( 75+y)*T);
        }
        if("x".equals(letra)){
            curve.moveTo((6+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (75+y)*T, (30+x)*T, (30+y)*T, (50+x)*T, (30+y)*T);
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (30+y)*T, (10+x)*T, (30+y)*T, (15+x)*T, (30+y)*T);
            curve.curveTo((28+x)*T, (30+y)*T, (28+x)*T, (80+y)*T, (56+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((59+x)*T,( 75+y)*T);
        }
        if("y".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (10+x)*T, (35+y)*T, (10+x)*T, (40+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((40+x)*T, (120+y)*T, (40+x)*T, (125+y)*T, (20+x)*T, (120+y)*T);
            curve.curveTo((10+x)*T, (100+y)*T, (40+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("z".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((-5+x)*T, (20+y)*T, (55+x)*T, (20+y)*T, (20+x)*T, (70+y)*T); 
            curve.curveTo((50+x)*T, (90+y)*T, (40+x)*T, (125+y)*T, (20+x)*T, (120+y)*T);
            curve.curveTo((10+x)*T, (100+y)*T, (30+x)*T, (80+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        
        //mayusculas
        if("A".equals(letra)){
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((25+x)*T,(0+y)*T);
            curve.moveTo((25+x)*T,(0+y)*T);
            curve.lineTo((50+x)*T,(70+y)*T);
            curve.curveTo((70+x)*T,(65+y)*T,(70+x)*T,(45+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((35+x)*T,(30+y)*T,(15+x)*T,(40+y)*T,(0+x)*T,(48+y)*T);
            curve.moveTo((0+x)*T,(48+y)*T);
            curve.curveTo((-11+x)*T,(48+y)*T,(-17+x)*T,(32+y)*T,(-8+x)*T,(20+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Á".equals(letra)){
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((25+x)*T,(0+y)*T);
            curve.moveTo((25+x)*T,(0+y)*T);
            curve.lineTo((50+x)*T,(70+y)*T);
            curve.curveTo((70+x)*T,(65+y)*T,(70+x)*T,(45+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((35+x)*T,(30+y)*T,(15+x)*T,(40+y)*T,(0+x)*T,(48+y)*T);
            curve.moveTo((0+x)*T,(48+y)*T);
            curve.curveTo((-11+x)*T,(48+y)*T,(-17+x)*T,(32+y)*T,(-8+x)*T,(20+y)*T);
            curve.moveTo((25+x)*T,(-5+y)*T);
            curve.lineTo((35+x)*T,( -15+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("B".equals(letra)){
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.lineTo((20+x)*T,(0+y)*T);
            curve.moveTo((20+x)*T,(0+y)*T);
            curve.curveTo((75+x)*T,(5+y)*T,(75+x)*T,(25+y)*T,(20+x)*T,(35+y)*T);
            curve.moveTo((20+x)*T,(35+y)*T);
            curve.curveTo((75+x)*T,(45+y)*T,(75+x)*T,(65+y)*T,(20+x)*T,(70+y)*T);
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.curveTo((0+x)*T,(65+y)*T,(0+x)*T,(55+y)*T,(20+x)*T,(50+y)*T);
            curve.moveTo((20+x)*T,(50+y)*T);
            curve.curveTo((38+x)*T,(58+y)*T,(50+x)*T,(68+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("C".equals(letra)){
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.curveTo((72+x)*T,(16+y)*T,(78+x)*T,(10+y)*T,(50+x)*T,(5+y)*T);
            curve.moveTo((50+x)*T,(5+y)*T);
            curve.curveTo((0+x)*T,(18+y)*T,(0+x)*T,(48+y)*T,(50+x)*T,(70+y)*T);
            curve.moveTo((50+x)*T,(70+y)*T);
            curve.lineTo((70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("D".equals(letra)){
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.curveTo((22+x)*T,(18+y)*T,(28+x)*T,(55+y)*T,(20+x)*T,(70+y)*T);
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.curveTo((2+x)*T,(62+y)*T,(10+x)*T,(50+y)*T,(35+x)*T,(70+y)*T);
            curve.moveTo((35+x)*T,(70+y)*T);
            curve.curveTo((90+x)*T,(48+y)*T,(90+x)*T,(28+y)*T,(30+x)*T,(0+y)*T);
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.curveTo((5+x)*T,(5+y)*T,(9+x)*T,(24+y)*T,(20+x)*T,(10+y)*T); 
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("E".equals(letra)){
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((48+x)*T,(8+y)*T,(53+x)*T,(19+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((30+x)*T,(0+y)*T,(15+x)*T,(23+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((18+x)*T,(42+y)*T,(20+x)*T,(65+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("É".equals(letra)){
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((48+x)*T,(8+y)*T,(53+x)*T,(19+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((30+x)*T,(0+y)*T,(15+x)*T,(23+y)*T,(50+x)*T,(35+y)*T);
            curve.moveTo((50+x)*T,(35+y)*T);
            curve.curveTo((18+x)*T,(42+y)*T,(20+x)*T,(65+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((45+x)*T,(-5+y)*T);
            curve.lineTo((55+x)*T, (-15+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("F".equals(letra)){
            curve.moveTo((80+x)*T,(0+y)*T);
            curve.curveTo((63+x)*T,(9+y)*T,(27+x)*T,(2+y)*T,(10+x)*T,(10+y)*T);
            curve.moveTo((10+x)*T,(10+y)*T);
            curve.curveTo((5+x)*T,(25+y)*T,(12+x)*T,(28+y)*T,(20+x)*T,(18+y)*T);
            curve.moveTo((40+x)*T,(10+y)*T);
            curve.curveTo((30+x)*T,(30+y)*T,(30+x)*T,(65+y)*T,(25+x)*T,(80+y)*T);
            curve.moveTo((25+x)*T,(80+y)*T);
            curve.curveTo((12+x)*T,(90+y)*T,(8+x)*T,(68+y)*T,(20+x)*T,(60+y)*T);  
            curve.moveTo((25+x)*T,(42+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
            curve.moveTo((42+x)*T,(40+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("G".equals(letra)){
            curve.moveTo((60+x)*T,(10+y)*T);
            curve.curveTo((36+x)*T,(3+y)*T,(21+x)*T,(18+y)*T,(20+x)*T,(40+y)*T);
            curve.moveTo((20+x)*T,(40+y)*T);
            curve.curveTo((35+x)*T,(75+y)*T,(55+x)*T,(75+y)*T,(70+x)*T,(40+y)*T);
            curve.moveTo((70+x)*T,(40+y)*T);
            curve.lineTo((55+x)*T,(40+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("H".equals(letra)){
            curve.moveTo((30+x)*T,(0+y)*T);
            curve.lineTo((32+x)*T,(70+y)*T);
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.lineTo((62+x)*T,(70+y)*T);
            curve.moveTo((60+x)*T,(70+y)*T);
            curve.curveTo((70+x)*T,(80+y)*T,(89+x)*T,(55+y)*T,(80+x)*T,(38+y)*T);
            curve.moveTo((80+x)*T,(38+y)*T);
            curve.curveTo((65+x)*T,(32+y)*T,(38+x)*T,(45+y)*T,(18+x)*T,(43+y)*T);  
            curve.moveTo((18+x)*T,(43+y)*T);
            curve.curveTo((9+x)*T,(35+y)*T,(12+x)*T,(12+y)*T,(25+x)*T,(23+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("I".equals(letra)){
            curve.moveTo((20+x)*T,(5+y)*T);
            curve.curveTo((32+x)*T,(2+y)*T,(50+x)*T,(10+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((70+x)*T,(8+y)*T,(68+x)*T,(1+y)*T,(60+x)*T,(0+y)*T);  
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((45+x)*T,(4+y)*T,(45+x)*T,(48+y)*T,(40+x)*T,(60+y)*T); 
            curve.moveTo((40+x)*T,(60+y)*T);
            curve.curveTo((33+x)*T,(75+y)*T,(23+x)*T,(73+y)*T,(25+x)*T,(64+y)*T); 
            curve.moveTo((25+x)*T,(64+y)*T);
            curve.curveTo((41+x)*T,(68+y)*T,(59+x)*T,(70+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Í".equals(letra)){
            curve.moveTo((20+x)*T,(5+y)*T);
            curve.curveTo((32+x)*T,(2+y)*T,(50+x)*T,(10+y)*T,(60+x)*T,(9+y)*T);
            curve.moveTo((60+x)*T,(9+y)*T);
            curve.curveTo((70+x)*T,(8+y)*T,(68+x)*T,(1+y)*T,(60+x)*T,(0+y)*T);  
            curve.moveTo((60+x)*T,(0+y)*T);
            curve.curveTo((45+x)*T,(4+y)*T,(45+x)*T,(48+y)*T,(40+x)*T,(60+y)*T); 
            curve.moveTo((40+x)*T,(60+y)*T);
            curve.curveTo((33+x)*T,(75+y)*T,(23+x)*T,(73+y)*T,(25+x)*T,(64+y)*T); 
            curve.moveTo((25+x)*T,(64+y)*T);
            curve.curveTo((41+x)*T,(68+y)*T,(59+x)*T,(70+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((50+x)*T,(-5+y)*T);
            curve.lineTo((60+x)*T, (-15+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("J".equals(letra)){
            curve.moveTo((0+x)*T, (20+y)*T);
            curve.curveTo((20+x)*T, (5+y)*T, (40+x)*T, (30+y)*T, (60+x)*T, (20+y)*T);
            curve.curveTo((60+x)*T, (15+y)*T, (50+x)*T, (5+y)*T, (30+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T, (20+y)*T, (50+x)*T, (50+y)*T, (40+x)*T, (90+y)*T);
            curve.curveTo((10+x)*T, (90+y)*T, (0+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("K".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((0+x)*T, (10+y)*T, (6+x)*T, (7+y)*T, (10+x)*T, (10+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (70+y)*T, (5+x)*T, (70+y)*T, (0+x)*T, (65+y)*T);
            curve.moveTo((40+x)*T, (10+y)*T);
            curve.curveTo((30+x)*T, (5+y)*T, (20+x)*T, (30+y)*T, (10+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (50+y)*T, (25+x)*T, (45+y)*T, (30+x)*T, (65+y)*T);
            curve.curveTo((30+x)*T, (65+y)*T, (32+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("L".equals(letra)){
            curve.moveTo((25+x)*T, (10+y)*T);
            curve.curveTo((20+x)*T, (0+y)*T, (5+x)*T, (0+y)*T, (0+x)*T, (10+y)*T);
            curve.curveTo((0+x)*T, (15+y)*T, (8+x)*T, (40+y)*T, (5+x)*T, (65+y)*T);
            curve.curveTo((0+x)*T, (80+y)*T, (0+x)*T, (40+y)*T, (5+x)*T, (65+y)*T);
            curve.curveTo((5+x)*T, (65+y)*T, (15+x)*T, (75+y)*T, (30+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        }
        if("M".equals(letra)){
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.curveTo((30+x)*T,( 0+y)*T, (45+x)*T, (0+y)*T, (50+x)*T, (30+y)*T);
            curve.lineTo((50+x)*T,(70+y)*T);
            curve.moveTo((50+x)*T, (30+y)*T);
            curve.curveTo((55+x)*T,( 0+y)*T, (70+x)*T, (0+y)*T, (75+x)*T, (30+y)*T);
            curve.lineTo((75+x)*T, (65+y)*T);
            curve.curveTo((77+x)*T,( 70+y)*T, (80+x)*T,( 70+y)*T, (85+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((85+x)*T, (75+y)*T);
        }
        if("N".equals(letra)){
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.curveTo((30+x)*T, (0+y)*T, (45+x)*T, (0+y)*T, (50+x)*T, (30+y)*T);
            curve.lineTo((50+x)*T,(65+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Ñ".equals(letra)){
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.curveTo((30+x)*T, (0+y)*T, (45+x)*T, (0+y)*T, (50+x)*T, (30+y)*T);
            curve.lineTo((50+x)*T,(65+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((10+x)*T, (3+y)*T);
            curve.curveTo((20+x)*T, (-2+y)*T, (30+x)*T, (8+y)*T, (40+x)*T, (3+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("O".equals(letra)){
            curve.moveTo((40+x)*T, (0+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (0+x)*T, (65+y)*T, (40+x)*T, (70+y)*T);
            curve.curveTo((80+x)*T, (65+y)*T, (80+x)*T, (5+y)*T, (40+x)*T, (0+y)*T);
            curve.moveTo((18+x)*T, (14+y)*T);
            curve.curveTo((40+x)*T, (20+y)*T, (60+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
            curve.moveTo((65+x)*T, (56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((80+x)*T, (75+y)*T);
        }
        if("Ó".equals(letra)){
            curve.moveTo((40+x)*T, (0+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (0+x)*T, (65+y)*T, (40+x)*T, (70+y)*T);
            curve.curveTo((80+x)*T, (65+y)*T, (80+x)*T, (5+y)*T, (40+x)*T, (0+y)*T);
            curve.moveTo((18+x)*T, (14+y)*T);
            curve.curveTo((40+x)*T, (20+y)*T, (60+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
            curve.moveTo((65+x)*T, (56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((40+x)*T,(-5+y)*T);
            curve.lineTo((50+x)*T, (-15+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((80+x)*T, (75+y)*T);
        }
        if("P".equals(letra)){
            curve.moveTo((5+x)*T, (15+y)*T);
            curve.curveTo((10+x)*T,(15+y)*T , (25+x)*T,(10+y)*T, (20+x)*T,(7+y)*T);
            curve.curveTo((12+x)*T, (5+y)*T, (8+x)*T, (10+y)*T, (20+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (10+y)*T, (45+x)*T, (35+y)*T, (20+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (7+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (30+x)*T, (75+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T, (75+y)*T);
        }
        if("Q".equals(letra)){
            curve.moveTo((40+x)*T, (0+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (0+x)*T, (65+y)*T, (40+x)*T, (70+y)*T);
            curve.curveTo((80+x)*T, (65+y)*T, (80+x)*T, (5+y)*T, (40+x)*T, (0+y)*T);
            curve.moveTo((18+x)*T, (14+y)*T);
            curve.curveTo((20+x)*T, (30+y)*T, (20+x)*T, (50+y)*T, (25+x)*T, (50+y)*T);
            curve.curveTo((35+x)*T, (40+y)*T, (55+x)*T, (40+y)*T, (65+x)*T, (56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((80+x)*T,( 75+y)*T);
        }
        if("R".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (5+x)*T, (0+y)*T, (5+x)*T, (10+y)*T);
            curve.moveTo((-10+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (0+y)*T, (50+x)*T, (35+y)*T, (11+x)*T, (40+y)*T);
            curve.moveTo((11+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (20+x)*T, (70+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T,( 75+y)*T);
        }
        if("S".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (25+x)*T, (30+y)*T, (20+x)*T, (0+y)*T);
            curve.curveTo((80+x)*T, (25+y)*T, (60+x)*T, (90+y)*T, (30+x)*T, (65+y)*T);
            curve.curveTo((35+x)*T, (50+y)*T, (45+x)*T, (80+y)*T, (70+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((70+x)*T,( 75+y)*T);
        }
        if("T".equals(letra)){
            curve.moveTo((25+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (35+x)*T, (0+y)*T, (35+x)*T, (5+y)*T);
            curve.moveTo((5+x)*T, (20+y)*T);
            curve.curveTo((10+x)*T, (-10+y)*T, (50+x)*T, (15+y)*T, (60+x)*T, (0+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("U".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (32+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (74+y)*T, (39+x)*T, (15+y)*T, (43+x)*T, (10+y)*T);
            curve.curveTo((43+x)*T, (40+y)*T, (40+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Ú".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (32+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (74+y)*T, (39+x)*T, (15+y)*T, (43+x)*T, (10+y)*T);
            curve.curveTo((43+x)*T, (40+y)*T, (40+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(-5+y)*T);
            curve.lineTo((40+x)*T, (-15+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("V".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((10+x)*T, (90+y)*T, (45+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (15+y)*T, (49+x)*T, (15+y)*T, (60+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("W".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((10+x)*T, (90+y)*T, (45+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((35+x)*T, (90+y)*T, (70+x)*T, (90+y)*T, (65+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (10+y)*T, (70+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T,(75+y)*T);
            curve.lineTo((80+x)*T,( 75+y)*T);
        }
        if("X".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (80+y)*T, (25+x)*T, (10+y)*T, (55+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (25+x)*T, (80+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("Y".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (32+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (74+y)*T, (39+x)*T, (15+y)*T, (43+x)*T, (10+y)*T);
            curve.curveTo((43+x)*T, (60+y)*T, (50+x)*T, (140+y)*T, (28+x)*T, (120+y)*T);
            curve.curveTo((25+x)*T, (90+y)*T, (32+x)*T, (80+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Z".equals(letra)){
            curve.moveTo((5+x)*T, (20+y)*T);
            curve.curveTo((10+x)*T, (-10+y)*T, (50+x)*T, (15+y)*T, (60+x)*T, (0+y)*T);
            curve.lineTo((5+x)*T, (70+y)*T);
            curve.moveTo((18+x)*T, (35+y)*T);
            curve.lineTo((48+x)*T, (35+y)*T);
            curve.moveTo((5+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (60+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("-".equals(letra)){
            curve.moveTo((10+x)*T, (50+y)*T);
            curve.lineTo((30+x)*T, (50+y)*T);
            curve.moveTo((10+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        }
        if("_".equals(letra)){
            curve.moveTo((10+x)*T, (70+y)*T);
            curve.lineTo((30+x)*T, (70+y)*T);
            curve.moveTo((10+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        }
        if("(".equals(letra)){
            curve.moveTo((15+x)*T, (0+y)*T);
            curve.curveTo((5+x)*T, (0+y)*T, (5+x)*T, (70+y)*T, (15+x)*T, (70+y)*T);
            curve.moveTo((10+x)*T, (75+y)*T);
            curve.lineTo((20+x)*T, (75+y)*T);
        }
        if(")".equals(letra)){
            curve.moveTo((15+x)*T, (0+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (25+x)*T, (70+y)*T, (15+x)*T, (70+y)*T);
            curve.moveTo((10+x)*T, (75+y)*T);
            curve.lineTo((20+x)*T, (75+y)*T);
        }
        if("[".equals(letra)){
            curve.moveTo((25+x)*T, (0+y)*T);
            curve.lineTo((10+x)*T, (0+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.moveTo((5+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        } 
        if("]".equals(letra)){
            curve.moveTo((10+x)*T, (0+y)*T);
            curve.lineTo((25+x)*T, (0+y)*T);
            curve.lineTo((25+x)*T, (70+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.moveTo((5+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        }
        if("{".equals(letra)){
            curve.moveTo((25+x)*T, (0+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (15+x)*T, (40+y)*T, (5+x)*T, (35+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (10+x)*T, (70+y)*T, (25+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        } 
        if("}".equals(letra)){
            curve.moveTo((0+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (0+y)*T, (10+x)*T, (40+y)*T, (20+x)*T, (35+y)*T);
            curve.curveTo((5+x)*T, (35+y)*T, (15+x)*T, (70+y)*T, (0+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        }
        if("!".equals(letra)){
            curve.moveTo((25+x)*T, (90+y)*T);
            curve.curveTo((20+x)*T,( 91+y)*T, (20+x)*T, (99+y)*T, (25+x)*T, (100+y)*T);
            curve.curveTo((30+x)*T, (99+y)*T, (30+x)*T, (91+y)*T, (25+x)*T, (90+y)*T);
            curve.moveTo((25+x)*T, (80+y)*T);
            curve.lineTo((25+x)*T, (10+y)*T);
            curve.moveTo((15+x)*T, (75+y)*T);
            curve.lineTo((35+x)*T, (75+y)*T);
        }
        if("¡".equals(letra)){
            curve.moveTo((25+x)*T, (10+y)*T);
            curve.curveTo((20+x)*T, (11+y)*T, (20+x)*T, (19+y)*T, (25+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T,(19+y)*T, (30+x)*T, (11+y)*T, (25+x)*T, (10+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (90+y)*T);
            curve.moveTo((15+x)*T, (75+y)*T);
            curve.lineTo((35+x)*T, (75+y)*T);
        }
        if("¿".equals(letra)){ 
            curve.moveTo((25+x)*T, (10+y)*T);
            curve.curveTo((20+x)*T, (11+y)*T, (20+x)*T, (19+y)*T, (25+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T,(19+y)*T, (30+x)*T, (11+y)*T, (25+x)*T, (10+y)*T);
            curve.moveTo((25+x)*T, (30+y)*T);
            curve.lineTo((25+x)*T, (65+y)*T);
            curve.curveTo((-30+x)*T, (90+y)*T, (45+x)*T, (140+y)*T, (45+x)*T, (90+y)*T);
            curve.moveTo((15+x)*T, (75+y)*T);
            curve.lineTo((35+x)*T, (75+y)*T);
        }
        if("?".equals(letra)){
            curve.moveTo((25+x)*T, (100+y)*T);
            curve.curveTo((20+x)*T, (101+y)*T, (20+x)*T, (109+y)*T, (25+x)*T, (110+y)*T);
            curve.curveTo((30+x)*T, (109+y)*T, (30+x)*T, (101+y)*T, (25+x)*T, (100+y)*T);
            curve.moveTo((25+x)*T, (90+y)*T);
            curve.lineTo((25+x)*T, (65+y)*T);
            curve.curveTo((90+x)*T, (50+y)*T, (25+x)*T, (-20+y)*T, (5+x)*T, (30+y)*T);
            curve.moveTo((15+x)*T, (75+y)*T);
            curve.lineTo((35+x)*T, (75+y)*T);
        }
        if(".".equals(letra)){
            curve.moveTo((5+x)*T, (65+y)*T);
            curve.curveTo((2+x)*T, (67+y)*T, (2+x)*T, (68+y)*T, (5+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (68+y)*T, (7+x)*T, (67+y)*T, (5+x)*T, (65+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((10+x)*T, (75+y)*T);
        }
        if(":".equals(letra)){
            curve.moveTo((5+x)*T, (65+y)*T);
            curve.curveTo((2+x)*T, (67+y)*T, (2+x)*T, (68+y)*T, (5+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (68+y)*T, (7+x)*T, (67+y)*T, (5+x)*T, (65+y)*T);
            curve.moveTo((5+x)*T, (45+y)*T);
            curve.curveTo((2+x)*T, (47+y)*T, (2+x)*T, (48+y)*T, (5+x)*T, (50+y)*T);
            curve.curveTo((7+x)*T, (48+y)*T, (7+x)*T, (47+y)*T, (5+x)*T, (45+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((10+x)*T, (75+y)*T);
        }
        if(",".equals(letra)){
            curve.moveTo((5+x)*T,(70+y)*T);
            curve.curveTo((6+x)*T, (71+y)*T, (3+x)*T, (73+y)*T, (2+x)*T, (80+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((10+x)*T, (75+y)*T);
        }
        if(";".equals(letra)){
            curve.moveTo((5+x)*T, (65+y)*T);
            curve.curveTo((2+x)*T, (67+y)*T, (2+x)*T, (68+y)*T, (5+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (68+y)*T, (7+x)*T, (67+y)*T, (5+x)*T, (65+y)*T);
            curve.moveTo((5+x)*T,(75+y)*T);
            curve.curveTo((4+x)*T, (76+y)*T, (3+x)*T, (78+y)*T, (2+x)*T, (80+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((10+x)*T, (75+y)*T);
        }
        if("'".equals(letra)){
            curve.moveTo((5+x)*T, (0+y)*T);
            curve.curveTo((4+x)*T, (4+y)*T, (2+x)*T, (7+y)*T, (0+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((15+x)*T, (75+y)*T);
        }
        if( "\"".equals(letra)){
            curve.moveTo((5+x)*T, (0+y)*T);
            curve.curveTo((4+x)*T, (4+y)*T, (2+x)*T, (7+y)*T, (0+x)*T, (10+y)*T);
            curve.moveTo((10+x)*T, (0+y)*T);
            curve.curveTo((9+x)*T, (4+y)*T, (7+x)*T, (7+y)*T, (5+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((15+x)*T, (75+y)*T);
        }
        if("<".equals(letra)){
            curve.moveTo((15+x)*T, (30+y)*T);
            curve.lineTo((0+x)*T,(40+y)*T);
            curve.lineTo((15+x)*T,(50+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((20+x)*T, (75+y)*T);
        }
        if(">".equals(letra)){
            curve.moveTo((0+x)*T, (30+y)*T);
            curve.lineTo((15+x)*T,(40+y)*T);
            curve.lineTo((0+x)*T,(50+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((20+x)*T, (75+y)*T);
        }
        return curve;
    }
        
    public Path2D.Double Dsubc(String letra, double x, double y, double T) {
        Path2D.Double curve = new Path2D.Double();
        if("a".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (71+y)*T, (23+x)*T, (67+y)*T, (40+x)*T, (30+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (24+y)*T, (72+x)*T, (32+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (75+y)*T, (40+x)*T, (90+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((70+x)*T, (50+y)*T);
            curve.curveTo((52+x)*T, (72+y)*T, (58+x)*T, (78+y)*T, (70+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((70+x)*T, (75+y)*T);
        }
        if("á".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (71+y)*T, (23+x)*T, (67+y)*T, (40+x)*T, (30+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (24+y)*T, (72+x)*T, (32+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((40+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (75+y)*T, (40+x)*T, (90+y)*T, (70+x)*T, (50+y)*T);
            curve.moveTo((70+x)*T, (50+y)*T);
            curve.curveTo((52+x)*T, (72+y)*T, (58+x)*T, (78+y)*T, (70+x)*T, (70+y)*T);
            curve.moveTo(62+x*T,13+y*T);
            curve.lineTo(90+x*T,0+y*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((70+x)*T, (75+y)*T);
        }
        if("b".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (41+y)*T, (45+x)*T, (23+y)*T, (33+x)*T, (23+y)*T);
            curve.moveTo((33+x)*T, (23+y)*T);
            curve.curveTo((21+x)*T, (28+y)*T, (12+x)*T, (45+y)*T, (11+x)*T, (62+y)*T);
            curve.moveTo((11+x)*T, (62+y)*T);
            curve.curveTo((15+x)*T, (73+y)*T, (22+x)*T, (68+y)*T, (25+x)*T, (55+y)*T);
            curve.moveTo((25+x)*T, (55+y)*T);
            curve.curveTo((31+x)*T, (53+y)*T, (36+x)*T, (52+y)*T, (42+x)*T, (53+y)*T);
            curve.moveTo((42+x)*T, (53+y)*T);
            curve.lineTo((42+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("c".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((13+x)*T, (58+y)*T, (38+x)*T, (33+y)*T, (60+x)*T, (30+y)*T);
            curve.moveTo((60+x)*T, (30+y)*T);
            curve.curveTo((3+x)*T, (48+y)*T, (3+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("d".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (69+y)*T, (13+x)*T, (65+y)*T, (15+x)*T, (55+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (40+y)*T, (38+x)*T, (40+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((70+x)*T, (10+y)*T);
            curve.curveTo((30+x)*T, (65+y)*T, (33+x)*T, (74+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((15+x)*T, (55+y)*T);
            curve.curveTo((20+x)*T, (75+y)*T, (35+x)*T, (75+y)*T, (40+x)*T, (55+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("e".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (62+y)*T, (36+x)*T, (49+y)*T, (45+x)*T, (35+y)*T);
            curve.moveTo((45+x)*T, (35+y)*T);
            curve.curveTo((47+x)*T, (31+y)*T, (42+x)*T, (28+y)*T, (35+x)*T, (32+y)*T);
            curve.moveTo((35+x)*T, (32+y)*T);
            curve.curveTo((18+x)*T, (47+y)*T, (10+x)*T, (65+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("é".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((18+x)*T, (62+y)*T, (36+x)*T, (49+y)*T, (45+x)*T, (35+y)*T);
            curve.moveTo((45+x)*T, (35+y)*T);
            curve.curveTo((47+x)*T, (31+y)*T, (42+x)*T, (28+y)*T, (35+x)*T, (32+y)*T);
            curve.moveTo((35+x)*T, (32+y)*T);
            curve.curveTo((18+x)*T, (47+y)*T, (10+x)*T, (65+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo(62+x*T,13+y*T);
            curve.lineTo(90+x*T,0+y*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("f".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((16+x)*T, (63+y)*T, (36+x)*T, (52+y)*T, (48+x)*T, (36+y)*T);
            curve.moveTo((48+x)*T, (36+y)*T);
            curve.curveTo((52+x)*T,( 31+y)*T, (50+x)*T, (28+y)*T, (42+x)*T, (32+y)*T);
            curve.moveTo((42+x)*T, (32+y)*T);
            curve.curveTo((20+x)*T, (52+y)*T, (5+x)*T, (75+y)*T, (3+x)*T, (90+y)*T);
            curve.moveTo((3+x)*T, (90+y)*T);
            curve.curveTo((3+x)*T, (100+y)*T, (13+x)*T, (90+y)*T, (23+x)*T, (70+y)*T);
            curve.moveTo((23+x)*T, (70+y)*T);
            curve.curveTo((22+x)*T, (64+y)*T, (18+x)*T, (64+y)*T, (12+x)*T, (69+y)*T);
            curve.moveTo((12+x)*T, (69+y)*T);
            curve.curveTo((21+x)*T, (72+y)*T, (35+x)*T, (72+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("g".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((11+x)*T,(71+y)*T, (17+x)*T, (68+y)*T, (20+x)*T, (60+y)*T);
            curve.moveTo((20+x)*T, (60+y)*T);
            curve.curveTo((22+x)*T, (73+y)*T, (34+x)*T, (73+y)*T,(43+x)*T , (60+y)*T);
            curve.moveTo((43+x)*T, (60+y)*T);
            curve.curveTo((43+x)*T, (43+y)*T, (33+x)*T, (43+y)*T, (20+x)*T, (60+y)*T);
            curve.moveTo((43+x)*T, (60+y)*T);
            curve.curveTo((35+x)*T, (85+y)*T, (22+x)*T, (96+y)*T, (5+x)*T, (98+y)*T);
            curve.moveTo((5+x)*T, (98+y)*T);
            curve.curveTo((0+x)*T, (96+y)*T, (0+x)*T, (92+y)*T, (3+x)*T, (90+y)*T);
            curve.moveTo((3+x)*T, (90+y)*T);
            curve.curveTo((18+x)*T, (80+y)*T, (28+x)*T, (75+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("h".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (63+y)*T, (28+x)*T, (56+y)*T, (38+x)*T, (20+y)*T);
            curve.moveTo((38+x)*T, (20+y)*T);
            curve.curveTo((41+x)*T, (18+y)*T, (39+x)*T, (16+y)*T, (34+x)*T, (20+y)*T);
            curve.moveTo((34+x)*T, (20+y)*T);
            curve.curveTo((23+x)*T, (48+y)*T, (18+x)*T, (56+y)*T, (12+x)*T, (70+y)*T);
            curve.moveTo((12+x)*T, (70+y)*T);
            curve.curveTo((22+x)*T, (56+y)*T, (30+x)*T, (53+y)*T, (35+x)*T, (58+y)*T);
            curve.moveTo((35+x)*T, (58+y)*T);
            curve.curveTo((28+x)*T, (63+y)*T, (25+x)*T, (72+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("i".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (58+y)*T, (29+x)*T, (48+y)*T, (45+x)*T,(30+y)*T);
            curve.moveTo((45+x)*T, (30+y)*T);
            curve.curveTo((20+x)*T, (52+y)*T, (10+x)*T, (66+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((50+x)*T, (22+y)*T);
            curve.curveTo((52+x)*T, (24+y)*T, (54+x)*T, (24+y)*T, (50+x)*T, (23+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("í".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (58+y)*T, (29+x)*T, (48+y)*T, (45+x)*T,(30+y)*T);
            curve.moveTo((45+x)*T, (30+y)*T);
            curve.curveTo((20+x)*T, (52+y)*T, (10+x)*T, (66+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((50+x)*T, (22+y)*T);
            curve.curveTo((52+x)*T, (24+y)*T, (54+x)*T, (24+y)*T, (50+x)*T, (23+y)*T);
            curve.moveTo(62+x*T,13+y*T);
            curve.lineTo(90+x*T,0+y*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("j".equals(letra)){  
            curve.moveTo((35+x)*T, (35+y)*T);
            curve.curveTo((32+x)*T, (36+y)*T, (32+x)*T, (44+y)*T, (35+x)*T, (45+y)*T);
            curve.curveTo((38+x)*T, (44+y)*T, (38+x)*T, (36+y)*T, (35+x)*T, (35+y)*T);
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (70+y)*T, (35+x)*T, (50+y)*T);
            curve.lineTo((15+x)*T, (110+y)*T);
            curve.curveTo((-5+x)*T, (135+y)*T, (-5+x)*T, (80+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("k".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (65+y)*T, (35+x)*T, (20+y)*T, (40+x)*T,(10+y)*T );
            curve.curveTo((30+x)*T, (10+y)*T, (20+x)*T, (35+y)*T, (15+x)*T, (70+y)*T);
            curve.moveTo((17+x)*T, (52+y)*T);
            curve.curveTo((40+x)*T, (51+y)*T, (40+x)*T, (59+y)*T, (25+x)*T, (60+y)*T);
            curve.curveTo((40+x)*T, (59+y)*T, (40+x)*T, (69+y)*T, (25+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (30+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("l".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (65+y)*T, (45+x)*T, (20+y)*T, (45+x)*T,(15+y)*T);
            curve.curveTo((25+x)*T, (20+y)*T, (20+x)*T, (70+y)*T, (35+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((35+x)*T,( 75+y)*T);
        }
        if("m".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((15+x)*T, (40+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (25+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (40+y)*T);
            curve.curveTo((35+x)*T, (35+y)*T, (40+x)*T, (35+y)*T, (45+x)*T, (40+y)*T);
            curve.lineTo((35+x)*T, (70+y)*T);
            curve.moveTo((45+x)*T, (40+y)*T);
            curve.curveTo((50+x)*T, (35+y)*T, (55+x)*T, (35+y)*T, (60+x)*T, (40+y)*T);
            curve.lineTo((50+x)*T, (65+y)*T);
            curve.curveTo((53+x)*T, (70+y)*T, (62+x)*T, (70+y)*T, (65+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((65+x)*T, (75+y)*T);
        }
        if("n".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((15+x)*T, (40+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (25+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (40+y)*T);
            curve.curveTo((35+x)*T, (35+y)*T, (40+x)*T, (35+y)*T, (45+x)*T, (40+y)*T);
            curve.lineTo((35+x)*T, (65+y)*T);
            curve.curveTo((40+x)*T, (70+y)*T, (45+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
            
        }
        if("ñ".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((2+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (10+x)*T, (64+y)*T);
            curve.lineTo((15+x)*T, (40+y)*T);
            curve.curveTo((20+x)*T, (35+y)*T, (25+x)*T, (35+y)*T, (30+x)*T, (40+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (40+y)*T);
            curve.curveTo((35+x)*T, (35+y)*T, (40+x)*T, (35+y)*T, (45+x)*T, (40+y)*T);
            curve.lineTo((35+x)*T, (65+y)*T);
            curve.curveTo((40+x)*T, (70+y)*T, (45+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((20+x)*T, (30+y)*T);
            curve.curveTo((25+x)*T, (25+y)*T, (35+x)*T, (35+y)*T, (40+x)*T, (30+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("o".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.curveTo((20+x)*T, (80+y)*T, (40+x)*T, (70+y)*T, (45+x)*T, (50+y)*T);
            curve.curveTo((40+x)*T, (40+y)*T, (20+x)*T, (35+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((20+x)*T, (46+y)*T);
            curve.curveTo((25+x)*T, (50+y)*T, (45+x)*T, (50+y)*T, (55+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("ó".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.curveTo((20+x)*T, (80+y)*T, (40+x)*T, (70+y)*T, (45+x)*T, (50+y)*T);
            curve.curveTo((40+x)*T, (40+y)*T, (20+x)*T, (35+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((20+x)*T, (46+y)*T);
            curve.curveTo((25+x)*T, (50+y)*T, (45+x)*T, (50+y)*T, (55+x)*T, (45+y)*T);
            curve.moveTo((37+x)*T, (64+y)*T);
            curve.curveTo((42+x)*T, (70+y)*T, (46+x)*T, (70+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((35+x)*T,(20+y)*T);
            curve.lineTo((45+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((50+x)*T,( 75+y)*T);
        }
        if("p".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (20+x)*T, (47+y)*T, (30+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (65+y)*T, (17+x)*T, (70+y)*T);
            curve.lineTo((30+x)*T, (40+y)*T);
            curve.lineTo((10+x)*T, (90+y)*T);
            curve.moveTo((15+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (72+y)*T, (40+x)*T, (72+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T, (75+y)*T);
        }
        if("q".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((4+x)*T, (70+y)*T, (8+x)*T, (70+y)*T, (13+x)*T, (64+y)*T);
            curve.curveTo((15+x)*T, (70+y)*T, (35+x)*T, (70+y)*T, (40+x)*T, (50+y)*T);
            curve.curveTo((35+x)*T, (45+y)*T, (20+x)*T, (35+y)*T, (13+x)*T, (64+y)*T);
            curve.moveTo((40+x)*T, (55+y)*T);
            curve.lineTo((20+x)*T, (100+y)*T);
            curve.moveTo((33+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (85+y)*T, (20+x)*T, (60+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T, (75+y)*T);
        }
        if("r".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((14+x)*T, (65+y)*T, (14+x)*T, (35+y)*T, (10+x)*T, (30+y)*T);
            curve.curveTo((3+x)*T, (60+y)*T, (43+x)*T, (35+y)*T, (40+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (35+y)*T, (25+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("s".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (35+x)*T, (30+y)*T, (30+x)*T, (30+y)*T);
            curve.curveTo((40+x)*T, (35+y)*T, (50+x)*T, (90+y)*T, (25+x)*T, (67+y)*T);
            curve.curveTo((35+x)*T, (60+y)*T, (40+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((50+x)*T, (75+y)*T);
        }
        if("t".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (20+x)*T, (20+y)*T, (35+x)*T, (0+y)*T);
            curve.curveTo((10+x)*T, (70+y)*T, (10+x)*T, (70+y)*T, (40+x)*T, (70+y)*T);
            curve.moveTo((8+x)*T, (25+y)*T);
            curve.lineTo((32+x)*T, (25+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("u".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (28+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (55+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("ú".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (75+y)*T, (28+x)*T, (45+y)*T, (25+x)*T, (40+y)*T);
            curve.curveTo((5+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (55+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (45+x)*T, (75+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((35+x)*T,(20+y)*T);
            curve.lineTo((45+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("v".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (35+y)*T, (10+x)*T, (35+y)*T, (15+x)*T, (40+y)*T);
            curve.curveTo((-5+x)*T, (83+y)*T, (30+x)*T, (83+y)*T, (37+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (49+x)*T, (45+y)*T, (48+x)*T, (40+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((55+x)*T,( 75+y)*T);
        }
        if("w".equals(letra)){
            curve.moveTo((0+x)*T, (45+y)*T);
            curve.curveTo((5+x)*T, (30+y)*T, (10+x)*T, (30+y)*T, (15+x)*T, (30+y)*T);
            curve.curveTo((-10+x)*T, (83+y)*T, (25+x)*T, (83+y)*T, (35+x)*T, (35+y)*T);
            curve.curveTo((10+x)*T, (83+y)*T, (45+x)*T, (83+y)*T, (55+x)*T, (30+y)*T);
            curve.curveTo((58+x)*T, (35+y)*T, (60+x)*T, (35+y)*T, (66+x)*T, (30+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((66+x)*T,( 75+y)*T);
        }
        if("x".equals(letra)){
            curve.moveTo((6+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (75+y)*T, (35+x)*T, (30+y)*T, (54+x)*T, (30+y)*T);
            curve.moveTo((10+x)*T, (45+y)*T);
            curve.curveTo((15+x)*T, (30+y)*T, (20+x)*T, (30+y)*T, (25+x)*T, (30+y)*T);
            curve.curveTo((28+x)*T, (30+y)*T, (28+x)*T, (80+y)*T, (54+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((59+x)*T,( 75+y)*T);
        }
        if("y".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (35+y)*T, (25+x)*T, (40+y)*T);
            curve.curveTo((0+x)*T, (83+y)*T, (35+x)*T, (83+y)*T, (50+x)*T, (40+y)*T);
            curve.curveTo((30+x)*T, (120+y)*T, (30+x)*T, (125+y)*T, (10+x)*T, (120+y)*T);
            curve.curveTo((0+x)*T, (100+y)*T, (30+x)*T, (80+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("z".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((15+x)*T, (20+y)*T, (65+x)*T, (20+y)*T, (25+x)*T, (70+y)*T); 
            curve.curveTo((35+x)*T, (90+y)*T, (25+x)*T, (125+y)*T, (5+x)*T, (120+y)*T);
            curve.curveTo((0+x)*T, (100+y)*T, (20+x)*T, (80+y)*T, (50+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        
        
        
        
        //mayusculas
        if("A".equals(letra)){
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.lineTo((30+x)*T,(70+y)*T);
            curve.moveTo((30+x)*T,(70+y)*T);
            curve.curveTo((45+x)*T,(75+y)*T,(58+x)*T,(71+y)*T,(60+x)*T,(55+y)*T);
            curve.moveTo((60+x)*T,(55+y)*T);
            curve.curveTo((62+x)*T,(49+y)*T,(58+x)*T,(48+y)*T,(50+x)*T,(53+y)*T);
            curve.moveTo((50+x)*T,(53+y)*T);
            curve.curveTo((26+x)*T,(56+y)*T,(22+x)*T,(51+y)*T,(26+x)*T,(30+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Á".equals(letra)){
            curve.moveTo((60+x)*T,(13+y)*T);
            curve.lineTo((80+x)*T,(3+y)*T);
            curve.moveTo((0+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.lineTo((30+x)*T,(70+y)*T);
            curve.moveTo((30+x)*T,(70+y)*T);
            curve.curveTo((45+x)*T,(75+y)*T,(58+x)*T,(71+y)*T,(60+x)*T,(55+y)*T);
            curve.moveTo((60+x)*T,(55+y)*T);
            curve.curveTo((62+x)*T,(49+y)*T,(58+x)*T,(48+y)*T,(50+x)*T,(53+y)*T);
            curve.moveTo((50+x)*T,(53+y)*T);
            curve.curveTo((26+x)*T,(56+y)*T,(22+x)*T,(51+y)*T,(26+x)*T,(30+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("B".equals(letra)){
            curve.moveTo((10+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.curveTo((79+x)*T,(28+y)*T,(72+x)*T,(45+y)*T,(36+x)*T,(43+y)*T);
            curve.moveTo((36+x)*T,(43+y)*T);
            curve.curveTo((78+x)*T,(54+y)*T,(73+x)*T,(68+y)*T,(20+x)*T,(70+y)*T);
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.curveTo((0+x)*T,(65+y)*T,(0+x)*T,(55+y)*T,(20+x)*T,(50+y)*T);
            curve.moveTo((20+x)*T,(50+y)*T);
            curve.curveTo((38+x)*T,(58+y)*T,(50+x)*T,(68+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("C".equals(letra)){
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.curveTo((36+x)*T,(25+y)*T,(25+x)*T,(35+y)*T,(15+x)*T,(55+y)*T);
            curve.moveTo((15+x)*T,(55+y)*T);
            curve.curveTo((15+x)*T,(64+y)*T,(22+x)*T,(72+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("D".equals(letra)){
            curve.moveTo((60+x)*T,(20+y)*T);
            curve.lineTo((16+x)*T,(70+y)*T);
            curve.curveTo((5+x)*T,(75+y)*T,(3+x)*T,(70+y)*T,(16+x)*T,(61+y)*T);
            curve.moveTo((16+x)*T,(61+y)*T);
            curve.curveTo((21+x)*T,(61+y)*T,(28+x)*T,(65+y)*T,(32+x)*T,(70+y)*T);
            curve.moveTo((32+x)*T,(70+y)*T);
            curve.curveTo((79+x)*T,(54+y)*T,(85+x)*T,(30+y)*T,(58+x)*T,(20+y)*T);
            curve.moveTo((58+x)*T,(20+y)*T);
            curve.curveTo((41+x)*T,(21+y)*T,(36+x)*T,(28+y)*T,(42+x)*T,(28+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("E".equals(letra)){
            curve.moveTo((50+x)*T,(15+y)*T);
            curve.curveTo((53+x)*T,(23+y)*T,(60+x)*T,(25+y)*T,(70+x)*T,(20+y)*T);
            curve.moveTo((70+x)*T,(20+y)*T);
            curve.curveTo((39+x)*T,(26+y)*T,(38+x)*T,(33+y)*T,(60+x)*T,(40+y)*T);
            curve.moveTo((60+x)*T,(40+y)*T);
            curve.curveTo((10+x)*T,(55+y)*T,(8+x)*T,(66+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("É".equals(letra)){
            curve.moveTo((50+x)*T,(15+y)*T);
            curve.curveTo((53+x)*T,(23+y)*T,(60+x)*T,(25+y)*T,(70+x)*T,(20+y)*T);
            curve.moveTo((70+x)*T,(20+y)*T);
            curve.curveTo((39+x)*T,(26+y)*T,(38+x)*T,(33+y)*T,(60+x)*T,(40+y)*T);
            curve.moveTo((60+x)*T,(40+y)*T);
            curve.curveTo((10+x)*T,(55+y)*T,(8+x)*T,(66+y)*T,(70+x)*T,(70+y)*T);
            curve.moveTo((65+x)*T,(12+y)*T);
            curve.lineTo((83+x)*T,(0+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("F".equals(letra)){
            curve.moveTo((9+x)*T,(61+y)*T);
            curve.curveTo((1+x)*T,(72+y)*T,(3+x)*T,(75+y)*T,(15+x)*T,(68+y)*T);
            curve.moveTo((15+x)*T,(68+y)*T);
            curve.lineTo((55+x)*T,(20+y)*T);
            curve.moveTo((25+x)*T,(20+y)*T);
            curve.curveTo((14+x)*T,(25+y)*T,(13+x)*T,(21+y)*T,(23+x)*T,(15+y)*T);
            curve.moveTo((23+x)*T,(15+y)*T);
            curve.curveTo((48+x)*T,(15+y)*T,(63+x)*T,(24+y)*T,(80+x)*T,(20+y)*T);  
            curve.moveTo((25+x)*T,(42+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
            curve.moveTo((42+x)*T,(40+y)*T);
            curve.lineTo((42+x)*T,(42+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("G".equals(letra)){
            curve.moveTo((70+x)*T,(10+y)*T);
            curve.curveTo((45+x)*T,(10+y)*T,(28+x)*T,(18+y)*T,(20+x)*T,(40+y)*T);
            curve.moveTo((20+x)*T,(40+y)*T);
            curve.curveTo((35+x)*T,(75+y)*T,(55+x)*T,(75+y)*T,(70+x)*T,(40+y)*T);
            curve.moveTo((70+x)*T,(40+y)*T);
            curve.lineTo((55+x)*T,(40+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("H".equals(letra)){
            curve.moveTo((50+x)*T,(0+y)*T);
            curve.lineTo((10+x)*T,(70+y)*T);
            curve.moveTo((70+x)*T,(0+y)*T);
            curve.lineTo((30+x)*T,(70+y)*T);
            curve.moveTo((30+x)*T,(70+y)*T);
            curve.curveTo((56+x)*T,(63+y)*T,(63+x)*T,(50+y)*T,(58+x)*T,(48+y)*T);
            curve.moveTo((58+x)*T,(48+y)*T);
            curve.curveTo((46+x)*T,(40+y)*T,(9+x)*T,(43+y)*T,(20+x)*T,(19+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("I".equals(letra)){
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((40+x)*T,(20+y)*T);
            curve.lineTo((76+x)*T,(20+y)*T);
            curve.moveTo((10+x)*T,(70+y)*T);
            curve.lineTo((35+x)*T,(70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Í".equals(letra)){
            curve.moveTo((20+x)*T,(70+y)*T);
            curve.lineTo((60+x)*T,(20+y)*T);
            curve.moveTo((40+x)*T,(20+y)*T);
            curve.lineTo((76+x)*T,(20+y)*T);
            curve.moveTo((10+x)*T,(70+y)*T);
            curve.lineTo((35+x)*T,(70+y)*T);
            curve.moveTo((62+x)*T,(13+y)*T);
            curve.lineTo((90+x)*T,(0+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("J".equals(letra)){
            curve.moveTo((20+x)*T, (20+y)*T);
            curve.curveTo((40+x)*T, (5+y)*T, (60+x)*T, (30+y)*T, (80+x)*T, (20+y)*T);
            curve.curveTo((80+x)*T, (15+y)*T, (70+x)*T, (5+y)*T, (50+x)*T, (20+y)*T);
            curve.curveTo((50+x)*T, (20+y)*T, (40+x)*T, (50+y)*T, (20+x)*T, (90+y)*T);
            curve.curveTo((0+x)*T, (100+y)*T, (0+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("K".equals(letra)){
            curve.moveTo((15+x)*T, (10+y)*T);
            curve.curveTo((15+x)*T, (10+y)*T, (21+x)*T, (7+y)*T, (25+x)*T, (10+y)*T);
            curve.lineTo((10+x)*T, (70+y)*T);
            curve.curveTo((7+x)*T, (70+y)*T, (5+x)*T, (70+y)*T, (0+x)*T, (65+y)*T);
            curve.moveTo((55+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (5+y)*T, (35+x)*T, (30+y)*T, (20+x)*T, (30+y)*T);
            curve.curveTo((25+x)*T, (50+y)*T, (40+x)*T, (45+y)*T, (45+x)*T, (65+y)*T);
            curve.curveTo((45+x)*T, (65+y)*T, (47+x)*T, (70+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((40+x)*T, (75+y)*T);
        }
        if("L".equals(letra)){
            curve.moveTo((35+x)*T, (10+y)*T);
            curve.curveTo((30+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (10+x)*T, (65+y)*T);
            curve.curveTo((5+x)*T, (80+y)*T, (5+x)*T, (40+y)*T, (10+x)*T, (65+y)*T);
            curve.curveTo((10+x)*T, (65+y)*T, (20+x)*T, (75+y)*T, (30+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((30+x)*T, (75+y)*T);
        }
        if("M".equals(letra)){
            curve.moveTo((5+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (30+x)*T, (30+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (30+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (55+x)*T, (0+y)*T, (55+x)*T, (30+y)*T);
            curve.lineTo((45+x)*T,(70+y)*T);
            curve.moveTo((55+x)*T, (30+y)*T);
            curve.curveTo((60+x)*T, (0+y)*T, (80+x)*T,( 0+y)*T, (80+x)*T, (30+y)*T);
            curve.lineTo((70+x)*T, (65+y)*T);
            curve.curveTo((77+x)*T, (70+y)*T, (80+x)*T, (70+y)*T, (85+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((85+x)*T, (75+y)*T);
        }
        if("N".equals(letra)){
            curve.moveTo((5+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (30+x)*T, (30+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (30+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (55+x)*T, (0+y)*T, (55+x)*T, (30+y)*T);
            curve.lineTo((45+x)*T,(65+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Ñ".equals(letra)){
            curve.moveTo((5+x)*T, (30+y)*T);
            curve.curveTo((10+x)*T, (0+y)*T, (30+x)*T, (0+y)*T, (30+x)*T, (30+y)*T);
            curve.lineTo((20+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T, (30+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (55+x)*T, (0+y)*T, (55+x)*T, (30+y)*T);
            curve.lineTo((45+x)*T,(65+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (57+x)*T, (70+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((15+x)*T, (3+y)*T);
            curve.curveTo((25+x)*T, (-2+y)*T, (35+x)*T, (8+y)*T, (45+x)*T, (3+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("O".equals(letra)){
            curve.moveTo((60+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (5+y)*T, (-10+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (115+x)*T, (5+y)*T,(60+x)*T, (0+y)*T);
            curve.moveTo((28+x)*T, (14+y)*T);
            curve.curveTo((50+x)*T, (20+y)*T, (70+x)*T, (20+y)*T, (90+x)*T, (10+y)*T);
            curve.moveTo((55+x)*T, (56+y)*T);
            curve.curveTo((60+x)*T, (65+y)*T, (70+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((80+x)*T, (75+y)*T);
        }
        if("Ó".equals(letra)){
            curve.moveTo((60+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (5+y)*T, (-10+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (115+x)*T, (5+y)*T, (60+x)*T, (0+y)*T);
            curve.moveTo((28+x)*T, (14+y)*T);
            curve.curveTo((50+x)*T, (20+y)*T, (70+x)*T, (20+y)*T, (90+x)*T, (10+y)*T);
            curve.moveTo((55+x)*T, (56+y)*T);
            curve.curveTo((60+x)*T, (65+y)*T, (70+x)*T, (70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((40+x)*T,(-5+y)*T);
            curve.lineTo((50+x)*T, (-15+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((80+x)*T, (75+y)*T);
        }
        if("P".equals(letra)){
            curve.moveTo((5+x)*T, (15+y)*T);
            curve.curveTo((10+x)*T,(15+y)*T , (25+x)*T,(10+y)*T, (20+x)*T,(7+y)*T);
            curve.curveTo((12+x)*T, (5+y)*T, (8+x)*T, (10+y)*T,( 20+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (10+y)*T, (50+x)*T, (35+y)*T, (13+x)*T, (40+y)*T);
            curve.moveTo((20+x)*T, (7+y)*T);
            curve.lineTo((5+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (30+x)*T, (75+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T, (75+y)*T);
        }
        if("Q".equals(letra)){
            curve.moveTo((60+x)*T, (0+y)*T);
            curve.curveTo((15+x)*T, (5+y)*T, (-10+x)*T, (65+y)*T, (30+x)*T, (70+y)*T);
            curve.curveTo((55+x)*T, (65+y)*T, (115+x)*T,(5+y)*T, (60+x)*T, (0+y)*T);
            curve.moveTo((28+x)*T, (14+y)*T);
            curve.curveTo((20+x)*T, (30+y)*T, (20+x)*T, (50+y)*T, (25+x)*T, (50+y)*T);
            curve.curveTo((35+x)*T, (40+y)*T, (55+x)*T, (40+y)*T, (65+x)*T,(56+y)*T);
            curve.curveTo((70+x)*T, (65+y)*T, (75+x)*T,(70+y)*T, (80+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T,( 75+y)*T);
            curve.lineTo((80+x)*T,( 75+y)*T);
        }
        if("R".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((20+x)*T, (70+y)*T, (20+x)*T, (0+y)*T, (25+x)*T, (10+y)*T);
            curve.moveTo((10+x)*T, (10+y)*T);
            curve.curveTo((60+x)*T, (0+y)*T, (60+x)*T, (45+y)*T, (15+x)*T, (40+y)*T);
            curve.moveTo((11+x)*T, (40+y)*T);
            curve.curveTo((45+x)*T, (45+y)*T, (20+x)*T, (70+y)*T, (45+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((45+x)*T,( 75+y)*T);
        }
        if("S".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((25+x)*T, (70+y)*T, (40+x)*T, (30+y)*T, (40+x)*T, (0+y)*T);
            curve.curveTo((80+x)*T, (25+y)*T, (60+x)*T, (90+y)*T, (25+x)*T, (65+y)*T);
            curve.curveTo((35+x)*T, (50+y)*T, (45+x)*T, (80+y)*T, (70+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((70+x)*T,( 75+y)*T);
        }
        if("T".equals(letra)){
            curve.moveTo((25+x)*T, (70+y)*T);
            curve.curveTo((50+x)*T, (70+y)*T, (50+x)*T, (0+y)*T, (60+x)*T, (5+y)*T);
            curve.moveTo((25+x)*T, (20+y)*T);
            curve.curveTo((30+x)*T, (-10+y)*T, (70+x)*T, (15+y)*T, (80+x)*T, (0+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T,( 75+y)*T);
        }
        if("U".equals(letra)){
            curve.moveTo((30+x)*T, (10+y)*T);
            curve.curveTo((55+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (42+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((60+x)*T, (74+y)*T, (53+x)*T, (15+y)*T, (63+x)*T, (10+y)*T);
            curve.curveTo((53+x)*T, (40+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Ú".equals(letra)){
            curve.moveTo((30+x)*T, (10+y)*T);
            curve.curveTo((55+x)*T, (0+y)*T, (0+x)*T, (74+y)*T, (42+x)*T, (70+y)*T);
            curve.moveTo((32+x)*T, (70+y)*T);
            curve.curveTo((60+x)*T, (74+y)*T, (53+x)*T, (15+y)*T, (63+x)*T, (10+y)*T);
            curve.curveTo((53+x)*T, (40+y)*T, (50+x)*T, (75+y)*T, (60+x)*T, (70+y)*T);
            curve.moveTo((30+x)*T,(-5+y)*T);
            curve.lineTo((40+x)*T, (-15+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("V".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((-30+x)*T, (90+y)*T, (20+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((45+x)*T, (15+y)*T, (48+x)*T, (15+y)*T, (50+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("W".equals(letra)){
            curve.moveTo((0+x)*T, (25+y)*T);
            curve.curveTo((0+x)*T, (5+y)*T, (15+x)*T, (5+y)*T, (15+x)*T, (10+y)*T);
            curve.curveTo((-30+x)*T, (90+y)*T, (20+x)*T, (90+y)*T, (40+x)*T, (10+y)*T);
            curve.curveTo((-5+x)*T, (90+y)*T, (50+x)*T, (90+y)*T, (65+x)*T, (10+y)*T);
            curve.curveTo((50+x)*T, (10+y)*T, (70+x)*T, (20+y)*T, (80+x)*T, (10+y)*T);
            curve.moveTo((0+x)*T,(75+y)*T);
            curve.lineTo((80+x)*T,( 75+y)*T);
        }
        if("X".equals(letra)){
            curve.moveTo((0+x)*T, (70+y)*T);
            curve.curveTo((35+x)*T, (80+y)*T, (40+x)*T, (10+y)*T, (70+x)*T, (10+y)*T);
            curve.moveTo((20+x)*T, (10+y)*T);
            curve.curveTo((35+x)*T, (0+y)*T, (35+x)*T, (80+y)*T, (55+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((55+x)*T, (75+y)*T);
        }
        if("Y".equals(letra)){
            curve.moveTo((0+x)*T, (10+y)*T);
            curve.curveTo((25+x)*T, (0+y)*T, (-35+x)*T, (74+y)*T, (5+x)*T, (70+y)*T);
            curve.moveTo((5+x)*T, (70+y)*T);
            curve.curveTo((30+x)*T, (74+y)*T, (20+x)*T, (15+y)*T, (35+x)*T, (10+y)*T);
            curve.curveTo((11+x)*T, (60+y)*T, (15+x)*T, (140+y)*T, (-10+x)*T, (120+y)*T);
            curve.curveTo((-10+x)*T, (90+y)*T, (20+x)*T, (80+y)*T, (35+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        if("Z".equals(letra)){
            curve.moveTo((30+x)*T, (20+y)*T);
            curve.curveTo((35+x)*T, (-10+y)*T, (75+x)*T, (15+y)*T, (85+x)*T, (0+y)*T);
            curve.lineTo((6+x)*T, (70+y)*T);
            curve.moveTo((28+x)*T, (35+y)*T);
            curve.lineTo((60+x)*T, (35+y)*T);
            curve.moveTo((6+x)*T, (70+y)*T);
            curve.curveTo((10+x)*T, (60+y)*T, (50+x)*T, (75+y)*T, (70+x)*T, (70+y)*T);
            curve.moveTo((0+x)*T, (75+y)*T);
            curve.lineTo((60+x)*T, (75+y)*T);
        }
        return curve;
    }

    public Graphics2D Pcontrol(String letra, double X, double Y, double Tp) {
        g3d = (Graphics2D) jPanel1.getGraphics();
        g3d.setColor(Color.RED);
        int T = (int) Tp;// con las opciones de incremento de tamaño al aproximarlas a un entero las deja en 1 por lo cual no varia
        int x = (int) X;// con las opciones de incremento de tamaño al aproximarlas a un entero las deja en 1 por lo cual no varia
        int y= (int) Y;// con las opciones de incremento de tamaño al aproximarlas a un entero las deja en 1 por lo cual no varia
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
                g3d.fillOval((25+x)*T, (35+y)*T, 4, 4);
                g3d.fillOval((22+x)*T, (36+y)*T, 4, 4);
                g3d.fillOval((22+x)*T, (44+y)*T, 4, 4);
                g3d.fillOval((25+x)*T, (45+y)*T, 4, 4);
                g3d.fillOval((0+x)*T, (70+y)*T, 4, 4);
                g3d.fillOval((15+x)*T, (70+y)*T, 4, 4);
                g3d.fillOval((15+x)*T, (70+y)*T, 4, 4);
                g3d.fillOval((25+x)*T, (50+y)*T, 4, 4);
                g3d.fillOval((25+x)*T, (110+y)*T, 4, 4);
                g3d.fillOval((0+x)*T, (135+y)*T, 4, 4);
                g3d.fillOval((0+x)*T, (80+y)*T, 4, 4);
                g3d.fillOval((40+x)*T, (70+y)*T, 4, 4);
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

    public String[] reverse(String[] nums){
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums.length - 1 - i] = nums[i];
        }
 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
    
    private void coloresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coloresMousePressed
        if (colorito == null) {
            colorito = Color.white;
        } else {
            colorito = JColorChooser.showDialog(this, "select a color", colorito);
        }
    }//GEN-LAST:event_coloresMousePressed

    private void Pcontrol1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pcontrol1MousePressed
        if (Xp % 2 == 0) {
            Puntos = true;
            Xp++;
        } else {
            Puntos = false;
            Xp++;
        }
    }//GEN-LAST:event_Pcontrol1MousePressed

    private void Pcontrol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pcontrol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pcontrol1ActionPerformed

    private void xsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xsliderStateChanged
        xpos = xslider.getValue();
    }//GEN-LAST:event_xsliderStateChanged

    private void ysliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ysliderStateChanged
        ypos = yslider.getValue();
    }//GEN-LAST:event_ysliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pcontrol1;
    public static javax.swing.JButton colores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField palabra;
    private javax.swing.JSlider xslider;
    private javax.swing.JSlider yslider;
    // End of variables declaration//GEN-END:variables
}
