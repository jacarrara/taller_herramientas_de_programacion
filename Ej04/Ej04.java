package Ej04;

import java.util.Scanner;

public class Ej04 {

	private static Scanner input = new Scanner(System.in);
	
	public static void imprimirSecuencia(int num1, int num2) {
		
		System.out.println("Secuencia incluyendo extremos:");
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		System.out.println("Secuencia excluyendo extremos:");
		for (int i = num1+1; i < num2; i++) {
			System.out.println(i);
		}
		
	}
	
	public static int ingresarNumero(int index) {
		
		System.out.println("Ingrese el numero " + index);
		int num = input.nextInt();
		
		return num;
	}
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		do {
			
			num1 = ingresarNumero(1);
			num2 = ingresarNumero(2);
			
		} while (num1 > num2);
		
		imprimirSecuencia(num1, num2);

	}

}
