package tp1.ejercicio1;

public class Clase {
	public static void incisoFor (int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void incisoWhile (int a, int b) {
		while (a <= b) {
			System.out.println(a++);
		}
	}
	
	public static void incisoRecursivo (int a, int b) {
		if (a <= b) {
			System.out.println(a);
			incisoRecursivo(++a, b);
		}
	}
}
