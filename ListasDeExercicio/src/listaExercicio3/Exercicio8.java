package listaExercicio3;

import java.util.Scanner;

public class Exercicio8 {
//	Dado o salário de um funcionário, o programa deve calcular o salário com 15% de aumento.
//	Exemplo: Dado o salário R$ 3.500,00, o sistema deve mostrar a msg: Um funcionário que ganhava R$ 3500.00,
//	com 15% de aumento, passa a receber R$ 4025.00.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//Recebe o VALOR do SALÁRIO do funcionário.
		double salary = input.nextDouble();
		
		//CALCULA quanto o SALÁRIO vai AUMENTAR.
		double increase = salary * 1.15;
		
		//IMPRIME na TELA o TEXTO com as VARIÁVEIS que guardam os DADOS e CÁLCULOS.  
		System.out.print("Um funcionário que ganhava R$" +salary+
						 ", com 15% de aumento, passa a receber R$" +increase+".");
	}

}
