package tp1.ejercicio5;

public class Ejercicio5 {

	static int minimo;
	static int maximo;
	static double promedio;
	
	public static double [] incisoA (int [] vector) {
		double [] resultados = new double [3];
		resultados[0] = 9999;
		resultados[1] = 0;
		int tot = 0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]<resultados[0]){
				resultados[0] = vector[i];
			}
			if (vector[i]>resultados[1]) {
				resultados[1] = vector[i];
			}
			tot = tot + vector[i];
		}
		resultados[2] = tot / vector.length;
		return resultados;
	}
	
	public static void incisoB (int [] vector, Resultado res) {
		int min = 99999, max = 0, tot = 0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]<min){
				min = vector[i];
			}
			if (vector[i]>max) {
				max = vector[i];
			}
			tot = tot + vector[i];
		}
		res.setMinimo(min);
		res.setMaximo(max);
		res.setPromedio(tot/vector.length);
	}
	
	public static void incisoC (int [] vector) {
		int min = 99999, max = 0, tot = 0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]<min){
				min = vector[i];
			}
			if (vector[i]>max) {
				max = vector[i];
			}
			tot = tot + vector[i];
		}
		minimo = min;
		maximo = max;
		promedio = tot / vector.length;		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arreglo = {4, 2, 6, 1, 3, 56, 23, 67, 4};
		double [] resultados = Ejercicio5.incisoA(arreglo);
		System.out.println("---- CON RETURN ----");
		System.out.println("Minimo: " + resultados[0] + "\nMaximo: " + resultados[1] + "\nPromedio: " + resultados[2]);
		
		Resultado res = new Resultado();
		Ejercicio5.incisoB(arreglo, res);
		System.out.println("\n---- CON PARAMETROS ----");
		System.out.println("Minimo: " + res.getMinimo() + "\nMaximo: " + res.getMaximo() + "\nPromedio: " + res.getPromedio());
		
		Ejercicio5.incisoC(arreglo);
		System.out.println("\n---- SIN NADA ----");
		System.out.println("Minimo: " + minimo + "\nMaximo: " + maximo + "\nPromedio: " + promedio);
	}

}
