package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese lado del triángulo:  ");
		float lado = sc.nextFloat();
		
		float perimetro = lado * 3;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nPerímetro del triangulo : " + perimetro);
	}
}