/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcpoo.A;

import abcpoo.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author RNS
 */
public class ReporteA extends javax.swing.JFrame {
     public static ArrayList<Empleado> Integrantes = new ArrayList<Empleado>();
DefaultTableModel dtm;
    private final JFrame p;
    int pos;
    /**
     * Creates new form ReporteA
     */
    int anchoColumna;
    public ReporteA(JFrame p) {
        initComponents();
        this.p=p;
        this.setLocationRelativeTo(null);
      
        pos = 0;
        dtm = new DefaultTableModel();

        dtm.addColumn("Nombre");
        dtm.addColumn("Apellidos");
        dtm.addColumn("NSS");
        dtm.addColumn("Salario");
        
        Tabla.setModel(dtm);
         JViewport scroll =  (JViewport) Tabla.getParent(); 
        int ancho = scroll.getWidth(); 
         
        //Aqui especificamos las dimensiones de nuestra tabla
        TableColumnModel modeloColumna = Tabla.getColumnModel(); 
        TableColumn columnaTabla; 
        for (int i = 0; i < Tabla.getColumnCount(); i++) { 
            columnaTabla = modeloColumna.getColumn(i); 
            switch(i){ 
                case 0: anchoColumna = (30*ancho)/100; 
                        break; 
                case 1: anchoColumna = (40*ancho)/100; 
                        break; 
                case 2: anchoColumna = (10*ancho)/100; 
                        break; 
                case 3: anchoColumna = (30*ancho)/100;
            }                      
            columnaTabla.setPreferredWidth(anchoColumna);            
        } 
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        for (int i = 0; i < Tabla.getColumnCount(); i++) {
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
        Tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);  
        }
        
         
        
        

        // Leemos el archivo de profesores
        try {
            FileInputStream fi = new FileInputStream("Empleados.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Integrantes = (ArrayList) oi.readObject();
            oi.close();
        } catch (Exception exception) {
            System.out.println("Error -- " + exception.toString());
            System.out.println("Error no se ha creado el archivo ");
        }
        

        //-----------------------------------------------------------------------------
        int cont = -1;
        for (int i = 0; i < Integrantes.size(); i++) {

            Object[] rowData = new Object[2];
            cont++;
            dtm.addRow(rowData);

            dtm.setValueAt(Integrantes.get(i).getNombre(), cont, 0);
            dtm.setValueAt(Integrantes.get(i).getApellidos(), cont, 1);
            dtm.setValueAt( Integrantes.get(i).getNss(), cont, 2);
            dtm.setValueAt( ((EmpleadoAsalariado)(Integrantes.get(i))).getSalario()  , cont, 3);
            

        }

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        p.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
