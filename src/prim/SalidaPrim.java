package prim;

import java.util.List;

public class SalidaPrim {	
	private int pesoTotal;
	private List<Integer> nodosConectados;
	
	public SalidaPrim(int pesoTotal, List<Integer> nodosConectados) {
		this.pesoTotal = pesoTotal;
		this.nodosConectados = nodosConectados;
	}

	@Override
	public String toString() {
		System.out.println("Peso total: " + this.pesoTotal);
		System.out.println("Orden de la lista: ");
		for(Integer i: this.nodosConectados) {
			System.out.print(i + "  ");
		}
		return null;
	}
	
	
	

}
