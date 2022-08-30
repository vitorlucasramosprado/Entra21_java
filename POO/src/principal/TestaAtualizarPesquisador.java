package principal;

import model.entity.Pesquisador;
import model.repository.PesquisadorRepository;

public class TestaAtualizarPesquisador {

	public static void main(String[] args) {

		PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
		
		Pesquisador pesquisador = pesquisadorRepository.consultarPorId(1);
		
		pesquisador.setMatricula(37);
		
		pesquisadorRepository.atualizar(pesquisador);
		
	}

}
