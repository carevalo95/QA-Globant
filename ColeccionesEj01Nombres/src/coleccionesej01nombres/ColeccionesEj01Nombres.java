/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej01nombres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class ColeccionesEj01Nombres {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<String> razas = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean salir = false;

        do {
            System.out.println("Ingrese una raza de perro");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("¿Desea salir? ingrese 1.SI 2. NO");
            int opc = leer.nextInt();
            if (opc == 1) {
                salir = true;
            }
        } while (!salir);

        System.out.println(razas.toString());
    }

    public static void ordenarArray() {
        Collections.sort(razas);
    }

    public static void eliminarRaza() {

        System.out.println("Ingresa la raza que deseas eliminar");
        String razaE = leer.next();

        for (int i = 0; i < razas.size(); i++) {
            if (razas.get(i).equals(razaE)) {
                razas.remove(i);
            }
        }
    }

    public static void mostarRazas() {
        System.out.println(razas.toString());
    }

}
