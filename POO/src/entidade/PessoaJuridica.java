package entidade;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean verificaAdimplencia() {
		double saldoTotal = 0;
		
		for (int i = 0; i < getContas().size(); i++) {
			saldoTotal += getContas().get(i).getSaldo();	
		}
		if (saldoTotal > -1000) {
			 super.setAdimplente(true);
		}
		return super.isAdimplente();
		
	}
	
	@Override
	public String getApelido() {
		return this.getNome() + " LTDA";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}