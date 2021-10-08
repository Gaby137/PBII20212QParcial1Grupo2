package ar.edu.unlam.pb2.smartwatch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeportistaTest {

	@Test
	public void queSePuedaCalcularDistanciaEnMetros() {

		// preparacion
		Deportista usuario = new Deportista();

		final Integer PASOS_DE_PRUEBA = 10;

		Paso senorDePasos = new Paso(100);
		for (int i = 0; i < PASOS_DE_PRUEBA; i++) {
			senorDePasos.darPaso();
		}
		// valor esperado distancia en metros

		final Double RESULTADO_ESPERADO = 6.87;

		// ejecucion

		Double valorObtenido = usuario.distanciaRecorrida(senorDePasos.getCantPasos(), Paso.LONGITUD_DE_UN_PASO);

		// validacion

		assertEquals(RESULTADO_ESPERADO, valorObtenido, 0.01);

	}

}
