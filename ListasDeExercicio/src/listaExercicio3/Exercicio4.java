package listaExercicio3;

import java.util.Scanner;

public class Exercicio4 {
/**
 * Dado um número, o programa deve mostrar a sua tabuada.
 * Digitado o valor 5, o sistema deve mostrar o result na tela:
 * 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//MÉTODO 1
//		int number = input.nextInt();	
//		for(int i = 1; i<=10; i++) {
//            int result = i * number;
//            System.out.println(number + " x " + i + " = " + result);
//		}
		
		//MÉTODO 2
		int contador = 0;
		int multiplicador = 5;
		while(contador <= 10) {
			int resultado = multiplicador*contador;
			System.out.println(multiplicador+ "x" +contador+ " = " +resultado);
			contador++;
		}
		
		
	}
}
