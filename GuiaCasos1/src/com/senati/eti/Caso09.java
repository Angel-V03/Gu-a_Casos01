package com.senati.eti;

//Importamos las librer�as correspondientes.
import java.util.Scanner;

public class Caso09 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese primer lado del rect�ngulo: ");
		int lado1 = sc.nextInt();
		System.out.print("Ingrese segundo lado del rect�ngulo: ");
		int lado2 = sc.nextInt();
		
		//Declaramos nuestras dem�s variables para operar.
		int area = lado1 * lado2;
		int perimetro = lado1 * 2 + lado2 * 2;
		
		//Mostramos nuestros resultados.
		System.out.println("\n..................");
		System.out.println("N�MEROS INGRESADOS");
		System.out.println("..................");
		System.out.println("\n�rea del rect�ngulo ........ : " + area);
		System.out.println("Per�metro del rectangulo ... : " + perimetro);	
	}
}