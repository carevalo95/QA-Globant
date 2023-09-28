/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej05peliculas;

import Servicios.ServicioPelicula;

/**
 *
 * @author DianaArevalo
 */
public class ColeccionesEj05Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        sp.cargarPeliculas();
    }
    
}
