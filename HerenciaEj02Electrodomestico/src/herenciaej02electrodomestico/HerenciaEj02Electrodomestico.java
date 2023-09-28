/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej02electrodomestico;

import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author 57312
 */
public class HerenciaEj02Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor tele = new Televisor();
        tele.crearTelevisor();
        tele.precioFinal();
        System.out.println(tele);
        Lavadora lava = new Lavadora();
        lava.crearLavadora();
        lava.precioFinal();
        System.out.println(lava);

        Televisor tele1 = new Televisor(45, true, "Negro", 'C', 10);
        Televisor tele2 = new Televisor(15, false, "Blanco", 'D', 25);
        Lavadora lava1 = new Lavadora(19, "Gris", 'A', 50);
        Lavadora lava2 = new Lavadora(9, "Roja", 'F', 30);
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);
        electrodomesticos.add(lava1);
        electrodomesticos.add(lava2);

        double totalTelevisores = 0;
        double totalLavadoras = 0;
        double total = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            System.out.println("Precio electrodoméstico: " + electrodomestico.getPrecio());
            total += electrodomestico.getPrecio();
            if (electrodomestico instanceof Lavadora) {
                totalLavadoras += electrodomestico.getPrecio();
            } else {
                totalTelevisores += electrodomestico.getPrecio();
            }
        }
        System.out.println("Estos son los totales:\nTotal Televisores: " + totalTelevisores + "\nTotal Lavadoras " + totalLavadoras + "\nTotal Electrodomésticos: " + total);
    }

}
