/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author usuario
 */
public class Comprador extends javax.swing.JFrame {

    /**
     * Creates new form Comprador
     */
    public Comprador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 242, 242));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(219, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Lomejor para tu auto ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 270, 220, 50);

        jLabel6.setBackground(new java.awt.Color(219, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Nuevos Autos");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 60, 150, 50);

        jLabel7.setBackground(new java.awt.Color(219, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Servicio");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 90, 150, 50);

        jLabel8.setBackground(new java.awt.Color(219, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("La mejor atención");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 20, 200, 50);

        jLabel2.setBackground(new java.awt.Color(219, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("NOVEDADES");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 180, 170, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(520, 140, 400, 330);

        jButton2.setBackground(new java.awt.Color(255, 63, 63));
        jButton2.setText("Cerrar Sesión");
        getContentPane().add(jButton2);
        jButton2.setBounds(803, 20, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("COMPRADOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(342, 38, 252, 97);

        jPanel3.setBackground(new java.awt.Color(221, 255, 255));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(214, 242, 242));
        jPanel2.setLayout(null);

        jButton3.setBackground(new java.awt.Color(99, 255, 130));
        jButton3.setText("Actualizar");
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 130, 150, 31);

        jButton1.setBackground(new java.awt.Color(99, 255, 130));
        jButton1.setText("Ver vehiculos");
        jPanel2.add(jButton1);
        jButton1.setBounds(270, 130, 150, 31);

        jLabel5.setBackground(new java.awt.Color(219, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("VEHICULO");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(160, 30, 130, 50);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(20, 140, 490, 270);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("@ConsencionarioNicole");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(170, 450, 170, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Bienvenid@");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 20, 110, 40);

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(nombre);
        nombre.setBounds(120, 20, 150, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 950, 550);

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
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
