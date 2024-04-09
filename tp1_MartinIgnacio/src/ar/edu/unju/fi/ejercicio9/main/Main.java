package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 3; i>0;i--) {
			Producto producto = new Producto();
			System.out.println("Ingrese nombre de producto: ");
			String nombre = scanner.next();
			System.out.println("Ingrese código del producto: ");
			int codigo = scanner.nextInt();
			System.out.println("Ingrese precio del producto: ");
			Float precio = scanner.nextFloat();
			System.out.println("Ingrese descuento: ");
			int descuento = scanner.nextInt();
			
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			System.out.println("Producto N°"+i);
			System.out.println("Aplicando descuento...");
			producto.calcularDescuento();
			producto.mostrarAtributos();
			
		}
		scanner.close();
		

	}

}
