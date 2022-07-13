package listaExercicio1;

import java.util.Scanner;

public class Exercicio6 {
/**
 * 	
 * @param Ler o nome, 2 notas e a frequência de um aluno em uma disciplina e verificar se o aluno foi aprovado
 * ou não, sabendo que para ser aprovado um aluno precisa ter média >= 6,0 e frequência > 70%.
 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Insira seu nome: ");
			String $nome = entrada.nextLine();
			
			System.out.print("Insira sua primeira nota: ");
			int $nota1 = entrada.nextInt();
			
			System.out.print("Insira sua segunda nota: ");
			int $nota2 = entrada.nextInt();
			
			System.out.print("Insira sua frequência: ");
			float $frequencia = entrada.nextFloat();
			
			int $media = ($nota1 + $nota2)/2;
			
				if (($media >= 6 ) && ($frequencia > 70)) {
					
					System.out.print("!!Parabéns, você foi aprovado!!");
				}
				else {
					System.out.print("Você está reprovado!");
				}	
	}

}
