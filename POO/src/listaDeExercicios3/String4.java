package listaDeExercicios3;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vogal = 0;
		
		System.out.print("Insira uma palavra: ");
		String palavra = input.next();
		
		System.out.println("a) Nº caractéres: " + palavra.length());
		
		System.out.println("\nb) letras maiúsculas: " + palavra.toUpperCase());
		
		char chars[] = palavra.toLowerCase().toCharArray();
			for (int indice = 0; indice < palavra.length(); indice++) {
				switch (chars[indice]) {
				case 'a':
					 vogal++;
					break;
				case 'e':
					 vogal++;
					break;
				case 'i':
					 vogal++;
					break;
				case 'o':
					 vogal++;
					break;
				case 'u':
					 vogal++;
					break;
				default:
					break;
				}
			}
		System.out.println("\nc) Nº vogais: " + vogal);
	}

}
