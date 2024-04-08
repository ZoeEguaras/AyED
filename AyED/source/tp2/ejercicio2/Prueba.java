package tp2.ejercicio2;

public class Prueba {
	
	public static void imprimir (BinaryTree<Integer> arbol) {
		System.out.print(arbol.toString() + " - ");
		if (arbol.hasLeftChild()) {
			imprimir(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) {
			imprimir(arbol.getRightChild());
		}
	}

	public static void main(String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		hijoDerecho.addRightChild(new BinaryTree <Integer>(55));
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho); 

		imprimir(ab);
		System.out.print("\n");
		imprimir(ab.espejo());
		System.out.print("\n");
		System.out.print("Cantidad de hojas: " + ab.contarHojas());
	}

}
