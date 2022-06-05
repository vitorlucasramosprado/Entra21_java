/**
 * 
 */
package listaExercicio3;

import java.util.Scanner;

public class Exercicio2 {
	/**
	 * 
	 * @param A profiter de uma cidade deseja fazer uma pesquisa entre os 5
	 *          habitantes. Esta pesquisa deseja coletar os dados sobre o salário e
	 *          número de filhos de cada habitante e após as leituras, escrever:
	 *          a)    Média de salário da população b)    Média do número de filhos
	 */

	public static void main(String[] args) {

		int[] children = new int[5];
		int[] salary = new int[5];

		insertSalary(salary);
		insertChildren(children);
		calculatesAverageSalary(salary);
		calculateAverageChildren(children);

	}

	public static void insertSalary(int[] salary) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o salário dos habitantes");

		System.out.print("Habitante 1:  ");
		salary[0] = entrada.nextInt();

		System.out.print("Habitante 2:  ");
		salary[1] = entrada.nextInt();

		System.out.print("Habitante 3:  ");
		salary[2] = entrada.nextInt();

		System.out.print("Habitante 4:  ");
		salary[3] = entrada.nextInt();

		System.out.print("Habitante 5:  ");
		salary[4] = entrada.nextInt();
	}

	public static void insertChildren(int[] children) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o número de filhos");

		System.out.print("Habitante 1:  ");
		children[0] = entrada.nextInt();

		System.out.print("Habitante 2:  ");
		children[1] = entrada.nextInt();

		System.out.print("Habitante 3:  ");
		children[2] = entrada.nextInt();

		System.out.print("Habitante 4:  ");
		children[3] = entrada.nextInt();

		System.out.print("Habitante 5:  ");
		children[4] = entrada.nextInt();
	}

	public static void calculatesAverageSalary(int[] salary) {
		int sum = 0;
		for (int i = 0; i < salary.length; i++) {
			sum += salary[i];
		}
		int averageSalary = sum / salary.length;
		System.out.println("Media salarial = " + averageSalary + "R$");
	}

	public static void calculateAverageChildren(int[] children) {
		int sum = 0;
		for (int i = 0; i < children.length; i++) {
			sum += children[i];
		}
		int averageChildren = sum / children.length;
		System.out.println("Média do número de filhos:" + averageChildren);
	}

}
