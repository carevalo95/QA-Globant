/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej03alumnos;

import Servicios.ServicioAlumno;

/**
 *
 * @author DianaArevalo
 */
public class ColeccionesEj03Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno sa= new ServicioAlumno();
        sa.crearAlumno();
        sa.buscarAlumno();
    }
    
}
