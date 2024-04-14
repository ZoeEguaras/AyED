package tp2.ejercicio7;

import tp2.ejercicio2.BinaryTree;

public class ParcialArboles {
	
	private BinaryTree<Integer> dato;
	
	public ParcialArboles (BinaryTree<Integer> arbol) {
		this.dato = arbol;
	}
	
	 public boolean isLeftTree (int num) {
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
	 }
	 
	 private BinaryTree<Integer> buscarNum (BinaryTree<Integer> dato, int num) {
		 if (dato.isEmpty()) {
			 return null;
		 } else {
			 if (dato.getData() == num) {
				 return dato;
			 } else {
				 BinaryTree<Integer> aux = new BinaryTree<Integer>();
				 if (dato.hasLeftChild()) {
					 aux = buscarNum(dato.getLeftChild(), num);
				 }
				 if (dato.hasRightChild() && aux == null) {
					 aux = buscarNum(dato.getRightChild(), num);
				 }
				 return aux;
			 }
		 }
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
