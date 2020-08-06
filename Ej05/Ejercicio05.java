package Ej05;

import java.util.Scanner;

public class Ejercicio05 {

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
		
		//Pregunto si el num2 es igual a cero
		if (num2 == 0) {
			//Muestro por pantalla
			System.out.println("No se puede dividir por cero");
		} else {
			//Muestro por pantalla
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		
		
		//Cierro la captura por teclado
		input.close();

	}

}
