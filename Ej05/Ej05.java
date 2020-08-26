package Ej05;

import java.util.Scanner;

public class Ej05 {

	private static Scanner input = new Scanner(System.in);
	
	public static double calcularPromedio(int sumatoria, int cantidad) {
		return sumatoria / cantidad;
	}
	
	public static void main(String[] args) {
		double promedio;
		int numero, sumatoria, i;
		
		promedio = 0;
		sumatoria = 0;
		i = 0;
		do {
			System.out.println("Ingrese un numero");
			numero = input.nextInt();
			
			sumatoria += numero;
			promedio = calcularPromedio(sumatoria, (i+1));
			i++;
		} while (promedio < 20);

		System.out.println("Se leyeron " + i + " valores");
	}

}
