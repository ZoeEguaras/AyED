package tp2.ejercicio7;

import tp1.ejercicio8.Queue;
import tp2.ejercicio2.BinaryTree;

public class ParcialArboles {
	
	private BinaryTree<Integer> dato;
	
	public ParcialArboles (BinaryTree<Integer> arbol) {
		this.dato = arbol;
	}
	
	 public boolean isLeftTree (int num) {
		if (!dato.isEmpty()) {
			BinaryTree<Integer> arbolNum = buscarNum(dato, num);
			if (arbolNum != null) {
				int izq, der;
				if (arbolNum.hasLeftChild()) {
					izq = contarUnicos(arbolNum.getLeftChild());
				} else izq = -1;
				if (arbolNum.hasRightChild()) {
					der = contarUnicos(arbolNum.getRightChild());
				} else der = -1;
				
				if (izq > der) {
					return true;
				} else return false;
			} else return false;
		} else return false;
	 }
	 
	 private BinaryTree<Integer> buscarNum (BinaryTree<Integer> dato, int num) {
		 BinaryTree<Integer> arbol = null;
		 Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		 cola.enqueue(dato);
		 cola.enqueue(null);
		 while (!cola.isEmpty()) {
			 arbol = cola.dequeue();
			 if (arbol != null) {
				 if (arbol.getData() == num) {
					 return arbol;
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
				 }
			 }
		 }
		 return null;
	 }
	 
	 private int contarUnicos (BinaryTree<Integer> arbol) {
		 if (arbol.isEmpty()) {
			 return 0;
		 } else {
			 int total = 0;
			 if (arbol.hasLeftChild() && arbol.hasRightChild()) {
				 total = contarUnicos(arbol.getLeftChild()) + contarUnicos(arbol.getRightChild());
			 } else if (arbol.hasLeftChild() && !arbol.hasRightChild()) {
				 total = 1 + contarUnicos(arbol.getLeftChild());
			 } else if (arbol.hasRightChild() && !arbol.hasLeftChild()) {
				 total = 1 + contarUnicos(arbol.getRightChild());
			 }
			 return total;
		 }
	 }

}
