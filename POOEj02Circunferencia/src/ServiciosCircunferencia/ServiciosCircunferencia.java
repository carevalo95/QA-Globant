/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosCircunferencia;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosCircunferencia {
    
    public Circunferencia CrearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el radio de la circunferencia");
        return new Circunferencia(leer.nextDouble());
        
    }
    
    public double CalcularArea(double radio){
        return (Math.pow(radio, 2))*(Math.PI);
    }
    
    public double CalcularPerimetro(double radio){
        return 2*(Math.PI)+radio;
    }
}
