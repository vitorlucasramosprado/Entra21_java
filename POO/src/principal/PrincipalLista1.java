package principal;

import entidade.Conta;

public class PrincipalLista1 {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		//conta1.deposita(100);		
		
//		double valorSacadoDeFato = conta1.saca(500);
//		System.out.println("Sacado de fato R$" + valorSacadoDeFato );
		
		
		conta1.depositar(1000);
		
		conta1.efetuarRendimento(5.0);
		System.out.println("saldo atual: R$" + conta1.getSaldo());
		
		
	}

}
