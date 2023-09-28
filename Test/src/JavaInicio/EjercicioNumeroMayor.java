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
public class EjercicioNumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();

        if (num1 > 25) {
            if (num2 > 25) {
                System.out.println("Ambos números son mayores a 25");
            } else {
                System.out.println("Solo el primer número es mayor a 25");
            }
        } else if (num2 > 25) {
            System.out.println("Solo el segundo número es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
        
        //esto es un if sin llaves
        if (num2==25)
        System.out.println("Entró al if sin llaves");
        
        System.out.println("Ahora vamos a ahcer otra cosa");
        
    }
}
