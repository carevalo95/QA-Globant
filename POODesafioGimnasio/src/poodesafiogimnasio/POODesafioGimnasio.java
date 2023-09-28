/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poodesafiogimnasio;

import Servicios.ServiciosCliente;
import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class POODesafioGimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCliente sc = new ServiciosCliente();
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione la opción deseada:\n1.Crear cliente\n2.Modificar cliente\n3.Eliminar cliente\n4.Listar clientes\n5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sc.crearCliente();
                    break;
                case 2:
                    sc.actualizarCliente();
                    break;
                case 3:
                    sc.eliminarCliente();
                    break;
                case 4:
                    sc.obtenerClientes();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
}
