package ar.edu.unlam.pb2.smartwatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

	public class DeportistaTest {

	@Test
	public void queSePuedaCalcularDistanciaEnMetros() {
		
		//preparacion 
		Deportista usuario = new Deportista();
		Paso paso = new Paso();
		Paso dados=new Paso();
		
		paso.setCantPasos(10);
		//valor esperado
		
		Double RESULTADO_ESPERADO=6.87;
		
		
		//ejecucion 
		
		Double valorObtenido= usuario.distanciaRecorrida(paso);
		
		//validacion 
		
		assertEquals(RESULTADO_ESPERADO, valorObtenido);
		
		
	}

}
