/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class Meses {
    
    private String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = meses[10];

    public Meses() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public boolean buscarMes(){
        Scanner leer = new Scanner(System.in);
        boolean adivinado = false;
        System.out.println("Ingresa el nombre del mes en minúsculas");
        String mesUsu = leer.next();
        if (mesUsu.equals(mesSecreto)) {
            System.out.println("¡Bien hecho, acertaste!");
            adivinado = true;
            return adivinado;
        }else{
            System.out.println("No has acertado, intenta de nuevo");
            buscarMes();
        }
        return adivinado;
    }
}
