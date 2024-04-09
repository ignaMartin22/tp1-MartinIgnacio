package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
 private int n;
 public CalculadoraEspecial() {
	// TODO Auto-generated constructor stub
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
 
public int calcularSumatoria() {
	int resultado = 0;
	for(int k=1; k<=n;k++) {
		resultado += Math.pow(((k*(k+1))/2),2);
	}
return resultado;	
}

public int calcularProductorial() {
	int resultado = 1;
	for(int k=1;k<=n;k++) {
		resultado *= k*(k+4);
	}
	
	return resultado;
}

}
