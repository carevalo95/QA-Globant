/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();

    public void crearPelicula() {

        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese el titulo de la película");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del director de la película");
        p1.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película");
        p1.setDuracion(leer.nextDouble());
        peliculas.add(p1);
        System.out.println("Película creada");

    }

    public void mostrarLista() {
        System.out.println(peliculas);
    }

    public ArrayList listarPelisMay1hora() {
        ArrayList<Pelicula> mayorUnaHora = new ArrayList();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                mayorUnaHora.add(pelicula);
            }
        }
        return mayorUnaHora;
    }

    public void cargarPeliculas() {
        int opc = 1;
        do {
            crearPelicula();
            System.out.println("¿Desea crear otra película? 1.SI 2.NO");
            opc = leer.nextInt();
        } while (opc == 1);

        System.out.println("Lista de películas");
        mostrarLista();
        System.out.println("------------------");
        System.out.println("Lista de películas con duración mayor a una hora");
        ArrayList mayor = listarPelisMay1hora();
        System.out.println(mayor.toString());
        System.out.println("------------------");
        System.out.println("Películas ordenadas por mayor duración");
        peliculas.sort(Comparadores.ordenarPorDuracionDesc);
        mostrarLista();
        System.out.println("------------------");
        System.out.println("Películas ordenadas por menor duración");
        peliculas.sort(Comparadores.ordenarPorDuracionAsc);
        mostrarLista();
        System.out.println("------------------");
        System.out.println("Películas ordenadas por título");
        peliculas.sort(Comparadores.ordenarPorTitulo);
        mostrarLista();
        System.out.println("------------------");
        System.out.println("Películas ordenadas por director");
        peliculas.sort(Comparadores.ordenarPorDirector);
        mostrarLista();
    }
}
