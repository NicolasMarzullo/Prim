package prim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeAdyacencia {

	private List<List<Arista>> arrayAdyacenciaNodo;

	public ListaDeAdyacencia(int cantNodos) {

		this.arrayAdyacenciaNodo = new ArrayList<>();

		// Creo todas las listas
		for (int i = 0; i < cantNodos; i++) {
			arrayAdyacenciaNodo.add(new LinkedList<>());
		}

	}

	public void setValor(int nodoI, int nodoJ, int peso) {
		if(nodoI==nodoJ) {
			return;
		}
		
		//Lo cargo doble porque no es dirigido 
		this.arrayAdyacenciaNodo.get(nodoI).add(new Arista(peso, nodoI, nodoJ));
		this.arrayAdyacenciaNodo.get(nodoJ).add(new Arista(peso, nodoJ, nodoI));
	}
	
	public List<Arista> getValor(int nodoI) {
		return this.arrayAdyacenciaNodo.get(nodoI);
	}
	
	public int getValor(int nodoI, int nodoJ) {
		
		for(Arista a: this.arrayAdyacenciaNodo.get(nodoI)) {
			if(a.getNodoDestino() == nodoJ) {
				return a.getPeso();
			}
		}
		
		return -1;
	}

}
