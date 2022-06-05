package listaExercicio2;

import java.util.Scanner;

public class Exercicio9 {
/**
 * 
 * @param Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
*receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a
*quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o
*valor a ser pago pelo cliente
 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira quantos Kg de morango você pegou: ");
		float $morango = entrada.nextFloat();
		
		System.out.print("Insira quantos Kg de maçãs você pegou: ");
		float $maca = entrada.nextFloat();
		
		
			if($morango > 5) {
				double $valorMorango = $morango * 2.2;
			}
			else {
				double $valorMorango = $morango *2.5;
			}
			
			if($maca > 5) {
				double $valorMaca = $maca *1.5;
			}
			else {
				double $valorMaca = $maca *1.8;
			}
			
			double $valorMorango = 0;	
			double $valorMaca = 0;
		
		
		double $valorTotal = $valorMorango + $valorMaca;
		
		double $quantidadeTotal = $morango + $maca;
		
			if(($quantidadeTotal > 8) || ($valorTotal > 25.0)) {
				double $desconto = $valorTotal * 0.9;
			}
		
		 System.out.print($valorTotal);
		


	}

}
