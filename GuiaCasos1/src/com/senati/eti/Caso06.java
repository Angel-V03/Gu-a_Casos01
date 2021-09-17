package com.senati.eti;

public class Caso06 {

	public static void main(String[] args) {
		
		//Declaramos nuestras variables para calcular nuestras operaciones.
		int rs1 = (int)Math.pow(5, 3);
		float rs2 = (float)Math.pow(81.0, 1/2.0);
		float rs3 = (float)Math.pow(125.0, 1/3.0);
		float rs4 = (float)Math.pow(256.0, 1/4.0) + (float)Math.pow(25.0, 1/2.0);
		
		//Mostramos nuestros resultados.
		System.out.println("\n--------------");
		System.out.println("  RESULTADOS  ");
		System.out.println("--------------");
		System.out.println("\nResultado 1 = " + rs1);
		System.out.println("\nResultado 2 = " + rs2);
		System.out.println("\nResultado 3 = " + rs3);
		System.out.println("\nResultado 4 = " + rs4);
	}
}
