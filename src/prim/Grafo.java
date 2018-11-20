package prim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Grafo {
	private List<Nodo> nodos;
	private int cantDeNodos;
	private ListaDeAdyacencia listaDeAdyacencia;

	public Grafo(int cantDeNodos) {
		this.cantDeNodos = cantDeNodos;
		this.nodos = new ArrayList<>();

		for (int i = 0; i < cantDeNodos; i++) {
			nodos.add(new Nodo(i));
		}

		this.listaDeAdyacencia = new ListaDeAdyacencia(cantDeNodos);
	}

	public void setValor(int nodoI, int nodoJ, int peso) {
		this.listaDeAdyacencia.setValor(nodoI, nodoJ, peso);
	}

	public SalidaPrim calcularPrim() {
		List<Integer> nodosConectados = new LinkedList<>();
		int pesoTotal = 0, nodoActual = 0;
		PriorityQueue<Arista> colaNodoArista = new PriorityQueue<>();
		List<Arista> arbolAbarcadorCostoMinimo = new LinkedList<>();
		Arista aristaAux;
		
		//Agrego el priemr nodo sin analizar
		nodosConectados.add(nodoActual);

		while (nodosConectados.size() != this.cantDeNodos) {
			// Elijo el 0 como primer nodo
			for (Arista a : this.listaDeAdyacencia.getValor(nodoActual)) {
				colaNodoArista.add(a);
			}

			// Necesito una arista que NO esté en el conjunto solucion
			// La cola me va a sacar la de menor peso
			aristaAux = colaNodoArista.poll();
			while (nodosConectados.contains(aristaAux.getNodoDestino())) {
				aristaAux = colaNodoArista.poll();
			}
			
			nodoActual = aristaAux.getNodoDestino();
			arbolAbarcadorCostoMinimo.add(aristaAux);
			// Acumulo peso y agrego 
			pesoTotal += aristaAux.getPeso();
			nodosConectados.add(nodoActual);
			
		}

		return new SalidaPrim(pesoTotal, arbolAbarcadorCostoMinimo);
	}

}
