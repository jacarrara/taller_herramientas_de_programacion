package Ej14;

import java.util.Scanner;

public class Ejercicio14 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		char op;
		int num1, num2, resultado;
		
		//Muestro por pantalla
		System.out.println("Ingrese el numero 1");
		
		//Capturo la entrada de teclado y la guardo en num1
		num1 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el numero 2");
				
		//Capturo la entrada de teclado y la guardo en num2
		num2 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el tipo de operacion (s, r, p ó d)");
		
		//Capturo la entrada de teclado y la guardo en op
		op = input.next().charAt(0);
		
		//Dependiendo la operacion elegida realizo los calculos
		switch (op) {
			case 's':
				resultado = num1 + num2;
				System.out.println(String.format("%d + %d = %d", num1, num2, resultado));
				break;
			case 'r':
				resultado = num1 - num2;
				System.out.println(String.format("%d - %d = %d", num1, num2, resultado));
				break;
			case 'p':
				resultado = num1 * num2;
				System.out.println(String.format("%d * %d = %d", num1, num2, resultado));
				break;
			case 'd':
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println(String.format("%d / %d = %d", num1, num2, resultado));
				} else
					System.out.println("No se puede dividir por cero");
				break;
			default:
				System.out.println("Operacion invalida");
		}
		
		
		//Cierro la captura por teclado
		input.close();

	}

}
