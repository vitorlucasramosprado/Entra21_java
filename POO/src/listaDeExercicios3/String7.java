package listaDeExercicios3;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		String valor = input.next();

		char charNumeros[] = valor.toCharArray();
		
		for (int i = 0; i < charNumeros.length; i++) {
		
			switch (charNumeros[i]) {
			case '0':
				 System.out.print("ZERO, ");
				break;
			case '1':
				 System.out.print("UM, ");
				break;
			case '2':
				 System.out.print("DOIS, ");
				break;
			case '3':
				 System.out.print("TRÊS, ");
				break;
			case '4':
				 System.out.print("QUATRO, ");
				break;
			case '5':
				 System.out.print("CINCO, ");
				break;
			case '6':
				 System.out.print("SEIS, ");
				break;
			case '7':
				 System.out.print("SETE, ");
				break;
			case '8':
				 System.out.print("OITO, ");
				break;
			case '9':
				 System.out.print("NOVE, ");
				break;
			default:
				System.out.println("cai no default");
				break;
			}
		}
	}
}
