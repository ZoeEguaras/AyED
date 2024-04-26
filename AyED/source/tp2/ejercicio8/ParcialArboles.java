package tp2.ejercicio8;

import tp2.ejercicio2.BinaryTree;

public class ParcialArboles {
	
	 public boolean esPrefijo (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 if (arbol1.isEmpty()) {
			 return true;
		 } else {
			 if (arbol2.isEmpty()) {
				 return false;
			 } else return verificacion(arbol1, arbol2);
		 }
	 }
	 
	 private boolean verificacion (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 if (arbol1.getData() != arbol2.getData()) {
			 return false;
		 } else {
			 boolean aux = true;
			 if (arbol1.hasLeftChild()) {
				 if (arbol2.hasLeftChild()) {
					 aux = aux && esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild());
				 }
			 } else return false;
			 if (arbol1.hasRightChild() && aux) {
				 if (arbol2.hasRightChild()) {
					 aux = aux && esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
				 }
			 }
			 return aux;
		 }
	}

}
