package EntornoDesarrollo;

import java.util.Scanner;

public class Ejercicio5 {

	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		int age;
		
		System.out.println("Introduce tu edad:");

		age= sc.nextInt();
		
		while (age<=0) {
			
			System.out.println("La edad debe ser un numero positivo, por favor introduce de nuevo la edad:");	
			
			age= sc.nextInt();
		}
		
		if(age<12) {
			
			System.out.println("Infante");
		}
		else if(age>=12 && age<18) {
			
			System.out.println("Adolescente");
		}
		
		else if(age>=18 && age<=60) {
			
			System.out.println("Adulto");
		}
		
		else if(age>60) {
			
			System.out.println("Anciano");
		}
		
	}
	
}
