package Ejercicio3ExtraAlojamiento.Entidades;

public class Camping extends ExtraHotelero {

	protected int cantBanosDisponibles;
	protected boolean restaurante;
	protected int capacidadMaxCarpas;

	public Camping(String name, String direccion, String gerente, String localidad, boolean privado, int cantMetrosCuadrados,
			int cantBanosDisponibles, boolean restaurante, int capacidadMaxCarpas) {
		super(name, direccion, gerente, localidad, privado, cantMetrosCuadrados);
		this.cantBanosDisponibles = cantBanosDisponibles;
		this.restaurante = restaurante;
		this.capacidadMaxCarpas = capacidadMaxCarpas;
	}

    public int getCantBanosDisponibles() {
        return cantBanosDisponibles;
    }

    public void setCantBanosDisponibles(int cantBanosDisponibles) {
        this.cantBanosDisponibles = cantBanosDisponibles;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    @Override
    public String toString() {
        return name + " cantBanosDisponibles=" + cantBanosDisponibles + ", restaurante=" + restaurante + ", capacidadMaxCarpas=" + capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

}
