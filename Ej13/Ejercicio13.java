package Ej13;

import java.util.Scanner;

public class Ejercicio13 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	//Declaro e inicializo constantes
	private static final int PRECIO_HORA_COMUN = 16;
	private static final int PRECIO_HORA_EXTRA = 20;
	private static final int MAX_HORAS_COMUNES = 40;
	
	public static void main(String[] args) {
		
		//Declaro variables
		int horasComunes = 0, 
			horasExtras = 0, 
			horas = 0, 
			sueldo = 0;
		
		//Muestro por pantalla
		System.out.println("Ingrese la cantidad de horas semanales trabajadas");
		
		//Capturo la entrada de teclado y la guardo en num1
		horas = input.nextInt();
		
		//Pregunto si trabajó mas de 40h para desglosar horas comunes y horas extras
		if (horas >= MAX_HORAS_COMUNES) {
			horasExtras = horas - MAX_HORAS_COMUNES;
			horasComunes = MAX_HORAS_COMUNES;
		} else
			//Valido que las horas sean positivas, sino el sueldo es cero
			if (horas >= 0)
				horasComunes = horas;
			else
				horasComunes = 0;
		
		//Calculo el sueldo semanal
		sueldo = (horasComunes * PRECIO_HORA_COMUN) + (horasExtras * PRECIO_HORA_EXTRA);
		
		//Muestro por pantalla
		System.out.println("El suedo semanal es: $" + sueldo);
		
		//Cierro la captura por teclado
		input.close();

	}

}
