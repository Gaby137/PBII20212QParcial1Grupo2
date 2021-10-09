package ar.edu.unlam.pb2.smartwatch.deportista;

public class Runner extends Deportista {
	private ZonaDeFrecuenciaCardiaca zonaDeFrecuenciaCardiacaActual;

	public Runner() {
		super();
	}

	public Runner(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.CARRERA);
		this.zonaDeFrecuenciaCardiacaActual = new ZonaDeFrecuenciaCardiaca();
	}

	public Double ritmo() {
		return 0.0;
	}

	public ZonaDeFrecuenciaCardiaca getZonaDeFrecuenciaCardiacaActual(Double fc) {
		this.zonaDeFrecuenciaCardiacaActual.calcularZonaFrecuenciaCardiacaActual(super.getEdadActual(), fc);
		return this.zonaDeFrecuenciaCardiacaActual;
	}

	public void setZonaDeFrecuenciaCardiacaActual(ZonaDeFrecuenciaCardiaca zonaDeFrecuenciaCardiacaActual) {
		this.zonaDeFrecuenciaCardiacaActual = zonaDeFrecuenciaCardiacaActual;
	}

}
