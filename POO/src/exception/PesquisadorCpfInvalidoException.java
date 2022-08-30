package exception;

public class PesquisadorCpfInvalidoException extends Exception {
	
	public  PesquisadorCpfInvalidoException(String message, Exception e) {
		super(message, e);
	}
	
	public PesquisadorCpfInvalidoException(String message) {
		super(message);
	}
}
