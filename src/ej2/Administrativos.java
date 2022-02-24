package ej2;

public class Administrativos extends Empresa{
	private String nombre;
	private int edad;
	private String estudios;
	private int numeroOrdenador;
	
	public Administrativos() {
		
		MeterDatos();
		
	}

	public void MeterDatos() {
		System.out.println("introduce nombre: ");
		setNombre(teclado.next());
		
		System.out.println("introduce edad: ");
		setEdad(teclado.nextInt());
		
		System.out.println("introduce tu numero de ordenador: ");
		setNumeroOrdenador(teclado.nextInt());
		
		System.out.println("introduce tu titulo: ");
		setEstudios(teclado.next());
		
	}

	
	public String DevolverDatos() {
		
		return "nombre: " + nombre + " edad: " + edad + " estudios: " + estudios + " numero del ordenador: " + numeroOrdenador;
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

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public int getNumeroOrdenador() {
		return numeroOrdenador;
	}

	public void setNumeroOrdenador(int numeroOrdenador) {
		this.numeroOrdenador = numeroOrdenador;
	}
	
	

}
