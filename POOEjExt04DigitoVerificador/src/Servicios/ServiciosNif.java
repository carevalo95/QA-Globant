/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosNif {

    Scanner leer = new Scanner(System.in);
    NIF n = new NIF();

    public NIF crearNIF() {
        long dni;
        String lon;
        do {
            System.out.println("Ingrese el número DNI");
            dni = leer.nextLong();
            lon = String.valueOf(dni);
        } while (lon.length() > 8);
        n.setDNI(dni);
        n.setLetra(calcularLetra(n.getDNI()));
        return n;

    }

    public String calcularLetra(Long dni) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resto = Math.toIntExact(dni % 23);
        return letras[resto];
    }

    public void mostrar(NIF nif) {
        String DNIString;
        String ceros = "";
        DNIString = String.valueOf(n.getDNI());
        for (int i = 0; i < 8 - DNIString.length(); i++) {
            ceros += "0";
        }
        System.out.println("El NIF es: " + ceros + n.getDNI() + "-" + n.getLetra());
    }
}
