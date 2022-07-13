package listaExercicio1;

import java.util.Scanner;

public class Exercicio5 {
/**
 * @param Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80 km/h, mostre
 * uma mensagem dizendo que ele foi multado. A multa vai custar R$ 7,00 por cada km acima do limite.
 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira sua velocidade em km/h: ");
		int $velocidadeDoCarro = entrada.nextInt();
		
		if ($velocidadeDoCarro > 80) {
			
			int $multa = ($velocidadeDoCarro - 80)*7;
			
			System.out.print("A velocidade do veículo ultrapassa o limite que é permitido na via."
					+ "\n Você será multado no valor de: " + $multa + "R$" );
			
		}
		

	}

}
