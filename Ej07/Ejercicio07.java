package Ej07;

import java.util.Scanner;

public class Ejercicio07 {
	
	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int num1, num2, num3;
		
		//Muestro por pantalla
		System.out.println("Ingrese el num1");
		
		//Capturo la entrada de teclado y la guardo en num1
		num1 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el num2");
		
		//Capturo la entrada de teclado y la guardo en num2
		num2 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el num3");
				
		//Capturo la entrada de teclado y la guardo en num3
		num3 = input.nextInt();
		
		//Pregunto si num1 es igual num2 y num2 es igual num3
		if (num1 == num2 && num2 == num3) {
			//Muestro por pantalla
			System.out.println("Los numeros son iguales");
		} else
			//Pregunto si num1 es mayor a num2 y num1 es mayor a num3
			if (num1 > num2 && num1 > num3) {
				//Muestro por pantalla
				System.out.println("El mayor numero es num1");
			} else
				//Pregunto si num2 es mayor a num1 y num2 es mayor a num3
				if (num2 > num1 && num2 > num3) {
					//Muestro por pantalla
					System.out.println("El mayor numero es num2");
				} else {
					//Muestro por pantalla
					System.out.println("El mayor numero es num3");
				}
		
		
		//Cierro la captura por teclado
		input.close();

	}


}
