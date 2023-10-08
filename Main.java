package compumundocibermegared;

public class Main {

	public static void main(String[] args) {
		
		Componentes memoria = new Memoria("DRR4", "Nogamel", 16.0);
		Componentes disco = new DiscoRigido("Duramax", "Solid", 512.0, 30.0);
		Componentes procesador = new Procesador("Intel", "I9", 3.9, 3.9);
		
		Computadora compu = new Computadora("marca", "modelo", 1980, 'A', true, memoria, disco, procesador);
		System.out.println(compu.toString());
		
	}

}
