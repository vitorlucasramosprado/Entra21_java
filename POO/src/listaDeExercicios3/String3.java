package listaDeExercicios3;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 0,
			e = 0,
			i = 0,
			o = 0,
			u = 0;
		
		System.out.println("Digite uma frase");
		String frase = input.nextLine();
		
		char chars[] = frase.toLowerCase().toCharArray();
		
		for (int indice = 0; indice < frase.length(); indice++) {
			switch (chars[indice]) {
			case 'a':
				 a++;
				break;
			case 'e':
				 e++;
				break;
			case 'i':
				 i++;
				break;
			case 'o':
				 o++;
				break;
			case 'u':
				 u++;
				break;
			default:
				break;
			}
		}
		System.out.println("Quantidade de cada vogal"
				+ "\na: "+a+
				"\ne: "+e+
				"\ni: "+i+
				"\no: "+o+
				"\nu: "+u+
				"\n\nFrase: "+ frase);
		
	}

}
