/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class ServiciosCliente {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Cliente> clientes = new ArrayList();

    public Cliente crearCliente() {
        Cliente cl = new Cliente();
        System.out.println("Ingrese los datos del cliente");
        System.out.println("Nombre");
        cl.setNombre(leer.next());
        System.out.println("Edad:");
        cl.setEdad(leer.nextInt());
        System.out.println("Altura:");
        cl.setAltura(leer.nextDouble());
        System.out.println("Peso");
        cl.setPeso(leer.nextDouble());
        System.out.println("Objetivo");
        cl.setObjetivo(leer.next());
        clientes.add(cl);
        System.out.println(cl);
        return cl;
    }

    public void obtenerClientes() {
        if (clientes.isEmpty()) {
            System.out.println("NO hay clientes");
        } else {
            System.out.println("-------------");
            System.out.println(clientes);
            System.out.println("------------");
        }
    }

    public void actualizarCliente() {
        System.out.println("Ingrese el id del cliente a modificar");
        int idModificar = leer.nextInt();
        Optional<Cliente> clienteEncontrado = clientes.stream().filter(cliente -> cliente.getId() == idModificar).findFirst();

        if (clienteEncontrado.isPresent()) {
            Cliente cl = clienteEncontrado.get();
            int opcion;
            do {
                System.out.println("¿Qué atributo desea modificar?\n"
                        + "1.Nombre\n2.Edad\n3.Altura\n4.Peso\n5.Objetivo\n6.Guardar y salir");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre");
                        cl.setNombre(leer.next());
                        break;
                    case 2:
                        System.out.println("Ingrese la nueva edad");
                        cl.setEdad(leer.nextInt());
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva altura");
                        cl.setAltura(leer.nextDouble());
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo peso");
                        cl.setPeso(leer.nextDouble());
                        break;
                    case 5:
                        System.out.println("Ingrese el nuevo objetivo");
                        cl.setObjetivo(leer.next());
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (opcion != 6);
        }
    }

    public void eliminarCliente() {
        System.out.println("Ingrese el id del cliente a eliminar");
        int idEliminar = leer.nextInt();
        Optional<Cliente> clienteEncontrado = clientes.stream().filter(cliente -> cliente.getId() == idEliminar).findFirst();
        if (clienteEncontrado.isPresent()) {
            Cliente cl = clienteEncontrado.get();
            clientes.remove(cl);
            System.out.println("Cliente eliminado");
            System.out.println(clientes);
        } else {
            System.out.println("El cliente con el id ingresado no existe");
        }
    }
}
