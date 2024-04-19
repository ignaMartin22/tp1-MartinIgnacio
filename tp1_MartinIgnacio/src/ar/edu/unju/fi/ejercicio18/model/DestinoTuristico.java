package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
private int codigo;
private String nombre;
private float precio;
private Pais pais;
private int dias;


public DestinoTuristico() {
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + ", Pais[ " + pais+" ]"
			+ ", Dias: " + dias;
}


public int getCodigo() {
	return codigo;
}


public void setCodigo(int codigo) {
	this.codigo = codigo;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public float getPrecio() {
	return precio;
}


public void setPrecio(float precio) {
	this.precio = precio;
}


public Pais getPais() {
	return pais;
}


public void setPais(Pais pais) {
	this.pais = pais;
}


public int getDias() {
	return dias;
}


public void setDias(int dias) {
	this.dias = dias;
}



}
