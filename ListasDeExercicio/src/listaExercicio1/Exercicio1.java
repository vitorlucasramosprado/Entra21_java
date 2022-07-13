
package listaExercicio1;

import java.util.Scanner;

/* dado dois numeros, somar e mostrar o resultado na tela */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Numero 2: ");
		int numero2 = entrada.nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("resutado = " + resultado);		
		 					
	}

}
