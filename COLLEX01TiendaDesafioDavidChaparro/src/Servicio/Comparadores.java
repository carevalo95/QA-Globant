/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.*;

/**
 *
 * @author david
 */
public class Comparadores {

    public static Comparator<Producto> ordenarPorNombre = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}
