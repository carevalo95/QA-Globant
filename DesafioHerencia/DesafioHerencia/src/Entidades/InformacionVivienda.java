/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author 57312
 */
public class InformacionVivienda {
    
    private int dormitorios;
    private String paredes, piso;
    private boolean iluminacion;

    public InformacionVivienda() {
    }

    public InformacionVivienda(int dormitorios, String paredes, String piso, boolean iluminacion) {
        this.dormitorios = dormitorios;
        this.paredes = paredes;
        this.piso = piso;
        this.iluminacion = iluminacion;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }
    
    
}
