/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Hospital {

    private ArrayList<Familia> familias;

    public Hospital() {
    }

    public Hospital(ArrayList<Familia> familias) {
        this.familias = familias;
    }

    public ArrayList<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(ArrayList<Familia> familias) {
        this.familias = familias;
    }

}
