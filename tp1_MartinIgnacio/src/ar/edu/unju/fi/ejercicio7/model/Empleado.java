package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	private String nombre;
	private String legajo;
	private Float salario;
	
	private static final Float SALARIO_MINIMO=210000.00f;
	private static final Float AUMENTO = 20000.00f;
	
	public Empleado(String nombre, String legajo, Float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO; 
		}
	}

	public void mostrarEmpleado() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: "+salario);
	}
	
	public void aumentarSalario() {
		salario += AUMENTO;
	}
	

	
	
	
}
