package ar.edu.unlam.pb2.smartwatch;

public class Deportista { //--> No puede ser abtracta porque el objerto se instancia 
	private String nombre;
	private Integer  edadActual;
	private Double pesoActual;
	private Double alturaActual;
	private Integer pasosDiarios;
	private Paso pasos;
	private Double unPaso=0.687;
	protected Disciplina tipoDeDisciplina;
	//private Double distEnCm= pasos*68.;
	private Double distEnMts;
	private Double distEnKms = distEnMts/1000;

	public Deportista() {

	}

	public Deportista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {

		this.nombre = nombre;
		this.edadActual = edadActual;
		this.pesoActual = pesoActual;
		this.alturaActual = alturaActual;
		this.pasosDiarios =0;
		
	}

	public Double distanciaRecorrida(Paso paso) {
		
		distEnMts=unPaso*pasos.getCantPasos();
		
		return distEnMts ;
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

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public Double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}

	public Integer getPasosDiarios() {
		return pasosDiarios;
	}

	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}

	public Disciplina getTipoDeDisciplina() {
		return tipoDeDisciplina;
	}

	public void setTipoDeDisciplina(Disciplina tipoDeDisciplina) {
		this.tipoDeDisciplina = tipoDeDisciplina;
	}
	
	

}
