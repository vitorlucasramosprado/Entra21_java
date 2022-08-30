package principal;

import java.util.Date;

import controller.PesquisadorController;
import exception.PesquisadorCpfInvalidoException;
import exception.PesquisadorMatriculaInvalidaException;
import exception.PesquisadorNomeInvalidoException;
import model.entity.Pesquisador;

public class TestaInserirPesquisador {

	public static void main(String[] args) {
		
		PesquisadorController pesquisadorController = new PesquisadorController();
		
		Pesquisador novoPesquisador = new Pesquisador("Xaulin", "12345698778", 1, new Date());
		
		Pesquisador pesquisador;
		try {
			pesquisador = pesquisadorController.inserir(novoPesquisador);
			System.out.println(pesquisador.toString());
		} catch (PesquisadorNomeInvalidoException | PesquisadorMatriculaInvalidaException
				| PesquisadorCpfInvalidoException e) {
			e.getMessage();
		}
		
	}

}
