/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import UnoAMuchos.Equipo;
import UnoAMuchos.Jugador;
import UnoaUno.Dni;
import UnoaUno.Persona;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setApellido("Perez");
        Dni dni = new Dni();
        dni.setSerie('A');
        dni.setNumero(123);
        p.setDni(dni);
        System.out.println(p);
        
        List<Jugador> jugadores = new ArrayList();
        Jugador j1 = new Jugador("Julian","Rojas","Delantero",7);
        Jugador j2 = new Jugador("Juan","Rollo","Delantero",10);
        Jugador j3 = new Jugador("Jorge","Robledo","Portero",1);
        
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        Equipo eq = new Equipo("Ganadores");        
        eq.setJugadores(jugadores);
        
        System.out.println(eq);
        
       /* ArrayList<Jugador> jugadores = new ArrayList() {
            {
                add(new Jugador("Juan","Perez","Delantero",54));
                add(new Jugador("Julian","Lopez","Portero",4));
            }
        };
        jugadores.forEach(System.out::println);*/
    }

}
