/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CategoriaVO;
import Util.Conexión;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class CategoriaDAO extends Conexión{
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operaciones = false;
    private String sql;
    
    public CategoriaDAO (){
    }
    
    public  ArrayList<CategoriaVO> listar(){
        
        ArrayList<CategoriaVO>listaCategorias= new ArrayList<>();
        try {
            conexion= this.obtenerConexión();
            sql="select * from categoria";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while(mensajero.next()){
                
                CategoriaVO  catVO = new CategoriaVO(mensajero.getString(1), mensajero.getString(2));

                listaCategorias.add(catVO);
                
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null,e);
        }finally{
            try {
                this.cerrarConexión();
                
            } catch (SQLException e) {
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
           return listaCategorias; 
    }
    
    
    public  ArrayList<CategoriaVO> listarCategoria(String tipo){
        
        ArrayList<CategoriaVO>listaTipo= new ArrayList<>();
        try {
            conexion= this.obtenerConexión();
            sql="SELECT * FROM `categoria` WHERE CATIPO=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, tipo);
            mensajero = puente.executeQuery();
            
            while(mensajero.next()){
                
                CategoriaVO  catVO = new CategoriaVO(mensajero.getString(1), mensajero.getString(2));

                listaTipo.add(catVO);
                
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null,e);
        }finally{
            try {
                this.cerrarConexión();
                
            } catch (SQLException e) {
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
           return listaTipo; 
    }
}
