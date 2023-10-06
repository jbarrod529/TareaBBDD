package daw1.comienzo;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		   
		   
		   /** Inicializo las variables */
				float distance;
				float velocity;
				int timeHour;
				int timeMinutes;
				
				
				/** Obtengo los datos */
				System.out.println("Introduce la distancia a recorrer");
				distance= scanner.nextFloat();
				System.out.println("Introduce la velocidad media prevista (km/h)");
				velocity = scanner.nextFloat();

				if (velocity <=0) {
					
					System.out.println("La velocidad introducida debe ser un numero positivo, por favor introduce un valor valido:");
					
					velocity = scanner.nextFloat();
			
				}
				
				/** calulamos el tiempo */
				
				timeHour= (int)(distance/velocity);
				timeMinutes= (int)((distance % velocity)/velocity*60);;

				/** Muestro los resultados */
				System.out.println("El tiempo que se tardará en recorrer esa distancia es: "+timeHour+" horas y "+timeMinutes+" minutos");
		
		
	
		
		
	}

}
