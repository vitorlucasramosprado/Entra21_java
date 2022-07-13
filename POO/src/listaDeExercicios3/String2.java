package listaDeExercicios3;

import java.util.Scanner;

public class String2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		
		System.out.print("Digite uma palavra: ");
		String palavra = input.next();
		
		int qtd = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.substring(i).startsWith(palavra)) {
				qtd++;
			}
		}
		System.out.println("Número de vezes que "+ palavra + " aparece no texto: "+ qtd);
	}
	
	

}
