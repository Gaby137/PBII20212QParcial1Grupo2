package ar.edu.unlam.pb2.smartwatch.deportista;

public class Runner extends Deportista {
	private ZonaDeFrecuenciaCardiaca zonaDeFrecuenciaCardiacaActual;

	public Runner() {
		super();
	}

	public Runner(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.CARRERA);
	}

	public Double ritmo() {
		return 0.0;
	}

	public ZonaDeFrecuenciaCardiaca getZonaDeFrecuenciaCardiacaActual() {
		return zonaDeFrecuenciaCardiacaActual;
	}

	public void setZonaDeFrecuenciaCardiacaActual(ZonaDeFrecuenciaCardiaca zonaDeFrecuenciaCardiacaActual) {
		this.zonaDeFrecuenciaCardiacaActual = zonaDeFrecuenciaCardiacaActual;
	}

}
