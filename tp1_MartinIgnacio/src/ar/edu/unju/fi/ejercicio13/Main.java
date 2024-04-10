package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] valor = new int [8];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i<valor.length;i++) {
			System.out.println("ingrese numero: ");
			valor[i]=scanner.nextInt();
		}
		scanner.close();
		
		for(int j=0;j<valor.length;j++) {
			System.out.println("Posición ["+j+"]: "+valor[j]);
		}

	}

}
