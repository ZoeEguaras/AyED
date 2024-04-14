package tp2.ejercicio7;

import tp2.ejercicio2.BinaryTree;

public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(2);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(7);
		BinaryTree<Integer> hijoIzquierdo2 = new BinaryTree<Integer>(23);
		hijoIzquierdo2.addLeftChild(new BinaryTree<Integer>(-3));
		BinaryTree<Integer> hijoDerecho2 = new BinaryTree<Integer>(6);
		hijoDerecho2.addLeftChild(new BinaryTree<Integer>(55));
		hijoDerecho2.addRightChild(new BinaryTree<Integer>(11));
		hijoIzquierdo.addLeftChild(hijoIzquierdo2);
		hijoIzquierdo.addRightChild(hijoDerecho2);
		
		BinaryTree<Integer> hijoDerecho = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> hijoIzquierdo3 = new BinaryTree<Integer>(19);
		BinaryTree<Integer> hijoDerecho3 = new BinaryTree<Integer>(4);
		hijoDerecho3.addLeftChild(new BinaryTree<Integer>(18));
		hijoIzquierdo3.addRightChild(hijoDerecho3);
		hijoDerecho.addLeftChild(hijoIzquierdo3);
		arbol.addLeftChild(hijoIzquierdo);
		arbol.addRightChild(hijoDerecho);
		
		arbol.entreNiveles(0, 4);
		
		ParcialArboles parcial = new ParcialArboles(arbol);
		System.out.println("El arbol es Izquierdo: " + parcial.isLeftTree(-5));

	}

}
