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
public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int Inventario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        Inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return Inventario;
    }

    public void setInventario(int inventario) {
        Inventario = inventario;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", Inventario="
                + Inventario + "]";
    }

}
