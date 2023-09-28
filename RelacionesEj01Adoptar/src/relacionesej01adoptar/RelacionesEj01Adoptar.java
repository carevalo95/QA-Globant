/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej01adoptar;

import Entidades.*;

/**
 *
 * @author DianaArevalo
 */
public class RelacionesEj01Adoptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro m1 = new Perro("Ema","Beagle",2,"Medio");
        //Persona p1 = new Persona("Caro","Arevalo",28,10235,m1);
        Persona p1 = new Persona("Caro","Arevalo",28,10235);
        p1.setMascota(m1);
        
        System.out.println(p1);
    
    }
}