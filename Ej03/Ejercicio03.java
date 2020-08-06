package Ej03;

import java.util.Scanner;

public class Ejercicio03 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Muestro por pantalla
		System.out.println("Ingrese su nombre");
		
		//Capturo la entrada de teclado en la variable nombre
		String nombre = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Bienvenido " + nombre + "!");
		
		//Cierro la captura de teclado
		input.close();

	}

}
