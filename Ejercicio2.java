package daw1.comienzo;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		   
		   
		   /** Inicializamos las variables */
				float distance;
				float velocity;
				int timeHour;
				int timeMinutes;
				
				
				/** Obtengo los datos */
				System.out.println("Introduce la distancia a recorrer en km");
				distance= sc.nextFloat();
		
				while (distance <0) {
					
					System.out.println("La distancia introducida debe ser un numero mayor o igual que 0, por favor introduce un valor valido:");
					
					velocity = sc.nextFloat();
			
				}
	
				System.out.println("Introduce la velocidad media prevista (km/h)");
				velocity = sc.nextFloat();

				while (velocity <=0) {
					
					System.out.println("La velocidad introducida debe ser un numero positivo, por favor introduce un valor valido:");
					
					velocity = sc.nextFloat();
			
				}
				
				/** calulamos el tiempo */
				
				timeHour= (int)(distance/velocity);
				timeMinutes= (int)(((distance % velocity)/velocity)*60);

				/** Muestro los resultados */
				System.out.println("El tiempo que se tardará en recorrer esa distancia es: "+timeHour+" horas y "+timeMinutes+" minutos");
		
		
	
		
		
	}

}
