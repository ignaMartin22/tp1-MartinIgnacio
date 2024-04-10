package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tamano;
		do {
			System.out.println("Ingrese tamaño del array (5-10): ");
			tamano = scanner.nextInt();
		}while(tamano < 5 || tamano >10);
		
		String [] nombres = new String [tamano];
		
		for(int i = 0; i<nombres.length;i++) {
			System.out.println("Ingrese nombre: ");
			nombres[i]=scanner.next();
		}
		
		System.out.println("INICIO A FIN");
		for(int j = 0;j<nombres.length;j++){
			System.out.println("Posición ["+j+"]: "+nombres[j]);
		}
		
		System.out.println("FINAL A INICIO");
		for(int k= nombres.length-1;k>=0;k--){
			System.out.println("Posición ["+k+"]: "+nombres[k]);
		}

	}

}
