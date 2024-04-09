package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
private int diametro;
private float precio;
private double area;
private boolean ingredientesEspeciales;

private static final int INGREDIENTE_ESPECIAL20 = 500;
private static final int INGREDIENTE_ESPECIAL30 = 750;
private static final int INGREDIENTE_ESPECIAL40 = 1000;


public Pizza() {
	// TODO Auto-generated constructor stub
}

public int getDiametro() {
	return diametro;
}
public void setDiametro(int diametro) {
	this.diametro = diametro;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public double getArea() {
	return area;
}
public void setArea(float area) {
	this.area = area;
}
public boolean isIngredientesEspeciales() {
	return ingredientesEspeciales;
}
public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
	this.ingredientesEspeciales = ingredientesEspeciales;
}

public void calcularPrecio() {
	
	switch(diametro) {
	case 20:
		if(ingredientesEspeciales == true) {
			precio = 4500 + INGREDIENTE_ESPECIAL20;
		}else {
			precio = 4500;
		}
		break;
	case 30:
		if( ingredientesEspeciales == true) {
			precio = 4800 + INGREDIENTE_ESPECIAL30;
		}else {
			precio = 4800;
		}
		break;
	case 40:
		if(ingredientesEspeciales == true) {
			precio = 5500 + INGREDIENTE_ESPECIAL40;
		}else {
			precio = 5500;
		}
		break;
	}
	}

public double calcularArea() {
	double radio = diametro/2;
	area = Math.PI*(Math.pow(radio,2));
	
	return area;
}

public void mostrarAtributos() {
	System.out.println("Diámetro: "+diametro+"cm");
	System.out.println("Ingredientes especiales: "+ingredientesEspeciales);
	System.out.println("Precio pizza: $"+precio);
	System.out.println("Area de la pizza: "+area+"cm");
}

}
