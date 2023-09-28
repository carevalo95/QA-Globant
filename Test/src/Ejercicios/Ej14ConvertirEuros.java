/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class Ej14ConvertirEuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        byte opc;
        String moneda = "";
        System.out.println("Ingrese el número de Euros a convertir");
        euros = leer.nextDouble();

        do {
            System.out.println("Seleccione la moneda a convertir:\n1.Dólares\n2.Yenes\n3.Libras");
            opc = leer.nextByte();
        } while (opc < 1 || opc > 3);

        switch (opc) {
            case 1:
                moneda = "Dólares";
                break;
            case 2:
                moneda = "Yenes";
                break;
            case 3:
                moneda = "Libras";
                break;
            default:
                System.out.println("Ha ingresado una opción incorrecta");
        }
        ConvertirEuros(euros, moneda);

    }

    public static void ConvertirEuros(double euro, String moneda) {

        double conversion = 0;
        switch (moneda) {
            case "Dólares":
                conversion = euro * (1.28611);
                break;
            case "Yenes":
                conversion = euro * (129.852);
                break;
            case "Libras":
                conversion = euro * (0.86);
                break;
        }
        System.out.println(euro + " Euros es igual a " + conversion + " " + moneda);

    }
}
