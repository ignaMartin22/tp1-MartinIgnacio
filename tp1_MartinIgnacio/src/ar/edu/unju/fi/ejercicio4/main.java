package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		do {  // uso el do-while solo como bucle de control para que no se permita el ingreso de un numero mayor a 10 o negativo
			System.out.println("Ingrese numero: ");
			i = scanner.nextInt();
		} while(i > 10 || i < 0);
		
		int factorial = 1;
		while(i > 0) { // Aqui uso el while con el objetivo de calcular el factorial
			factorial *= i--;
		}
		System.out.println("Factorial: "+factorial);
		
		scanner.close();
	}

}
