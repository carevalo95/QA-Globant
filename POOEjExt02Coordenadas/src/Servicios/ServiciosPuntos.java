/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosPuntos {
    Scanner leer = new Scanner(System.in);
    Puntos p = new Puntos();
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese la coordenada x1");
        p.setX1(leer.nextDouble());
        System.out.println("Ingrese la coordenada y1");        
        p.setY1(leer.nextDouble());
        System.out.println("Ingrese la coordenada x2");
        p.setX2(leer.nextDouble());
        System.out.println("Ingrese la coordenada y2");        
        p.setY2(leer.nextDouble());
        return p;
    }
    
    public void calcularDistancia(Puntos p){
        double distancia;
        distancia = Math.sqrt(Math.pow((p.getX2()-p.getX1()),2)+ Math.pow(p.getY2()-p.getY1(), 2));
        System.out.println("La distancia entre los dos puntos ingresados es: "+distancia);
       
    }
}
