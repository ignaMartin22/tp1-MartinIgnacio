package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		Calendar fecha = Calendar.getInstance();
		
		System.out.println("Ingrese nombre: ");
		persona.setNombre(scanner.next());
		System.out.println("Ingrese Dia de Nacimiento: ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese mes de Nacimiento: ");
		int mes = scanner.nextInt()-1;
		System.out.println("Ingrese año de Nacimiento: ");
		int anio = scanner.nextInt();
		fecha.set(anio, mes, dia);
		persona.setFechaNacimiento(fecha);
		
		persona.mostrarDatos();
		
	}

}
