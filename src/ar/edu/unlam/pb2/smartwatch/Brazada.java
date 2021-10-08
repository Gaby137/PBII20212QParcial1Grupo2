package ar.edu.unlam.pb2.smartwatch;

public class Brazada extends Sensor {
	private static final Integer LONGITUD_DE_BRAZADA = 1;
	private Integer contBrazada;

	public Brazada(Integer frecuenciaCardiaca) {
		super(frecuenciaCardiaca);
		this.contBrazada = 0;
	}

	public void darUnaBrazada() {
		super.setPulso(true);
		this.contBrazada++;
		if (this.contBrazada == 60) {
			super.setCadencia(60D);
		}
	}

	@Override
	public Double calcularVelocidad() {
		Double resultado = 0.0;
		if (this.contBrazada > 0) {
			resultado = calcularCadencia() * LONGITUD_DE_BRAZADA;
		}
		return resultado;
	}

}
