package tp3.ejercicio3;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
        List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
        children2.add(new GeneralTree<Integer>(21));
        children2.add(new GeneralTree<Integer>(22));
        children2.add(new GeneralTree<Integer>(23));
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
        List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
        children3.add(new GeneralTree<Integer>(31));
        children3.add(new GeneralTree<Integer>(32));
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
        List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
        childen.add(a1);childen.add(a2);childen.add(a3);
        GeneralTree<Integer> a = new GeneralTree<Integer>(11, childen);
        
        System.out.println("Altura: " + a.altura());
        System.out.println("Ancho: " + a.ancho());
        int num = 23;
        int nivel = a.nivel(num);
        if (nivel != -1) {
        	System.out.println("El " + num + " se encuentra en el nivel: " + nivel);
        } else {
        	System.out.println("El " + num + " no se encuentra en el arbol.");
        }
	}

}
