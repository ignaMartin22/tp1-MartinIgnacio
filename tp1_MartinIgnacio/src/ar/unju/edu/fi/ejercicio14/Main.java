package ar.unju.edu.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int tamaño;
		do {
		System.out.println("Ingrese el tamaño del arreglo(3-10): ");
		tamaño = scanner.nextInt();
		}while(tamaño > 10 || tamaño < 3);
		
		int [] arreglo = new int[tamaño];
		
		for(int i = 0 ;  i<arreglo.length;i++) {
			System.out.println("Ingrese entero a agregar al arreglo: ");
			arreglo[i]=scanner.nextInt();
		}
		
		for(int j = 0; j<arreglo.length; j++ ) {
			System.out.println("Posición ["+j+"]: "+arreglo[j]);
		}
		
		scanner.close();
	}

}
