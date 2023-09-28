package Servicio;

import java.util.ArrayList;

import Entidad.Producto;

public class Tienda {

	ServicioProducto sp = new ServicioProducto();

	public void venta(ArrayList<Producto> productoList, String nombre) {

		Producto product = sp.buscarProducto(productoList, nombre);

		if (product.getNombre().equalsIgnoreCase(nombre)) {
			if (product.getInventario() > 0) {
				product.setInventario(product.getInventario() - 1);
				System.out.println("Su venta fue reportada");
			}else
				System.out.println("No hay inventario del producto " + product.getNombre());
		}else {
			System.out.println("No se encuentra disponible ese producto");
		}
	}

	public void reposicion(ArrayList<Producto> productoList, String nombre) {

		Producto product = sp.buscarProducto(productoList, nombre);

		if (product.getNombre().equalsIgnoreCase(nombre)) {
			product.setInventario(product.getInventario() + 1);
			System.out.println("Su reposición fue realizada");
		}else {
			System.out.println("No hay inventario del producto " + product.getNombre());
		}
	}

}
