package com.senati.eti;

//Importamos las librerías correspondientes.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

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
		float incremento = total * 0.42f;
		float pagototal = total * 1.42f;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nProducto(s) ........ : " + producto);
		System.out.println("Valor .............. : S/" + df.format(total));
		System.out.println("Incremento (42%) ... : S/" + df.format(incremento));
		System.out.println("Total a pagar ...... : S/" + df.format(pagototal));
	}
}