/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12clasepersonaydate;

import Entidades.Persona;
import Servicios.ServiciosPersona;
import java.util.Scanner;

/**
 *
 * @author 57312
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class POOEJ12ClasePersonaYDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosPersona sp = new ServiciosPersona();
        Persona p = sp.crearPersona();
        System.out.println("Tu edad es: " + sp.calcularEdad(p) + " años");
        
        System.out.println("Ingrese la edad a comparar");
        int edadCompare = leer.nextInt();
        if (p.menorQue(edadCompare)) {
            System.out.println("La persona previamente creada es menor");
        }else{
            System.out.println("La persona previamente creada NO es menor");
        }
        
        sp.mostrarPersona(p);
    }
    
}
