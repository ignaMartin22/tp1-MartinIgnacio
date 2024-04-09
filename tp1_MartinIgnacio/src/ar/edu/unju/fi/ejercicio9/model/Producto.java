package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private Float precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public float calcularDescuento() {
		precio -= descuento;
		return precio;
	}
	public void mostrarAtributos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Código: "+codigo);
		System.out.println("Precio: "+precio);
		System.out.println("Descuento: "+descuento);
	}
	
}
