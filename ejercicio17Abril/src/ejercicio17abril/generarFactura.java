/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17abril;

/**
 *
 * @author 57312
 */
public class generarFactura {
 
    public double calcularIva(double valor){
        double valorIva = valor*0.19;
        return valorIva;
    }
    
    public double calcularTotal(double valor, double iva){
        double valorTotal = valor + iva;
        return valorTotal;
    }
}
