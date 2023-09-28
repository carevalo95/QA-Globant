package Entidades;

public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora(Integer carga, String color, char consumoEnergetico, Integer peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();        
        System.out.println("Ingrese la carga de la lavadora");
        setCarga(leer.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + " carga= " + carga;

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga>30) {
            setPrecio(getPrecio()+500);
        }
    }

}
