package listaDeExercicios3;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase");
		String texto = input.nextLine();
		
		String[] palavras = texto.split(" ");
		
		System.out.println("O número de palavaras é: "+palavras.length);
	}

}
