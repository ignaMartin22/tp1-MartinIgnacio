package ar.edu.unju.fi.ejercicio8.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
public class Main {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Introduzca numero: ");
		int n  = scanner.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		
		System.out.println("Productorial: "+calculadora.calcularProductorial());
		System.out.println("Sumatoria: "+calculadora.calcularSumatoria());
		
		scanner.close();

	}

}
