package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese el nombre del estudiante: ");
		String estudiante = sc.nextLine();
		System.out.print("Ingrese la primera nota: ");
		int nota1 = sc.nextInt();
		System.out.print("Ingrese la segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.print("Ingrese la tercera nota: ");
		int nota3 = sc.nextInt();
		
		//Creamos nuestras variables para operar.
		float prom1 = nota1 * 0.2f;
		float prom2 = nota2 * 0.3f;
		float prom3 = nota3 * 0.5f;
		float promtot = (prom1 + prom2 + prom3);

		//Mostramos nuestros resultados.
		System.out.println("\nRESULTADOS   ");
		System.out.println("::::::::::::::::::::");
		System.out.println("\nEstudiante ..... : " + estudiante);
		System.out.println("Promedio ....... : " + promtot);
	}
}