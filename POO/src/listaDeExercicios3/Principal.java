package listaDeExercicios3;

import entidade.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica vitor = new PessoaFisica("vitor", "415.904.258-98");
		vitor.setDataNascimento("15/08/2002");
		
		PessoaFisica outro = vitor;
		
		System.out.println(outro);
		System.out.println(vitor);
		
		
	}

}
