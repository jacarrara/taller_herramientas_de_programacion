package Ej04;

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Muestro por pantalla
		System.out.println("Ingrese el num1");
		
		//Capturo la entrada de teclado y la guardo en num1
		int num1 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el num2");
		
		//Capturo la entrada de teclado y la guardo en num2
		int num2 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));
		
		//Cierro la captura por teclado
		input.close();

	}

}