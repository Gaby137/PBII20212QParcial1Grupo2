package ar.edu.unlam.pb2.smartwatch;

public class Deportista {
	private String nombre;
	private Integer edadActual;
	private Double pesoActual;
	private Double alturaActual;
	private Integer pasosDiarios;
	protected Disciplina tipoDeDisciplina;

	public Deportista() {

	}

	public Deportista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super();
		this.nombre = nombre;
		this.edadActual = edadActual;
		this.pesoActual = pesoActual;
		this.alturaActual = alturaActual;
		this.pasosDiarios = 0;
	}

	public Disciplina getTipoDeDisciplina() {
		return tipoDeDisciplina;
	}

	public void setTipoDeDisciplina(Disciplina tipoDeDisciplina) {
		this.tipoDeDisciplina = tipoDeDisciplina;
	}

	public Double distanciaRecorrida(Integer cantidadMovimentos, Double longitud) {
		return cantidadMovimentos * longitud;
	}

	public void tiempoTrascurrido() {

	}

	public Double calcularElRitmo() {
		return 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(Integer edadActual) {
		this.edadActual = edadActual;
	}

	public double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}

	public int getPasosDiarios() {
		return pasosDiarios;
	}

	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}
}
