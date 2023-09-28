/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosRaices {

    Scanner leer = new Scanner(System.in);
    Raices r = new Raices();

    public double getDiscrimate(Raices r) {
        return (Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(Raices r) {
//        if (d == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return getDiscrimate(r) > 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscrimate(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double sol1 = (-r.getB() + Math.sqrt(getDiscrimate(r))) / (2 * r.getA());
            double sol2 = (r.getB() - Math.sqrt(getDiscrimate(r))) / (2 * r.getA());
            System.out.println("Solución 1: " + sol1);
            System.out.println("Solución 1: " + sol2);
        } else {
            System.out.println("La ecuación no tiene dos soluciones");
        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double sol = r.getB() / (2 * r.getA());
            System.out.println("La única solución es: " + sol);
        } else {
            System.out.println("No tiene solución");
        }
    }

    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene solución");
        }
    }
}
