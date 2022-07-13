package entidade;

import java.util.ArrayList;

public abstract class Pessoa {

	private String nome;
	private boolean adimplente;
	private ArrayList<Conta> contas;
	
	public Pessoa() {
		super();
		this.adimplente = true;
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.adimplente = true;
	}
	

	public abstract boolean verificaAdimplencia();
	
	
	public abstract String getApelido();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

	public boolean isAdimplente() {
		return adimplente;
	}

	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}

}