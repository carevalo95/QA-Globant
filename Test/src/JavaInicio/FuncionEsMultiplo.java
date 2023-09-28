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
public class FuncionEsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      EsMultiplo();    
        
    }
    
    public static void EsMultiplo (){
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        
        if (num1%num2==0) {
            System.out.println("El número "+num1+" es múltiplo de "+num2);
        }
        else{
            System.out.println("El número "+num1+" No es múltiplo de "+num2);
        }
    }
}
