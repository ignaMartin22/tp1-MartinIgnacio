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
		personaUno.setNombre(scanner.next());
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
		personaUno.setProvincia(scanner.next());

		
		personaUno.mostrarCampos();
		System.out.println("**********");		
		System.out.println("SEGUNDA PERSONA");
		System.out.println("**********");
		System.out.println("Nombre: ");
		String nombre = scanner.next();
		System.out.println("DNI: ");
		int dni = scanner.nextInt();
		System.out.println("Introduzca Dia de Nacimiento: ");
		dia =  scanner.nextInt();
		System.out.println("Introduzca mes de Nacimiento: ");
		mes = scanner.nextInt();
		System.out.println("Introduzca año de Nacimiento: ");
		anio = scanner.nextInt();
		System.out.println("Provincia: ");
		String provincia = scanner.next();
		Persona personaDos =  new Persona(dni, nombre, LocalDate.of(anio, mes, dia), provincia);
		
		personaDos.mostrarCampos();
		
		System.out.println("TERCER PERSONA");
		System.out.println("Nombre: ");
		nombre = scanner.next();
		System.out.println("DNI: ");
		dni = scanner.nextInt();
		System.out.println("Introduzca Dia de Nacimiento: ");
		dia =  scanner.nextInt();
		System.out.println("Introduzca mes de Nacimiento: ");
		mes = scanner.nextInt();
		System.out.println("Introduzca año de Nacimiento: ");
		anio = scanner.nextInt();
		
		Persona personaTres = new Persona(dni, nombre, LocalDate.of(anio, mes, dia));
		
		personaTres.mostrarCampos();
		
		scanner.close();
	}

}
