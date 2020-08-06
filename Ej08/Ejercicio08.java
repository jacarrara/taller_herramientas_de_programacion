package Ej08;

import java.util.Scanner;

public class Ejercicio08 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int dia;
		
		//Muestro por pantalla
		System.out.println("Ingrese un numero entre el 1 y 7 inclusive");
		
		//Capturo la entrada de teclado y la guardo en num1
		dia = input.nextInt();
		
		//Dependiendo de la opcion ingresada, imprimo el dia o un mensaje de error
		switch(dia) {
			case 1:
				System.out.println("Dia Domingo");
				break;
			case 2:
				System.out.println("Dia Lunes");
				break;
			case 3:
				System.out.println("Dia Martes");
				break;
			case 4:
				System.out.println("Dia Miercoles");
				break;
			case 5:
				System.out.println("Dia Jueves");
				break;
			case 6:
				System.out.println("Dia Viernes");
				break;
			case 7:
				System.out.println("Dia Sabado");
				break;
			default:
				System.out.println("El dia ingresado no es valido");
			
		}
		
		
		//Cierro la captura por teclado
		input.close();

	}


}
