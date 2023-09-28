package Ejercicio3ExtraAlojamiento.Entidades;

public class fourStarsHotel extends Hotel {

	// implements calculoPrecioHabitaciones

	protected String tipoGym;
	protected String nombreRestaurante;
	protected int capaciRestaurante;

	public fourStarsHotel(String name, String direccion, String gerente, String localidad, int cantidadHabitaciones, int numCamas,
			int numPisos, double precioHabitaciones, String tipoGym, String nombreRestaurante, int capaciRestaurante) {
		super(name, direccion, gerente, localidad, cantidadHabitaciones, numCamas, numPisos, precioHabitaciones);
		this.tipoGym = tipoGym;
		this.nombreRestaurante = nombreRestaurante;
		this.capaciRestaurante = capaciRestaurante;
		super.precioHabitaciones = calcularPrecioHabitacion();
	}

	public double getPrecioHabitaciones() {
		return this.calcularPrecioHabitacion();
	}

	@Override
	public double calcularPrecioHabitacion() {

		double precio;
		precio = 50 + (numCamas * cantidadHabitaciones * numPisos);
		if (capaciRestaurante <= 30) {
			precio += 10;
		} else if (capaciRestaurante <= 50) {
			precio += 30;
		} else {
			precio += 50;
		}
		if (tipoGym.equalsIgnoreCase("A")) {
			precio += 50;
		} else {
			precio += 30;
		}

		return precio;
	}
//
//	@Override
//	public double calcularPrecioHabitacion() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
