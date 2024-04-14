package tp2.ejercicio5;

import tp2.ejercicio2.BinaryTree;

public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		hijoDerecho.addRightChild(new BinaryTree <Integer>(55));
		arbol.addLeftChild(hijoIzquierdo);
		arbol.addRightChild(hijoDerecho);
		
		ProfundidadDeArbolBinario profundidad = new ProfundidadDeArbolBinario(arbol);
		System.out.println("Suma de los elementos del arbol en la profundidad 2: " + profundidad.sumaElementosProfundidad(2));
	}

}
