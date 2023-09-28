package Ejercicio3ExtraAlojamiento.MainPackage;

import Ejercicio3ExtraAlojamiento.Entidades.Alojamiento;
import Ejercicio3ExtraAlojamiento.Entidades.Camping;
import Ejercicio3ExtraAlojamiento.Entidades.ExtraHotelero;
import Ejercicio3ExtraAlojamiento.Entidades.Hotel;
import Ejercicio3ExtraAlojamiento.Entidades.fiveStarsHotel;
import Ejercicio3ExtraAlojamiento.Entidades.fourStarsHotel;
import Ejercicio3ExtraAlojamiento.Entidades.residencies;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAlojamiento {

    public static void main(String[] args) {

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        alojamientos.add(new fourStarsHotel("Hotel Egg", "Cra 25#2-35", "lola", "sur", 10, 30, 5, 0, "a", "sopa", 30));
        alojamientos.add(new fourStarsHotel("Hotel Altamar", "Cra 5#42-75", "Chucho", "Suroeste", 8, 20, 3, 0, "b", "ristorante", 60));
        alojamientos.add(new residencies("Residencia1", "Calle falsa 1-23", "Harvey Scarpeta", "Norte", true, 66, 7, false, true));
        alojamientos.add(new Camping("Camping1!", "Otra calle falsa 1. 23", "Juan F.", "Suroriente", true, 35, 2, false, 7));
        alojamientos.add(new fiveStarsHotel("Colombian Hotels", "Cra 5#12-15", "Juanita", "Noroeste", 10, 30, 5, 0, "a", "sopa", 30, 6, 16, 4));
        alojamientos.add(new fiveStarsHotel("Hotel Costa", "Cra 8#24-34", "Pablo", "Suroriente", 10, 30, 5, 0, "a", "sopa", 30, 4, 14, 7));
        alojamientos.add(new Camping("Camping2", " calle falsa 1 23", "Juanelo Jara.", "Suroriente", false, 25, 1, true, 6));
        alojamientos.add(new residencies("Residencia2", "Calle falsa 1-35", "Juan sin Miedo", "Norte", false, 44, 27, true, false));
        menu(alojamientos);
    }

    public static void menu(ArrayList alojamientos) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        do {
            System.out.println("----CONSULTA DE ALOJAMIENTOS---");
            System.out.println("Por favor, seleccione la opción deseada:\n1.Ver alojamientos\n2.Ver hoteles\n3.Ver campings con restaurante\n4.Ver residencias con descuento\n5.Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    mostrarAlojamientos(alojamientos);
                    break;
                case 2:
                    mostrarHotelesporprecio(alojamientos);
                    break;
                case 3:
                    mostrarCampingsconRestaurante(alojamientos);
                    break;
                case 4:
                    mostrarResidenciasconDescuento(alojamientos);
                    break;
            }

        } while (opcion != 5);

    }

    public static void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                System.out.println(
                        "El tipo de alojamiento es " + alojamiento.getClass().getSimpleName() + " y el precio de las habitaciones es: " + ((Hotel) alojamiento).getPrecioHabitaciones());
            } else if (alojamiento instanceof ExtraHotelero) {
                System.out.println(
                        "El tipo de alojamiento es " + alojamiento.getClass().getSimpleName());

            }
        }
    }

    public static void mostrarHotelesporprecio(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                System.out.println("El tipo de alojamiento es " + alojamiento.getClass().getSimpleName() + " y el precio de las habitaciones es: " + ((Hotel) alojamiento).getPrecioHabitaciones());
            }
        }

    }

    public static void mostrarCampingsconRestaurante(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof ExtraHotelero) {
                if (alojamiento instanceof Camping) {
                    if (((Camping) alojamiento).isRestaurante()) {
                        System.out.println(alojamiento);
                    }
                }
            }
        }
    }

    public static void mostrarResidenciasconDescuento(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof ExtraHotelero) {
                if (alojamiento instanceof residencies) {
                    if (((residencies) alojamiento).isDescuentos()) {
                        System.out.println(alojamiento);
                    }
                }
            }
        }
    }
}
