package exception;

public class VacinaSemResponsavelException extends Exception {

	public VacinaSemResponsavelException(String causa, Exception e) {
		super(causa, e);
		
	}
	
	public VacinaSemResponsavelException(String causa) {
		super(causa);
		
	}

	
}
