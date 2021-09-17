package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso21 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner y DecimalFormat.
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		//Indicamos La cantidad de decimales requeridos.
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese el producto a adquirir: ");
		String producto = sc.nextLine();
		System.out.print("Ingrese el precio unitario:  ");
		float precio = sc.nextFloat();
		System.out.print("Ingrese la cantidad:  ");
		int cantidad = sc.nextInt();
		
		//Creamos nuestras variables para operar.
		float total = precio * cantidad;
		float disminuye = total * 0.12f;
		float pagototal = total * 0.88f;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nProducto(s) ........ : " + producto);
		System.out.println("Valor .............. : S/" + df.format(total));
		System.out.println("Descuento (12%) .... : S/" + df.format(disminuye));
		System.out.println("Total a pagar ...... : S/" + df.format(pagototal));
	}
}