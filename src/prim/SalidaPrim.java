package prim;

import java.util.List;

public class SalidaPrim {	
	private int pesoTotal;
	private List<Arista> arbolAbarcadorCostoMinimo;
	
	
	public SalidaPrim(int pesoTotal, List<Arista> arbolAbarcadorCostoMinimo) {
		this.pesoTotal = pesoTotal;
		this.arbolAbarcadorCostoMinimo = arbolAbarcadorCostoMinimo;
	}


	@Override
	public String toString() {
		System.out.println("Peso total: " + this.pesoTotal);
		System.out.println("Orden de la lista: ");
		for(Arista a: this.arbolAbarcadorCostoMinimo) {
			System.out.println("Arista: " + a.getNodoDestino() + "  <----->  " + a.getNodoOrigen()  + "  Peso: " + a.getPeso());
		}
		return null;
	}
	
	
	

}
