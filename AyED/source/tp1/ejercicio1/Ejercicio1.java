package tp1.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 9;
		
		// Supongo que 'a' siempre será menor a 'b'.
		System.out.println("--- CON FOR ---");
		Clase.incisoFor(a, b);
		
		System.out.println("--- CON WHILE ---");
		Clase.incisoWhile(a, b);
		
		System.out.println("--- CON RECURSION ---");
		Clase.incisoRecursivo(a, b);
	}
}
