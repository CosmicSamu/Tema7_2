package ej2;

import java.util.Scanner;

public class Maquinistas extends Empresa {

	
	private int numeroMaquina;
	private int añosMaquina;

	public Maquinistas() {
		
		MeterDatos();
	}

	
	public String DevolverDatos() {
		return "nombre: " + nombre + " edad: " + edad + " numero de maquina: " + numeroMaquina + " años con esa maquina: " + añosMaquina;

	}

	
	public void MeterDatos() {
		
		System.out.println("introduce nombre: ");
		setNombre(teclado.next());
		
		System.out.println("introduce edad: ");
		setEdad(teclado.nextInt());
		
		System.out.println("introduce tu numero de maquina: ");
		setNumeroMaquina(teclado.nextInt());
		
		System.out.println("introduce los años con tu maquina: ");
		setAñosMaquina(teclado.nextInt());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroMaquina() {
		return numeroMaquina;
	}

	public void setNumeroMaquina(int numeroMaquina) {
		this.numeroMaquina = numeroMaquina;
	}

	public int getAñosMaquina() {
		return añosMaquina;
	}

	public void setAñosMaquina(int añosMaquina) {
		this.añosMaquina = añosMaquina;
	}

	
}
