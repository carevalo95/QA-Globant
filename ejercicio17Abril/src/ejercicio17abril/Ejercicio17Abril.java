/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17abril;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author 57312
 */
public class Ejercicio17Abril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double producto, subtotal = 0;
        int cantidad = 0;
        boolean error = true;

        do {
            try {
                ArrayList<Double> valores = new ArrayList();
                System.out.println("¿Cuántos productos desea registrar?");
                cantidad = sc.nextInt();
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Dígite el valor del primer producto:");
                    producto = sc.nextDouble();
                    valores.add(producto);
                    subtotal = subtotal + producto; 
                }
                error = false;
            } catch (Exception e) {
                System.out.println("Digite valores válidos");
                //error = false;
            }
            //error = false;
        } while (error);

        generarFactura a = new generarFactura();
        double Iva = a.calcularIva(subtotal);
        double total = a.calcularTotal(subtotal, Iva);

        System.out.println("El subtotal de la factura es: " + subtotal + "\nEl valor del iva de la factura es: " + Iva + "\nEl valor total de la factura es: " + total);
    }

}
