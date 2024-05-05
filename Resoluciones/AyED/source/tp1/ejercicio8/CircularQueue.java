package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T> {
	public T shift () {
		if (!data.isEmpty()) {
			T dato = super.dequeue();
			super.enqueue(dato);
			return dato;
		}
		else
		{
			System.out.print("La cola está vacía.");
			return null;
		}		
	}
}
