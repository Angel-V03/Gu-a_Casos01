package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso05 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Primer número: ");
		float numero1 = sc.nextFloat();

		System.out.print("Segundo número: ");
		float numero2 = sc.nextFloat();
		
		//Aplicamos un CAST: Convierte un tipo de dato a otro.
		float resultado1 = (numero1 + numero2)/2;
		float resultado2 = numero1 + numero1*0.2f;
		float resultado3 = (float)(numero2-numero2*0.3);

		//Mostramos nuestros resultados.
		System.out.println("\n..............");
		System.out.println("..RESULTADOS..");
		System.out.println("..............");
		System.out.println("Resultado 1.....:" + resultado1);
		System.out.println("Resultado 2.....:" + resultado2);
		System.out.println("Resultado 3.....:" + resultado3);
	}
}