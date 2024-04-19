package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List <Pais> paises = new ArrayList();
		Pais pais1 = new Pais(111,"Argentina");
		Pais pais2 = new Pais(222,"España");
		Pais pais3 = new Pais(333,"Italia");
		Pais pais4 = new Pais(444,"Alemania");
		
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);
		
		int opc = 0;
		List <DestinoTuristico> destinos =  new ArrayList();

		do {
			menu();
			System.out.println("Ingrese opción: ");
			opc = scanner.nextInt();
			switch(opc) {
			case 1:
				DestinoTuristico destino = new DestinoTuristico();
				System.out.println("Ingrese codigo de destino(ej: 1,2,3): ");
				destino.setCodigo(scanner.nextInt());
				System.out.println("Ingrese nombre de destino: ");
				destino.setNombre(scanner.next());
				System.out.println("Ingrese precio: ");
				destino.setPrecio(scanner.nextFloat());
				System.out.println("Ingrese código del pais de destino (111,222,333,444): ");
				int codigoPaisDestino = scanner.nextInt();
				for(Pais p:  paises) {
					if(codigoPaisDestino == p.getCodigo()) {
						destino.setPais(p);
					}
				}
				System.out.println("Ingrese cantidad de dias: ");
				destino.setDias(scanner.nextInt());
				
				destinos.add(destino);
				break;
			case 2:
				for(DestinoTuristico d:  destinos) {
					System.out.println(d.toString());
				}
				break;
				
			case 3:
				System.out.println("Ingrese código de destino a modificar: ");
				int codigoModificar  = scanner.nextInt();
				for(DestinoTuristico d:  destinos) {
					if(codigoModificar == d.getCodigo()) {
						System.out.println("Ingrese codigo de pais nuevo: ");
						int codigoPaisNuevo = scanner.nextInt();
						for(Pais p:  paises) {
							if(codigoPaisNuevo == p.getCodigo()) {
								d.setPais(p);
							}
						}
					}
				}
				break;
				
			case 4: 
				destinos.clear();
				break;
				
			case 5:
				System.out.println("Ingrese codigo de destino turistico a eliminar: ");
				int codigoEliminar =   scanner.nextInt();
				Iterator iterator = destinos.iterator();
				while(iterator.hasNext()) {
					DestinoTuristico d = (DestinoTuristico)iterator.next();
					if(codigoEliminar == d.getCodigo()) {
						iterator.remove();
					}
				}
				break;
				
			case 6:
				destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
				destinos.forEach(des -> System.out.println(des));
				break;
				
			case 7:
				paises.forEach(p -> System.out.println(p));
				break;
				
			case 8:
				System.out.println("Ingrese el codigo del pais: ");
				int codigoBuscar  = scanner.nextInt();
				for(DestinoTuristico d: destinos) {
				if(d.getPais().getCodigo() == codigoBuscar) {
					System.out.println(d);
				}
				}
				break;
			
			case 9:
				System.out.println("FIN DEL PROGRAMA");
				break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				
			}
			
			
		}while(opc != 9);
	}

	public static void menu() {
		System.out.println("*** MENU ***");
		System.out.println("1- Alto de destino turístico");
		System.out.println("2- Mostrar Destinos Turísticos");
		System.out.println("3- Modificar el pais de un destino turístico");
		System.out.println("4- Limpiar destinos turísticos");
		System.out.println("5- Eliminar Destino turístico");
		System.out.println("6- Mostrar destino turístico por nombre");
		System.out.println("7- Mostrar todos los paises");
		System.out.println("8- Mostrar destinos turisticos de un pais");
		System.out.println("9- Salir");
	}
}
