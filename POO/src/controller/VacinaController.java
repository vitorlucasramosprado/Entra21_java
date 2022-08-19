package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Banco;
import model.entity.Vacina;
import model.repository.VacinaRepository;

public class VacinaController {

	private VacinaRepository vacinaRepository;
	
	public VacinaController() {
		super();
		this.vacinaRepository = new VacinaRepository();
	}

	public Vacina inserir(Vacina novaVacina) {
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
	
	public ArrayList<Vacina> pesquisarTodas(){
		return this.vacinaRepository.pesquisarTodas();
	}
}
