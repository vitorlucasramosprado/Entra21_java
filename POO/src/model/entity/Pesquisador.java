package model.entity;

import java.util.Date;

public class Pesquisador {

	private int id;
	private String nome;
	private String cpf;
	private int matricula;
	private Date dataNascimento;
	
	public Pesquisador() {
		super();
	}

	public Pesquisador(int id, String nome, String cpf, int matricula, Date dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
	}
	public Pesquisador(String nome, String cpf, int matricula, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "\n\nPesquisador \nId: " + id + "\nNome: " + nome + "\nCpf: " + cpf + "\nMatricula: " + matricula
				+ "\nData Nascimento: " + dataNascimento + " ";
	}
}
