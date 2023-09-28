package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57312
 */
public class Ahorcado {

    private String[] palabra;
    private int cantLetrasEncontradas;
    private int cantJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetrasEncontradas, int cantJugadasMax) {
        this.palabra = palabra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }
        
}
