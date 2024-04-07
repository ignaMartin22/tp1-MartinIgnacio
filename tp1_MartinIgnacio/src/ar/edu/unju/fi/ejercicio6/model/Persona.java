package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

 public class Persona{
	 private int dni;
	 private String nombre;
	 private LocalDate fechaDeNacimiento;
	 private String provincia;
	 
	 public Persona() { // constructor vacio
		// TODO Auto-generated constructor stub
	}

	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento, String provincia) { // constructor parametrizado
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento) { // constructor con provincia por defecto
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	 
	public int calcularEdad() {		
		return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
	}
	public boolean mayorDeEdad(int edad) {
		return edad > 18;
	}
	public void mostrarCampos() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		System.out.println("Fecha de Nacimiento: "+this.fechaDeNacimiento);
		System.out.println("Provincia: "+this.provincia);
		int edad = this.calcularEdad();
		System.out.println("Edad: "+edad);
		if(this.mayorDeEdad(edad)) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	}
 }

