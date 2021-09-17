package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner y DecimalFormat.
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		//Indicamos La cantidad de decimales requeridos.
		
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Número de aprobados: ");
		int aprobados = sc.nextInt();
		System.out.print("Número de desaprobados: ");
		int desaprobados = sc.nextInt();
		System.out.print("Número de retirados: ");
		int retirados = sc.nextInt();
		
		//Creamos nuestras variables para operar.
		float porcen_aprobados = aprobados * 100 / 23f;
		float porcen_desaprobados = desaprobados * 100 / 23f;
		float porcen_retirados = retirados * 100 / 23f;
		
		//Mostramos nuestros resultados.
		System.out.println("\n::::::::::::::");
		System.out.println("  RESULTADOS  ");
		System.out.println("::::::::::::::");
		System.out.println("\nAprobados ...... : "+df.format(porcen_aprobados)+"%");
		System.out.println("Desaprobados ... : "+df.format(porcen_desaprobados)+"%");
		System.out.println("Retirados ...... : "+df.format(porcen_retirados)+"%");	
	}
}