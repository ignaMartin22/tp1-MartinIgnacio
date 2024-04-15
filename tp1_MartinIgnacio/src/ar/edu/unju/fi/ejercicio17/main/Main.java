package ar.edu.unju.fi.ejercicio17.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opc;
		List <Jugador>  jugadores = new ArrayList();
		do {
			menu();
			System.out.println("Ingrese opción: ");
			opc = scanner.nextInt();
			switch(opc) {
			case 1:
				Jugador jugador = new Jugador();
				System.out.println("Nuevo Jugador");
				System.out.println("Ingrese nombre: ");
				String nombre = scanner.next();
				System.out.println("Ingrese Apellido: ");
				String apellido = scanner.next();
				System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
				String fecha = scanner.next();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaNacimiento = LocalDate.parse(fecha, formato);
				System.out.println("Ingrese Nacionalidad: ");
				String nacionalidad = scanner.next();
				System.out.println("Ingrese estatura: ");
				float estatura = scanner.nextFloat();
				System.out.println("Ingrese peso: ");
				float peso = scanner.nextFloat();
				System.out.println("Ingrese posicion (delantero,medio,defensa,arquero): ");
				String posicion = scanner.next();
				
				jugador.setNombre(nombre);
				jugador.setApellido(apellido);
				jugador.setFechaDeNacimiento(fechaNacimiento);
				jugador.setNacionalidad(nacionalidad);
				jugador.setEstatura(estatura);
				jugador.setPeso(peso);
				jugador.setPosicion(posicion);
				
				jugadores.add(jugador);

				break;
			case 2: 
				System.out.println("Ingrese NOMBRE: ");
				String nombreJugador = scanner.next();
				System.out.println("Ingrese APELLIDO: ");
				String apellidoJugador = scanner.next();
				
				for(Jugador j: jugadores) {
					if(j.getNombre().equals(nombreJugador) && j.getApellido().equals(apellidoJugador)) {
						System.out.println(j.toString());
					}
				}
				
				break;
			case 3:
				jugadores.sort(Comparator.comparing(Jugador::getApellido));
				jugadores.forEach(jug -> System.out.println(jug));
				break;
			case 4:
				System.out.println("Ingrese NOMBRE: ");
				String modificaNombre = scanner.next();
				System.out.println("Ingrese APELLIDO: ");
				String modificaApellido = scanner.next();
				for(Jugador j: jugadores) {
					if(j.getNombre().equals(modificaNombre) && j.getApellido().equals(modificaApellido)) {
						System.out.println("Ingrese nombre: ");
						j.setNombre(scanner.next());
						System.out.println("Ingrese Apellido: ");
						j.setApellido(scanner.next());
						System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
						String fechaNac = scanner.next();
						DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate fechaNacimiento2 = LocalDate.parse(fechaNac, formato2);
						j.setFechaDeNacimiento(fechaNacimiento2);
						System.out.println("Ingrese Nacionalidad: ");
						j.setNacionalidad(scanner.next());
						System.out.println("Ingrese estatura: ");
						j.setEstatura(scanner.nextFloat());
						System.out.println("Ingrese peso: ");
						j.setPeso(scanner.nextFloat());
						System.out.println("Ingrese posicion (delantero,medio,defensa,arquero): ");
						j.setPosicion(scanner.next());

					}
				}
				break;
			case 5:
				
				System.out.println("Ingrese nombre de jugador a eliminar: ");
				String nombreEliminar = scanner.next();
				System.out.println("Ingrese apellido de jugador a eliminar: ");
				String apellidoEliminar = scanner.next();
			
				Iterator iterator = jugadores.iterator();
				while(iterator.hasNext()) {
					Jugador j = (Jugador)iterator.next();
					if(j.getNombre().equals(nombreEliminar) && j.getApellido().equals(apellidoEliminar)) {
						iterator.remove();
					}
				}
				break;
			case 6:
				System.out.println("La cantidad de Jugadores es: "+jugadores.size());
				break;
			case 7:
				int c = 0;
				System.out.println("Ingrese nacionalidad que busca: ");
				String nacionalidadBuscar = scanner.next();
				for(Jugador j: jugadores) {
					if(j.getNacionalidad().equals(nacionalidadBuscar)) {
						c++;
					}
				}
				System.out.println("La cantidad total de jugadores de "+nacionalidadBuscar+" es "+c);
				
				
				break;
			case 8:
				System.out.println("Fin del programa");
				break;
			}
		}while(opc != 8);
		
	}
	public static void menu() {
		System.out.println("*** MENU ***");
		System.out.println("1- Alta de Jugador");
		System.out.println("2- Mostrar Datos del Jugador");
		System.out.println("3- Mostrar todos los jugadores");
		System.out.println("4- Modificar datos de un Jugador");
		System.out.println("5- Eliminar Jugador");
		System.out.println("6- Mostrar la cantidad total de jugadores");
		System.out.println("7- Mostrar la cantidad de jugadores por nacionalidad");
		System.out.println("8-Salir");
		}


}
