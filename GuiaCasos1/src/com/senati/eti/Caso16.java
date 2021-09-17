package com.senati.eti;

//Importamos las librerías correspondientes.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner y DecimalFormat.
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		//Indicamos La cantidad de decimales requeridos.
		
		
		//Enviamos un mensaje al usuario y declaramos nuestras variables.
		System.out.print("Ingrese horas trabajadas: ");
		int htrabajadas = sc.nextInt();
		System.out.print("Ingrese su tarifa por hora: ");
		float tarifahora = sc.nextFloat();
		
		//Creamos nuestras variables para operar.
		float sueldo = (htrabajadas * tarifahora);
		float bono = sueldo * 0.05f;
		float totalsoles = sueldo + bono;
		float totaldolar = totalsoles / 3.24f;
		
		//Mostramos nuestros resultados.
		System.out.println("\nRESULTADOS   ");
		System.out.println("::::::::::::::::::::");
		System.out.println("\nSueldo .............. : S/" + df.format(sueldo));
		System.out.println("Bono ................ : S/" + df.format(bono));
		System.out.println("Sueldo en soles ..... : S/" + df.format(totalsoles));	
		System.out.println("Sueldo en dólares ... : S/" + df.format(totaldolar));
	}
}