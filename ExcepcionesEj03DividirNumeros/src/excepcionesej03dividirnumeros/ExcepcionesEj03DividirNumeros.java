/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej03dividirnumeros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ExcepcionesEj03DividirNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el primer número");
            String num1 = sc.next();
            System.out.println("Ingrese el segundo número");
            int num2 = sc.nextInt();
            int nume1 = Integer.parseInt(num1);
            //int nume2 = Integer.parseInt(num2);
            double res = nume1 / num2;
            System.out.println("El resultado al dividir los dos números es: " + res);
        } catch (NumberFormatException e) {
            System.out.println("Alguno de los números ingresados no es válido");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Valor errado");
        }
    }
}
