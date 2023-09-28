/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej02ruletarusa;

import Entidades.*;
import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class RelacionesEj02RuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de jugadores (debe ser entre 1 y 6)");
        int num = leer.nextInt();
        ArrayList<Jugador> jugadores = new ArrayList();
        if (num < 1 || num > 6) {
            num = 6;
        }
        for (int i = 0; i < num; i++) {
            Jugador j = new Jugador();
            jugadores.add(j);
        }
        Revolver r = new Revolver();
        r.llenarRevolver();
        System.out.println(r);
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, r);
        juego.ronda();
    }

}
