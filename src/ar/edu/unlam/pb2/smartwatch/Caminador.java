package ar.edu.unlam.pb2.smartwatch;

public class Caminador extends Deportista {

	public Caminador() {
		super();
	}

	public Caminador(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.CAMINATA);
	}
	

}
