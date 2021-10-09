package ar.edu.unlam.adminSmartwatch;

import java.util.Scanner;

import ar.edu.unlam.pb2.smartwatch.deportista.Caminador;
import ar.edu.unlam.pb2.smartwatch.deportista.Ciclista;
import ar.edu.unlam.pb2.smartwatch.deportista.Deportista;
import ar.edu.unlam.pb2.smartwatch.deportista.Nadador;
import ar.edu.unlam.pb2.smartwatch.deportista.Runner;
import ar.edu.unlam.pb2.smartwatch.sensor.Brazada;
import ar.edu.unlam.pb2.smartwatch.sensor.Paso;
import ar.edu.unlam.pb2.smartwatch.sensor.Pedaleo;

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
		String nombre;
		Integer edadActual;
		Double pesoActual, alturaActual;
		Runner nuevo;
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
		
		nuevo Runner (nombre,edadActual,pesoActual,alturaActual);//tira error porque falta la clase runner completar
		
		Paso pasos = new Paso(95);
		
		System.out.println("* Hola " + nuevo.getNombre()+" \n*");
		
		System.out.println("\nDistancia recorrida: "+ nuevo.distanciaRecorrida(pasos.getCantPasos(), Paso.LONGITUD_DE_UN_PASO));
		System.out.println("\nTiempo transcurrido: " + nuevo.tiempoTrascurrido(pasos.getCantPasos()));
		
		
		
		
		/*Integer opcionCorredor = menuCorredor();
		switch (opcionCorredor) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:					//esto no iria ya que el reloj debe mostrar todos los metodos. 
		 						//llamar a los metodos desde el objeto instanciado Runner; 
			break;
		case 9:
			break;
		default:
			System.out.println("Opción Invalida");
			break;
		}*/
	}

	public static void opcionCiclismo() {
		
		String nombre;
		Integer edadActual;
		Double pesoActual, alturaActual;
		Ciclista nuevo;
		
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
		System.out.println("*****************************");
		
		nuevo = new Ciclista(nombre,edadActual,pesoActual,alturaActual);
		
		Pedaleo pedaleo = new Pedaleo(95);
		System.out.println("* Hola *" + nuevo.getNombre()+" \n");
		
		System.out.println("\nDistancia recorrida: "+ nuevo.distanciaRecorrida(pedaleo.getCantPedaleos(), Brazada.LONGITUD_DE_BRAZADA));
		System.out.println("\nTiempo transcurrido: " + nuevo.tiempoTrascurrido(pedaleo.getCantPedaleos()));
		
		
		/*Integer opcionCiclista = menuCiclista();
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
		}*/
	}

	public static void opcionNatacion() {
		String nombre;
		Integer edadActual;
		Double pesoActual, alturaActual;
		Nadador nuevo;
		
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
		System.out.println("*****************************");
		
		nuevo = new Nadador(nombre,edadActual,pesoActual,alturaActual);
		
		Brazada brazadas = new Brazada(95);
		System.out.println("* Hola *" + nuevo.getNombre()+" \n");
		
		System.out.println("\nDistancia recorrida: "+ nuevo.distanciaRecorrida(brazadas.getContBrazada(), Brazada.LONGITUD_DE_BRAZADA));
		System.out.println("\nTiempo transcurrido: " + nuevo.tiempoTrascurrido(brazadas.getContBrazada()));
		System.out.println("\nRitmo: " + nuevo.calcularElRitmo());
		
		
		/*Integer opcionNadador = menuNadador();
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
		}*/
	}

	public static void opcionCaminata() {
		
		String nombre;
		Integer edadActual;
		Double pesoActual, alturaActual;
		Caminador nuevo;
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
		System.out.println("*****************************");
		
		nuevo = new Caminador(nombre,edadActual,pesoActual,alturaActual);
		
		Paso pasos = new Paso(95);
		
		System.out.println("* Hola " + nuevo.getNombre()+" \n*");
		
		System.out.println("\nDistancia recorrida: "+ nuevo.distanciaRecorrida(pasos.getCantPasos(), Paso.LONGITUD_DE_UN_PASO));
		System.out.println("\nTiempo transcurrido: " + nuevo.tiempoTrascurrido(pasos.getCantPasos()));
		
		/*Integer opcionCaminador = menuCaminador();
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
		}*/
	}

	/*private static Integer menuCorredor() {
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
		/*System.out.println("Ciclista -- Elija una opcion\n");
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

	}*/

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
