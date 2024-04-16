package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
private int codigo;
private String Nombre;
public Pais() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Código de Pais: " + codigo + ", Nombre de Pais:  " + Nombre;
}

public Pais(int codigo, String nombre) {
	super();
	this.codigo = codigo;
	Nombre = nombre;
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}

}
