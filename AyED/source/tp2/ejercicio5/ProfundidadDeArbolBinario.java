package tp2.ejercicio5;

import tp2.ejercicio2.BinaryTree;
import tp1.ejercicio8.Queue;

public class ProfundidadDeArbolBinario {
	
	private BinaryTree<Integer> dato;
	
	public ProfundidadDeArbolBinario (BinaryTree<Integer> arbol) {
		this.dato = arbol;
	}
	
	public int sumaElementosProfundidad (int p) {
		BinaryTree<Integer> arbol = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>> ();
		cola.enqueue(dato);
		cola.enqueue(null);
		int prof = 0, total = 0;
		while ((!cola.isEmpty()) && (prof <= p)) {
			arbol = cola.dequeue();
			if (arbol != null) {
				if (prof == p) {
					total += arbol.getData();
				} else {
					if (arbol.hasLeftChild()) {
						cola.enqueue(arbol.getLeftChild());
					}
					if (arbol.hasRightChild()) {
						cola.enqueue(arbol.getRightChild());
					}
				}
			} else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					prof ++;
				}
			}
		}
		return total;
	}
}
