package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nAlumno: " + nombre + " " + apellido);
	}
}