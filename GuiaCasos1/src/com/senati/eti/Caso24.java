package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese primer monto: ");
		int monto1 = sc.nextInt();
		System.out.print("Ingrese segundo monto: ");
		int monto2 = sc.nextInt();
		System.out.print("Ingrese tercer monto: ");
		int monto3 = sc.nextInt();
		
		//Creamos nuestras variables para operar.
		float num1 = (monto1 / 5f) + (monto2 * 0.2f);
		float num2 = (monto3 * 1.6f) / 2f;
		float sum = monto1 + monto2 + monto3;
		float num3 = sum - (sum * 0.08f);
		
		//Mostramos nuestros resultados.
		System.out.println("\nRESULTADOS   ");
		System.out.println("::::::::::::::::::::");
		System.out.println("\nPrimer resultado ...... : " + num1);
		System.out.println("Segundo resultado ..... : " + num2);
		System.out.println("Tercer resultado ...... : " + num3);
	}
}