/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro li = new Libro();
        System.out.println("Ingrese el nombre del libro");
        li.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        li.setAutor(leer.next());
        System.out.println("Ingrese el número de ejemplares");
        li.setEjemplares(leer.nextInt());
        do {
            System.out.println("Ingrese el número de ejemplares prestados");
            li.setPrestados(leer.nextInt());
            if (li.getPrestados() > li.getEjemplares()) {
                System.out.println("El número de libros prestados no puede ser mayor al número"
                        + " de ejemplares existentes");
            }
        } while (li.getPrestados() > li.getEjemplares());
        return li;
    }

    public void mostrarLista(HashSet libros) {
        if (libros.size() > 0) {
            System.out.println("Libros disponibles:");
            libros.forEach((libro) -> {
                System.out.println(libro);
            });
        } else {
            System.out.println("Aún no hay libros, ve a crear algunos");
        }

    }

    public Libro buscarLibro(HashSet libros) {
        ArrayList<Libro> librosA = new ArrayList(libros);
        boolean encontrado = false;
        Libro li = new Libro();
        System.out.println("Ingrese el nombre del libro a buscar");
        String nombre = leer.next();
        for (Libro libro : librosA) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                li = libro;
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El libro no se encuentra en la librería");
        }
        return li;
    }

    public void prestamo(Libro li) {
        if ((li.getEjemplares() - li.getPrestados()) > 0) {
            li.setPrestados(li.getPrestados() + 1);
            System.out.println("Préstamo registrado correctamente");
        } else {
            System.out.println("No se poseen ejemplares disponibles");
        }
    }

    public void devolucion(Libro li) {
        li.setPrestados(li.getPrestados() - 1);
        System.out.println("Devolución registrada correctamente");
    }

    public void eliminarLibro(HashSet libros, Libro li) {
        libros.remove(li);
        System.out.println("Libro eliminado correctamente");
    }
}
