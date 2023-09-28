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
public class Ej11MenuOperarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        double num1, num2;
        char salir;
        boolean sesion = true;
        System.out.println("Ingrese el primer número");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextDouble();

        do {
            System.out.println("Seleccione una opción:\n1.Sumar\n2.Restar\n"
                    + "3.Multiplicar\n4.Dividir\n5.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Sumar(num1, num2);
                    break;
                case 2:
                    Restar(num1, num2);
                    break;
                case 3:
                    Multiplicar(num1, num2);
                    break;
                case 4:
                    Dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Esta seguro de salir (S/N)");
                    salir = leer.next().toUpperCase().charAt(0);
                    if (salir=='S') {
                        sesion = false;
                    }
                    break;
                default:
                    System.out.println("La opción ingresada es incorrrecta");
                    break;
            }
        } while (sesion);

    }

    public static void Sumar(double num1, double num2) {
        System.out.println("La suma de los números es: " + (num1 + num2));
    }

    public static void Restar(double num1, double num2) {
        System.out.println("La resta de los números es: " + (num1 - num2));
    }

    public static void Multiplicar(double num1, double num2) {
        System.out.println("La multiplicación de los números es: " + (num1 * num2));
    }

    public static void Dividir(double num1, double num2) {
        System.out.println("La división de los números es: " + (num1 / num2));
    }
}
