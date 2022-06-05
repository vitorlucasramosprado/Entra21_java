package listaExercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
/**
 * 
 * @param Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e o programa deve mostrar quantos
 *  dólares ela pode comprar. Considere que 1 dólar custa 5,90 reais. Exemplo: O programa vai perguntar: Quanto
 *  de dinheiro você tem na carteira?, a pessoa vai digitar 32,75 e o programa deve mostrar: Com R$ 32.75, você
 *  poderá comprar US$ 7,79.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto de dinheiro você tem na carteira? ");
		float cash = input.nextFloat();
		
		double conversion = cash/5.90;
		DecimalFormat conversionf = new DecimalFormat("#.##");
		
		System.out.print("Com R$" +cash+ ", você poderá comprar US$" +conversionf.format(conversion));	
		
	}
}
