package ar.edu.unlam.pb2.smartwatch.deportista;

public class Caminador extends Deportista {
	
	private Double distanciaEnKm;
	private Double tiempoEnHora, ritmoCalculado;

	public Caminador() {
		super();
	}

	public Caminador(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.CAMINATA);
	}
	
	@Override
	
	public Double distanciaRecorrida(Integer cantidadMovimentos, Double longitud) {
		
		distanciaEnKm = cantidadMovimentos*longitud/1000;
		
		return distanciaEnKm;
		
	}
	
	
	@Override 
	 public Double tiempoTranscurrido (Integer cantidadMovimientos){
		
		tiempoEnHora= getTiempoTranscurrido()/60D;
		
		return tiempoEnHora;
	}
	
	public Double ritmo() {
		
		ritmoCalculado = distanciaEnKm/ getTiempoTranscurrido();
		
		return ritmoCalculado;
		
	}
	
	
	

}
