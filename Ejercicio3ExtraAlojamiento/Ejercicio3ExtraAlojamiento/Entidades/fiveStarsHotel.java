package Ejercicio3ExtraAlojamiento.Entidades;

public class fiveStarsHotel extends fourStarsHotel {

	protected int cantLimos;
	protected int salones;
	protected int cantSuits;

	public fiveStarsHotel(String name,String direccion, String gerente, String localidad, int cantidadHabitaciones, int numCamas,
			int numPisos, double precioHabitaciones, String tipoGym, String nombreRestaurante, int capaciRestaurante,
			int cantLimos, int salones, int cantSuits) {
		super(name, direccion, gerente, localidad, cantidadHabitaciones, numCamas, numPisos, precioHabitaciones, tipoGym,
				nombreRestaurante, capaciRestaurante);
		
		this.cantLimos = cantLimos;
		this.salones = salones;
		this.cantSuits = cantSuits;
		super.precioHabitaciones = calcularPrecioHabitacion();
	}

	@Override
	public double calcularPrecioHabitacion() {

		return (super.calcularPrecioHabitacion() + (15 * cantLimos));
	}

}
