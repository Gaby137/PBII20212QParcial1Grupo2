package ar.edu.unlam.pb2.smartwatch;

public class Paso extends Sensor {
	// Este numero representa la longitud de un paso promedio tanto para hombres con
	// mujeres
	private static final double LONGITUD_DE_UN_PASO = 0.687;
	private int cantPasos;

	public Paso(int frecuenciaCardiaca) {
		super(frecuenciaCardiaca);
		this.cantPasos = 0;
	}

	public void darPaso() {
		super.setPulso(true);
		cantPasos++;
		if (cantPasos == 60) {
			super.setCadencia(60);
		}
	}

	@Override
	public void recibirUnPulso() {
		if (super.isPulso()) {
			int seg = getTiempoSeg();
			super.setTiempoSeg(seg++);
		}

	}

	@Override
	public void recibirUnPulsoGPS() {
		if (super.isPulsoGPS()) {
			int metros = getMetros();
			super.setMetros(metros++);
		}
	}

	@Override
	public double calcularVelocidad() {
		return calcularCadencia() * LONGITUD_DE_UN_PASO;
	}

	@Override
	public double calcularCadencia() {
//		como un pulso es un paso en un seg
//		la cadencia es igual a cant pasos por minuto
		return getCadencia();
	}

	public int getCantPasos() {
		return cantPasos;
	}

	public void setCantPasos(int cantPasos) {
		this.cantPasos = cantPasos;
	}

}
