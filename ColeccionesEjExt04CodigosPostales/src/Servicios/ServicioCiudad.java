/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.*;

/**
 *
 * @author DianaArevalo Almacena en un HashMap los códigos postales de 10
 * ciudades a elección de esta página: https://mapanet.eu/index.htm. Nota: Poner
 * el código postal sin la letra, solo el número. • Pedirle al usuario que
 * ingrese 10 códigos postales y sus ciudades. • Muestra por pantalla los datos
 * introducidos • Pide un código postal y muestra la ciudad asociada si existe
 * sino avisa al usuario. • Muestra por pantalla los datos • Agregar una ciudad
 * con su código postal correspondiente más al HashMap. • Elimina 3 ciudades
 * existentes dentro del HashMap, que pida el usuario. • Muestra por pantalla
 * los datos
 */
public class ServicioCiudad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, String> ciudades = new HashMap();

    public void agregarCiudad() {
        int opc = 0;
        do {
            System.out.println("Ingrese el código postal de la ciudad");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el nombre de la ciudad");
            String nombre = leer.next();
            ciudades.put(codigo, nombre);
            System.out.println("¿Desea crear otra ciudad? 1.SI 2.NO");
            opc = leer.nextInt();
        } while (opc == 1);
    }

    public void listarCiudades() {
        if (ciudades.size() > 0) {
            for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("[Código: " + key + " nombre: " + value + "]");
            }
        } else {
            System.out.println("No hay ciudades creadas aún");
        }
    }

    public int buscarCiudad() {
        int codEncontrado = 0;
        System.out.println("Ingrese el código de la ciudad");
        int codigo = leer.nextInt();
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Integer key = entry.getKey();
            if (key == codigo) {
                return codigo;
            }
        }
        return codEncontrado;
    }

    public void mostrarCiudad() {
        int codigo = buscarCiudad();
        if (codigo > 1) {
            System.out.println("[Código: " + codigo + " nombre: " + ciudades.get(codigo) + "]");
        } else {
            System.out.println("La ciudad no se encuentra en el listado");
        }
    }

    public void eliminarCiudad() {
        int codigo = buscarCiudad();
        if (codigo > 1) {
            ciudades.remove(codigo);
            System.out.println("La ciudad ha sido eliminada");
        } else {
            System.out.println("La ciudad no se encuentra en el listado");
        }
    }
    
    public void modificarCiudad(){
        int codigo = buscarCiudad();
        if (codigo > 1) {
            System.out.println("Ingrese el nuevo nombre de la ciudad");
            String nombreN = leer.next();
            ciudades.replace(codigo, nombreN);
            System.out.println("La ciudad ha sido modificada");
        } else {
            System.out.println("La ciudad no se encuentra en el listado");
        }
    }

    public void menu() {
        int opc = 0;
        do {
            System.out.println("Seleccione la opción deseada:\n1.Crear ciudad\n2.Listar ciudades\n3.Buscar ciudad"
                    + "\n4.Eliminar ciudad\n5.Modificar ciudad\n6.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarCiudad();
                    break;
                case 2:
                    listarCiudades();
                    break;
                case 3:
                    mostrarCiudad();
                    break;
                case 4:
                    eliminarCiudad();
                    break;
                case 5:
                    modificarCiudad();
                    break;
                case 6:
                    opc = 6;
                    break;
                default:
                    System.out.println("Ha ingresado una opción incorrecta");
            }
        } while (opc != 6);

    }
}
