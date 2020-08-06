package Ej05;

import java.util.Scanner;

public class Ejercicio05 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int num1, num2, resultado;
		
		//Muestro por pantalla
		System.out.println("Ingrese el num1");
		
		//Capturo la entrada de teclado y la guardo en num1
		num1 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el num2");
		
		//Capturo la entrada de teclado y la guardo en num2
		num2 = input.nextInt();
		
		//Pregunto si el num2 es igual a cero
		if (num2 == 0) {
			//Muestro por pantalla
			System.out.println("No se puede dividir por cero");
		} else {
			//Realizo la división y la guardo en la variable resultado
			resultado = num1 / num2;
					
			//Muestro por pantalla
			System.out.println(num1 + " / " + num2 + " = " + resultado);
		}
		
		
		//Cierro la captura por teclado
		input.close();

	}

}
