/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Comprador;
import Vista.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ControladorUsuario {
    
    public void rolVendedor() {
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        
    }
    
    public void rolComprador() {
        Comprador comprador = new Comprador();
        comprador.setVisible(true);
    }
    
}
