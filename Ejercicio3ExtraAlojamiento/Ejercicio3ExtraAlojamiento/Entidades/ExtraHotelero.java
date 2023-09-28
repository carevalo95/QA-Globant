package Ejercicio3ExtraAlojamiento.Entidades;

public class ExtraHotelero extends Alojamiento {
	
	protected boolean privado;
	int cantMetrosCuadrados;
	
	public ExtraHotelero(String name, String direccion, String gerente, String localidad, boolean privado, int cantMetrosCuadrados) {
		super(name, direccion, gerente, localidad);
		this.privado = privado;
		this.cantMetrosCuadrados = cantMetrosCuadrados;
	}
	
	
	
	

}
