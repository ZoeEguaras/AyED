package tp1.ejercicio3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante  [] arregloEst =  new Estudiante [2];
		Profesor  [] arregloProf =  new Profesor [3];
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i < arregloEst.length; i++) {
			System.out.println("\n--- NUEVO ESTUDIANTE ---");
			Estudiante estudiante = new Estudiante();
			System.out.println("Ingrese nombre: ");
			String dato = scanner.nextLine();
			estudiante.setNombre(dato);
			System.out.println("Ingrese apellido: ");
			dato = scanner.nextLine();
			estudiante.setApellido(dato);
			System.out.println("Ingrese comision: ");
			dato = scanner.nextLine();
			estudiante.setComision(dato);
			System.out.println("Ingrese email: ");
			dato = scanner.nextLine();
			estudiante.setEmail(dato);
			System.out.println("Ingrese direccion: ");
			dato = scanner.nextLine();
			estudiante.setDireccion(dato);	
			arregloEst[i] = estudiante;
		}
		
		for (int i=0; i < arregloProf.length; i++) {
			System.out.println("\n--- NUEVO PROFESOR ---");
			Profesor profesor = new Profesor();
			System.out.println("Ingrese nombre: ");
			String dato = scanner.nextLine();
			profesor.setNombre(dato);
			System.out.println("Ingrese apellido: ");
			dato = scanner.nextLine();
			profesor.setApellido(dato);
			System.out.println("Ingrese email: ");
			dato = scanner.nextLine();
			profesor.setEmail(dato);
			System.out.println("Ingrese catedra: ");
			dato = scanner.nextLine();
			profesor.setCatedra(dato);
			System.out.println("Ingrese facultad: ");
			dato = scanner.nextLine();
			profesor.setFacultad(dato);	
			arregloProf[i] = profesor;
		}
		
		scanner.close();
		
		System.out.println("\n------ ARREGLO ESTUDIANTES ------");
		for (int i=0; i < arregloEst.length; i++) {
			System.out.println("\n--- ESTUDIANTE ---");
			System.out.println(arregloEst[i].tusDatos());
		}
		
		System.out.println("\n------ ARREGLO PROFESORES ------");
		for (int i=0; i < arregloProf.length; i++) {
			System.out.println("\n--- PROFESOR ---");
			System.out.println(arregloProf[i].tusDatos());
		}
	}

}
