package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso08 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestra variable "lado".
		System.out.print("Ingrese lado del cuadrado: ");
		int lado = sc.nextInt();
		
		//int area = lado * lado;
		int area = (int) Math.pow(lado, 2);
		int perimetro = lado*4;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nÁrea ......... : " + area);
		System.out.println("Perímetro .... : " + perimetro);
	}
}