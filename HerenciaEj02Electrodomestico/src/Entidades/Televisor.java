package Entidades;

public final class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, String color, char consumoEnergetico, Integer peso) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return super.toString() + " resolución= " + resolucion + " TDT= " + TDT;

    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolución del televisor");
        setResolucion(leer.nextDouble());
        System.out.println("Si el televisor tiene TDT ingrese 1, de lo contrario ingrese 2");
        int opc = leer.nextInt();
        if (opc == 1) {
            setTDT(true);
        } else {
            setTDT(false);
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            setPrecio(getPrecio() * 1.3);
        }
        if (TDT) {
            setPrecio(getPrecio() + 500);
        }

    }

}
