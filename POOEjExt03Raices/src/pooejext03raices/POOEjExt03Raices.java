/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext03raices;

import Entidades.Raices;
import Servicios.ServiciosRaices;

/**
 *
 * @author 57312
 */
public class POOEjExt03Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosRaices sr = new ServiciosRaices();
        Raices r = new Raices(4,4,1);
        System.out.println("El valor discriminante es: "+sr.getDiscrimate(r));
        sr.calcular(r);        
    }
    
}
