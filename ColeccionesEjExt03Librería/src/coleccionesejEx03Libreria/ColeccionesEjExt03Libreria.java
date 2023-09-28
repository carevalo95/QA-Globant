/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejEx03Libreria;

import Entidades.Libro;
import Servicios.ServicioLibro;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class ColeccionesEjExt03Libreria {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();

        HashSet<Libro> libreria = new HashSet();

        boolean salir = false;
        int op = 0;
        do {
            System.out.println("Menú\n1.Crear libro\n2.Registrar préstamo\n3.Registrar devolución\n4.Listar libros\n5.Eliminar un libro\n6.Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    do {
                        libreria.add(sl.crearLibro());
                        System.out.println("¿Desea crear un nuevo libro? 1.SI 2.NO");
                        int opc = leer.nextInt();
                        if (opc == 2) {
                            salir = true;
                        }
                    } while (!salir);
                    sl.mostrarLista(libreria);
                    break;
                case 2:
                    Libro li = sl.buscarLibro(libreria);
                    if (li.getTitulo() != null) {
                        sl.prestamo(li);
                    }
                    break;
                case 3:
                    li = sl.buscarLibro(libreria);
                    if (li.getTitulo() != null) {
                        sl.devolucion(li);
                    }
                    break;
                case 4:
                    sl.mostrarLista(libreria);
                    break;
                case 5:
                    li = sl.buscarLibro(libreria);
                    if (li.getTitulo() != null) {
                        sl.eliminarLibro(libreria, li);
                    }
                    break;
                case 6:
                    op = 6;
                    break;
            }
        } while (op != 6);

    }
}
