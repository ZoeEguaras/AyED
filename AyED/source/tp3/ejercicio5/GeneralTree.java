package tp3.ejercicio5;

import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	// En profundidad
	
	public int altura() {
		if (this.isLeaf()) {
			return 0;
		}
		int max = 0;
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> child: children) {
			max = Math.max(max, child.altura()); 
		}
		return max + 1;
	}
	
	// En profundidad
	
	public int nivel(T dato){
		if (this.getData().equals(dato)) {
			return 0;
		}
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> child: children) {
			int niv = child.nivel(dato);
			
			if (niv != -1) {
				return niv + 1;
			}
		}
		return -1;
	}

	public int ancho(){
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int anchoMax = -1;
		int ancho = 0;
		
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				ancho += 1;
				List <GeneralTree<T>> children = aux.getChildren();
				for (GeneralTree<T> child: children) {
					cola.enqueue(child);
				}
			} 
			else {
				if (!cola.isEmpty()) {
					ancho = 0;
					cola.enqueue(null);
				}
			}
			if (ancho > anchoMax) {
				anchoMax = ancho;
			}
		}
		return anchoMax;
	}
	
	 public boolean esAncestro(T a, T b) {
		 GeneralTree<T> subArbol = buscarArbolA(this, a);
		 if (subArbol != null) {
			 return buscarB(subArbol, b);
		 }
		 return false;
	 }
	 
	 private GeneralTree<T> buscarArbolA (GeneralTree<T> arbol, T a) {
		 if (arbol.getData().equals(a)) {
			 return arbol;
		 }
		 GeneralTree<T> aux;
		 List<GeneralTree<T>> children = arbol.getChildren();
		 for (GeneralTree<T> child: children) {
			 aux = buscarArbolA(child, a);
			 
			 if (aux != null) {
				 return aux;
			 }
		 }
		 return null;
	 }
	 
	 private boolean buscarB (GeneralTree<T> arbol, T b) {
		 if (arbol.getData().equals(b)) {
			 return true;
		 }
		 boolean find = false;
		 List<GeneralTree<T>> children = arbol.getChildren();
		 for (GeneralTree<T> child: children) {
			 find = find | buscarB(child, b);
		 }
		 return find;
	 }
}