/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesdesafiotienda;

import java.util.*;

import Entidades.Producto;
import Servicios.ServicioProducto;
import Entidades.Tienda;

/**
 *
 * @author DianaArevalo
 */
public class ColeccionesDesafioTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Producto> productos = new ArrayList<Producto>();
        ServicioProducto sp = new ServicioProducto();
        Tienda tienda = new Tienda();
        boolean salir = true;

        do {

            System.out.println("----MENU-----");
            System.out.println("1: Crear producto \n" + "2: Modificar producto \n" + "3: Listar productos \n"
                    + "4: Eliminar producto \n" + "5: Reportar una venta \n" + "6: Reposición \n" + "7: Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    productos.add(sp.crearProducto());
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del producto");
                    sp.modificarProducto(productos, leer.next());

                    break;
                case 3:
                    sp.mostrarProductos(productos);
                    break;
                case 4:
                    System.out.println("Ingresa el nombre del producto a eliminar");
                    sp.eliminarProducto(productos, leer.next());
                    break;
                case 5:
                    System.out.println("Ingresa el nombre del producto  que vendiste");
                    tienda.venta(productos, leer.next());
                    break;
                case 6:
                    System.out.println("Ingresa el nombre del producto a reponer");
                    tienda.reposicion(productos, leer.next());
                    break;
                case 7:
                    salir = false;
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (salir);
    }
}
