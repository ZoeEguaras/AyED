package tp2.ejercicio2;

import tp1.ejercicio8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.getData() == null && this.isLeaf());
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		if (isLeaf()) {
			return 1;
		}
		else {
			int hojas = 0;
			if (hasLeftChild()) {
				hojas += getLeftChild().contarHojas();
			}
			if (hasRightChild()) {
				hojas += getRightChild().contarHojas();
			}
			return hojas;
		}
	}
		
    public BinaryTree<T> espejo(){
    	if (isEmpty()) {
    		return null;
    	}
    	else {
    		BinaryTree<T> arbol = new BinaryTree<T>(this.data);
			if (hasLeftChild()) {
				arbol.addRightChild(getLeftChild().espejo());
			}
			if (hasRightChild()) {
				arbol.addLeftChild(getRightChild().espejo());
			} 
			return arbol;
		}
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		BinaryTree<T> arbol = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		while (!cola.isEmpty() && (nivel <= m)) {
			arbol = cola.dequeue();
			if (arbol != null) {
				if ((nivel >= n) && (nivel <= m)) {
					System.out.println(arbol.getData());
				}
				if (arbol.hasLeftChild()) {
					cola.enqueue(arbol.getLeftChild());
				}
				if (arbol.hasRightChild()) {
					cola.enqueue(arbol.getRightChild());
				}
			} else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					nivel ++;
				}
			}
		}
    }
		
}
