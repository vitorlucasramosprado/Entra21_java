package listaExercicio2;

import java.util.Scanner;

public class Exercicio7 {
	/**
	 * 
	 * @param Calcule a média dos alunos e indique se ele está aprovado ou reprovado. Permita que este
               aluno faça exame para poder ser aprovado.
	         4 notas bimestrais
               Média para aprovação = 7,0
               Média para aprovação para Exame = 6,0
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.print("Insira a nota do primeiro bimestre: ");
		int $bimestre1 = entrada.nextInt();
		
		System.out.print("Insira a nota do segundo bimestre: ");
		int $bimestre2 = entrada.nextInt();
		
		System.out.print("Insira a nota do terceiro bimestre: ");
		int $bimestre3 = entrada.nextInt();
		
		System.out.print("Insira a nota do quarto bimestre: ");
		int $bimestre4 = entrada.nextInt();
		
		float $media = ($bimestre1 + $bimestre2 + $bimestre3 + $bimestre4)/4;
			
			if($media >= 7.0) {
				System.out.print("!!Parabéns, você está aprovado!!");
			}else {
				System.out.print("Sua média está menor que a necessária para ser aprovado."
						+ "\nFaça a prova de recuperação"
						+ "\nInsira a nota da prova de recuperação:");
						float $notaRecuperacao = entrada.nextFloat();
						
						if($notaRecuperacao >= 6 ) {
							System.out.print("!!! Parabéns, você está aprovado !!!");
						}else {
							System.out.print("Você está reprovado!!");
						}
			   }							
	}  
}
