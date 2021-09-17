package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese producto a adquirir: ");
		String product = sc.nextLine();
		System.out.print("Ingrese el precio por producto: ");
		float precio = sc.nextFloat();
		System.out.print("Ingrese la cantidad: ");
		float cantidad = sc.nextFloat();
		
		//Creamos nuestras variables para operar.
		float importe = precio * cantidad;
		float IGV = importe * 0.18f;
		float desct = importe * 0.03f;
		float total = (importe- desct) + IGV;
		
		//Mostramos nuestros resultados.
		System.out.println("\nRESULTADOS   ");
		System.out.println("::::::::::::::::::::");
		System.out.println("\nProducto(s) ............. : " + product);
		System.out.println("Importe de compra ....... : S/" + importe);
		System.out.println("IGV de compra ........... : S/" + IGV);
		System.out.println("Descuento aplicado ...... : S/" + desct);
		System.out.println("Total a pagar ........... : S/" + total);	
	}  
}