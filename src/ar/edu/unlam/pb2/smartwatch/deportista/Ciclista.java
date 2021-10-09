package ar.edu.unlam.pb2.smartwatch.deportista;

public class Ciclista extends Deportista {
	private ZonaDeFrecuenciaCardiaca zonaDeFrecuenciaCardiacaActual;

	public Ciclista() {
		super();
	}

	public Ciclista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.CICLISMO);
		this.zonaDeFrecuenciaCardiacaActual = new ZonaDeFrecuenciaCardiaca();
	}

	public ZonaDeFrecuenciaCardiaca getZonaDeFrecuenciaCardiacaActual() {
		return zonaDeFrecuenciaCardiacaActual;
	}


	public Double velocidad(Double distanciaEnKm,Double tiempoEnSegundos) {
		Double velocidadTotal=0.0;
		Double tiempoEnHoras=0.0;
		
		tiempoEnHoras=tiempoEnSegundos/3600.0;
		
		velocidadTotal=distanciaEnKm/tiempoEnHoras;
		
		return velocidadTotal;
	}
	public Double cadencia(Double pedaleadas, Double tiempoEnSegundos) {
		Double tiempoEnMinutos=0.0;
		Double cadenciaEnRPM=0.0;
		
		tiempoEnMinutos=tiempoEnSegundos/60.0;
		
		cadenciaEnRPM=pedaleadas*tiempoEnMinutos;
		
		return cadenciaEnRPM;
	}
	
	public ZonaDeFrecuenciaCardiaca getZonaDeFrecuenciaCardiacaActual(Double fc) {
		this.zonaDeFrecuenciaCardiacaActual.calcularZonaFrecuenciaCardiacaActual(super.getEdadActual(), fc);
		return this.zonaDeFrecuenciaCardiacaActual;
	}
	
	public void setZonaDeFrecuenciaCardiacaActual(ZonaDeFrecuenciaCardiaca zonaDeFrecuenciaCardiacaActual) {
		this.zonaDeFrecuenciaCardiacaActual = zonaDeFrecuenciaCardiacaActual;
	}
	public Double velocidad() {
		return 0.0;
	}
	public Double cadencia() {
		return 0.0;
	}
	
}
