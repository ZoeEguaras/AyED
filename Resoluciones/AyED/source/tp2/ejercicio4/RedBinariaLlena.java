package tp2.ejercicio4;

import tp2.ejercicio2.BinaryTree;

public class RedBinariaLlena {
	
	private BinaryTree<Integer> dato;
	
	public RedBinariaLlena (BinaryTree<Integer> arbol) {
		this.dato = arbol;
	}
	
	public int retardoReenvio () {
		int mayorRetardo = calcularRetardo(dato);
		return mayorRetardo;
	}
	
	private int calcularRetardo (BinaryTree<Integer> arbol) {
		if (arbol.isEmpty()) {
			return 0;
		} else {
			int izq = arbol.getData();
			int der = arbol.getData();
			if (arbol.hasLeftChild()) {
				izq += calcularRetardo(arbol.getLeftChild());
			}
			if (arbol.hasRightChild()) {
				der += calcularRetardo(arbol.getRightChild());
			}
			if (izq > der) {
				return izq;
			} else return der;
		}
	}
}
