package controller;

import java.util.ArrayList;

import exception.PesquisadorCpfInvalidoException;
import exception.PesquisadorMatriculaInvalidaException;
import exception.PesquisadorNomeInvalidoException;
import exception.VacinaSemResponsavelException;
import model.entity.Pesquisador;
import model.entity.Vacina;
import model.repository.PesquisadorRepository;
import model.repository.VacinaRepository;

public class PesquisadorController {

	private PesquisadorRepository pesquisadorRepository;
	
	public PesquisadorController() {
		super();
		this.pesquisadorRepository = new PesquisadorRepository();
	}

	public Pesquisador inserir(Pesquisador pesquisador) throws PesquisadorNomeInvalidoException,
			PesquisadorMatriculaInvalidaException, PesquisadorCpfInvalidoException {
		if (pesquisador.getNome() == null || pesquisador.getNome().trim().isEmpty()) {
			throw new PesquisadorNomeInvalidoException("Informe o Nome do pesquisador");

		} else if (pesquisador.getMatricula() == 0) {
			throw new PesquisadorMatriculaInvalidaException("Informe a matrícula do pesquisador");
		
		} else if (pesquisador.getCpf() == null || pesquisador.getCpf().trim().isEmpty()) {
			throw new PesquisadorCpfInvalidoException("Informe o CPF do Pesquisador");
		}
		
		return this.pesquisadorRepository.inserir(pesquisador);
	}
	
	public boolean atualizar(Pesquisador pesquisador) {
		return this.pesquisadorRepository.atualizar(pesquisador);
	}
	
	public boolean excluir(int id) {
		return this.pesquisadorRepository.excluir(id);
	}
	
	public Pesquisador pesquisarPorId(int id) {
		return this.pesquisadorRepository.consultarPorId(id);
	}
	
	public ArrayList<Pesquisador> pesquisarTodas(){
		return this.pesquisadorRepository.pesquisarTodos();
	}
}
