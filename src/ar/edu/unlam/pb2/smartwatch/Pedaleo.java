package ar.edu.unlam.pb2.smartwatch;

public class Pedaleo extends Sensor {
	public static final double LONGITUD_DE_PEDALEO_PROM = 0.89;
	private int cantDePedaleo;

	public Pedaleo(int frencuenciaCardiaca) {
		super(frencuenciaCardiaca);
		this.cantDePedaleo = 0;
	}

	public void darUnPedaleo() {
		super.setPulso(true);
		cantDePedaleo++;
		if (cantDePedaleo == 60) {
			super.setCadencia(60);
		}
	}

	@Override
	public double calcularVelocidad() {
		double resultado = 0.0;
		if (cantDePedaleo > 0) {
			resultado = ((this.cantDePedaleo * LONGITUD_DE_PEDALEO_PROM) / super.getTiempoSeg());
		}
		return resultado;
	}

}
