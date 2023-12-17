package Entidades;

public abstract class Hotel extends Alojamiento{

	protected int cantidadHabitaciones;
	protected int numCamas;
	protected int numPisos;
	protected double precioHabitaciones;

	public Hotel(String name, String direccion, String gerente, String localidad, int cantidadHabitaciones, int numCamas, int numPisos,
			double precioHabitaciones) {
		super(name, direccion, gerente, localidad);
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.numCamas = numCamas;
		this.numPisos = numPisos;
		this.precioHabitaciones = precioHabitaciones;
	}
	
	public double  getPrecioHabitaciones() {
		return precioHabitaciones;
	}
	
//	El precio de una habitaci�n debe calcularse de acuerdo con la siguiente f�rmula:
//		PrecioHabitaci�n = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//		agregado por gimnasio) + (valor agregado por limosinas). 
	
	public abstract double calcularPrecioHabitacion();
	
	
	
	

}
