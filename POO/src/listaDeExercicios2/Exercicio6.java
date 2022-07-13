package listaDeExercicios2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] =  new int[3];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira um número: ");
			numeros[i] = input.nextInt();
		}
		System.out.println("\n");
		for (int i = 0; i < 11; i++) {
			int resultado = i*numeros[0];
			System.out.println(numeros[0]+ "x" + i + "=" + resultado);
		}
		System.out.println("\n");
		for (int i = 0; i < 11; i++) {
			int resultado = i*numeros[1];
			System.out.println(numeros[1]+ "x" + i + "=" + resultado);
		}
		System.out.println("\n");
		for (int i = 0; i < 11; i++) {
			int resultado = i*numeros[2];
			System.out.println(numeros[2]+ "x" + i + "=" + resultado);
		}
		
	
	}

}
