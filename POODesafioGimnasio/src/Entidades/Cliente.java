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
public class Cliente {
    
    private static int contadorRegistro;
    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;

    public Cliente() {
        this.id = ++contadorRegistro;
    }

    public Cliente(String nombre, int edad, double altura, double peso, String objetivo) {
        this.id = ++contadorRegistro;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public static void setContadorRegistro(int contadorRegistro) {
        Cliente.contadorRegistro = contadorRegistro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", objetivo=" + objetivo + '}';
    }

    
    
}
