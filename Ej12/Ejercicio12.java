package Ej12;

import java.util.Scanner;

public class Ejercicio12 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int d1, d2, d3, cantSeis = 0;
		
		//Muestro por pantalla
		System.out.println("Ingrese el valor del primer dado");
		
		//Capturo la entrada de teclado y la guardo en d1
		d1 = input.nextInt();
		
		//Muestro por pantalla
		System.out.println("Ingrese el valor del segundo dado");
				
		//Capturo la entrada de teclado y la guardo en d2
		d2 = input.nextInt();
				
		//Muestro por pantalla
		System.out.println("Ingrese el valor del tercer dado");
		
		//Capturo la entrada de teclado y la guardo en d3
		d3 = input.nextInt();
		
		//Me aseguro que el valor de cada dado esté entre 1 y 6, sino muestro un error
		if ((d1 >= 1 && d1 <= 6) && (d2 >= 1 && d2 <= 6) && (d3 >= 1 && d3 <= 6)) {
			//Incremento el contador cada vez que un dado sea 6
			if (d1 == 6)
				cantSeis++;
			
			if (d2 == 6)
				cantSeis++;
			
			if (d3 == 6)
				cantSeis++;
			
			//De acuerdo al contador, muestro el mensaje que corresponda
			switch (cantSeis) {
			case 0:
				System.out.println("Insuficiente");
				break;
			case 1:
				System.out.println("Regular");
				break;
			case 2:
				System.out.println("Muy bien");
				break;
			case 3:
				System.out.println("Excelente");
				break;
			}
			
		} else
			System.out.println("Al menos un valor ingresado es incorrecto");
		
		
		//Cierro la captura por teclado
		input.close();

	}

}
