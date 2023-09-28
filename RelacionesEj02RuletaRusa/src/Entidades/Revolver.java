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
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    @Override
    public String toString() {
        return "Revolver{" + "posición Inicial=" + posicionActual + ", posición del Agua=" + posicionAgua + '}';
    }

    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }

    }
}
