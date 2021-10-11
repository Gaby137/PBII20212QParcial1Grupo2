package ar.edu.unlam.adminSmartwatch;

import java.util.Scanner;

import ar.edu.unlam.pb2.smartwatch.deportista.Caminador;
import ar.edu.unlam.pb2.smartwatch.deportista.Ciclista;
import ar.edu.unlam.pb2.smartwatch.deportista.Nadador;
import ar.edu.unlam.pb2.smartwatch.deportista.Runner;

public class InterfazSmartWatch {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer opcionDeseada = 0;

		String nombre;
		Integer edadActual;
		Double pesoActual, alturaActual;

		System.out.println("*****************************");
		System.out.println("**Complete con sus datos: **");
		System.out.println(" Ingrese su nombre:");
		nombre = teclado.next();
		System.out.println("Ingrese su edad: ");
		edadActual = teclado.nextInt();
		System.out.println("Ingrese su peso actual: ");
		pesoActual = teclado.nextDouble();
		System.out.println("Ingrese su altura actual: ");
		alturaActual = teclado.nextDouble();

		do {

			mostrarOpciones();
			opcionDeseada = teclado.nextInt();

			switch (opcionDeseada) {

			case 1:
				Runner runner = new Runner(nombre, edadActual, pesoActual, alturaActual);
				break;
			case 2:
				Ciclista ciclista = new Ciclista(nombre, edadActual, pesoActual, alturaActual);
				break;
			case 3:
				Nadador nadador = new Nadador(nombre, edadActual, pesoActual, alturaActual);
				break;
			case 4:
				Caminador caminador = new Caminador(nombre, edadActual, pesoActual, alturaActual);
				break;
			case 5:
//				darPaso();
				break;
			case 6:

				break;
			case 7:

				break;
			default:
				break;

			}

		} while (opcionDeseada != 9);

	}

	private static void mostrarOpciones() {

		System.out.println("* Hola *\n");
		System.out.println("*****************************");
		System.out.println("�Que deporte va a realizar hoy?");
		System.out.println("1 - Corredor");
		System.out.println("2 - Ciclismo");
		System.out.println("3 - Nataci�n");
		System.out.println("4 - Caminador ");
		System.out.println("5 - Dar paso ");
		System.out.println("6 - Dar brazada ");
		System.out.println("7 - Dar pedaleo ");
		System.out.println("9 - Salir");
		System.out.println("*****************************");
		System.out.println("Ingrese una opcion");

	} /*****/ /***/

}
