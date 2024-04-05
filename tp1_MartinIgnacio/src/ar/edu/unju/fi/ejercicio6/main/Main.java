package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		int dia, mes, anio;
		Scanner scanner = new Scanner(System.in);
		Persona personaUno = new Persona();
		
		System.out.println("Introduzca Nombre: ");
		personaUno.setNombre(scanner.nextLine());
		System.out.println("Introduzca DNI: ");
		personaUno.setDni(scanner.nextInt());

		System.out.println("Introduzca Dia de Nacimiento: ");
		dia =  scanner.nextInt();
		System.out.println("Introduzca mes de Nacimiento: ");
		mes = scanner.nextInt();
		System.out.println("Introduzca año de Nacimiento: ");
		anio = scanner.nextInt();
		personaUno.setFechaDeNacimiento(LocalDate.of(anio, mes, dia));

		System.out.println("Introduzca Provincia: ");
		personaUno.setProvincia(scanner.nextLine());

		
		personaUno.mostrarCampos();

		scanner.close();
	}

}
