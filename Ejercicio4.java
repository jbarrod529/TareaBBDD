package EntornoDesarrollo;

import java.util.Scanner;

public class Ejercicio4 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		   
		   
		   /** Inicializamos las variables */
		
		int numDia;
		
		System.out.println("Introduce un numero del 1 al 7");
		
		
		numDia = sc.nextInt();
		
		while (numDia <1 || numDia >7)	{
			
			System.out.println("Valor introducido incorrecto, por favor introduce un numero del 1 al 7");
			numDia = sc.nextInt();
			}
					
		switch(numDia) {
		
		case 1:
			System.out.println("El día introducido es el Lunes");break;
		case 2:
			System.out.println("El día introducido es el Martes");break;
		case 3:
			System.out.println("El día introducido es el Miércoles");break;
		case 4:
			System.out.println("El día introducido es el Jueves");break;
		case 5:
			System.out.println("El día introducido es el Viernes");break;
		case 6:
			System.out.println("El día introducido es el Sábado");break;
		case 7:
			System.out.println("El día introducido es el Domingo");break;
				
			
		
		}
}
}
