package principal;

import model.repository.PesquisadorRepository;

public class TestaExcluirPesquisador {

	public static void main(String[] args) {
		PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();

		pesquisadorRepository.excluir(4);
		
	}

}
