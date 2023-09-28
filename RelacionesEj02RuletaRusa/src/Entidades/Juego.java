/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author 57312
 */
public class Juego {

    private Revolver r;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public void ronda() {
        int cont = 1;
        boolean juego = true;        
        do {
            System.out.println("Ronda "+cont);
            for (Jugador jugadore : jugadores) {
                jugadore.disparo(r);
                if (jugadore.isMojado()) {
                    juego = false;
                }
            }
            for (Jugador jugadore : jugadores) {
                System.out.println(jugadore);
            }
            cont++;
        } while (juego);
        

    }
}
