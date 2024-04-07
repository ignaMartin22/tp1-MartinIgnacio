package ar.edu.unju.fi.ejercicio7.main;


import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese Nombre de Empleado: ");
		String nombre = scanner.next();
		System.out.println("Ingrese numero de legajo: ");
		String legajo = scanner.next();
		System.out.println("Ingrese Salario: ");
		Float salario = scanner.nextFloat();
		
		Empleado empleadoUno = new Empleado(nombre, legajo, salario);
		
		empleadoUno.mostrarEmpleado();;
		empleadoUno.aumentarSalario();
		empleadoUno.mostrarEmpleado();;
		
		scanner.close();
	}

}
