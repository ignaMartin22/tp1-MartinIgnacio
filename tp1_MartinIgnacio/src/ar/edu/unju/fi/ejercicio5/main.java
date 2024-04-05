package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor ingrese un numero entre 1 y 9: ");
		int numero = scanner.nextInt();
		scanner.close();
		for(i = 0; i<=10; i++) {
			System.out.println(numero+" X  "+i+" = "+numero*i);
		}
	}

}
