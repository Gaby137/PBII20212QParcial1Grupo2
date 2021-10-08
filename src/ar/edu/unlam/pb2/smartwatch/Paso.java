package ar.edu.unlam.pb2.smartwatch;

public class Paso extends Sensor {
	// Este numero representa la longitud de un paso promedio tanto para hombres
	// como mujeres
	private static final Double LONGITUD_DE_UN_PASO = 0.687;
	private Integer cantPasos;

	public Paso (){
		
	}
	
	public Paso(Integer frecuenciaCardiaca) {
		super(frecuenciaCardiaca);
		this.cantPasos = 0;
	}

	public void darPaso() {
		super.setPulso(true);
		cantPasos++;
		if (cantPasos == 60) {
			super.setCadencia(60D);
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

	public Integer getCantPasos() {
		return this.cantPasos;
	}

	public void setCantPasos(Integer cantPasos) {
		this.cantPasos = cantPasos;
	}

	public Double getLongitudDeUnPaso() {
		return this.LONGITUD_DE_UN_PASO;
	}
}
