package tp1.ejercicio7;

import java.util.*;

public class TestArrayList {
	
	// Inciso D
	public static void imprimirListaE (ArrayList<Estudiante> listaE) {
		for (Estudiante e : listaE) {
			System.out.println(e.tusDatos() + "\n");
		}
	}
	
	public static void incisoD (ArrayList<Estudiante> listaE1) {	
		Estudiante estudiante;
		listaE1.add(estudiante = new Estudiante ("Nombre1", "Apellido1", "Email1", "Comision1", "Direccion1"));
		listaE1.add(estudiante = new Estudiante ("Nombre2", "Apellido2", "Email2", "Comision2", "Direccion2"));
		listaE1.add(estudiante = new Estudiante ("Nombre3", "Apellido3", "Email3", "Comision3", "Direccion3"));
		
		ArrayList<Estudiante> listaE2 = new ArrayList<Estudiante>(listaE1);
		
		System.out.println("\n--- LISTA 1 ---");
		imprimirListaE(listaE1);
		System.out.println("\n--- LISTA 2 ---");
		imprimirListaE(listaE2);
		
		estudiante = listaE1.get(0);
		estudiante.setApellido("Desconocido");
		
		System.out.println("\n--- LISTA 1 ---");
		imprimirListaE(listaE1);
		System.out.println("\n--- LISTA 2 ---");
		imprimirListaE(listaE2);
	}
	
	// Inciso F
	public static boolean esCapicua(ArrayList<Integer> lista) {
		for (int i = 0; i < lista.size() / 2; i++) {
			if (lista.get(i) != lista.get(lista.size() - i -1)) {
				return false;
			}
		}
		return true;
	}
	
	// Inciso G
	public static void imprimirListaI (List<Integer> listaI) {
		for (Integer i : listaI) {
			System.out.println(i);
		}
	}
	
	public static void invertirArrayList(ArrayList<Integer> lista) {
		for (int i = 0; i < lista.size()/2; i++) {
			int num = lista.get(i);
			lista.set(i, lista.get(lista.size() - i - 1));
			lista.set(lista.size() - i - 1, num);
		}
	}
	
	// Inciso H
	public static int sumarLinkedList(LinkedList<Integer> lista) {
		int total = 0;
		if (!lista.isEmpty()) {
			LinkedList<Integer> sublist = new LinkedList<Integer>(lista.subList(1, lista.size()));
	        total = lista.getFirst() + sumarLinkedList(sublist);	
		}
		return total;
	}
	
	// Inciso I
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		ArrayList<Integer> combinada = new ArrayList<Integer>(lista1.subList(0, lista1.size()));
		for (Integer i : lista2) {
			int x = 0;
			boolean noAgregado = true;
			while ((x < combinada.size()) && noAgregado) {
				if (combinada.get(x) > i) {
					combinada.add(x, i);
					noAgregado = false;
				} else {
					x++;
				}
			}
			if (noAgregado) {
	            combinada.add(i);
	        }
		}
		return combinada;
	}
	
	public static void main(String[] args) {
		// Inciso A
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		for (String arg : args) {
			int numero = Integer.parseInt(arg);
			listaNumeros.add(numero);
		}
		imprimirListaI(listaNumeros);
		
		// Inciso D
		ArrayList<Estudiante> listaE = new ArrayList<Estudiante>();
		incisoD(listaE);
		
		//Inciso E
		Estudiante estudiante = new Estudiante ("Nombre2", "Apellido2", "Email2", "Comision2", "Direccion2");
		if (!listaE.contains(estudiante)){
			listaE.add(estudiante);
			System.out.println("Estudiante registrado con exito.\n");
		} else {
			System.out.println("El estudiante ya esta registrado.\n");
		}
		
		// Inciso F
		if (esCapicua(listaNumeros)) {
			System.out.println("La lista de numeros es capicua.\n");
		} else {
			System.out.println("La lista de numeros no es capicua.\n");
		}
		
		// Inciso G
		invertirArrayList(listaNumeros);
		imprimirListaI(listaNumeros);
		
		// Inciso H
		LinkedList<Integer> listaNumerosLink = new LinkedList<Integer> (listaNumeros);
		System.out.println("\n--- LINKED LIST ---");
		imprimirListaI(listaNumerosLink);
		System.out.println("\nSuma total de la LinkedList: " + sumarLinkedList(listaNumerosLink));
		
		
		// Inciso I
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(4);
		lista1.add(6);
		System.out.println("\n--- LISTA 1 ---");
		imprimirListaI(lista1);
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(2);
		lista2.add(3);
		lista2.add(9);
		System.out.println("\n--- LISTA 2 ---");
		imprimirListaI(lista2);
		
		ArrayList<Integer> listaCombinada = new ArrayList<Integer>(combinarOrdenado(lista1, lista2));
		System.out.println("\n--- LISTA COMBINADA ---");
		imprimirListaI(listaCombinada);	
	}
	
}
