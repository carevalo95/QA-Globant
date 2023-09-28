package Servicio;

import java.util.*;

import Entidad.Producto;

public class ServicioProducto {

	Scanner leer = new Scanner(System.in);

	public Producto crearProducto() {

		Producto product = new Producto();

		System.out.println("Ingresa el nombre del producto");
		product.setNombre(leer.next());

		System.out.println("Ingresa la categoría");
		product.setCategoria(leer.next());

		System.out.println("Ingresa el precio");
		product.setPrecio(leer.nextDouble());

		System.out.println("Ingresa la cantidad de inventario del producto");
		product.setInventario(leer.nextInt());

		return product;

	}

	public Producto buscarProducto(ArrayList<Producto> productoList, String nombre) {

		Producto product = new Producto();

		// boolean isPresent = false;

		for (int i = 0; i < productoList.size(); i++) {
			if (productoList.get(i).getNombre().equals(nombre)) {
				product = productoList.get(i);
			}
		}

		return product;
	}

	public void modificarProducto(ArrayList<Producto> productoList, String nombre) {

		Producto product = buscarProducto(productoList, nombre);

		if (product.getNombre() != null) {
			System.out.println("¿Qué atributo quieres modificar ?");
			System.out.println("1: Nombre");
			System.out.println("2: Categoría");
			System.out.println("3: Precio");
			System.out.println("4: Cantidad en inventario");
			int opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingresa el nuevo nombre");
				product.setNombre(leer.next());
				break;
			case 2:
				System.out.println("Ingresa la nueva categoría del producto");
				product.setCategoria(leer.next());
				break;
			case 3:
				System.out.println("Ingresa el nuevo precio");
				product.setPrecio(leer.nextDouble());
				break;
			case 4:
				System.out.println("Ingresa el nuevo inventario");
				product.setInventario(leer.nextInt());
				break;
			default:
				System.out.println("No seleccionaste una opción válida");
				break;
			}

		} else {
			System.out.println("No existe un producto con ese nombre ");
		}
	}

	public void eliminarProducto(ArrayList<Producto> productoList, String nombre) {

		Producto product = buscarProducto(productoList, nombre);
		if (product.getNombre().equalsIgnoreCase(nombre)) {
			productoList.remove(product);
			System.out.println("Su producto ha sido eliminado correctamente ");
		} else {
			System.out.println("No existe un producto con ese nombre ");
		}
	}

	public void mostrarProductos(ArrayList<Producto> productoList) {

		if (productoList.size() == 0) {
			System.out.println("No hay productos disponibles");
		} else {
			for (Producto producto : productoList) {
				System.out.println(producto);
			}
		}
	}

}
