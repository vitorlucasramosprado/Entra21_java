package listaExercicio2;

import java.util.Scanner;

public class Exercicio8 {
/**@param Leia o número da conta do cliente, seu saldo, débito e crédito. Calcular e escrever o saldo
 *atual utilizando a fórmula saldo atual = saldo - débito + crédito. 
 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o número da sua conta: ");
		String $conta = entrada.nextLine();
		
		System.out.print("Saldo: ");
		int $saldo = entrada.nextInt();
		
		System.out.print("Débito: ");
		float $debito = entrada.nextFloat();
		
		System.out.print("crédito: ");
		float $credito = entrada.nextFloat();
		
		float $saldoAtual = ($saldo - $debito) + $credito;
		
		System.out.print("R$"+$saldoAtual);	
	}
}

		
//		if($saldoAtual >= 0) {
//			System.out.print("Saldo Positivo ");
//		}
//		else {
//			System.out.print("Saldo Negativo ");
//		}	
		
