package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();  //crea un objeto
		int cantidad = nombre.length(); //longitud()
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nNúmero de caracteres ... : " + cantidad);
	}
}