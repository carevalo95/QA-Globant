/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_poo;

import entidades.Rectangulo;
import servicios.RectanguloServicio;

/**
 *
 * @author Daniel
 */
public class Ejercicio4_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        
        System.out.println("La superficie es: "+ rs.calcularSuperficie(r1));
        System.out.println("El perimetro es: "+ rs.calcularPerimetro(r1));
        System.out.println("");
        rs.dibujarRectangulo(r1);
        
        
    }
    
}
