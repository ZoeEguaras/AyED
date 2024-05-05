package tp2.ejercicio9;

import tp2.ejercicio2.BinaryTree;

public class Test {

	public static void imprimirInt (BinaryTree<Integer> arbol) {
		System.out.println("Nodo: " + arbol.getData());
		if (arbol.hasLeftChild()) {
			imprimirInt(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) {
			imprimirInt(arbol.getRightChild());
		}
	}
	
	public static void imprimirVal (BinaryTree<Valores> arbol) {
		System.out.println("Suma: " + arbol.getData().getSuma() + " - Diferencia: " + arbol.getData().getDiferencia());
		if (arbol.hasLeftChild()) {
			imprimirVal(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) {
			imprimirVal(arbol.getRightChild());
		}
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		hijoDerecho.addRightChild(new BinaryTree <Integer>(55));
		arbol.addLeftChild(hijoIzquierdo);
		arbol.addRightChild(hijoDerecho);
		
		ParcialArboles parcial = new ParcialArboles();
		BinaryTree<Valores> nuevoArbol = new BinaryTree<Valores>();
		
		imprimirInt(arbol);
		nuevoArbol = parcial.sumAndDif(arbol);
		if (nuevoArbol != null) {
			imprimirVal(nuevoArbol);
		}
	}

}
