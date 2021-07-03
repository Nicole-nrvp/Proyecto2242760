/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.VehiculoVO;
import Util.Conexión;
import Util.Crud;
import com.mysql.jdbc.StringUtils;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class VehiculoDAO extends Conexión implements Crud{
    //LOS DAO HEREDAN DE LA CLASE CONEXION DE BD////////// ARRIBA EN LA CLASE PRINCIPAL

    //1. DECLARAR VARIABLES U OBEJTOS////////////////////////////////////////////////
    
    //objetos SIEMPREEEEE
    private Connection  conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    //variables de tipo boolean mejor por defecto
    private boolean operaciones = false;
    private String sql;
    private String vehPlaca="", datId="", catId="", vehModelo="", vehMarca="", vehEstado="", vehPrecio=""; 

    public VehiculoDAO() {
    }
     
    //2. EL METODO PRINCIPAL PARA RECIBIR LOS DATOS DEL VO (CONSTRUCTOR) ///////////////CUANDO SE EJECUTA LA CLASE Y SE LLAMA IGUAL A LA CLASE/////////////
                    //usuVO ES LO QUE TRAEMOS DEL VO
    public VehiculoDAO(VehiculoVO vehVO){
        super();
        
        try {
            conexion = this.obtenerConexión();
            vehPlaca = vehVO.getVehPlaca();
            datId = vehVO.getDatosId();
            catId = vehVO.getCategoriaId();
            vehModelo = vehVO.getVehModelo();
            vehMarca = vehVO.getVehMarca();
            vehEstado = vehVO.getVehEstado();
            vehPrecio = vehVO.getVehPrecio();
            
        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);  
        }
  
    }

    @Override
    public boolean agregarRegistro() {
         try {
            sql="insert into vehiculo value(?,?,?,?,?,?,?)";
            //crear un puente para la conexion y envia la setencia sql 
            puente = conexion.prepareStatement(sql);
            ///envia atributos por set 
            puente.setString(1, vehPlaca);
            puente.setString(2, datId);
            puente.setString(3, catId);
            puente.setString(4, vehModelo);
            puente.setString(5, vehMarca);
            puente.setString(6, vehEstado);
            puente.setString(7, vehPrecio);
            
            //YA EJECUTO ESTO
            puente.executeUpdate();
            operaciones= true;
            
        } catch (SQLException e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
        } finally{
            try {
                this.cerrarConexión();
                
            } catch (SQLException e) {
             Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
           return operaciones;
    }


    @Override
    public boolean actualizarRegistro() {
try {
    
            //UPDATE `cliente` SET `CLI_APELLIDO` = 'ELITEEE' WHERE `cliente`.`CLI_ID` = 1;
            sql="update vehiculo set DATID=?, CATID=?, VEHMODELO=?, VEHMARCA=?, VEHESTADO=?, VEHPRECIO=? where VEHPLACA=?";
            //crear un puente para la conexion y envia la setencia sql 
            puente = conexion.prepareStatement(sql);
            ///envia atributos por set 
            puente.setString(1, datId);
            puente.setString(2, catId);
            puente.setString(3, vehModelo);
            puente.setString(4, vehMarca);
            puente.setString(5, vehEstado);
            puente.setString(6, vehPrecio);
            puente.setString(7, vehPlaca);

//            jTextField2Producto.setText(mensajero.getString(1));
//                jTextField1Precio.setText(mensajero.getString(2));
            //YA EJECUTO ESTO
            puente.executeUpdate();
            operaciones= true;
            
        } catch (SQLException e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
        } finally{
            try {
                this.cerrarConexión();
                
            } catch (SQLException e) {
             Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
           return operaciones;    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //METODOS PROPIOS
    public  VehiculoVO consultarPlaca(String placa){
        
        VehiculoVO vehVO = null;
        try {
             conexion= this.obtenerConexión();
            sql="select * from vehiculo where VEHPLACA= ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, placa);
            mensajero = puente.executeQuery();
            while(mensajero.next()){
                
                vehVO = new VehiculoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),
                        mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7));
            }
            
        } catch (Exception e) {
           Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
          
        }
//        finally{
//            try {
////                this.cerrarConexión();
//                
//            } catch (Exception e) {
//             Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
//            }
//        }
           return vehVO;    
    }
    
    //LISTA DE MUCHOS VEHICULOS
    //RETORNA UN ARRAYLIST
    public  ArrayList<VehiculoVO>listar(){
        ArrayList<VehiculoVO>listaVehiculos= new ArrayList<>();
        try {
            conexion= this.obtenerConexión();
            sql="select * from vehiculo";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while(mensajero.next()){
                VehiculoVO  vehVO = new VehiculoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),
                        mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7));
                
                listaVehiculos.add(vehVO);
            }
        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);}
//        }finally{
//            try {
//                this.cerrarConexión();
//                
//            } catch (SQLException e) {
//             Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
//            }
//        }
           return listaVehiculos; 
    }
    
     public  ArrayList<VehiculoVO> consultarporCategoria(String categoria){
         
         ArrayList <VehiculoVO> traerVehiculos = new ArrayList<>();

        try {
             conexion= this.obtenerConexión();
            sql="select * from vehiculo where CATID= ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, categoria);
            mensajero = puente.executeQuery();
            while(mensajero.next()){
                
            VehiculoVO vehVO = new VehiculoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),
                        mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7));
            traerVehiculos.add(vehVO);
            }
            
        } catch (Exception e) {
           Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
        }finally{
            try {
                this.cerrarConexión();
                
            } catch (SQLException e) {
             Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
           return traerVehiculos;  
           
     }
}
    