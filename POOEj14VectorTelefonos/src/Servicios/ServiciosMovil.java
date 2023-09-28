/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosMovil {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular(){
        Movil m = new Movil();
        System.out.println("Información del móvil");
        System.out.println("Marca");
        m.setMarca(leer.next());
        System.out.println("Precio");
        m.setPrecio(leer.nextInt());
        System.out.println("Modelo");       
        m.setModelo(leer.next());
        System.out.println("Memoria RAM");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("Almacenamiento");
        m.setAlmacenamiento(leer.nextInt());
        ingresarCodigo(m);
        return m;
        
    }
    
    public void ingresarCodigo(Movil m){
        int[] aux = new int[m.getCodigo().length];
        System.out.println("Ingresar código (" + m.getCodigo().length + " digitos)");
        String cod = leer.next();
        while(cod.length() != m.getCodigo().length){
            System.out.println("Ingresar código (" + m.getCodigo().length + " digitos)");
            cod = leer.next();
        }
        for (int i = 0; i < aux.length; i++) {
            aux[i] = Character.getNumericValue(cod.charAt(i));
        }
        m.setCodigo(aux);
    }
}
