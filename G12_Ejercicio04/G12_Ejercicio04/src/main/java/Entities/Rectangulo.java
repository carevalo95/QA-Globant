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
public class Rectangulo implements CalculosFormas{
    
    private int base,altura;
    

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        
        int area= this.base*this.altura;
        System.out.println("El area es: "+area);
    }

    @Override
    public void calcularPerimetro() {
        
        int perimetro= (this.base+this.altura)*2;
        System.out.println("El perímetro es: "+perimetro);
    }
    
}
