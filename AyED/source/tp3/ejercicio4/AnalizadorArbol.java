package tp3.ejercicio4;

import java.util.List;

import tp1.ejercicio8.Queue;
import tp3.ejercicio3.GeneralTree;

public class AnalizadorArbol {
	
	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol) {
		double promedio = 0;
		if ((arbol != null) && (!arbol.isEmpty())) {
			promedio = devolverMaximoPromedioHelper(arbol);
		}
		return promedio;
	}
	
	private double devolverMaximoPromedioHelper (GeneralTree<AreaEmpresa>arbol) {
		GeneralTree<AreaEmpresa> aux;
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		int tardanza = 0;
		int nodos = 0;
		double mayorProm = -1;
		
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				nodos += 1;
				tardanza += aux.getData().getTardanza();
				List <GeneralTree<AreaEmpresa>> children = aux.getChildren();
				for (GeneralTree<AreaEmpresa> child: children) {
					cola.enqueue(child);
				}
			} else {
				if (!cola.isEmpty()) {
					double promedio = tardanza / nodos;
					if (promedio > mayorProm) {
						mayorProm = promedio;
					}
					nodos = 0;
					tardanza = 0;
					cola.enqueue(null);
				}
			}
		}
		double promedio = tardanza / nodos;
		if (promedio > mayorProm) {
			mayorProm = promedio;
		}
		return mayorProm;
	}

}
