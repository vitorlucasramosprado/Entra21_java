package listaDeExercicios2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String aluno[] =   new String[3];
		double nota1[] = new double[3];  
		double nota2[] = new double[3];
		double media[] =  new double[3];
		
		for (int i = 0; i < nota1.length; i++) {			
			System.out.print("\nAluno: " );
			aluno[i] = input.next();
			
			System.out.print("Insira a nota 1: ");
			nota1[i] =  input.nextDouble();
			
			System.out.print("Insira a nota 2: ");
			nota2[i] =  input.nextDouble();
			
			media[i] = (nota2[i] + nota1[i]) / 2;
		}
		
		for (int indice = 0; indice < aluno.length; indice++) {
			
			System.out.println("================================"
					+ "\nAluno: " + aluno[indice]);
			System.out.println("Nota 1: " + nota1[indice]);
			System.out.println("Nota 2: " + nota2[indice]);
			System.out.println("Média: " + media[indice]);
			if(media[indice] >= 7) {
				System.out.println("Situação: Aprovado!!!" );
			}else {
				System.out.println("Situação: Reprovado..." );
			}
		}

	}

}
