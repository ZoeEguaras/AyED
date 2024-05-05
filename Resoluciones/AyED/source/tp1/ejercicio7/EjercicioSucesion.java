package tp1.ejercicio7;

import java.util.*;

public class EjercicioSucesion {

	public static List<Integer> calcularSucesion (int n) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(n);
		if (n != 1) {
			if (n % 2 == 0) {
				lista.addAll(calcularSucesion(n/2));
			} else {
				lista.addAll(calcularSucesion(3*n +1));
			}
		}
		return lista;
	}

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista = calcularSucesion(6);
		
		for (int numero : lista) {
			System.out.println(numero);
		}
	}
}
