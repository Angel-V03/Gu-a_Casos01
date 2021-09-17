package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("La base de un triangulo : ");
		int base = sc.nextInt();
		System.out.print("La altura de un triangulo : ");
		int altura = sc.nextInt();
		
		//Variable para calcular el área de un triángulo.
		float area = (base * altura) / 2f;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nÁrea del triangulo : " + area);
	}
}