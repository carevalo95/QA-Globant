/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosLibro {
    
    
    public Libro CargarLibro(){
        Libro L1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el código ISBN del libro");
        L1.setISBN(leer.nextInt());
        System.out.println("Por favor ingrese el título del libro");
        L1.setTitulo(leer.next());
        System.out.println("Por favor ingrese el autor del libro");
        L1.setAutor(leer.next());
        System.out.println("Por favor ingrese el número de páginas del libro");
        L1.setPaginas(leer.nextInt());
        return L1;
    }
    
    public void MostrarDatosLibro(Libro L){
        System.out.println(L);
    }
}
