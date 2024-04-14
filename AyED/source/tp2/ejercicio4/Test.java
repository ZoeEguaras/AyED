package tp2.ejercicio4;

import tp2.ejercicio2.BinaryTree;

public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		hijoDerecho.addRightChild(new BinaryTree <Integer>(55));
		hijoDerecho.addLeftChild(new BinaryTree <Integer>(20));
		arbol.addLeftChild(hijoIzquierdo);
		arbol.addRightChild(hijoDerecho); 
		
		RedBinariaLlena red = new RedBinariaLlena(arbol);
		System.out.println("Mayor retardo de envío: " + red.retardoReenvio());
	}

}
