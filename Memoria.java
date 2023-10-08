package compumundocibermegared;

public class Memoria extends Componentes{
	
	Memoria(String marca, String modelo, double capacidadGb) {
		super(marca, modelo, capacidadGb);
	}
	
	@Override
	public String verDatos() {
		return super.verDatos();
	}
	
	@Override
	public String toString() {
		return "Marca "+marca+" | Modelo: "+modelo+" | Capacidad en Gb: "+capacidadGb;
	}
}
