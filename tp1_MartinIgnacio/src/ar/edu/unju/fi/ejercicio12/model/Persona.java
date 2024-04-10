package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {

	private String nombre;
	private Calendar fechaNacimiento;
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public long edadPersona() {
		Calendar hoy = Calendar.getInstance();
		long milisegundos = hoy.getTimeInMillis()- fechaNacimiento.getTimeInMillis();
		long edad = milisegundos/1000/60/60/24/365;
		return edad;
	}
	
	public String signoZodiaco() {
		String signo = "nulo";
		int mes = fechaNacimiento.get(Calendar.MONTH);
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if(mes == 2 && dia >= 21 || mes == 3 && dia <= 19) {
			signo = "Aries";
		}else {
			if(mes==3 && dia >= 20 || mes == 4 && dia <=20) {
				signo = "Tauro";
			}else {
				if(mes == 4 && dia >= 21 || mes == 5 && dia <=20) {
					signo = "Géminis";
				}else {
					if(mes == 5 && dia >= 21 || mes == 6 && dia <= 22) {
						signo = "Cáncer";
					}else {
						if(mes== 6 && dia >= 23 || mes == 7 && dia <=22) {
							signo = "Leo";
						}else {
							if(mes == 7 && dia >= 23 || mes == 8 && dia <= 22) {
								signo = "Virgo";
							}else {
								if(mes == 8 && dia >=23 || mes == 9 && dia <= 22) {
									signo = "Libra";
								}else {
									if(mes == 9 && dia >= 23 || mes == 10 && dia <=21) {
										signo = "Escorpio";
									}else {
										if(mes == 10 && dia >= 22 || mes == 11 && dia <= 21) {
											signo = "Sagitario";
										}else {
											if(mes == 11 && dia >= 22 || mes == 0 && dia <= 19 ) {
												signo = "Capricornio";
											}else {
												if(mes == 0  && dia >= 20 || mes == 1 && dia <= 18) {
													signo = "Acuario";
												}else {
													if(mes == 1 && dia >= 19 || mes == 2 && dia <= 20) {
														signo = "Piscis";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return signo;
	}// termina
	
	public String estacionDelAno() {
		String estacion = "nulo";
		int mes = fechaNacimiento.get(Calendar.MONTH);
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if(mes>=2 && dia >= 20 || mes <= 5 && dia <= 20) {
			estacion = "Otoño";
		}else {
			if(mes >= 5 && dia >= 21 || mes <= 8 && dia <= 22) {
				estacion = "Invierno";
			}else {
				if(mes >= 8 && dia >=23 || mes <= 11 && dia <=21) {
					estacion = "Primavera";
				}else {
					estacion = "Verano";
				}
			}
		}
		
		return estacion;
	}
	
	public void mostrarDatos() {
		int mes = fechaNacimiento.get(Calendar.MONTH)+1;
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha de Nacimiento: "+fechaNacimiento.get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+fechaNacimiento.get(Calendar.YEAR));
        System.out.println("Edad: "+this.edadPersona());
        System.out.println("Signo del zodiaco: "+this.signoZodiaco());
        System.out.println("Estación: "+this.estacionDelAno());
	}
}
