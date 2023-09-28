/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author DianaArevalo Escriba un programa en el cual se ingrese un valor
 * límite positivo, y a continuación solicite números al usuario hasta que la
 * suma de los números introducidos supere el límite inicial.
 */
public class Ej10SumarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, num, suma;
        suma = 0;
        System.out.println("Ingrese el límite");
        limite = leer.nextInt();

        while (suma < limite) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma = suma + num;
        }
        
        System.out.println("La suma de los números es: " + suma);

    }
    
}
