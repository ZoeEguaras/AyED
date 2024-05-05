package tp2.ejercicio6;

import tp2.ejercicio2.BinaryTree;

public class Test {
	
	public static void imprimir (BinaryTree<Integer> arbol) {
		if (!arbol.isEmpty()) {
			System.out.println(arbol.getData());
			if (arbol.hasLeftChild()) {
				imprimir(arbol.getLeftChild());
			}
			if (arbol.hasRightChild()) {
				imprimir(arbol.getRightChild());
			}
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
		
		Transformacion T = new Transformacion(arbol);
		System.out.println("-------- ARBOL INICIAL --------");
		if (!arbol.isEmpty()) {
			imprimir(T.getDato());
			System.out.println();
		}
		
		System.out.println("----- ARBOL TRANSFORMADO -----");
		imprimir(T.suma());
	}

}
