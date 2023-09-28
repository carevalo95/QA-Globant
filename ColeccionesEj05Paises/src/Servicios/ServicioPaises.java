/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class ServicioPaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<Integer, Pais> paises = new HashMap();

    public void agregarPais() {
        Pais pa = new Pais();
        System.out.println("Ingrese el nombre del país");
        pa.setNombre(leer.next());
        paises.put(pa.hashCode(), pa);
    }

    public void cargarPaises() {
        int opc = 1;
        do {
            agregarPais();
            System.out.println("¿Desea crear otro pais? 1.SI 2.NO");
            opc = leer.nextInt();
        } while (opc == 1);
        listarPaises();
        iterar();
        listarPaises();
    }

//    public void listarNombrePaises(){
//        for (String nombres : paises.values()) {
//            System.out.println("Nombre: " + nombres);
//        }
//    }
    public void listarPaises() {
        paises.entrySet().forEach((pais) -> {
            System.out.println("Hash= " + pais.getKey() + ", nombre= " + pais.getValue().toString());
        });
    }

    /* 
    public void buscarPais(){
        boolean encontrado = false;
        System.out.println("Ingrese el nombre del pais");
        pa.setNombre(leer.next());
        encontrado = pa.equals(pa);
        if (encontrado) {
            paises.remove(pa);
        }
    }
     */
    public void iterar() {
        boolean borrado = false;
        //Iterator<Map.Entry<Integer, Pais>> itera = paises.entrySet().iterator();
        System.out.println("Ingrese el nombre del pais a eliminar");
        String nombre = leer.next();
        if (paises.values().removeIf(value -> value.getNombre().equals(nombre))) {
            borrado = true;
            System.out.println("El pais ha sido eliminado");
        } else {
            System.out.println("El pais no ha sido encontrado en la lista");
        }

        /* while (itera.hasNext()) {
            if (itera.next().getValue().getNombre().equals(pa.getNombre())) {
                paises.remove(pa.hashCode());
                borrado = true;
                System.out.println("El pais ha sido eliminado");
            }
        }
        if (!borrado) {
            System.out.println("El pais no ha sido encontrado en la lista");
        }*/
    }

    ArrayList<Pais> paisesL = new ArrayList(paises.values());
    
}
