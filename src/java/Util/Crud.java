/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author usuario
 */
public interface Crud {
    
    //se define el metodo publico abstracto porque estamos utilizando abstracion
    //boolean es el tipo de metodo y agregar es el nombre del metodo
    public abstract boolean agregarRegistro();
    public abstract boolean actualizarRegistro();
    public abstract boolean eliminarRegistro();

        

}
