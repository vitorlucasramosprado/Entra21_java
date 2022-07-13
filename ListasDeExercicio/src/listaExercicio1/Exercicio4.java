package listaExercicio1;

import java.util.Scanner;

public class Exercicio4 {
	/**
	 * 
	 * @param Dado duas médias, o programa deve calcular a média aritmética.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		float $numero1 = entrada.nextFloat();
		
		System.out.print("Insira um número: ");
		float $numero2 = entrada.nextFloat();
		
		float $media = ($numero1 + $numero2)/2;
		
		System.out.print("Média aritmética = " + $media);
		
	}

}
