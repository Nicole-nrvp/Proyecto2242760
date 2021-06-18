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
public class CategoriaVO {
    
    String catId, caTipo;

    public CategoriaVO() {
    }

    public CategoriaVO(String catId, String catTipo) {
        this.catId = catId;
        this.caTipo = catTipo;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatTipo() {
        return caTipo;
    }

    public void setCatTipo(String catTipo) {
        this.caTipo = catTipo;
    }
    
    
}
