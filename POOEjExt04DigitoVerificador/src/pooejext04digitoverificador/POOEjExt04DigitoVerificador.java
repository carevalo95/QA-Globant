/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext04digitoverificador;

import Entidades.NIF;
import Servicios.ServiciosNif;

/**
 *
 * @author 57312
 */
public class POOEjExt04DigitoVerificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosNif sn = new ServiciosNif();
        NIF n = new NIF();
        sn.crearNIF();
        sn.mostrar(n);
    }

}
