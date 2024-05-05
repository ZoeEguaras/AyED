package tp2.ejercicio3;

import java.util.LinkedList;

import tp2.ejercicio2.BinaryTree;

public class ContadorArbol {
	
	private BinaryTree<Integer> dato;
	
	public ContadorArbol (BinaryTree<Integer> arbol) {
		this.setDato(arbol);
	}
	
	public BinaryTree<Integer> getDato() {
		return dato;
	}

	public void setDato(BinaryTree<Integer> dato) {
		this.dato = dato;
	}

	public LinkedList<Integer> numerosParesI () {
		LinkedList<Integer> lista = new LinkedList<Integer> ();
		lista = listaInorden(dato);
		return lista;
	}
	
	private LinkedList<Integer> listaInorden (BinaryTree<Integer> arbol) {
		LinkedList<Integer> lista = new LinkedList<Integer> ();
		
		if (arbol.isEmpty()) {
			return null;
		} else {
			if (arbol.hasLeftChild()) {
				lista.addAll(listaInorden(arbol.getLeftChild()));
			}
			if (arbol.getData() % 2 == 0) {
				lista.add(arbol.getData());
			}
			if (arbol.hasRightChild()) {
				lista.addAll(listaInorden(arbol.getRightChild()));
			}
			return lista;
		}
	}
	
	public LinkedList<Integer> numerosParesP () {
		LinkedList<Integer> lista = new LinkedList<Integer> ();
		lista = listaPosorden(dato);
		return lista;
	}
	
	private LinkedList<Integer> listaPosorden (BinaryTree<Integer> arbol) {
		LinkedList<Integer> lista = new LinkedList<Integer> ();
		
		if (arbol.isEmpty()) {
			return null;
		} else {
			if (arbol.hasLeftChild()) {
				lista.addAll(listaInorden(arbol.getLeftChild()));
			}
			if (arbol.hasRightChild()) {
				lista.addAll(listaInorden(arbol.getRightChild()));
			}
			if (arbol.getData() % 2 == 0) {
				lista.add(arbol.getData());
			}
			return lista;
		}
	}
	
	public void imprimir (LinkedList<Integer> lista) {
		for (int numero: lista) {
			System.out.println(numero);
		}
	}
	
	
}
