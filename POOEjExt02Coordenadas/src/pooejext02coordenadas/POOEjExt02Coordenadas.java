/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext02coordenadas;

import Entidades.Puntos;
import Servicios.ServiciosPuntos;

/**
 *
 * @author 57312
 */
public class POOEjExt02Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ServiciosPuntos sp = new ServiciosPuntos();
        Puntos p = sp.crearPuntos();
        sp.calcularDistancia(p);
    }
    
}
