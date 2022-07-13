package listaExercicio1;

import java.util.Scanner;

public class Exercicio3 {
	/**
	 * @param Dado um número, o programa deve calcular o dobro e o triplo desse número.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		
		int numero = entrada.nextInt();
		
		int dobro  = numero * 2;
		
		int triplo = numero * 3;
		
		System.out.print(
				"Dobro = " + dobro + 
				"\nTriplo = " + triplo
				);	
	}
}
