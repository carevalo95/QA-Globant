package Ejercicio3ExtraAlojamiento.Entidades;

public class residencies extends ExtraHotelero {

	int cantHabitaciones;
	boolean campoDeportivo, descuentos;

	public residencies(String name, String direccion, String gerente, String localidad, boolean privado, int cantMetrosCuadrados,
			int cantHabitaciones, boolean campoDeportivo, boolean descuentos) {
		super(name, direccion, gerente, localidad, privado, cantMetrosCuadrados);
		this.cantHabitaciones = cantHabitaciones;
		this.campoDeportivo = campoDeportivo;
		this.descuentos = descuentos;
	}

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    @Override
    public String toString() {
        return name + " cantHabitaciones=" + cantHabitaciones + ", campoDeportivo=" + campoDeportivo + ", descuentos=" + descuentos;
    }

}
