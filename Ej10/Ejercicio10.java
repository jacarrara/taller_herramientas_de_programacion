package Ej10;

import java.util.Scanner;

public class Ejercicio10 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	//Declaro e inicializo constantes
	private static final int HORA_APERTURA = 10;
	private static final int HORA_CIERRE = 18;
	
	public static void main(String[] args) {
		
		//Declaro variables
		int hora;
		boolean estaAbierto = false;
		
		//Muestro por pantalla
		System.out.println("Ingrese la hora");
		
		//Capturo la entrada de teclado y la guardo en num1
		hora = input.nextInt();
		
		//Valido la hora
		if (hora < 0 || hora > 24) {
			//Muestro por pantalla el error si la hora no es válida
			System.out.println("Ha ingresado una hora incorrecta");
		} else {
			//Valido si la hora está entre el horario de apertura
			if (hora >= HORA_APERTURA && hora < HORA_CIERRE) {
				estaAbierto = true;
			}
			
			//Muestro el mensaje correspondiente, dependiendo al valor del booleando estaAbierto
			if (estaAbierto) {
				System.out.println("El estacionamiento se encuentra abierto");
			} else {
				System.out.println("El estacionamiento se encuentra cerrado");
			}
		}
		
		
		//Cierro la captura por teclado
		input.close();

	}

}
