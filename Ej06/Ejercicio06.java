package Ej06;

import java.util.Scanner;

public class Ejercicio06 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int num1;
		
		//Muestro por pantalla
		System.out.println("Ingrese un numero mayor a cero");
		
		//Capturo la entrada de teclado y la guardo en num1
		num1 = input.nextInt();
		
		//Pregunto si el resto de dividir a num1 sobre 2 es igual a cero
		if (num1%2 == 0) {
			//Muestro por pantalla
			System.out.println("El numero es par");
		} else {
			//Muestro por pantalla
			System.out.println("El numero es impar");
		}
		
		
		//Cierro la captura por teclado
		input.close();

	}


}
