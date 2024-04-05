package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor ingrese un numero: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) { // si el numero es par
			System.out.println("El número ingresado es par: "+numero*3);
		}else {
			System.out.println("El número ingresado es impar: "+numero*2);
		}
		
		scanner.close();
	}

}
