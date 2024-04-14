package tp2.ejercicio8;

import tp2.ejercicio2.BinaryTree;

public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol1 = new BinaryTree<>();
		
		BinaryTree<Integer> arbol2 = new BinaryTree<>();
		
		ParcialArboles parcial = new ParcialArboles();
		
		System.out.println("¿Es prefijo? " + parcial.esPrefijo(arbol1, arbol2));
	}

}
