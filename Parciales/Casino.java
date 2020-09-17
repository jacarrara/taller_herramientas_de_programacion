package Parciales;

import java.util.Random;
import java.util.Scanner;

public class Casino {

	private static final double DINERO_MINIMO        = 500.00;
	private static final double COSTO_RULETA         = 100.00;
	private static final double COSTO_BLACK_JACK     = 200.00;
	private static final double COSTO_POKER          = 300.00;
	private static final double MAXIMO_DINERO_GANADO = 5000.00;
	
	private static Scanner input = new Scanner(System.in);
	
	public static int obtenerResultado() {
		Random rn = new Random();
		return rn.nextInt(3);
	}

	public static String ingresarCadena(String mensaje) {
		String cadena;
		
		do {
			System.out.println(mensaje);
			cadena = input.nextLine();
		} while (cadena.equals(""));
		
		return cadena;
	}
	
	public static double ingresarPlata(String mensaje) {
		double plata;
		
		do {
			System.out.println(mensaje);
			plata = input.nextDouble();
			input.nextLine();
			
		} while (plata < DINERO_MINIMO);
		
		return plata;
	}
	
	public static double calcularPorcentaje(double total, double porciento) {
		return total * (porciento/100);
	}
	
	public static boolean puedoJugar(double plataInicial, double plataRestante) {
		
		return  (  plataRestante >= COSTO_BLACK_JACK ||
				   plataRestante >= COSTO_RULETA ||
				   plataRestante >= COSTO_POKER ) &&
				   plataRestante >= calcularPorcentaje(plataInicial, 20) &&
			       plataRestante < plataInicial + MAXIMO_DINERO_GANADO;
	}
	
	public static double procesarJuego(double costoJuego, double plataRestante) {
		int resultado = obtenerResultado();
		
		switch (resultado) {
		case 0:
			System.out.println("Perdio");
			break;
		case 1:
			System.out.println("Empato");
			plataRestante += costoJuego; 
			break;
		case 2:
			System.out.println("Gano");
			plataRestante += (costoJuego * 2); 
			break;
		}
		
		return plataRestante;
	}
	
	public static double calcularPorcentajeSobreTotal(double total, double cantidad) {
		return cantidad*100/total;
	}
	
	public static void main(String[] args) {
		String nombreJugador, juego;
		double plataInicial, plataRestante, costoJuego = 0;
		int cantidadPoker = 0, cantidadTotal = 0;
		boolean error;
		
		nombreJugador = ingresarCadena("Ingrese su nombre");
		plataInicial  = ingresarPlata("Ingrese el monto para jugar");
		plataRestante = plataInicial;
		
		do {
			error = false;
			juego = ingresarCadena("Ingrese el juego [pok/black/rul]");
			
			switch (juego) {
			case "pok":
				costoJuego = COSTO_POKER;
				break;
			case "black":
				costoJuego = COSTO_BLACK_JACK;
				break;
			case "rul":
				costoJuego = COSTO_RULETA;
				break;

			default:
				System.out.println("Juego invalido. Vuelva a ingresarlo");
				error = true;
				break;
			}
			
			
			if (!error) {
				if (plataRestante >= costoJuego) {
					plataRestante -= costoJuego;
					plataRestante = procesarJuego(costoJuego, plataRestante);
					cantidadTotal++;
					if (juego.equals("pok")) {
						cantidadPoker++;
					}
				}
				else {
					System.out.println("No le alcanza el dinero para este juego");
				}
			}
			
			System.out.println(String.format("Cantidad de dinero actual: $%.2f", plataRestante));
			
		} while (puedoJugar(plataInicial, plataRestante));
		
		System.out.println(String.format("Gracias %s! El dinero restante es de $%.2f. Jugaste %d veces al poker, %.2f%% del total", nombreJugador, plataRestante, cantidadPoker, calcularPorcentajeSobreTotal(cantidadTotal, cantidadPoker)));
		
		input.close();
	}

}
