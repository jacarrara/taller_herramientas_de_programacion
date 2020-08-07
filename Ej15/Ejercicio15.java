package Ej15;

import java.util.Scanner;

public class Ejercicio15 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int num;
		boolean estaEnA = false,
				estaEnB = false,
				estaEnAmbos = false,
				noEstaEnNinguno = true;
		
		//Muestro por pantalla
		System.out.println("Ingrese un numero");
		
		//Capturo la entrada de teclado y la guardo en fechaCompra
		num = input.nextInt();
		
		//Pregunto si tiene un solo digito (Conjunto A)
		if (num > -10 && num < 10) {
			estaEnA = true;
			noEstaEnNinguno = false;
		}
		
		//Pregunto si es impar (Conjunto B)
		if (num%2 != 0) {
			estaEnB = true;
			noEstaEnNinguno = false;
		}
	  
		//Pregunto si esta en ambos conjuntos
		if (estaEnA && estaEnB) {
			estaEnAmbos = true;
		}
			
		//Muestro por pantalla en que conjunto esta el numero
		if (estaEnAmbos) {
			System.out.println("Está en ambos");
		} else
			if (estaEnA)
				System.out.println("Está en A");
			else
				if (estaEnB)
					System.out.println("Está en B");
				else
					System.out.println("No esta en ninguno");
		
		//Cierro la captura por teclado
		input.close();

	}

}
