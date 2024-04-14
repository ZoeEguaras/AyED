package tp2.ejercicio2;

public class Test {
	
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
		
		if (!ab.isEmpty()) {
			imprimir(ab);
			System.out.println();
			imprimir(ab.espejo());
			System.out.println();
		}
		
		System.out.println("Cantidad de hojas: " + ab.contarHojas());
		
		System.out.println();
		System.out.println("Entre los niveles 1-2: ");
		ab.entreNiveles(1, 2);
	}

}
