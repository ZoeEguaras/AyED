package tp1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> extends Sequence<T> {
	List<T> data;
	
	public Pila () {
		data = new ArrayList<T>();
	}
	
	public void push (T dato) {
		data.add(dato);
	}
	
	public T pop () {
		T dato = data.remove(data.size() - 1);
		return dato;
	}
	
	public T top () {
		T dato = data.get(data.size() - 1);
		return dato;
	}
	
	public int size() {
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
