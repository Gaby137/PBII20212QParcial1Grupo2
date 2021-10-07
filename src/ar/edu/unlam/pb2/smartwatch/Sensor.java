package ar.edu.unlam.pb2.smartwatch;

public abstract class Sensor {
	// la velocidad es metros/segundos
	private double velocidad;
	private double cadencia;
	private int frecuenciaCardiaca;
	private int tiempoSeg;
	private int metros;
	private boolean pulso;
	private boolean pulsoGPS;

	public Sensor() {

	}

	public Sensor(int frecuenciaCardiaca) {
		super();
		this.velocidad = 0;
		this.cadencia = 0;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.tiempoSeg = 0;
		this.metros = 0;
		this.pulso = false;
		this.pulsoGPS = false;
	}

	public abstract double calcularVelocidad();

	public double calcularCadencia() {
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

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getCadencia() {
		return cadencia;
	}

	public void setCadencia(double cadencia) {
		this.cadencia = cadencia;
	}

	public int getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public int getTiempoSeg() {
		return tiempoSeg;
	}

	public void setTiempoSeg(int tiempoSeg) {
		this.tiempoSeg = tiempoSeg;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public boolean isPulso() {
		return pulso;
	}

	public void setPulso(boolean pulso) {
		this.pulso = pulso;
	}

	public boolean isPulsoGPS() {
		return pulsoGPS;
	}

	public void setPulsoGPS(boolean pulsoGPS) {
		this.pulsoGPS = pulsoGPS;
	}

}