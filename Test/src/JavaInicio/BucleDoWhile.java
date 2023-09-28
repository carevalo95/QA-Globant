/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInicio;

import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class BucleDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma, cont;
        suma = 0;
        cont = 0;
        do {
            System.out.println("Ingrese el número " + (cont+1));
            num = leer.nextInt();
            if (num < 0) 
                continue;            
            suma += num;
            cont++;
            if (num == 0){ 
                System.out.println("Se capturó el número cero");
            break;
            }
        } while (cont < 20);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
