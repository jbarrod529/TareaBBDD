package EntornoDesarrollo;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int n; //numero hasta el cual vamos a sumar
		int i; //utilizo esta variable para el bucle
		int suma=0;
		
		System.out.println("Introduce un numero mayor que 1:");
		n = sc.nextInt(); 
		
		while (n<1) {
			
			System.out.println("El numero introducido no cumple con los requisitos solicitados, por favor introduce un numero positivo:");
			n = sc.nextInt();	
			
		}
		
		for(i=1;i<=n;i++) {
			
			suma=suma+i;
		
			
		}
		
		System.out.print("La suma acumulada desde el 1 hasta el "+ n+ " es " +suma);
		
		
	}

}
