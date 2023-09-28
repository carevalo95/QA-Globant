/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosAhorcado;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        String[] vector = new String[palabra.length()];
        System.out.println("Ingrese la cantidad de jugadas");
        ah.setCantJugadasMax(leer.nextInt());

        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        ah.setPalabra(vector);
        return ah;
    }

    public void longitud(String[] palabra) {
        System.out.println("La longitud de la palabra a buscar es "
                + palabra.length);
    }

    public int buscar(String letra, String[] palabra) {
        int contador = 0;
        for (String palabra1 : palabra) {
            if (palabra1.equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean encontradas(String letra, String[] palabra, String[] copia) {
        boolean ret = false;
        int encontradas = 0;
        int coincide = buscar(letra, palabra);
        int faltantes;
        if (coincide > 0) {
            ret = true;
            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i].equalsIgnoreCase(letra)) {
                    copia[i] = palabra[i];
                    encontradas++;
                } else if (copia[i] != null) {
                    encontradas++;
                }
            }
        } else {
            System.out.println("La letra no pertenece a la palabra");
            for (String copia1 : copia) {
                if (copia1 != null) {
                    encontradas++;
                }
            }
        }
        ah.setCantLetrasEncontradas(encontradas);
        faltantes = copia.length - encontradas;
        System.out.println("Letras encontradas: " + encontradas + "\nLetras faltantes: " + faltantes);
        return ret;
    }

    public void intentos() {
        ah.setCantJugadasMax(ah.getCantJugadasMax() - 1);
        System.out.println("Te quedan " + ah.getCantJugadasMax() + " oportunidades");
    }

    public void mostrarProgreso(String[] copia) {
        for (String copia1 : copia) {
            if (copia1 != null) {
                System.out.print(copia1 + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }

    public void juego() {
        ah = crearJuego();
        String[] copia = new String[ah.getPalabra().length];
        boolean logrado = false;
        do {
            longitud(ah.getPalabra());
            System.out.println("Ingrese la letra a buscar");
            String letra = leer.next();
            if (!encontradas(letra, ah.getPalabra(), copia)) {
                intentos();
            } else {
                System.out.println("Te quedan " + ah.getCantJugadasMax() + " oportunidades");
                int encontradas = 0;
                for (String copia1 : copia) {
                    if (copia1 != null) {
                        encontradas++;
                    }
                }
                if (encontradas == copia.length) {
                    logrado = true;
                }
            }
            System.out.print("Así vamos: ");mostrarProgreso(copia);
            System.out.println("_________________________________");
        } while (ah.getCantJugadasMax() > 0 && !logrado);
        if (ah.getCantJugadasMax() == 0) {
            System.out.println("!Ahorcado!");
        } else if (logrado) {
            System.out.println("Genial, lo has logrado!!");
        }
    }
}
