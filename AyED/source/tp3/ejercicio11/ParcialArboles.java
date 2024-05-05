package tp3.ejercicio11;

import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp3.ejercicio5.GeneralTree;

public class ParcialArboles {
	 public static boolean resolver(GeneralTree<Integer> arbol) {
		 GeneralTree<Integer> aux;
		 Queue <GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>> ();
		 cola.enqueue(arbol);
		 cola.enqueue(null);
		 int actual = 0;
		 int anterior = 0;
		 boolean cumple = true;
		 while (!cola.isEmpty() && cumple) {
			 aux = cola.dequeue();
			 if (aux != null) {
				 actual += 1;
				 List <GeneralTree<Integer>> children = aux.getChildren();
				 for (GeneralTree<Integer> child: children) {
					 cola.enqueue(child);
				 }
			 } else {
				 if (actual != anterior+1) {
					 cumple = false;
				 }
				 if (!cola.isEmpty()) {
					 anterior = actual;
					 actual = 0;
					 cola.enqueue(null);
				 }
			 }
		 }
		 return cumple;
	 }
	 
	 public static void main(String[] args) {
	        List <GeneralTree<Integer>> subChildren1 = new LinkedList <GeneralTree<Integer>>();
	        subChildren1.add(new GeneralTree<Integer>(83));
	        GeneralTree<Integer> subAb1 = new GeneralTree<Integer>(18, subChildren1);
	        
	        List <GeneralTree<Integer>> subChildren2 = new LinkedList <GeneralTree<Integer>>();
	        subChildren2.add(subAb1);
	        GeneralTree<Integer> subAb2 = new GeneralTree<Integer>(5, subChildren2);
	        
	        List <GeneralTree<Integer>> subChildren3 = new LinkedList <GeneralTree<Integer>>();
	        subChildren3.add(new GeneralTree<Integer>(33));
	        subChildren3.add(new GeneralTree<Integer>(12));
	        subChildren3.add(new GeneralTree<Integer>(17));
	        subChildren3.add(new GeneralTree<Integer>(9));
	        GeneralTree<Integer> subAb3 = new GeneralTree<Integer>(3, subChildren3);
	        
	        List <GeneralTree<Integer>> subChildren4 = new LinkedList <GeneralTree<Integer>>();
	        subChildren4.add(new GeneralTree<Integer>(7));
	        subChildren4.add(new GeneralTree<Integer>(11));
	        subChildren4.add(subAb3);
	        GeneralTree<Integer> subAb4 = new GeneralTree<Integer>(4, subChildren4);
	        
	        List <GeneralTree<Integer>> subArbIzq = new LinkedList <GeneralTree<Integer>>();
	        subArbIzq.add(subAb2);
	        subArbIzq.add(subAb4);
	        GeneralTree<Integer> arbIzq = new GeneralTree<Integer>(1, subArbIzq);
	        
	        List <GeneralTree<Integer>> subArbDer = new LinkedList <GeneralTree<Integer>>();
	        subArbDer.add(new GeneralTree<Integer>(13));
	        GeneralTree<Integer> arbDer = new GeneralTree<Integer>(25, subArbDer);
	        
	        List <GeneralTree<Integer>> arbol = new LinkedList <GeneralTree<Integer>>();
	        arbol.add(arbIzq);
	        arbol.add(arbDer);
	        GeneralTree<Integer> a = new GeneralTree<Integer>(2, arbol);
	        
	        System.out.println("¿Es creciente? " + resolver(a));
	        
	        List<GeneralTree<Integer>> subChildren5 = new LinkedList <GeneralTree<Integer>>();
	        subChildren5.add(new GeneralTree<Integer>(7));
	        subChildren5.add(subAb3);
	        GeneralTree<Integer> subAb5 = new GeneralTree<Integer>(4, subChildren5);
	        
	        List<GeneralTree<Integer>> subArbIzq2 = new LinkedList<GeneralTree<Integer>>();
	        subArbIzq2.add(subAb2);
	        subArbIzq2.add(subAb5);
	        GeneralTree<Integer> arbIzq2 = new GeneralTree<Integer>(1, subArbIzq2);
	        
	        List <GeneralTree<Integer>> arbol2 = new LinkedList <GeneralTree<Integer>>();
	        arbol2.add(arbIzq2);
	        arbol2.add(arbDer);
	        GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, arbol2);
	        
	        System.out.println("¿Es creciente? " + resolver(a2));
	    }
}
