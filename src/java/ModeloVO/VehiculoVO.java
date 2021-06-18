/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author usuario
 */
public class VehiculoVO {
    //declarar los atributos del modulo
    private String vehPlaca, datId, catId, vehModelo, vehMarca, vehEstado, vehPrecio;

    public VehiculoVO(String vehPlaca, String datId, String catId, String vehModelo, String vehMarca, String vehEstado, String vehPrecio) {
        this.vehPlaca = vehPlaca;
        this.datId = datId;
        this.catId = catId;
        this.vehModelo = vehModelo;
        this.vehMarca = vehMarca;
        this.vehEstado = vehEstado;
        this.vehPrecio = vehPrecio;
    }

//    public VehiculoVO(String vehPlaca, String vehModelo, String vehMarca, String vehEstado, String vehPrecio) {
//        this.vehPlaca = vehPlaca;
//        this.vehModelo = vehModelo;
//        this.vehMarca = vehMarca;
//        this.vehEstado = vehEstado;
//        this.vehPrecio = vehPrecio;
//    }
    
   //CONSTRUCTOR SIEMPRE DE PRIMERAS
//    public VehiculoVO(String vehPlaca, String datosId, String categoriaId, String vehModelo, String vehMarca, String vehEstado, String vehPrecio) {
//        this.vehPlaca = vehPlaca;
//        this.datId = datosId;
//        this.catId = categoriaId;
//        this.vehModelo = vehModelo;
//        this.vehMarca = vehMarca;
//        this.vehEstado = vehEstado;
//        this.vehPrecio = vehPrecio;
//    }
    //inserto un constructor 2 VACIO PARA MANDAR DATOS CON UN QUERY
    public VehiculoVO() {
    }
    //constructor lleno 1 PARA RECIBIR DATOS
    
    //realizo el gett and sett (insertar codigo y allí)
    public String getVehPlaca() {
        return vehPlaca;
    }

    public void setVehPlaca(String vehPlaca) {
        this.vehPlaca = vehPlaca;
    }

    public String getDatosId() {
        return datId;
    }

    public void setDatosId(String datosId) {
        this.datId = datosId;
    }

    public String getCategoriaId() {
        return catId;
    }

    public void setCategoriaId(String categoriaId) {
        this.catId = categoriaId;
    }

    public String getVehModelo() {
        return vehModelo;
    }

    public void setVehModelo(String vehModelo) {
        this.vehModelo = vehModelo;
    }

    public String getVehMarca() {
        return vehMarca;
    }

    public void setVehMarca(String vehMarca) {
        this.vehMarca = vehMarca;
    }

    public String getVehEstado() {
        return vehEstado;
    }

    public void setVehEstado(String vehEstado) {
        this.vehEstado = vehEstado;
    }

    public String getVehPrecio() {
        return vehPrecio;
    }

    public void setVehPrecio(String vehPrecio) {
        this.vehPrecio = vehPrecio;
    }
    
    
}
