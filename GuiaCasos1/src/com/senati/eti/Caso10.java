package com.senati.eti;

//Importamos las librer�as correspondientes.
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		//Instancia a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Enviamos un mensaje al usuario y declaramos nuestra variable "radio".
		System.out.print("Ingrese el radio del c�rculo: ");
		float radio = sc.nextFloat();
		
		//Declaramos nuestras dem�s variables para operar.
		float area = 3.1416f * (float)Math.pow(radio, 2);
		float perimetro = (float)(3.1416 * radio) * 2;
		
		//Mostramos nuestros resultados.
		System.out.println("\n..................");
		System.out.println("    RESULTADOS    ");
		System.out.println("..................");
		System.out.println("\n�rea del c�rculo ........ : " + area);
		System.out.println("Per�metro del c�rculo ... : " + perimetro);	
	}
}