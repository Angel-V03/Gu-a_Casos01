package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso04 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Declaramos nuestras variables.
		float numero1 = 0;
		float numero2 = 0;
		
		//Enviamos un mensaje al usuario.
		System.out.print("Primer número: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		numero2 = sc.nextFloat();
		
		//Declaramos nuestras variables para calcular nuestras operaciones.
		float suma = numero1 + numero2;
		float resta = numero1 - numero2;
		float producto = numero1 * numero2;
		float cociente = numero1 / numero2;
		float resto_entero = numero1 % numero2;
		
		//Mostramos nuestros resultados.
		System.out.println("\n..................");
		System.out.println("NÚMEROS INGRESADOS");
		System.out.println("..................");
		System.out.println("Suma..........: " + suma);
		System.out.println("Resta.........: " + resta);	
		System.out.println("Producto......: " + producto);	
		System.out.println("Cociente......: " + cociente);	
		System.out.println("Resto entero..: " + resto_entero);	
	}
}
