/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);
    static List<Alumno> alumnos = new ArrayList();
    Alumno a1 = new Alumno();

    public void crearAlumno() {
        int opc = 1;
        do {
            System.out.println("Ingrese el nombre del alumno");
            a1.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                a1.getNotas().add(leer.nextInt());
            }
            alumnos.add(a1);
            System.out.println("¿Desea crear otro alumno? 1.SI 2.NO");
            opc = leer.nextInt();
        } while (opc == 1);
    }

    public void buscarAlumno() {
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        Optional<Alumno> alumnoEncontrado = alumnos.stream().filter(alumno -> alumno.getNombre().equalsIgnoreCase(nombre)).findFirst();

        if (alumnoEncontrado.isPresent()) {
            Alumno a2 = alumnoEncontrado.get();
            double notaF = notaFinal(a2.getNotas());
            System.out.println("La nota final de " + a2.getNombre() + " es " + notaF);
        } else {
            System.out.println("El alumno ingresado no se encuentra en la lista");
        }
    }

    public double notaFinal(List<Integer> notas) {
        double promedio = 0;
        for (Integer nota : notas) {
            promedio = nota + promedio;
        }
        promedio = promedio / notas.size();
        return promedio;
    }
}
