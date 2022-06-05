package listaExercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
//	Dado o preço de um produto, o sistema deve calcular o preço com discount de de 5%.
//	Exemplo: Dado o valor 546.00, o sistema deve mostrar a msg: O produto que custava R$ 546.0,
//	na promoção com discount de 5%, seu produto ficará R$ 518.7.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float price = input.nextFloat();
		
		double discount = price * 0.95;
		
		DecimalFormat conversionf = new DecimalFormat("#.##");
		
		System.out.print("O produto que custava R$" +price+
						 ", na promoção com desconto de 5%, seu produto ficará R$" + conversionf.format(discount)+".");
		
		


	}

}
