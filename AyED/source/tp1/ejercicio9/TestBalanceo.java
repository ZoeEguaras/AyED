package tp1.ejercicio9;

import tp1.ejercicio8.Pila;

public class TestBalanceo {

	public static boolean balanceo (String cadena) {
		boolean balanceado = true;
		Pila<Character> pila = new Pila<Character>();
		int i = 0;
		int corte = cadena.length();
		
		while ((balanceado) && (i < corte)) {
			Character car = cadena.charAt(i);
			if ((car == '(') | (car == '{') | (car == '[')) {
				pila.push(car);
			}
			else {
				if (pila.isEmpty()) {
					balanceado = false;
				}
				else {
					if ((car == ')') && (pila.pop() != '(')) {
							balanceado = false;
					}
					if ((car == '}') && (pila.pop() != '{')) {
						balanceado = false;
				    }
					if ((car == ']') && (pila.pop() != '[')) {
						balanceado = false;
				    }
				}
			}
			i++;
		}
		return balanceado;	
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (balanceo (args[0])) {
			System.out.print("La cadena " + args[0].toString() + " está balanceada.");
		}
		else {
			System.out.print("La cadena " + args[0].toString() + " no está balanceada.");
		}
	}

}
