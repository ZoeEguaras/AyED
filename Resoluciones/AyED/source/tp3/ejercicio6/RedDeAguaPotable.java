package tp3.ejercicio6;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio5.GeneralTree;

public class RedDeAguaPotable {
	public GeneralTree<Character> red;
	
	public RedDeAguaPotable(GeneralTree<Character> arbol) {
		this.red = arbol;
	}


	public double minimoCaudal(double caudal) {
		if (red == null | red.isEmpty()) {
			return 0;
		}
		return minimoCaudal(caudal, red);
	}
	
	private double minimoCaudal (double caudal, GeneralTree<Character> r) {
		if (r.isLeaf()) {
			return caudal;
		}
		List <GeneralTree<Character>> children = r.getChildren();
		double minCaudal = caudal, actCaudal = caudal / children.size();
		for (GeneralTree<Character> child: children) {
			double childCaudal = minimoCaudal(actCaudal, child);
			minCaudal = Math.min(minCaudal, childCaudal);
		}
		return minCaudal;
	}
	
	public static void main (String[] args) {
		GeneralTree<Character> ab1 = new GeneralTree<Character>('B');
    
		List<GeneralTree<Character>> subChildren1 = new LinkedList<GeneralTree<Character>>();
		subChildren1.add(new GeneralTree<Character>('L'));
		GeneralTree<Character> subAb1 = new GeneralTree<Character>('G', subChildren1);
		List<GeneralTree<Character>> subChildren2 = new LinkedList<GeneralTree<Character>>();
		subChildren2.add(new GeneralTree<Character>('F'));
		subChildren2.add(subAb1);
		GeneralTree<Character> ab2 = new GeneralTree<Character>('C', subChildren2);
    
		List<GeneralTree<Character>> subChildren3 = new LinkedList<GeneralTree<Character>>();
		subChildren3.add(new GeneralTree<Character>('M'));
		subChildren3.add(new GeneralTree<Character>('N'));
		GeneralTree<Character> subAb2 = new GeneralTree<Character>('J', subChildren3);
		List<GeneralTree<Character>> subChildren4 = new LinkedList<GeneralTree<Character>>();
		subChildren4.add(new GeneralTree<Character>('H'));
		subChildren4.add(new GeneralTree<Character>('I'));
		subChildren4.add(subAb2);
		subChildren4.add(new GeneralTree<Character>('K'));
		subChildren4.add(new GeneralTree<Character>('P'));
		GeneralTree<Character> ab3 = new GeneralTree<Character>('D', subChildren4);
    
		GeneralTree<Character> ab4 = new GeneralTree<Character>('E');
    
		List<GeneralTree<Character>> arbol = new LinkedList<GeneralTree<Character>>();
		arbol.add(ab1);
		arbol.add(ab2);
		arbol.add(ab3);
		arbol.add(ab4);
		GeneralTree<Character> ab = new GeneralTree<Character>('A', arbol);
    
		RedDeAguaPotable red = new RedDeAguaPotable(ab);
		System.out.println("Caudal minimo que recibe una casa: " + red.minimoCaudal(1000.0));
	}
}
