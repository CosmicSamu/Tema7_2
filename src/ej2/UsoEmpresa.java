package ej2;

import java.util.Scanner;

public class UsoEmpresa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// cuantos queremos en cada grupo
		int grupoA, grupoM, m = 0, empleado = 0,hueco = 0;

		// Numero de empleados que queremos
		System.out.println("cuantos empleados quieres?");
		int numeroEmpleado = teclado.nextInt();
		Empresa[] numeroEmpleados = new Empresa[numeroEmpleado];

		// Dentro del grupo de empleados cuantos maquinistas y administrativos hay

		System.out.println("Cuantos maquinistas quieres?");
		grupoM = teclado.nextInt();

		if (grupoM < numeroEmpleados.length) {
			for (m = 0; m < grupoM; m++) {
				// decimos que ese hueco es maquinista
				numeroEmpleados[m] = new Maquinistas();

			}
		}

		System.out.println("Cuantos Administrativos quieres?");
		grupoA = teclado.nextInt();
		
		
		if (grupoA + grupoM <= numeroEmpleados.length && grupoM != 0) {

			for (m= grupoM; m < grupoA + grupoM; m++) {
				// decimos que ese hueco es maquinista
				numeroEmpleados[m] = new Administrativos();

			}
		} else {
			for (m= 0; m < grupoA + grupoM; m++) {
				// decimos que ese hueco es maquinista
				numeroEmpleados[m] = new Administrativos();

			}
		}
		// empleados
		if (numeroEmpleados.length == grupoA + grupoM) {
			
		} else {
			 hueco =numeroEmpleados.length -(grupoA + grupoM) ;
			
		}

		// damos datos
		System.out.println("Maquinistas: ");
		for (m = 0; m < grupoM; m++) {

			System.out.println(numeroEmpleados[m].DevolverDatos());
		}

		System.out.println("Administrativos: ");
		for (m= grupoM; m < grupoA + grupoM; m++) {
			
			System.out.println(numeroEmpleados[m].DevolverDatos());
		}

		System.out.println("empleados sobrantes: " + hueco);

	}

}
