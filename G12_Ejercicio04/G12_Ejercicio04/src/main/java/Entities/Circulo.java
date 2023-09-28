/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Interfaces.CalculosFormas;

/**
 *
 * @author brian
 */
public class Circulo implements CalculosFormas{
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public void calcularArea() {
        
        double area = PI*(Math.pow(this.radio,2d));
        System.out.println("El area es: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro= PI*this.radio*2;
        System.out.println("El perímetro es: "+perimetro);
    }
    
    
    
}
