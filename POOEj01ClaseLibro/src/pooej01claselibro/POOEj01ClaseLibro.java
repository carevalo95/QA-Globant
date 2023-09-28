/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01claselibro;

import Entidades.Libro;
import Servicios.ServiciosLibro;

/**
 *
 * @author 57312
 */
public class POOEj01ClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosLibro sl = new ServiciosLibro();
        Libro Lib1 = sl.CargarLibro();
        sl.MostrarDatosLibro(Lib1);
        
        
    }
    
}
