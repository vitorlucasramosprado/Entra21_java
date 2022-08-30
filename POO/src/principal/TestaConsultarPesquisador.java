package principal;

import model.entity.Pesquisador;
import model.repository.PesquisadorRepository;

public class TestaConsultarPesquisador {

	public static void main(String[] args) {

		PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
		
		Pesquisador pesquisador = pesquisadorRepository.consultarPorId(1);
		
		System.out.println(pesquisador.toString());
	}

}
