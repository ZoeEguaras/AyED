package tp3.ejercicio3;

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
	
	// Por niveles
	
	public int alturaNivel() {	 
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				List <GeneralTree<T>> children = aux.getChildren();
				for (GeneralTree<T> child: children) {
					cola.enqueue(child);
				}
			} 
			else {
				if (!cola.isEmpty()) {
					nivel += 1;
					cola.enqueue(null);
				}
			}
		}
		return nivel;
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
	
	// Por niveles
	
	public int nivelNivel(T dato){
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				if (aux.getData().equals(dato)) {
					return nivel;
				}
				else {
					List <GeneralTree<T>> children = aux.getChildren();
					for (GeneralTree<T> child: children) {
						cola.enqueue(child);
					}
					
				}
			} 
			else {
				if (!cola.isEmpty()) {
					nivel += 1;
					cola.enqueue(null);
				}
			}
		}
		return -1;
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
				if (ancho > anchoMax) {
					anchoMax = ancho;
					ancho = 0;
				}
				if (!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
		return anchoMax;
	}
}