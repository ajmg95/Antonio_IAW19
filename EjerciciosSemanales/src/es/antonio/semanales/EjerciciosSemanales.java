package es.antonio.semanales;

import java.util.Scanner;

public class EjerciciosSemanales {
	
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		// (09/10/18) Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.
		
		System.out.println("Introduce un número:");
		int num = entrada.nextInt();
		
		if (num > 0) {
			if (num > 0 && num < 10) {
				System.out.println("Tiene una cifra.");
			}
			else if (num >= 10 && num < 100) {
				System.out.println("Tiene dos cifras.");
			}
			else if (num >= 100 && num < 1000) {
				System.out.println("Tiene tres cifras.");
			}
			else if (num >= 1000 && num < 10000) {
				System.out.println("Tiene cuatro cifras.");
			}
			else {
				System.out.println("Tiene más de cuatro cifras.");
			}
		}
		else {
			System.out.println("No valen los números negativos.");
		}
		
		
		
		
		/*(09/10/18) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
			Si trabaja 40 horas o menos se le paga 16€ por hora 
			Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.
         */  
		
		
		System.out.println("Introduce horas trabajadas: ");
		int hora = entrada.nextInt();
		
		if (hora >= 0) {
			if (hora <= 40) {
				int total1 = hora * 16;
				System.out.println("Sueldo: " + total1 + " €");
			}
			else {
				int total2 = 40 * 16 + (hora - 40) * 20;
				System.out.println("Sueldo: " + total2 + " €");
			}
		}
		else {
			System.out.println("Valor incorrecto.");
		}
		
		
		
		
	}
}
