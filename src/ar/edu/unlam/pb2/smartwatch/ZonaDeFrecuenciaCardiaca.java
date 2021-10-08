package ar.edu.unlam.pb2.smartwatch;

public class ZonaDeFrecuenciaCardiaca {
	private static final Double KARVONEN_220 = 220.0;
	private Double FrecuenciaCardiacaMin;
	private Double FrecuenciaCardiacaMax;
	private TipoDeZona tipoZona;

	public TipoDeZona getTipoZona() {
		return tipoZona;
	}

	public void setTipoZona(TipoDeZona tipoZona) {
		this.tipoZona = tipoZona;
	}

	public Double calcularZonaFrecuenciaCardiacaActual(Integer edad, Integer FrecuenciaCardiaca) {
		Double FCMaxPersona = KARVONEN_220 * edad;

//		60ppm - 50%  cambios hasta funcionando 

		return 0.0;
	}

	public Double calcularFrecuenciaCardiacaMaximaDeportista(Integer edad) {
		return KARVONEN_220 * edad;
	}

	public Double getFrecuenciaCardiacaMin() {
		return FrecuenciaCardiacaMin;
	}

	public void setFrecuenciaCardiacaMin(Double frecuenciaCardiacaMin) {
		FrecuenciaCardiacaMin = frecuenciaCardiacaMin;
	}

	public Double getFrecuenciaCardiacaMax() {
		return FrecuenciaCardiacaMax;
	}

	public void setFrecuenciaCardiacaMax(Double frecuenciaCardiacaMax) {
		FrecuenciaCardiacaMax = frecuenciaCardiacaMax;
	}

}