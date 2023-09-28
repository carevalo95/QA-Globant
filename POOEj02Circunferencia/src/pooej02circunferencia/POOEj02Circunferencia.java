/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02circunferencia;

import Entidades.Circunferencia;
import ServiciosCircunferencia.ServiciosCircunferencia;

/**
 *
 * @author 57312
 */
public class POOEj02Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCircunferencia sc = new ServiciosCircunferencia();
        Circunferencia ci = sc.CrearCircunferencia();
        System.out.println("El área de la circunferencia es: " + sc.CalcularArea(ci.getRadio()));
        System.out.println("El perímetro de la circunferencia es: " + sc.CalcularPerimetro(ci.getRadio()));

    }

}
