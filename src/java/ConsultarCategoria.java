
import ModeloDAO.CategoriaDAO;
import ModeloDAO.DatosPDAO;
import ModeloDAO.VehiculoDAO;
import ModeloVO.CategoriaVO;
import ModeloVO.DatosPVO;
import ModeloVO.VehiculoVO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class ConsultarCategoria extends javax.swing.JFrame {

     VehiculoVO vehVO = new VehiculoVO();
        VehiculoDAO vehDAO = new VehiculoDAO();
        
        DatosPVO datpVO = new DatosPVO();
        DatosPDAO datpDAO = new DatosPDAO();
        
        
    //ArrayList<VehiculoVO> 
    /**
     * Creates new form ActualizarVehiculo
     */
    public ConsultarCategoria(ArrayList listaC) {
        initComponents();
        setLocationRelativeTo(null);
        //listarCategoria();

        VehiculoVO vehVO = new VehiculoVO();
        VehiculoDAO vehDAO = new VehiculoDAO();
        //TABLA 
        ArrayList<VehiculoVO> lista = listaC;

        DefaultTableModel modelo = new DefaultTableModel();
        Object[] datos = new Object[5];
        modelo = (DefaultTableModel) TablaCat.getModel();

        
        for (int i = 0; i < lista.size(); i++) {
            //PRIMERO EXTRAO 
            vehVO = lista.get(i);

            datos[0] = vehVO.getVehPlaca();
            datos[1] = vehVO.getVehModelo();
            datos[2] = vehVO.getVehMarca();
            datos[3] = vehVO.getVehEstado();
            datos[4] = vehVO.getVehPrecio();


            modelo.addRow(datos);

        }

        TablaCat.setModel(modelo);

        //ME TRAJEELMETODO LISTAR PARA ENVIARLO ALTEXT
        CategoriaVO catVO = new CategoriaVO();
        CategoriaDAO catDAO = new CategoriaDAO();

        ArrayList<CategoriaVO> listaCategorias = catDAO.listar();
        for (int i = 0; i < listaCategorias.size(); i++) {
            catVO = listaCategorias.get(i);

        }
    }

    public void listarCategoria() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        textResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCat = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        botonDatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CATEGORIAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 40, 158, 29);

        marca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marca.setText("Categoria");
        getContentPane().add(marca);
        marca.setBounds(90, 150, 80, 30);
        getContentPane().add(textResultado);
        textResultado.setBounds(90, 390, 410, 80);

        jButton1.setText("Volver al Men??");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 443, 110, 40);

        TablaCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "MARCA", "MODELO", "ESTADO(COLOR)", "PRECIO"
            }
        ));
        TablaCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 220, 800, 150);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 260, 73, 23);

        botonDatos.setText("Datos");
        getContentPane().add(botonDatos);
        botonDatos.setBounds(753, 180, 80, 30);

        jLabel2.setText("Seleccione el vehiculo para ver los datos del vendedor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 390, 410, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//       Menu menu = new Menu();
//        menu.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCatMouseClicked
       
        
        int fila=TablaCat.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "Categoria vehiculo no seleccionado");
            
        }else{
            
            String placa =TablaCat.getValueAt(fila, 0).toString();
            vehVO = (VehiculoVO)vehDAO.consultarPlaca(placa);
            String datosId = vehVO.getDatosId();
            
            datpVO = (DatosPVO)datpDAO.consultarId(datosId);
            JOptionPane.showMessageDialog(null,"Nombre vendedor: " +datpVO.getDatNombre() +  " " + datpVO.getDatApellido() + " Telefono de contacto: " + datpVO.getDatTelefono());
            
            
        }
        
    }//GEN-LAST:event_TablaCatMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCat;
    private javax.swing.JButton botonDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel textResultado;
    // End of variables declaration//GEN-END:variables
}
