package tp1.ejercicio2;

public class Clase {
	public static int [] crearVector (int n) {
		int [] nuevoVector = new int [n];

		for (int i = 0; i < nuevoVector.length; i++) {
			nuevoVector[i] = n*(i+1);
		}
	return nuevoVector;
	}
	
	public static void imprimirVector (int [] vector) {
		System.out.println("--- VECTOR ---");
		for (int i = 0; i< vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
