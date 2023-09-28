/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAMuchos;

import java.util.List;

/**
 *
 * @author DianaArevalo
 */
public class Equipo {
    
    private String nombre;
    private List<Jugador> jugadores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    
}
