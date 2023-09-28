/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Entidad.*;
import Servicio.*;
import java.util.*;

/**
 *
 * @author david
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServicioProducto svp = new ServicioProducto();
        svp.opciones();
    }
}
