/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author usuario
 */
public class Articulo {

    private String pvp;
    private String id;
    private String stock;

    public Articulo(String pvp, String id, String stock) {
        this.pvp = pvp;
        this.id = id;
        this.stock=stock;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }


    public String getPvp() {
        return pvp;
    }

    public String getId() {
        return id;
    }



    public void setPvp(String pvp) {
        this.pvp = pvp;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

}
