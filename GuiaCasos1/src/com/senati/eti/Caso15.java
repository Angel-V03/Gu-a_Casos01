package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner y DecimalFormat.
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00"); 
		//Indicamos La cantidad de decimales requeridos.
		
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese la cantidad: ");
		int cantidad = sc.nextInt();
		System.out.print("Ingrese el precio: ");
		float precio = sc.nextFloat();
		
		//Creamos nuestras variables para operar.
		float import1 = (cantidad * precio); 
		float import2 = import1 / 3.24f;
		float import3 = import1 / 3.75f;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nImporte en soles ..... : " + df.format(import1));
		System.out.println("Importe en dólares ... : " + df.format(import2));
		System.out.println("Importe en euros ..... : " + df.format(import3));
	}
}