package tp2.ejercicio8;

import tp2.ejercicio2.BinaryTree;

public class ParcialArboles {
	
	 public boolean esPrefijo (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 if (arbol1.isEmpty()) {
			 if (arbol2.isEmpty()) {
				 return true;
			 } else return false;
		 } else {
			 if (arbol2.isEmpty()) {
				 return false;
			 } else return verificacion(arbol1, arbol2);
		 }
	 }
	 
	 private boolean verificacion (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 if (arbol1.isLeaf()) {
			 if (arbol1.getData() != arbol2.getData()) {
				 return false;
			 } else return true;
		 } else {
			 if (arbol1.getData() != arbol2.getData()) {
				 return false;
			 } else {
				 boolean aux = true;
				 if (arbol1.hasLeftChild() && arbol2.hasLeftChild()) {
					 aux = aux && esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild());
				 } else if (arbol1.hasLeftChild()) {
					 return false;
				 }
				 if (arbol1.hasRightChild() && arbol2.hasRightChild() && aux) {
					 aux = aux && esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
				 } else if (arbol1.hasRightChild()) {
					 return false;
				 }
				 return aux;
			 }
		 }
	 }
}
