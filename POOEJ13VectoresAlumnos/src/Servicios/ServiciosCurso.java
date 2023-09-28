/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosCurso {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c) {
        String[] alumnos = new String[c.getAlumnos().length];
        for (int i = 0; i < c.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del alumno número " + (i + 1));
            alumnos[i] = leer.nextLine();
        }
        c.setAlumnos(alumnos);
    }

    public Curso crearCurso() {
        Curso c = new Curso();
        System.out.println("Ingrese el nombre del curso");
        c.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días por semana");
        c.setCantidadHorasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno del curso: 1.mañana o 2.tarde");
        int turno = leer.nextInt();
        if (turno == 1) {
            c.setTurno("Mañana");
        } else {
            c.setTurno("Tarde");
        }
        System.out.println("Ingrese el precio por hora");
        c.setPrecioPorHora(leer.nextInt());
        cargarAlumnos(c);
        return c;
    }

    public int calcularGanancia(Curso c) {
        int ganancia;
        ganancia = c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length * c.getCantidadHorasPorSemana();
        return ganancia;
    }
}
