package tp1.ejercicio8;

import java.util.List;
import java.util.LinkedList;

public class Queue<T> extends Sequence<T> {
	List<T> data;
	
	public Queue() {
		data = new LinkedList<T>();
	}
	
	public void enqueue (T dato) {
		data.add(dato);
	}
	
	public T dequeue () {
		T dato = data.get(0);
		data.remove(0);
		return dato;
	}
	
	public T head () {
		return data.get(0);
	}
	
	public int size () {
		return data.size();
	}
	
	public boolean isEmpty () {
		return data.size() == 0;
	}
	
	public String toString () {
		String str = "[";
		for (T dato: data) {
			str += dato.toString() + ", ";
		}
		str = str.substring(0, str.length() -2) + "]";
		return str;
	}
}
