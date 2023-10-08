package compumundocibermegared;

public class Computadora {
	
	protected int anioFabricacion;
	protected char tipo;
	protected boolean encender;
	protected Componentes memoria;
	protected Componentes disco;
	protected Componentes procesador;
	
	Computadora(String marca, String modelo, int anioFabricacion, char tipo, boolean encender, Componentes memoria, Componentes disco, Componentes procesador) {
		this.anioFabricacion = anioFabricacion;
		this.tipo = tipo;
		this.encender = encender;
		this.memoria = memoria;
		this.disco = disco;
		this.procesador = procesador;
	}
	
	public String toString() {
		return "[ COMPUTADOR "+colores.rosa+"Tipo: "+tipo+" | Año de fabricación: "+anioFabricacion+", Encender: "+encender+colores.reset+" ]\n[ Memoria => "+colores.verde+memoria+colores.reset+" ]\n[ Disco => "+colores.verde+disco+colores.reset+" ]\n[ Procesador => "+colores.verde+procesador+colores.reset+" ]";
	}
}
