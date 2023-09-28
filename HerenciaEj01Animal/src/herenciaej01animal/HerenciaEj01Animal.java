/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej01animal;

import Entidades.*;

/**
 *
 * @author 57312
 */
public class HerenciaEj01Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.alimentar();
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentar();
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato.alimentar();
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentar();
    }
}
