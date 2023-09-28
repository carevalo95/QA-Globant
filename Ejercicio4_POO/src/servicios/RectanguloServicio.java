/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class RectanguloServicio {
    
    public Rectangulo crearRectangulo(){
        
        
        Scanner leer = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingrese la base del rectangulo");
        r.setBase(leer.nextDouble());
        
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(leer.nextDouble());
        
        return r;
        
    }
       
    public double calcularSuperficie(Rectangulo r){
        
        double superficie = r.getBase() * r.getAltura();
        
        return superficie;
        
    }
    public double calcularPerimetro(Rectangulo r){
        
        double perimetro =( r.getBase() + r.getAltura()) * 2;
        
        return perimetro;
        
    }
    
    public void dibujarRectangulo(Rectangulo r){
        double base = r.getBase();
        double altura = r.getAltura();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
    
}
