package ar.edu.unlam.adminSmartwatch;

import java.util.Scanner;

import ar.edu.unlam.pb2.smartwatch.Ciclista;

public class mainSmartwatch {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Bienvenido");
		Integer opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				opcionCarrera();
				break;
			case 2:
				
			
				opcionCiclismo();
				break;
			case 3:
				opcionNatacion();
				break;
			case 4:
				opcionCaminata();
				break;
			case 9:
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}
		} while (opcion != 9);
	}

	public static Ciclista crearCiclista() {
		String nombre="";
		nombre=teclado.next();
		Integer edad=0;
		edad=teclado.nextInt();
		Double peso=0.0;
		peso=teclado.nextDouble();
		Double altura=0.0;
		altura=teclado.nextDouble();
		
		Ciclista ciclista=new Ciclista(nombre,edad,peso,altura);
		
		return ciclista;
	}

	public static void opcionCarrera() {
		Integer opcionCorredor = menuCorredor();
		switch (opcionCorredor) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 9:
			break;
		default:
			System.out.println("Opción Invalida");
			break;
		}
	}

	public static void opcionCiclismo() {
		Integer opcionCiclista = menuCiclista();
		switch (opcionCiclista) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 9:
			break;
		default:
			System.out.println("Opción Invalida");
			break;
		}
	}

	public static void opcionNatacion() {
		Integer opcionNadador = menuNadador();
		switch (opcionNadador) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 9:
			break;
		default:
			System.out.println("Opción Invalida");
			break;
		}
	}

	public static void opcionCaminata() {
		Integer opcionCaminador = menuCaminador();
		switch (opcionCaminador) {
		case 1:
			break;
		case 2:
			break;
		case 9:
			break;
		default:
			System.out.println("Opción Invalida");
			break;
		}
	}

	private static Integer menuCorredor() {
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Runner -- Elija una opcion\n");
		System.out.println("1 - Distancia recorrida");
		System.out.println("2 - Tiempo transcurrido");
		System.out.println("3 - Ritmo");
		System.out.println("4 - Zona de frecuencia cardiaca");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion:");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;

	}

	private static Integer menuCiclista() {
		crearCiclista();
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Ciclista -- Elija una opcion\n");
		System.out.println("1 - Distancia recorrida");
		System.out.println("2 - Tiempo transcurrido");
		System.out.println("3 - Velocidad");
		System.out.println("4 - Zona de frecuencia cardiaca");
		System.out.println("5 - Cadencia");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion:");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;

	}

	private static Integer menuNadador() {
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Nadador -- Elija una opcion\n");
		System.out.println("1 - Distancia recorrida");
		System.out.println("2 - Tiempo transcurrido");
		System.out.println("3 - Ritmo");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion:");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;

	}

	private static Integer menuCaminador() {
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Caminador -- Elija una opcion\n");
		System.out.println("1 - Distancia recorrida");
		System.out.println("2 - Tiempo transcurrido");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion:");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;

	}

	private static Integer seleccionarOpcion() {

		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu -- Elija una disciplina\n");
		System.out.println("1 - Carrera");
		System.out.println("2 - Ciclismo");
		System.out.println("3 - Natacion");
		System.out.println("4 - Caminata");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion:");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

}
