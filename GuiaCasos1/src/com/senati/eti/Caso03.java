package com.senati.eti;

//Importamos la librer�a Java de lecturas.
import java.util.Scanner;

public class Caso03 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in); 
		
		//Declaramos nuestras variables.
		float numero1 = 0;
		float numero2 = 0;
		
		//Pedimos al usuario que inserte valores a las varibles.
		System.out.print("Primer n�mero: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		numero2 = sc.nextFloat();
		
		//Mostraros nuestros resultados.
		System.out.println("N�MEROS INGRESADOS");
		System.out.println("..................");
		System.out.println("N�mero 1: " + numero1);
		System.out.println("N�mero 2: " + numero2);			
	}
}
