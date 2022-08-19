package model.entity;

import java.util.Date;

public class Vacina {

	private int id;
	private String paisOrigem;
	private int estagio;
	private Date dataInicio;
	private String NomePesquisador;
	
	public Vacina() {
		super();
	}
	
	public Vacina(String paisOrigem, int estagio, Date dataInicio, String nomePesquisador) {
		super();
		this.paisOrigem = paisOrigem;
		this.estagio = estagio;
		this.dataInicio = dataInicio;
		NomePesquisador = nomePesquisador;
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
	
	public String getNomePesquisador() {
		return NomePesquisador;
	}
	public void setNomePesquisador(String nomePesquisador) {
		NomePesquisador = nomePesquisador;
	}

	@Override
	public String toString() {
		return "\n\nVacina id: " + id + "\nPaisOrigem: " + paisOrigem + "\nEstagio: " + estagio + "\nDataInicio: " + dataInicio
				+ "\nNomePesquisador: " + NomePesquisador + " ";
	}
	
}
