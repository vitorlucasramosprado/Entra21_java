package listaExercicio3;

import java.util.Scanner;

public class Exercicio1 {

	/**
	 * @param O sistema de avaliação de uma disciplina é composto por 3 provas. Leia
	 *          a nota das 3 provas e calcule a média final de um aluno desta
	 *          disciplina.
	 */

	public static void main(String[] args) {

		float[] test = new float[3];

		insertTest(test);
		calculatesFinalMedia(test);
	}

	public static void insertTest(float[] test) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota prova 1:");
		test[0] = entrada.nextFloat();

		System.out.print("Nota prova 2:");
		test[1] = entrada.nextFloat();

		System.out.print("Nota prova 3:");
		test[2] = entrada.nextFloat();

	}

	public static void calculatesFinalMedia(float[] test) {
		// float mediaFinal = (notaProva1 + notaProva2 + notaProva3) / 3;
		int sum = 0;
		for (int i = 0; i < test.length; i++) {
			sum += test[i];
		}
		int averageTest = sum / test.length;
		System.out.println("Média final: " + averageTest);
	}
}
