package ar.edu.unlam.pb2.smartwatch;

public class Nadador extends Deportista {
	private ZonaDeFrecuenciaCardiaca zonaDeFrecuanciaCardiacaActual;

	public Nadador(ZonaDeFrecuenciaCardiaca zonaDeFrecuanciaCardiacaActual, String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual,pesoActual,alturaActual);
		setTipoDeDisciplina(Disciplina.NATACION);
		this.zonaDeFrecuanciaCardiacaActual = zonaDeFrecuanciaCardiacaActual;
	}
	public double ritmo(double x) {
		return 0.0;
	}

	
	
}
