package compumundocibermegared;

public abstract class Componentes {
	protected String marca;
	protected String modelo;
	protected double capacidadGb;
	
	Componentes(String marca, String modelo, double capacidadGb) {
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadGb = capacidadGb;
	}

	public String verDatos() {
		return toString();
	}
	
	@Override
	public String toString() {
		return "[ Marca: "+marca+", Modelo: "+modelo+", Capacidad Gb: "+capacidadGb;
	}
}
