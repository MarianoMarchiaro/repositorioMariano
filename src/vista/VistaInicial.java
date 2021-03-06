/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.ControladorInicial;

/**
 *
 * @author Mariano
 */
public class VistaInicial extends javax.swing.JFrame {
    public static final String VISTA_LISTAPEDIDO = "ingreso ticket";
    public static final String VISTA_ESTADISTICAS = "egreso ticket";
    private ControladorInicial controlador;
    /**
     * Creates new form VistaInicial
     */
    public VistaInicial() {
        initComponents();
    }
    
    public void ejecutar(){
        this.setVisible(true);
    }
    
    public void setControlador(ControladorInicial controlador){
       jButton6.setActionCommand(VISTA_LISTAPEDIDO);
       
       jButton6.addActionListener(controlador);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(5);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1000, 770));
        getContentPane().setLayout(null);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton6.setText("LISTA DE PEDIDOS");
        getContentPane().add(jButton6);
        jButton6.setBounds(160, 410, 310, 160);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariano\\Downloads\\imagenMenuPrincipal.png")); // NOI18N
        jLabel4.setIconTextGap(6);
        jLabel4.setInheritsPopupMenu(false);
        jLabel4.setMaximumSize(new java.awt.Dimension(900, 768));
        jLabel4.setMinimumSize(new java.awt.Dimension(900, 768));
        jLabel4.setName(""); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1300, 768);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
