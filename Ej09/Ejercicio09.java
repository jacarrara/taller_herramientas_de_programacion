package Ej09;

import java.util.Scanner;

public class Ejercicio09 {

	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		String nom1, nom2, nom3, template;
		double cap1, cap2, cap3, porc1, porc2, porc3, total;
		
		//Muestro por pantalla
		System.out.println("Ingrese su nombre");
				
		//Capturo la entrada de teclado y la guardo en nom1
		nom1 = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese el capital aportado");
		
		//Capturo la entrada de teclado y la guardo en cap1
		cap1 = input.nextDouble();
		input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese su nombre");
						
		//Capturo la entrada de teclado y la guardo en nom2
		nom2 = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese el capital aportado");
		
		//Capturo la entrada de teclado y la guardo en cap2
		cap2 = input.nextDouble();
		input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese su nombre");
						
		//Capturo la entrada de teclado y la guardo en nom3
		nom3 = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese el capital aportado");
				
		//Capturo la entrada de teclado y la guardo en cap3
		cap3 = input.nextDouble();
		//input.nextLine();
		
		//Calculo el total
		total = cap1 + cap2 + cap3;
		
		//Valido que total sea distinto de cero para calcular los porcentajes
		if (total == 0) {
			porc1 = 0;
			
			porc2 = 0;
			
			porc3 = 0;
			
		} else {
			//Calculo Porcentajes
			porc1 = cap1 * 100 / total;
			
			porc2 = cap2 * 100 / total;
			
			porc3 = cap3 * 100 / total;
		}
		
		//Genero el string template para mostrar el reporte
	    template = "Nombre: %s, Capital aportado: $%.2f, Porcentaje del capital: %.2f%%, Monto total aportado: $%.2f";
	  
	    //Muestro por pantalla
	    System.out.println(String.format(template, nom1, cap1, porc1, total));
	    System.out.println(String.format(template, nom2, cap2, porc2, total));
	    System.out.println(String.format(template, nom3, cap3, porc3, total));
		 
		
		//Cierro la captura por teclado
		input.close();

	}

}
