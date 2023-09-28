package Entidades;

import Enums.Colores;
import Enums.Consumo;
import java.util.Scanner;

public class Electrodomestico {

    protected double precio;

    protected String color;

    protected char consumoEnergetico;

    protected Integer peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, Integer peso) {
        this.precio = 1000d;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public char comprobarConsumoEnergetico(char letraConsumo) {

        letraConsumo = Character.toUpperCase(letraConsumo);
        if (letraConsumo >= 'A' && letraConsumo <= 'F') {
            return letraConsumo;
        }
        return 'F';
    }

    public String comprobarColor(String color) {
        boolean val = true;
        for (Colores value : Colores.values()) {
            if (value.getNombre().equalsIgnoreCase(color)) {
                val = false;
            }
        }
        if (val) {
            return Colores.BLANCO.getNombre();
        } else {
            return color;
        }
    }

    public void crearElectrodomestico() {

        setPrecio(1000);

        System.out.println("Ingrese el color del electrodoméstico entre las siguientes opciones:\nblanco, negro, rojo, azul o gris.");
        setColor(leer.next());

        System.out.println("Ingrese el consumo");
        setConsumoEnergetico(leer.next().charAt(consumoEnergetico));
        int pesoU = 0;
        do {
            System.out.println("Ingrese el peso en kg mayor a 0");
            pesoU = leer.nextInt();
        } while (pesoU <= 0);

        setPeso(pesoU);
    }

    public void precioFinal() {
        int kg = this.peso;
        double precioE = 0;
        if (kg >= 80) {
            precioE = getPrecio() + 1000 + buscarPrecioConsumo(this.consumoEnergetico);
            setPrecio(precioE);
        } else if (kg >= 50) {
            precioE = getPrecio() + 800 + buscarPrecioConsumo(this.consumoEnergetico);
            setPrecio(precioE);
        } else if (kg >= 20) {
            precioE = getPrecio() + 500 + buscarPrecioConsumo(this.consumoEnergetico);
            setPrecio(precioE);
        } else {
            precioE = getPrecio() + 100 + buscarPrecioConsumo(this.consumoEnergetico);
            setPrecio(precioE);
        }
    }

    public double buscarPrecioConsumo(char consumo) {
        for (Consumo consum : Consumo.values()) {
            if (consum.name().equalsIgnoreCase(Character.toString(consumo))) {
                return consum.getConsumo();
            }
        }
        return 0;
    }

}
