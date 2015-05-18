/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcpoo;

import abcpoo.A.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

/**
 *
 * @author RNS
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        //Imagenes
        javax.swing.ImageIcon im;
        im = new javax.swing.ImageIcon("src/fondo de pantalla.jpg");
        im = new javax.swing.ImageIcon(im.getImage().getScaledInstance(1000, 500, java.awt.Image.SCALE_DEFAULT));

        javax.swing.ImageIcon im2;
        im2 = new javax.swing.ImageIcon("src/eliminar.png");
        im2 = new javax.swing.ImageIcon(im2.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_DEFAULT));

        javax.swing.ImageIcon im3;
        im3 = new javax.swing.ImageIcon("src/salir.png");
        im3 = new javax.swing.ImageIcon(im3.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
        
        javax.swing.ImageIcon im4;
        im4 = new javax.swing.ImageIcon("src/home.png");
        im4 = new javax.swing.ImageIcon(im4.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
        javax.swing.ImageIcon im5;
        im5 = new javax.swing.ImageIcon("src/clock.png");
        im5 = new javax.swing.ImageIcon(im5.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));

        javax.swing.ImageIcon im6;
        im6 = new javax.swing.ImageIcon("src/user.png");
        im6 = new javax.swing.ImageIcon(im6.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));

        
        javax.swing.ImageIcon im7;
        im7 = new javax.swing.ImageIcon("src/ticket.png");
        im7 = new javax.swing.ImageIcon(im7.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
        
        javax.swing.ImageIcon im8;
        im8 = new javax.swing.ImageIcon("src/configuration2.png");
        im8 = new javax.swing.ImageIcon(im8.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
        javax.swing.ImageIcon im9;
        im9 = new javax.swing.ImageIcon("src/basket.png");
        im9 = new javax.swing.ImageIcon(im9.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
        javax.swing.ImageIcon im10;
        im10 = new javax.swing.ImageIcon("src/cash.png");
        im10 = new javax.swing.ImageIcon(im10.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
        javax.swing.ImageIcon im11;
        im11 = new javax.swing.ImageIcon("src/BLACK_DOT.gif");
        im11 = new javax.swing.ImageIcon(im11.getImage().getScaledInstance(8, 8, java.awt.Image.SCALE_DEFAULT));
        
        javax.swing.ImageIcon im12;
        im12 = new javax.swing.ImageIcon("src/tag.png");
        im12 = new javax.swing.ImageIcon(im12.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        
//En esta parte inicializamos la ventana en la que vamos a colocar todo nuestro proyecto
        //---------------------------------------------------------------
        this.setSize(1000, 400);
        this.setLocationRelativeTo(this); //Este es para centrar la ventana en el escritorio
        this.setDefaultCloseOperation(2);
        this.setLayout(null);//Colocar los objetos donde yo quiera
        this.setTitle("Menu Principal");

        //---------------------------------------------------------------
        //Inicialización de los componentes de el menú 
        javax.swing.JMenu Inicio = new javax.swing.JMenu();
        Inicio.setIcon(im4);
        Inicio.setText("Inicio");
        
        

        

        javax.swing.JMenu Catalogo = new javax.swing.JMenu();
        Catalogo.setIcon(im6);
        Catalogo.setText("Catálogo");
        
        
        
        javax.swing.JMenu Acerca = new javax.swing.JMenu();
        Acerca.setIcon(im12);
        Acerca.setText("Acerca");

        //Inicialización y creación de de el menú
        javax.swing.JMenuBar menubar;
        menubar = new javax.swing.JMenuBar();
        menubar.add(Inicio);
        menubar.add(Catalogo);
        menubar.add(Acerca);
        this.setJMenuBar(menubar);

        //---------------------------------------------------------------
        //Meter Elementos a el Menú Archivo
        javax.swing.JMenuItem salir = new javax.swing.JMenuItem();
        salir.setIcon(im3);
        salir.setText("Salir");
        Inicio.add(salir);
        
        //---------------------------------------------------------------
        //Meter Elementos a el Menú Catalogo
        
        javax.swing.JMenu EC = new javax.swing.JMenu();
        EC.setIcon(im11);
        EC.setText("Empleado por Comisión.");
        Catalogo.add(EC);
        
        javax.swing.JMenu EBC = new javax.swing.JMenu();
        EBC.setIcon(im11);
        EBC.setText("Empleado Base más comisión.");
        Catalogo.add(EBC);
        
        javax.swing.JMenu EA = new javax.swing.JMenu();
        EA.setIcon(im11);
        EA.setText("Empleado Asalariado");
        Catalogo.add(EA);
        
        
        
        //---------------------------------------------------------------
        //Meter Elementos a el Menú Acerca
       
        javax.swing.JMenuItem Version = new javax.swing.JMenuItem();
        Version.setIcon(im11);
        Version.setText("Version 1.0");
        Acerca.add(Version);
        
        //---------------------------------------------------------------
        //Meter Elementos a Empleado por Comision
        
        
        //ALTAS
        javax.swing.JMenuItem AltasEC = new javax.swing.JMenuItem();
        AltasEC.setIcon(im11);
        AltasEC.setText("Altas EC");
        EC.add(AltasEC);
        //BAJAS
        javax.swing.JMenuItem BajasEC = new javax.swing.JMenuItem();
        BajasEC.setIcon(im11);
        BajasEC.setText("Bajas EC");
        EC.add(BajasEC);
        //CONSULTAS
        javax.swing.JMenuItem ConsultasEC = new javax.swing.JMenuItem();
        ConsultasEC.setIcon(im11);
        ConsultasEC.setText("Consultas EC");
        EC.add(ConsultasEC);
        //MODIFICACIONES
        javax.swing.JMenuItem ModificacionesEC = new javax.swing.JMenuItem();
        ModificacionesEC.setIcon(im11);
        ModificacionesEC.setText("Modificaciones EC");
        EC.add(ModificacionesEC);
        //REPORTE
        javax.swing.JMenuItem ReporteEC = new javax.swing.JMenuItem();
        ReporteEC.setIcon(im11);
        ReporteEC.setText("Reporte EC");
        EC.add(ReporteEC);
        
        
        
        //---------------------------------------------------------------
        //Meter Elementos a Empleado por Comision Mas Base
        
        
        //ALTAS
        javax.swing.JMenuItem AltasEBC = new javax.swing.JMenuItem();
        AltasEBC.setIcon(im11);
        AltasEBC.setText("AltasEBC");
        EBC.add(AltasEBC);
        //BAJAS
        javax.swing.JMenuItem BajasEBC = new javax.swing.JMenuItem();
        BajasEBC.setIcon(im11);
        BajasEBC.setText("BajasEBC");
        EBC.add(BajasEBC);
        //CONSULTAS
        javax.swing.JMenuItem ConsultasEBC = new javax.swing.JMenuItem();
        ConsultasEBC.setIcon(im11);
        ConsultasEBC.setText("Consultas EBC");
        EBC.add(ConsultasEBC); 
        //MODIFICACIONES
        javax.swing.JMenuItem ModificacionesEBC = new javax.swing.JMenuItem();
        ModificacionesEBC.setIcon(im11);
        ModificacionesEBC.setText("Modificaciones EBC");
        EBC.add(ModificacionesEBC);
        //REPORTE
        javax.swing.JMenuItem ReporteEBC = new javax.swing.JMenuItem();
        ReporteEBC.setIcon(im11);
        ReporteEBC.setText("Reporte EBC");
        EBC.add(ReporteEBC);
        
        
        //---------------------------------------------------------------
        //Meter Elementos a Empleado Asalariado
        
        
        //ALTAS
        javax.swing.JMenuItem AltasEA = new javax.swing.JMenuItem();
        AltasEA.setIcon(im11);
        AltasEA.setText("Altas EA");
        EA.add(AltasEA);
        //BAJAS
        javax.swing.JMenuItem BajasEA = new javax.swing.JMenuItem();
        BajasEA.setIcon(im11);
        BajasEA.setText("Bajas EA");
        EA.add(BajasEA);
        //CONSULTAS
        javax.swing.JMenuItem ConsultasEA = new javax.swing.JMenuItem();
        ConsultasEA.setIcon(im11);
        ConsultasEA.setText("Consultas EA");
        EA.add(ConsultasEA);
        //MODIFICACIONES
        javax.swing.JMenuItem ModificacionesEA = new javax.swing.JMenuItem();
        ModificacionesEA.setIcon(im11);
        ModificacionesEA.setText("Modificaciones EA");
        EA.add(ModificacionesEA);
        //REPORTE
        javax.swing.JMenuItem ReporteEA = new javax.swing.JMenuItem();
        ReporteEA.setIcon(im11);
        ReporteEA.setText("Reporte EA");
        EA.add(ReporteEA);
        //---------------------------------------------------------------   
        //colocamos la imagen que estará de fondo en nuestra ventana   
        
        javax.swing.JLabel lblSoluitions;
        lblSoluitions = new javax.swing.JLabel();
        lblSoluitions.setSize(250, 50);
        lblSoluitions.setLocation(810, 320);
        lblSoluitions.setFont(new java.awt.Font("Verdana", Font.BOLD, 20));
        lblSoluitions.setForeground(Color.white);
        lblSoluitions.setText(" SoluITions ");
        
        this.add(lblSoluitions);
       
        
       
        Reloj reloj = new Reloj(100, 300, 250, 50);
        reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reloj.setFont(new java.awt.Font("Verdana", Font.BOLD, 20));
        reloj.setForeground(Color.white);
        this.getContentPane().add(reloj);
        
        
        javax.swing.JLabel p1;
        p1 = new javax.swing.JLabel();
        p1.setSize(1000, 400);
        p1.setLocation(0, 0);
        p1.setIcon(im);
        p1.setOpaque(true);
        this.add(p1);
        
        
        
        
        
        
        
        
        
        //---------------------------------------------------------------
        
        //La configuración de la el menuItem para salir
        java.awt.event.ActionListener clicSalir = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
                
            }
        };
         //La configuración de el menuItem RegistrarClientes
        //-------------------------------------------------------------------------------
        //En esta parte creamos el objeto temporal para poder deshabilitar y volver habilitar la ventana padre
        //Código profe Lalo
        final javax.swing.JFrame temporal1;
        temporal1=this;
        
       //La configuración de el menuItem Acerca
        //-------------------------------------------------------------------------------
       java.awt.event.ActionListener clicAcerca = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Acerca R = new Acerca(temporal1);
                R.setVisible(true);
                setEnabled(false);
                //Si queremos que cuando abramos la ventana se haga invisible la ventana padre padre.  setVisible(false);
                
            }
        };
       
       java.awt.event.ActionListener clicAltasEA = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AltasA R = new AltasA(temporal1);
                R.setVisible(true);
                setVisible(false);

                //Si queremos que cuando abramos la ventana se haga invisible la ventana padre padre.  setVisible(false);
                
            }
        };
       
       java.awt.event.ActionListener clicBajasEA = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BajasA R = new BajasA(temporal1);
                R.setVisible(true);
                setVisible(false);
                //Si queremos que cuando abramos la ventana se haga invisible la ventana padre padre.  setVisible(false);
                
            }
        };
       
       
       java.awt.event.ActionListener clicBuscarEA = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarA R = new BuscarA(temporal1);
                R.setVisible(true);
                setVisible(false);
                //Si queremos que cuando abramos la ventana se haga invisible la ventana padre padre.  setVisible(false);
                
            }
        };
       
       java.awt.event.ActionListener clicModificacionesEA = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ModificacionesA R = new ModificacionesA(temporal1);
                R.setVisible(true);
                setVisible(false);
                //Si queremos que cuando abramos la ventana se haga invisible la ventana padre padre.  setVisible(false);
                
            }
        };
       
       java.awt.event.ActionListener clicReporteEA = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ReporteA R = new ReporteA(temporal1);
                R.setVisible(true);
                setVisible(false);
                //Si queremos que cuando abramos la ventana se haga invisible la ventana padre padre.  setVisible(false);
                
            }
        };
       
       
       
        
        //-------------------------------------------------------------------------------
        //Sección para añadir acciones a la ventana
        salir.addActionListener(clicSalir);
        Version.addActionListener(clicAcerca);
        AltasEA.addActionListener(clicAltasEA);
        BajasEA.addActionListener(clicBajasEA);
        ConsultasEA.addActionListener(clicBuscarEA);
        ModificacionesEA.addActionListener(clicModificacionesEA);
        ReporteEA.addActionListener(clicReporteEA);
        
        
        this.setVisible(false);
        this.setUndecorated(true);
        this.setResizable(false);

    }

}
