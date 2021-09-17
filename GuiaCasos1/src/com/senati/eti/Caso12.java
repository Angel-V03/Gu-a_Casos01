package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		//Declaramos nuestras variables frase.
		String frase = "ESCUELA DE TECNOLOGÍA E INFORMÁTICA";
		
		//Substring (posiciones en nnuestra variable "frase").
		String pl1 = frase.substring(0, 7);
		String pl2 = frase.substring(11, 21);
		String pl3 = frase.substring(24, 35);
		
		//Mostramos nuestros resultados.
		System.out.println("::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nFrase ....... : " + frase);
		System.out.println("\nPalabra 1 ... : " + pl1);
		System.out.println("Palabra 2 ... : " + pl2);
		System.out.println("Palabra 3 ... : " + pl3);
	}
}