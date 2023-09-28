/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package APP;

import Entities.Circulo;
import Entities.Rectangulo;

/**
 *
 * @author brian
 */
public class G12_Ejercicio04 {

    public static void main(String[] args) {
        Circulo circulo= new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(5, 2);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
    }
}
