package ar.edu.unlam.pb2.smartwatch.deportista;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.smartwatch.sensor.Paso;
import ar.edu.unlam.pb2.smartwatch.sensor.Pedaleo;

public class CiclistaTest {

	@Test
	public void queSePuedaInstanciarUnCiclista() {

		final String NOMBRE_ESPERADO = "Lance";
		final Integer EDAD_ESPERADA = 35;
		final Double PESO_ESPERADO = 75.80;
		final Double ALTURA_ESPERADA = 177.4;

		Ciclista ciclista = new Ciclista(NOMBRE_ESPERADO, EDAD_ESPERADA, PESO_ESPERADO, ALTURA_ESPERADA);

		assertEquals(NOMBRE_ESPERADO, ciclista.getNombre());
		assertEquals(EDAD_ESPERADA, ciclista.getEdadActual(), 0.1);
		assertEquals(PESO_ESPERADO, ciclista.getPesoActual(), 0.1);
		assertEquals(ALTURA_ESPERADA, ciclista.getAlturaActual(), 0.1);

	}

	@Test
	public void comprobarDistanciaRecorrida() {
		final Double PEDALEOS = 20.0;
		final Double VALOR_ESPERADO = 0.0178;

		Ciclista ciclista = new Ciclista("Lance", 35, 75.80, 177.4);

		Pedaleo p1 = new Pedaleo(100.0);

		for (int i = 0; i < PEDALEOS; i++) {
			p1.darUnPedaleo();
		}
		Double valorObtenido = ciclista.distanciaRecorrida(p1.getCantDePedaleo(), Pedaleo.LONGITUD_DE_PEDALEO_PROM);

		assertEquals(VALOR_ESPERADO, valorObtenido);
	}

	@Test
	public void comprobarTiempoTranscurrido() {

		final Double PEDALEOS = 20.0;
		final Double TIEMPO_ESPERADO = 20.0;
		Ciclista ciclista = new Ciclista("Lance", 35, 75.80, 177.4);

		Pedaleo p1 = new Pedaleo(100.0);
		for (int i = 0; i < PEDALEOS; i++) {
			p1.darUnPedaleo();
		}
		// Se tiene en cuenta que 1 pedaleo es 1 pulso,y 1 pulso es 1 seg

		Double valorObtenido = ciclista.tiempoTrascurrido(p1.getCantDePedaleo());

		assertEquals(TIEMPO_ESPERADO, valorObtenido, 0.1);
	}

	@Test
	public void comprobarVelocidad() {
		final Double PEDALEOS = 20.0;
		final Double VELOCIDAD_ESPERADA = 3.204;
		Ciclista ciclista = new Ciclista("Lance", 35, 75.80, 177.4);

		Pedaleo p1 = new Pedaleo(100.0);
		for (int i = 0; i < PEDALEOS; i++) {
			p1.darUnPedaleo();
		}

		Double distancia = ciclista.distanciaRecorrida(p1.getCantDePedaleo(), Pedaleo.LONGITUD_DE_PEDALEO_PROM);
		Double tiempo = ciclista.tiempoTrascurrido(p1.getCantDePedaleo());
		Double valorObtenido = ciclista.velocidad(distancia, tiempo);

		assertEquals(VELOCIDAD_ESPERADA, valorObtenido, 0.1);

	}

	@Test
	public void comprobarCadencia() {
		final Double PEDALEOS = 20.0;
		final Double CADENCIA_ESPERADA = 6.66;
		
		Ciclista ciclista = new Ciclista("Lance", 35, 75.80, 177.4);

		Pedaleo p1 = new Pedaleo(100.0);
		for (int i = 0; i < PEDALEOS; i++) {
			p1.darUnPedaleo();
		}
		//se tiene en cuenta 1 pedaleo = 1 segundo 
		Double valorObtenido=ciclista.cadencia(p1.getCantDePedaleo(), p1.getCantDePedaleo());
		
		assertEquals(CADENCIA_ESPERADA,valorObtenido,0.1);
		
		
	}
	
	@Test
	public void comprobarLaZonaCardiaca() {

		Ciclista ciclista = new Ciclista("Lance", 35, 75.80, 177.4);

		Pedaleo p1 = new Pedaleo(170.0);

		ZonaDeFrecuenciaCardiaca zonaEsperada = new ZonaDeFrecuenciaCardiaca(166.5, 185.0, TipoDeZona.MAXIMO);

		ZonaDeFrecuenciaCardiaca zonaCalculada = ciclista.getZonaDeFrecuenciaCardiacaActual(p1.getFrecuenciaCardiaca());

		assertEquals(zonaEsperada.getTipoZona(), zonaCalculada.getTipoZona());
		assertEquals(zonaEsperada.getFrecuenciaCardiacaMin(),
				Math.round(zonaCalculada.getFrecuenciaCardiacaMin() * 100.0) / 100.0, 0.1);

		assertEquals(zonaEsperada.getFrecuenciaCardiacaMax(),
				Math.round(zonaCalculada.getFrecuenciaCardiacaMax() * 100.0) / 100.0, 0.01);

		assertEquals(zonaEsperada, zonaCalculada);

	}
	
	
}
