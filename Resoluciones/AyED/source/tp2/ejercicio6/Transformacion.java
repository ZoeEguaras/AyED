package tp2.ejercicio6;

import tp2.ejercicio2.BinaryTree;

public class Transformacion {
	
	private BinaryTree<Integer> dato;
	
	public Transformacion (BinaryTree<Integer> arbol) {
		this.dato = arbol;
	}
	
	public BinaryTree<Integer> getDato() {
		return dato;
	}

	public void setDato(BinaryTree<Integer> dato) {
		this.dato = dato;
	}

	public BinaryTree<Integer> suma () {
		if (!dato.isEmpty()) {
			this.suma(dato);
		} else {
			BinaryTree<Integer> arbol = new BinaryTree<Integer>(0);
			this.setDato(arbol);
		}
		return dato;
	}
	
	private int suma (BinaryTree<Integer> dato) {
		if (dato.isLeaf()) {
			int total = dato.getData();
			dato.setData(0);
			return total;
		} else {
			int total = 0;
			if (dato.hasLeftChild()) {
				total += suma(dato.getLeftChild());
			}
			if (dato.hasRightChild()) {
				total += suma(dato.getRightChild());
			}
			dato.setData(total);
			return total + dato.getData();
		}
	}

}
