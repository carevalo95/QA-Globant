/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import clases.Operaciones;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class Calculadora {

    static Operaciones op;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        op = new Operaciones();
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        int opcion = 0;
        boolean valido = false;
        double result = 0;
        do {
            System.out.println("CALCULADORA\n\nElija el tipo de operación que desea realizar\n1 Tipo a + b"
                    + "\n2 Tipo a - b"
                    + "\n3 Tipo a / b"
                    + "\n4 Tipo a * b"
                    + "\n5 Tipo a^2"
                    + "\n6 Tipo (a + b)/2"
                    + "\n7 Tipo (a - b)/2"
                    + "\n8 Tipo (a + b)^2"
                    + "\n9 Tipo (a - b)^2"
                    + "\n0 Salir");

            opcion = sc.nextInt();
            if (opcion != 0) {

                do {
                    System.out.println("Ingrese el primer número");
                    try {
                        num1 = sc.nextDouble();
                        valido = true;
                    } catch (InputMismatchException ime) {
                        System.out.println("Ingrese un número válido");
                        sc.next();
                    }
                } while (!valido);

                valido = false;

                if (opcion != 5) {

                    do {
                        System.out.println("Ingrese el segundo número");
                        try {
                            num2 = sc.nextDouble();
                            if (opcion == 3 && num2 == 0) {
                                System.out.println("No es posible dividir por cero");
                            } else {
                                valido = true;
                            }
                        } catch (InputMismatchException ime) {
                            System.out.println("Ingrese un número válido");
                            sc.next();
                        }
                    } while (!valido);

                    valido = false;
                }
                switch (opcion) {
                    case 1:
                        result = op.suma(num1, num2);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 2:
                        result = op.resta(num1, num2);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 3:
                        result = op.division(num1, num2);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 4:
                        result = op.multiplicacion(num1, num2);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 5:
                        result = op.multiplicacion(num1, num1);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 6:
                        double opera1 = op.suma(num1, num2);
                        result = op.division(opera1, 2);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 7:
                        double opera2 = op.resta(num1, num2);
                        result = op.division(opera2, 2);
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 8:
                        double opera3 = op.multiplicacion(num1, num1);
                        double opera4 = (op.multiplicacion(num1, num2)) * 2;
                        double opera5 = op.multiplicacion(num2, num2);
                        result = opera3 + opera4 + opera5;
                        System.out.println("El resultado de la operación es " + result);
                        break;
                    case 9:
                        double opera6 = op.multiplicacion(num1, num1);
                        double opera7 = (op.multiplicacion(num1, num2)) * 2;
                        double opera8 = op.multiplicacion(num2, num2);
                        result = opera6 - opera7 + opera8;
                        System.out.println("El resultado de la operación es " + result);
                        break;
                }
            }
        } while (opcion != 0);
    }

}
