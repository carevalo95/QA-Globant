/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author DianaArevalo
 */
public class Jugador {

    private static int id = 1;
    private String nombre = "Jugador " + id;
    private boolean mojado = false;

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        if (mojado) {
            return "Jugador{" + "nombre=" + nombre + ", estado= mojado}";
        } else {
            return "Jugador{" + "nombre=" + nombre + ", estado = seco}";
        }
    }

    public Jugador() {
        id++;
    }

    public void disparo(Revolver r) {
        if (r.mojar()) {
            mojado = true;
        }
        r.siguienteChorro();
    }

}
