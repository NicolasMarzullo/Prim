package prim;

public class Arista implements Comparable<Arista> {

	private int peso;
	private int nodoOrigen;
	private int nodoDestino;

	public Arista(int peso, int nodoOrigen, int nodoDestino) {
		this.peso = peso;
		this.nodoOrigen = nodoOrigen;
		this.nodoDestino = nodoDestino;
	}
	
	

	public int getNodoOrigen() {
		return nodoOrigen;
	}

	public int getNodoDestino() {
		return nodoDestino;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Arista [peso=" + peso + ", nodoOrigen=" + nodoOrigen + ", nodoDestino=" + nodoDestino + "]";
	}

	@Override
	public int compareTo(Arista otra) {
		return this.peso - otra.peso;
	}

}
