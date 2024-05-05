package tp1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero positivo: ");
		int n = scanner.nextInt();
		scanner.close();
		
		int [] vector = Clase.crearVector(n);
		
		Clase.imprimirVector(vector);
	}
}
