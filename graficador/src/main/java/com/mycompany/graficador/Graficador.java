/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.graficador;


public class Graficador {

    public static void main(String[] args) {
        Dibujo Dibujo = new Dibujo();
        
        Dibujo.hablar();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dibujo().setVisible(true);
            }
        }
        );
    }
}
