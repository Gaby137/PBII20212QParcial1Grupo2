package ar.edu.unlam.pb2.smartwatch.sensor;

public class Paso extends Sensor {
	// Este numero representa la longitud de un paso promedio tanto para hombres
	// como mujeres
	public static final Double LONGITUD_DE_UN_PASO = 0.687;
	private Double cantPasos;

	public Paso() {

	}

	public Paso(Double frecuenciaCardiaca) {
		super(frecuenciaCardiaca);
		this.cantPasos = 0.0;
	}

	public void darPaso() {
		super.setPulso(true);
		cantPasos++;
		if (cantPasos == 60) {
			super.setCadencia(60D);
		}
		super.recibirUnPulso();
	}

	@Override
	public void darUnPulsoDeGPS() {
		Double m = 0.0;
		Double s = 0.0;
		setPulsoGPS(true);
		if (super.isPulsoGPS()) {
			m = super.getMetros();
			m++;
			super.setMetros(m);
			s = super.getTiempoSeg();
			s += (1 / LONGITUD_DE_UN_PASO);
			super.setTiempoSeg(s);
		}
	}

	@Override
	public Double calcularVelocidad() {
		Double resultado = 0.0;
		if (cantPasos > 0) {
			resultado = calcularCadencia() * LONGITUD_DE_UN_PASO;
		}
		return resultado;
	}

	public Double getCantPasos() {
		return this.cantPasos;
	}

	public void setCantPasos(Double cantPasos) {
		this.cantPasos = cantPasos;
	}

	public Double getLongitudDeUnPaso() {
		return this.LONGITUD_DE_UN_PASO;
	}

}
