/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tienda;


import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Compra {
    void compra(ArrayList<Articulo> A, String id, String pvp, String cantidad)
    {
        Articulo a = new Articulo (pvp, id, cantidad);
        A.add(a);
    }
    
    
}
