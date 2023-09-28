/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.*;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in);
    List<Producto> productos = new ArrayList();

    public void crearProducto() {

        Producto product = new Producto();

        System.out.print("Ingrese el nombre de producto: ");
        product.setNombre(leer.nextLine());
        System.out.print("Ingrese la categoria del producto: ");
        product.setCategoria(leer.nextLine());
        System.out.print("Ingrese el precio del producto: ");
        product.setPrecio(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese la cantidad en inventario del producto: ");
        product.setInventario(Integer.parseInt(leer.nextLine()));

        productos.add(product);

    }

    public void organizarProductos() {
        Collections.sort(productos, Comparadores.ordenarPorNombre);
    }

    // for simple para imprimir alumnos enumerados
    public void mostrarProductos() {

        if (productos.size() > 0) {
            organizarProductos();
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
        } else {
            System.out.println("\nAún no hay productos registrados en el sistema");
        }
    }

    public void modificarProducto() {

        int opc;

        if (productos.size() > 0) {

            do {
                mostrarProductos();
                System.out.println("¿Qué producto desea modificar?");
                int id = Integer.parseInt(leer.nextLine());
                Producto aux = productos.get(id - 1);
                System.out.println(id + ". " + productos.get(id - 1));
                System.out.println("¿Qué desea modificar?");
                System.out.println("1. Nombre\n" + "2. Categoria\n" + "3. Precio\n" + "4. Inventario\n" + "5. Salir" + "\nDigite una opción: ");
                opc = Integer.parseInt(leer.nextLine());

                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre para el producto: ");
                        aux.setNombre(leer.nextLine());
                        break;
                    case 2:
                        System.out.print("Ingrese la nueva categoria para el producto: ");
                        aux.setCategoria(leer.nextLine());
                        break;
                    case 3:
                        System.out.print("Ingrese el nuevo precio para el producto: ");
                        aux.setPrecio(Double.parseDouble(leer.nextLine()));
                        break;
                    case 4:
                        System.out.print("Ingrese la nueva cantidad en inventario para el producto: ");
                        aux.setPrecio(Integer.parseInt(leer.nextLine()));
                        break;
                    case 5:
                        System.out.print("Ingrese el nuevo nombre para el producto: ");
                        aux.setNombre(leer.nextLine());
                        System.out.print("Ingrese la nueva edad para el producto: ");
                        aux.setCategoria(leer.nextLine());
                        System.out.print("Ingrese la nueva altura para el producto: ");
                        aux.setPrecio(Double.parseDouble(leer.nextLine()));
                        System.out.print("Ingrese la nueva cantidad en inventario para el producto: ");
                        aux.setPrecio(Integer.parseInt(leer.nextLine()));
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida. Por favor, ingrese una opción válida");
                }
            } while (opc != 8);
        } else {
            mostrarProductos();
        }
    }

    public void eliminarProducto() {
        mostrarProductos();
        if (productos.size() > 0) {
            System.out.println("Escriba el código de producto que desea eliminar");
            int id = Integer.parseInt(leer.nextLine());
            productos.remove(id - 1);
            organizarProductos();
            System.out.println("El producto ha sido eliminado con éxito");
        }
    }

    public void venta() {
        mostrarProductos();
        if (productos.size() > 0) {
            System.out.println("Escriba el código de producto que desea vender");
            int id = Integer.parseInt(leer.nextLine());
            if (productos.get(id - 1).getInventario() > 0) {
                productos.get(id - 1).setInventario(productos.get(id - 1).getInventario() - 1);
                organizarProductos();
                System.out.println("El producto ha sido vendido con éxito");
            } else {
                System.out.println("No hay inventario de " + productos.get(id - 1).getNombre()+ " por vender");
            }
        }
    }

    public void reponer() {
        mostrarProductos();
        if (productos.size() > 0) {
            System.out.println("Escriba el código de producto que desea reponer");
            int id = Integer.parseInt(leer.nextLine());
            productos.get(id - 1).setInventario(productos.get(id - 1).getInventario() + 1);
            organizarProductos();
            System.out.println("El producto ha sido repuesto con éxito");
        }
    }

    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Crear Producto\n"
                + "2. Mostrar Productos\n"
                + "3. Modificar Producto\n"
                + "4. Eliminar Producto\n"
                + "5. Vender Producto\n"
                + "6. Reponer Producto\n"
                + "7. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    public void opciones() {

        int opc;
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    venta();
                    break;
                case 6:
                    reponer();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
        } while (opc != 7);
    }
}
