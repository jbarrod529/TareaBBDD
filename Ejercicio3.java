package daw1.comienzo;

import java.util.Scanner;

public class Ejercicio3 {
	
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	float num1;
	float num2;
	float num3;
	float maxTotal;
	
	System.out.println("Vamos a calcular el valor máximo de tres numeros que introduzcas, ¡comencemos!");
	
	System.out.println("Introduce el primer número");
	
	num1=scanner.nextFloat();
	
	System.out.println("Introduce el segundo número");
	
	num2=scanner.nextFloat();
	
	System.out.println("Introduce el tercer número número");
	
	num3=scanner.nextFloat();
	
	maxTotal=Math.max(Math.max(num1, num2),num3);
	
	
	
	System.out.println("El valor máximo introducido es :"+maxTotal);
	
	
