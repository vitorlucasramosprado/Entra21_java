package listaExercicio3;

import java.util.Scanner;

public class Exercicio6 {
/**
 * 
 * @param Crie um programa que leia a largura e a altura de uma parede em metros e calcule a sua área
 * e a quantidade e de tinta necessária para pintá-la, sabendo que cada litro de tinta, pinta uma área
 * de 2 metros quadrados. Exemplo: Dado os números 3 e 2,  programa deve mostrar a msg na tela: Sua parede
 * tem a dimensão de 3.0x2.0 e sua área é de 6.0 metros quadrados. Você precisará de 3 litros de tinta.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float largura = input.nextFloat();
		float altura = input.nextFloat();
		
		float area = largura*altura;
		float tinta = area/2;
		
		System.out.print("Sua parede tem a dimensão de " +largura+ "x" +altura+ 
						" e sua área é de " +area+" metros quadrados." + 
						" Você precisará de " +tinta+ " litros de tinta.");
		
		
	}

}
