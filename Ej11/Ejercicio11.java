package Ej11;

import java.util.Scanner;

public class Ejercicio11 {
	
	//Instancio el objeto input de la clase Scanner
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		String fechaCompra, nombreComprador, nombreProducto, ticket;
		int cantidad;
		double precioProducto, total;
		
		//Muestro por pantalla
		System.out.println("Ingrese la fecha (YYYMMDD)");
		
		//Capturo la entrada de teclado y la guardo en fechaCompra
		fechaCompra = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese su nombre");
				
		//Capturo la entrada de teclado y la guardo en nombreComprador
		nombreComprador = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese el nombre del producto");
				
		//Capturo la entrada de teclado y la guardo en nombreProducto
		nombreProducto = input.nextLine();
		
		//Muestro por pantalla
		System.out.println("Ingrese el precio del producto");
		
		//Capturo la entrada de teclado y la guardo en precioProducto
		precioProducto = input.nextDouble();
		
		//Muestro por pantalla
		System.out.println("Ingrese la cantidad del producto");
						
		//Capturo la entrada de teclado y la guardo en cantidad
		cantidad = input.nextInt();
		
		
		
		//Genero el string template para mostrar el ticket
	    ticket = "\nFecha de Compra: %s\nNombre del Comprador: %s\nProducto solicitado: %s\n"
	    		+ "Cantidad Solicitada: %d\nPrecio Unitario: $%.2f\nTotal a Pagar: $%.2f";
	    
	    //Calculo el precio total
	    total = cantidad * precioProducto;
	    
	    //Imprimo por pantalla el ticket
	    System.out.println(String.format(ticket, fechaCompra, nombreComprador, nombreProducto, cantidad, precioProducto, total));
	  
		
		//Cierro la captura por teclado
		input.close();

	}

}
