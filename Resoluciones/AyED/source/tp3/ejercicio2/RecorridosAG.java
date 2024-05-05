package tp3.ejercicio2;

import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp3.ejercicio1.GeneralTree;

public class RecorridosAG {
	private boolean esImpar (Integer num) {
		boolean ok = true;
		if (num % 2 == 0) {
			ok = false;
		}
		return ok;
	 }
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	 pasados como parámetros, recorrido en preorden. */
	
	 public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a, Integer n) {
		List <Integer> listaImpares = new LinkedList <Integer> ();
		if ((a != null) && (! a.isEmpty())) {
			numerosImparesMayoresQuePreOrdenHelper(a, n, listaImpares);
		}
		return listaImpares;
	}
	 
	 private void numerosImparesMayoresQuePreOrdenHelper (GeneralTree <Integer> a, Integer n, List <Integer> lista) {
		 if (esImpar(a.getData()) && a.getData() > n) {
			 lista.add(a.getData());
		 }
		 List <GeneralTree <Integer>> children = a.getChildren();
		 for (GeneralTree <Integer> child: children) {
			 numerosImparesMayoresQuePreOrdenHelper(child, n, lista);
		 }
	 }
	 
	 /* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	 pasados como parámetros, recorrido en inorden. */
	 
	 public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		 List <Integer> listaImpares = new LinkedList <Integer> ();
			if ((a != null) && (! a.isEmpty())) {
				numerosImparesMayoresQueInOrdenHelper(a, n, listaImpares);
			}
		 return listaImpares;
	}
	 
	 private void numerosImparesMayoresQueInOrdenHelper (GeneralTree <Integer> a, Integer n, List <Integer> lista) {
		 List <GeneralTree <Integer>> children = a.getChildren();
		 if (a.hasChildren()) {
			 GeneralTree<Integer> primerHijo = children.get(0); 
			 if (esImpar(primerHijo.getData()) && primerHijo.getData() > n) {
				 lista.add(primerHijo.getData());
			 }
		 }
		 if (esImpar(a.getData()) && a.getData() > n) {
			 lista.add(a.getData());
		 }
		 for(int i=1; i < children.size(); i++) {
	           numerosImparesMayoresQueInOrdenHelper(children.get(i), n, lista);
	     }
	 }
	 
	 /* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	 pasados como parámetros, recorrido en postorden. */
	 
	 public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n) {
		 List <Integer> listaImpares = new LinkedList <Integer> ();
			if ((a != null) && (! a.isEmpty())) {
				numerosImparesMayoresQuePostOrdenHelper(a, n, listaImpares);
			}
		 return listaImpares;
	}
	 
	 private void numerosImparesMayoresQuePostOrdenHelper (GeneralTree <Integer> a, Integer n, List <Integer> lista) {
		 List <GeneralTree <Integer>> children = a.getChildren();
		 for (GeneralTree <Integer> child: children) {
			 numerosImparesMayoresQuePostOrdenHelper(child, n, lista);
		 }
		 if (esImpar(a.getData()) && a.getData() > n) {
			 lista.add(a.getData());
		 }
	 }
	 
	 /* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	 pasados como parámetros, recorrido por niveles. */
	 
	 public List<Integer> numerosImparesMayoresQuePorNiveles (GeneralTree <Integer> a, Integer n) {
		 List <Integer> listaImpares = new LinkedList <Integer> ();
		 GeneralTree<Integer> tree;
		 Queue <GeneralTree<Integer>> cola = new Queue <GeneralTree<Integer>> ();
		 cola.enqueue(a);
		 
		 while (!cola.isEmpty()) {
			 tree = cola.dequeue();
			 if (esImpar(tree.getData()) && tree.getData() > n) {
				 listaImpares.add(tree.getData());
			 }
			 List <GeneralTree <Integer>> children = tree.getChildren();
			 for (GeneralTree <Integer> child: children) {
				 cola.enqueue(child);
			 }
		 }
		 return listaImpares;
	 }
}
