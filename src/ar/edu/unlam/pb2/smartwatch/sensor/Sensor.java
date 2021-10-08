package ar.edu.unlam.pb2.smartwatch.sensor;

public abstract class Sensor {
	// la velocidad es metros/segundos
	private Double velocidad;
	private Double cadencia;
	private Double frecuenciaCardiaca;
	private Double tiempoSeg;
	private Double metros;
	private Boolean pulso;
	private Boolean pulsoGPS;

	public Sensor() {

	}

	public Sensor(Double frecuenciaCardiaca) {
		super();
		this.velocidad = 0.0;
		this.cadencia = 0.0;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.tiempoSeg = 0.0;
		this.metros = 0.0;
		this.pulso = false;
		this.pulsoGPS = false;
	}

	public abstract Double calcularVelocidad();

	public Double calcularCadencia() {
//		como un pulso es un paso/brazada/pedaleo en un seg
//		la cadencia es igual a cant de los mismo  por minuto
		return this.cadencia;
	}

	public void darUnPulsoDeGPS() {
		this.pulsoGPS = true;
		this.metros++;
	}

	public void recibirUnPulso() {
		if (this.isPulso()) {
			this.tiempoSeg++;
		}

	}

	public void recibirUnPulsoGPS() {
		if (this.isPulsoGPS()) {
			this.metros++;
		}
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Double getCadencia() {
		return cadencia;
	}

	public void setCadencia(Double cadencia) {
		this.cadencia = cadencia;
	}

	public Double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(Double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public Double getTiempoSeg() {
		return tiempoSeg;
	}

	public void setTiempoSeg(Double tiempoSeg) {
		this.tiempoSeg = tiempoSeg;
	}

	public Double getMetros() {
		return metros;
	}

	public void setMetros(Double metros) {
		this.metros = metros;
	}

	public Boolean isPulso() {
		return pulso;
	}

	public void setPulso(Boolean pulso) {
		this.pulso = pulso;
	}

	public Boolean isPulsoGPS() {
		return pulsoGPS;
	}

	public void setPulsoGPS(Boolean pulsoGPS) {
		this.pulsoGPS = pulsoGPS;
	}

}
