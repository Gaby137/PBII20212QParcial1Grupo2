package ar.edu.unlam.pb2.smartwatch.deportista;

public class Nadador extends Deportista {
	public Nadador() {
		super();
	}

	public Nadador(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.NATACION);
	}

	public double ritmo(double x) {
		return 0.0;
	}

}
