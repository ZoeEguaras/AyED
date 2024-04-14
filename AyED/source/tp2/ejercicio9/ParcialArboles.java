package tp2.ejercicio9;

import tp2.ejercicio2.BinaryTree;

public class ParcialArboles {
	
	 public BinaryTree<Valores> sumAndDif(BinaryTree<Integer> arbol) {
		BinaryTree<Valores> nuevoArbol = new BinaryTree<Valores>();
		nuevoArbol = armarArbol(arbol, arbol.getData(), 0);
		return nuevoArbol;
	 }
	 
	 private BinaryTree<Valores> armarArbol (BinaryTree<Integer> arbol, int suma, int padre) {
		 BinaryTree<Valores> nuevoArbol = new BinaryTree<Valores>();
		 if (arbol.isEmpty()) {
			 return null;
		 } else {
			 Valores v = new Valores (suma, arbol.getData() - padre);
			 nuevoArbol.setData(v);
			 if (arbol.hasLeftChild()) {
				 nuevoArbol.addLeftChild(armarArbol(arbol.getLeftChild(), suma + arbol.getLeftChild().getData(), arbol.getData()));
			 }
			 if (arbol.hasRightChild()) {
				 nuevoArbol.addRightChild(armarArbol(arbol.getRightChild(), suma + arbol.getRightChild().getData(), arbol.getData()));
			 }
			 return nuevoArbol;
		 }
	 }
}
