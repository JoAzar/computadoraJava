package compumundocibermegared;

public class DiscoRigido extends Componentes{
	protected double velocidadRPM;
	
	DiscoRigido(String marca, String modelo, double capacidadGb, double velocidadRPM) {
		super(marca, modelo, capacidadGb);
		this.velocidadRPM = velocidadRPM;
	}
	
	@Override
	public String verDatos() {
		return super.verDatos();
	}
	
	@Override
	public String toString() {
		//String marca, String modelo, double capacidadGb, double velocidadRPM
		return "Marca: "+marca+" | Modelo: "+modelo+" | Velocidad Ghz: "+velocidadRPM;
	}
}
