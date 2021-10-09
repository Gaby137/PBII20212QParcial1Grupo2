package ar.edu.unlam.pb2.smartwatch.sensor;

public class Pedaleo extends Sensor {
	public static final Double LONGITUD_DE_PEDALEO_PROM = 0.89;
	private Double cantDePedaleo;

	public Pedaleo(Double frencuenciaCardiaca) {
		super(frencuenciaCardiaca);
		this.cantDePedaleo = 0.0;
	}

	public void darUnPedaleo() {
		super.setPulso(true);
		cantDePedaleo++;
		if (cantDePedaleo == 60) {
			super.setCadencia(60D);
		}
	}

	@Override
	public Double calcularVelocidad() {
		Double resultado = 0.0;
		if (cantDePedaleo > 0) {
			resultado = ((this.cantDePedaleo * LONGITUD_DE_PEDALEO_PROM) / super.getTiempoSeg());
		}
		return resultado;
	}


	public Double getCantDePedaleo() {
		return cantDePedaleo;
	}

	public void setCantDePedaleo(Double cantDePedaleo) {
		this.cantDePedaleo = cantDePedaleo;
	}

	@Override
	public void darUnPulsoDeGPS() {
		// TODO Auto-generated method stub

	}

}
