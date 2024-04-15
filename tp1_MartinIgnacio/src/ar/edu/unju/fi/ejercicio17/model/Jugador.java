package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;


public class Jugador {
private String nombre;
private String apellido;
private LocalDate fechaDeNacimiento;
private String nacionalidad;
private float estatura;
private float peso;
private String posicion;

public Jugador() {
	// TODO Auto-generated constructor stub
}

@Override
	public String toString() {
		return "Nombre: "+nombre+ ", Apellido: "+apellido+ ", Edad: "+this.calcularEdad()+", Fecha de Nacimiento: "+fechaDeNacimiento+", Nacionalidad: "+nacionalidad+", Estatura: "+estatura+", Peso: "+peso+", Posición: "+posicion;
	}
public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellido() {
	return apellido;
}



public void setApellido(String apellido) {
	this.apellido = apellido;
}



public LocalDate getFechaDeNacimiento() {
	return fechaDeNacimiento;
}



public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
	this.fechaDeNacimiento = fechaDeNacimiento;
}



public String getNacionalidad() {
	return nacionalidad;
}



public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}



public float getEstatura() {
	return estatura;
}



public void setEstatura(float estatura) {
	this.estatura = estatura;
}



public float getPeso() {
	return peso;
}



public void setPeso(float peso) {
	this.peso = peso;
}



public String getPosicion() {
	return posicion;
}



public void setPosicion(String posicion) {
	this.posicion = posicion;
}



public int calcularEdad() {
	LocalDate hoy = LocalDate.now();
	Period periodo = Period.between(fechaDeNacimiento, hoy);
	int edad = periodo.getYears();
	return edad;
}
}
