/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import Servicios.ServicioMascota;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author 57312
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioMascota sm = new ServicioMascota();
        
        /*forma manual
        Mascota m1 = new Mascota();
      
        m1.nombre = "Ema";
        m1.apodo = "negra";
         */
        
        /*Forma manual usando constructores
        Mascota m1 = new Mascota("Ema", "Negra", "gato");
        System.out.println("Ingrese la edad de " + m1.getApodo());
        m1.setEdad(leer.nextInt());
        System.out.println("La nueva mascota tiene los siguiente atributos:\n"
                + "Su nombre es: " + m1.getNombre() + "\nSu apodo es: " + m1.getApodo() + "\n"
                + "Su tipo es: " + m1.getTipo()+"\nSu edad es: "+m1.getEdad()+" años");
         */
        
        
        //Usando los métodos de la clase servicios
        
        Mascota m1 = sm.crearMascota();
        m1.pasear(100);
        System.out.println(m1);
        m1.pasear(50, 4);

        //usando la función toString
        System.out.println(m1);

    }
}
