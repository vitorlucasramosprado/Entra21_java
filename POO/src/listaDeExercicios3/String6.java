package listaDeExercicios3;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um texto: ");
		String texto = input.nextLine();
		
		System.out.println("\nDigite a palavra nova:");
		String palavraNova = input.next();
		
		System.out.println("\nDigite a palavra a ser trocada: ");
		String palavraVelha = input.next();
				
		String palavras[] = texto.toLowerCase().split("\\s+");
		
		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i].equals(palavraVelha.toLowerCase())) {
				palavras[i] = palavraNova;
			}
		}
		String novoTexto = String.join(" ", palavras);
		
		System.out.println("Novo texto: \n" + novoTexto);
		
		
		
		
	}

}
