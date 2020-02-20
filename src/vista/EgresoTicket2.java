/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import controlador.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class EgresoTicket2 extends javax.swing.JFrame {
    public static final String BOTON_CONFIRMAR = "CONFIRMAR";
    public RepositorioTicket repoTicket = new RepositorioTicket();
    /**
     * Creates new form EgresoTicket
     */
    public EgresoTicket2() {
        initComponents();
        jButton1.setBackground(Color.green);
        jButton2.setBackground(Color.red);
        
    }
    public void setControlador(ControladorGestionarEgresoTransporte controlador){
        jButton1.setActionCommand(BOTON_CONFIRMAR);
        jButton1.addActionListener(controlador);
    }
    public void ejecutar(){
        this.setVisible(true);
        //cargarTabla();
    }
    public void cargarTabla(){
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        for(Ticket c : repoTicket.getTickets()){
            Object[] fila = {c.getNumero(),c.getTransportista().getNombre(),c.getFecha()};
            tabla.addRow(fila);
        }
    }
    public void cargarTabla(RepositorioTicket repoTicket){
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        for(Ticket c : repoTicket.getTickets()){
            Object[] fila = {c.getNumero(),c.getTransportista().getNombre(),c.getFecha()};
            tabla.addRow(fila);
        }
    }public Ticket cargarTicket(){
        int numero = jTable1.getSelectedRow();
        Ticket ticket = repoTicket.getTickets().get(numero);
        jLabel11.setText(ticket.getEt().getNombre());
        jLabel12.setText(ticket.getTransportista().getNombre());
        jLabel13.setText(String.valueOf(ticket.getTransportista().getDni()));
        jLabel14.setText(ticket.getTransporte().getPatenteChasis());
        jLabel15.setText(ticket.getAcoplado().getPatenteAcoplado());
        jLabel16.setText(String.valueOf(ticket.getCantidadBinesIngreso()));
        return ticket;
    }
    public void cargarTickets(){
        int numero = jTable1.getSelectedRow();
        Ticket ticket = repoTicket.getTickets().get(numero);
        jLabel11.setText(ticket.getEt().getNombre());
        jLabel12.setText(ticket.getTransportista().getNombre());
        jLabel13.setText(String.valueOf(ticket.getTransportista().getDni()));
        jLabel14.setText(ticket.getTransporte().getPatenteChasis());
        jLabel15.setText(ticket.getAcoplado().getPatenteAcoplado());
        jLabel16.setText(String.valueOf(ticket.getCantidadBinesIngreso()));
    }
    public String getObservaciones(){
        return jTextArea1.getText();
    }
    public float getPesoSalida(){
        float numero = 0;
        try{
            numero = (float) Double.parseDouble(jTextField1.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error al ingresar el peso Salida");
            return getPesoSalida();
        }
        return numero;
    }
    public int getCantidadBinesSalida(){
        int numero = 0;
        try{
            numero = Integer.parseInt(jTextField2.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error al ingresar la Cantidad de bines de salida");
            return getCantidadBinesSalida();
        }
        return numero;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(5);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel5.setText("EMPRESA TRANSPORTE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 380, 150, 14);

        jLabel6.setText("NOMBRE CONDUCTOR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 430, 150, 14);

        jLabel7.setText("DNI CONDUCTOR");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 460, 140, 14);

        jLabel8.setText("PATENTE CHASIS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 490, 140, 14);

        jLabel9.setText("PATENTE ACOPLADO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 520, 150, 14);

        jLabel10.setText("CANTIDAD BINES ENTRADA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 570, 170, 14);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 380, 260, 20);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(210, 430, 260, 20);

        jLabel13.setText("             ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(230, 460, 220, 14);

        jLabel14.setText("     ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(230, 490, 190, 14);

        jLabel15.setText("             ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(230, 520, 250, 14);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(230, 570, 250, 20);

        jLabel17.setText("PESO SALIDA:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(500, 370, 100, 14);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(630, 370, 203, 20);

        jLabel20.setText("CANTIDAD BINES SALIDA:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(500, 430, 180, 14);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(690, 430, 145, 20);

        jLabel21.setText("OBSERVACIONES:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(500, 490, 140, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(510, 510, 330, 96);

        jButton1.setText("CONFIRMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 630, 130, 23);

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 630, 130, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("EGRESO TRANSPORTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(248, 11, 250, 28);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Ticket", "Conductor", "Fecha"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 50, 780, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setBackground(Color.yellow);
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
        jTextArea1.setBackground(Color.yellow);
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        cargarTickets();
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EgresoTicket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EgresoTicket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EgresoTicket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EgresoTicket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EgresoTicket2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}