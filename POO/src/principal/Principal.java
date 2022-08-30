package principal;

import java.util.ArrayList;

import model.entity.Conta;
import model.entity.Pessoa;
import model.entity.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> correntistas = new ArrayList<Pessoa>();
		
		PessoaFisica pedro = new PessoaFisica("Pedro de Lara", "01233311122");
		pedro.setDataNascimento("15/08/1802");
		
		Conta contaPedro1 = new Conta("ab123","12345", -200);
		Conta contaPedro2 = new Conta("ab321","12345", -200);
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		contas.add(contaPedro1);
		
		pedro.setContas(contas);
		
		System.out.println("adimplente:"+ pedro.verificaAdimplencia());
		
		
		
		
//		
//		PessoaJuridica firma1 = new PessoaJuridica("A firma",
//				"22333333000011");
//		
//		correntistas.add(pedro);
//		correntistas.add(firma1);
//		
//		for(int i=0; i < correntistas.size(); i++) {
//			System.out.println("Apelido: " 
//						+ correntistas.get(i).getApelido());
//		}
	}
}