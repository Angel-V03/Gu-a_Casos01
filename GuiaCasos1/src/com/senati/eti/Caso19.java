package com.senati.eti;

//Importamos las librer�as correspondientes.
import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese lado del tri�ngulo:  ");
		float lado = sc.nextFloat();
		
		float perimetro = lado * 3;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nPer�metro del triangulo : " + perimetro);
	}
}