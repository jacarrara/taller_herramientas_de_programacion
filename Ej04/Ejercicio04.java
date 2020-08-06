package Ej04;

import java.util.Scanner;

public class Ejercicio04 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int num1, num2;
		
		//Muestro por pantalla
		System.out.println("Ingrese el num1");
		
		//Capturo la entrada de teclado y la guardo en num1
		num1 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el num2");
		
		//Capturo la entrada de teclado y la guardo en num2
		num2 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));
		
		//Cierro la captura por teclado
		input.close();

	}

}