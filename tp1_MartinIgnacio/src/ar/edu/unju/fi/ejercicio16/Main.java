package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nombres = new String[5];
		
		for(int i = 0; i<nombres.length;i++) {
			System.out.println("Ingrese nombre: ");
			nombres[i]=scanner.next();
		}
		
		int j = 0;
		while(j <nombres.length) {
			System.out.println("Posición ["+j+"]: "+nombres[j]);
			j++;
		}
		
		byte i;
		int k = 5;
		do {
			int p=0;
		  System.out.println("Ingrese la posición del elemento a eliminar: ");
		   i = scanner.nextByte();
		   
			while(i<nombres.length-1) {
				nombres[i]=nombres[i+1];
				i++;
			}
			nombres[nombres.length-1] = " ";

			j = 0;
			while(j <nombres.length) {
				System.out.println("Posición ["+j+"]: "+nombres[j]);
				j++;
			}
		     k--;
		}while(k > 0);
		
		
		
		
	}

}
