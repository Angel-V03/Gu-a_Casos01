package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		//Operamos.
		int sumatoria = (n*(n+1))/2;
		
		//Mostramos nuestros resultados al usuario.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nSumatoria ... : " + sumatoria);
	}
}