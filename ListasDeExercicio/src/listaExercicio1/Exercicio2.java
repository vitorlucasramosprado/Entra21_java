package listaExercicio1;

import java.util.Scanner;

public class Exercicio2 {
	/**
	 * @param Dado um número inteiro, o programa deve mostrar
	 * o número antecessor, o número digitado e o número sucessor. 
	 */
	public static void main(String[] args) {
		  
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um um número: ");
		int numero = entrada.nextInt();
		
		int antecessor = numero - 1;	
		int sucessor = numero +1;
		
		System.out.print(
				"Número: " + numero +
				"\nAntecessor: " + antecessor +
				"\nSucessor: " + sucessor
				);

	}

}
