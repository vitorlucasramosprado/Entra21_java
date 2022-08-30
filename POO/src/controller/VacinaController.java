package controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exception.VacinaDataInicioInvalidaException;
import exception.VacinaEstagioInvalidoException;
import exception.VacinaPaisInvalidoException;
import exception.VacinaSemResponsavelException;
import model.entity.Vacina;
import model.repository.VacinaRepository;

@RestController
@RequestMapping("/api/vacinas")
public class VacinaController {

	private VacinaRepository vacinaRepository;
	
	public VacinaController() {
		super();
		this.vacinaRepository = new VacinaRepository();
	}

	public Vacina inserir(Vacina novaVacina) throws VacinaSemResponsavelException, VacinaPaisInvalidoException,
			VacinaEstagioInvalidoException, VacinaDataInicioInvalidaException {
		if (novaVacina.getPesquisador() == null) {
			throw new VacinaSemResponsavelException("Informe o pesquisador da Vacina");
	
		} else if (novaVacina.getPaisOrigem() == null || novaVacina.getPaisOrigem().trim().isEmpty()) {
			throw new VacinaPaisInvalidoException("Informe o país");
		
		} else if (novaVacina.getEstagio() == 0) {
			throw new VacinaEstagioInvalidoException("Informe o estágio da pesquisa");
		
		} else if (novaVacina.getDataInicio() == null) {
			throw new VacinaDataInicioInvalidaException("Informe a data de início da pesquisa");
		}

		return this.vacinaRepository.inserir(novaVacina);
	}
	
	public boolean atualizar(Vacina vacina) {
		return this.vacinaRepository.atualizar(vacina);
	}
	
	public boolean excluir(int id) {
		return this.vacinaRepository.excluir(id);
	}
	
	public Vacina pesquisarPorId(int id) {
		return this.vacinaRepository.pesquisarPorId(id);
	}
	
	@GetMapping
	public ArrayList<Vacina> pesquisarTodas(){
		return this.vacinaRepository.pesquisarTodas();
	}
}
