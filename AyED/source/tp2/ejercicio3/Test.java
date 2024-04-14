package tp2.ejercicio3;

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

		System.out.println("------------ PRUEBA DEL CONTADOR ------------");
		
		ContadorArbol contador = new ContadorArbol(arbol);
		System.out.println();
		System.out.println("Inorden: ");
		contador.imprimir(contador.numerosParesI());
		System.out.println();
		System.out.println("Postorden: ");
		contador.imprimir(contador.numerosParesP());
	}
		
}
