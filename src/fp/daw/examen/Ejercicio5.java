package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;



public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Random r = new Random();
			int adivinar = r.nextInt(100);
			int aleatorio = 0;
			int i = 0;
			do {			
				do {
			System.out.println("Introduce un número aleatorio");
			 aleatorio = a.nextInt();
			if (aleatorio <= 0)
				System.out.println("Cantidad Incorrecta. Vuelve a introducirla");	
				} while(aleatorio != 0);
				
			 while (adivinar != aleatorio); 
			 
				if (adivinar == aleatorio) {
					System.out.println("El número " + aleatorio + " es correcto.");
				} 
				if (adivinar >= aleatorio) {
					System.out.println("El número " + aleatorio + " es mayor.");
				} 
				if (adivinar <= aleatorio) {
					System.out.println("El número " + aleatorio + " es menor.");
				} 
				
				System.out.println("¿Deseas realizar otro desglose? (S/N) ");			
				} while (a.next().toLowerCase().equals("s"));
			
	}

}
	

					
	

	

			
	



