import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[] arg) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		int i;
		int multiplicacion;
		
		System.out.print("Introduce un numero entero:");
		n = sc.nextInt();
		
		
		
		for(i=0;i<=10;i++) {
			
			multiplicacion = n*i;
		
			
		
		
		System.out.println(+ n + " x "  + i + " = "+  multiplicacion);
		}	
		
	}

}
