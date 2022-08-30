package principal;

import java.util.ArrayList;
import java.util.List;

import model.entity.Pesquisador;
import model.repository.PesquisadorRepository;

public class TestaConsultarTodosPesquisadores {

	public static void main(String[] args) {
		PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
	
		 ArrayList<Pesquisador> pesquisadores = pesquisadorRepository.pesquisarTodos();
		
		pesquisadores.forEach(psq -> System.out.println(psq.toString()));
	
	}

}
