package ar.edu.unlam.pb2.smartwatch;

public enum TipoDeZona {
//	60ppm - 50%
	Descanso,

//	50% - 60%		: es una zona de calentamiento, rehabilitaci�n, acondicionamiento, aer�bico inicial� un ritmo muy f�cil.
	Calentamiento,

//	60% - 80%		: zona de intensidad ligera, ritmo f�cil, c�modo, representa un entrenamiento cardiovascular b�sico, pudiendo hablar con comodidad.
	Aerobico, // la zona aer�bica con ritmo moderado en la que se realiza un trabajo de
				// calidad para el sistema cardiovascular. Aqu� la respiraci�n es agitada y es
				// m�s complicado mantener una conversaci�n.

//	80% - 90%      : terreno de umbral anaer�bico, la intensidad es mayor con el objetivo de mejorar el rendimiento y la respiraci�n es forzada.
	Umbral,

//	90% - 100%	 :la FCmax del persona segun la edad, la zona de m�ximo esfuerzo e intensidad que podemos soportar.
	Maximo;
}
