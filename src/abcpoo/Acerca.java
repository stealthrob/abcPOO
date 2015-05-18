/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcpoo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import abcpoo.Principal;

/**
 *
 * @author RNS
 */
public class Acerca extends javax.swing.JFrame {
    //private final JFrame p;

    public Acerca(final JFrame padre) {
        
        //Imagenes
        javax.swing.ImageIcon im;
        im = new javax.swing.ImageIcon("src/back.png");
        im = new javax.swing.ImageIcon(im.getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT));

        javax.swing.ImageIcon im2;
        im2 = new javax.swing.ImageIcon("src/acercade.jpg");
        im2 = new javax.swing.ImageIcon(im2.getImage().getScaledInstance(700, 400, java.awt.Image.SCALE_DEFAULT));


        //En esta parte inicializamos la ventana en la que vamos a colocar todo nuestro proyecto
        //---------------------------------------------------------------
        this.setSize(700, 400);
        this.setLocationRelativeTo(this); //Este es para centrar la ventana en el escritorio
        this.setDefaultCloseOperation(2);
        this.setLayout(null);//Colocar los objetos donde yo quiera
        this.setTitle("Versión 1.0  SouITions ");
 

         //---------------------------------------------------------------
        //Aquí creamos el los labels para los text fields
        final javax.swing.JLabel lblFecha;
        lblFecha = new javax.swing.JLabel();
        lblFecha.setSize(250, 30);
        lblFecha.setLocation(50, 50);
        lblFecha.setFont(new java.awt.Font("Verdana", Font.BOLD, 20));
        lblFecha.setForeground(Color.white);
        lblFecha.setText(" SoluITions ");
        this.add(lblFecha);
        
        final javax.swing.JLabel lbl1;
        lbl1 = new javax.swing.JLabel();
        lbl1.setSize(400,200);
        lbl1.setLocation(340, 220);
        lbl1.setFont(new java.awt.Font("", Font.BOLD, 15));
        lbl1.setForeground(Color.white);
        lbl1.setText("Desarrollado por Roberto Nieto Salgado");
        this.add(lbl1);
        
        
        
        final javax.swing.JLabel lbl2;
        lbl2 = new javax.swing.JLabel();
        lbl2.setSize(400,200);
        lbl2.setLocation(340, 250);
        lbl2.setFont(new java.awt.Font("", Font.BOLD, 15));
        lbl2.setForeground(Color.white);
        lbl2.setText("Fecha de Lanzamiento: 17 de Mayo del 2015");
        this.add(lbl2);
        
        
        final javax.swing.JLabel lbl3;
        lbl3 = new javax.swing.JLabel();
        lbl3.setSize(400,200);
        lbl3.setLocation(340, 190);
        lbl3.setFont(new java.awt.Font("", Font.BOLD, 15));
        lbl3.setForeground(Color.white);
        lbl3.setText("soluitions.com.mx");
        this.add(lbl3);
        
        final javax.swing.JLabel lbl4;
        lbl4 = new javax.swing.JLabel();
        lbl4.setSize(400,200);
        lbl4.setLocation(340, 150);
        lbl4.setFont(new java.awt.Font("", Font.BOLD, 18));
        lbl4.setForeground(Color.white);
        lbl4.setText("abcPOO");
        this.add(lbl4);


         //---------------------------------------------------------------
        //Aquí creamos el button para poder enviar los datos que se recolectaron en los textsfields a la base de datos
        javax.swing.JButton btnAlta;
        btnAlta = new javax.swing.JButton();
        btnAlta.setSize(50, 40);
        btnAlta.setLocation(20, 325);
        btnAlta.setIcon(im);
        btnAlta.setFont(new java.awt.Font("", Font.BOLD, 15));
        btnAlta.setToolTipText("Da clic para regresar...");
        this.add(btnAlta);
        
        //---------------------------------------------------------------   
        //colocamos la imagen que estará de fondo en nuestra ventana   
        
        javax.swing.JLabel p1;
        p1 = new javax.swing.JLabel();
        p1.setSize(700, 400);
        p1.setLocation(0, 0);
        p1.setIcon(im2);
        p1.setOpaque(true);
        this.add(p1);

        //---------------------------------------------------------------
        //Aquí creamos el evento para mandar los datos capturados en el formulario a la base de datos
        java.awt.event.ActionListener a;
        a = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                dispose();
                padre.setEnabled(true);
                
            }
        };
        btnAlta.addActionListener(a);

        //----------------------------------------------------------------------------------------------
        //
        //Aquí creamos el evento para la salida de la ventana
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                //Si queremos que cuando cerremos la ventana se vuelva a hacer visible la ventana padre padre.setVisible(true);
                padre.setEnabled(true);
            }
        });
 this.setResizable(false);
    }

}
