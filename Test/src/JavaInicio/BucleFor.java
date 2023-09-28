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
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el número " + (i+1));
            num = leer.nextInt();
            if (num <1 || num >20)  
                continue;
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");           
        }
    }    
}
