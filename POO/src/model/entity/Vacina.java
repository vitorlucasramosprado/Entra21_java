package model.entity;

import java.util.Date;

public class Vacina {

	private int id;
	private String paisOrigem;
	private int estagio;
	private Date dataInicio;
	private Pesquisador pesquisador;
	
	public Vacina() {
		super();
	}
	
	public Vacina(String paisOrigem, int estagio, Date dataInicio, Pesquisador pesquisador) {
		super();
		this.paisOrigem = paisOrigem;
		this.estagio = estagio;
		this.dataInicio = dataInicio;
		this.pesquisador = pesquisador;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	public int getEstagio() {
		return estagio;
	}
	public void setEstagio(int estagio) {
		this.estagio = estagio;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}

	@Override
	public String toString() {
		return "\n\nVacina id: " + id + "\nPaisOrigem: " + paisOrigem + "\nEstagio: " + estagio + "\nDataInicio: " + dataInicio
				+ "\nNomePesquisador: " + pesquisador.getNome() + " ";
	}
	
}
