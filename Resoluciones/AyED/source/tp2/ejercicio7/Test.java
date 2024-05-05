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
		
		ParcialArboles parcial = new ParcialArboles(arbol);
		System.out.println("--------------- RESULTADOS ---------------");
		System.out.println("¿Con num = 7 el arbol es Izquierdo? " + parcial.isLeftTree(7));
		System.out.println("¿Con num = 2 el arbol es Izquierdo? " + parcial.isLeftTree(2));
		System.out.println("¿Con num = -5 el arbol es Izquierdo? " + parcial.isLeftTree(-5));
		System.out.println("¿Con num = 19 el arbol es Izquierdo? " + parcial.isLeftTree(19));
		System.out.println("¿Con num = -3 el arbol es Izquierdo? " + parcial.isLeftTree(-3));
	}

}
