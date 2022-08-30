package exception;

public class PesquisadorMatriculaInvalidaException extends Exception {

	public PesquisadorMatriculaInvalidaException(String message, Exception e) {
		super(message, e);
	}
	
	public PesquisadorMatriculaInvalidaException(String message) {
		super(message);
	}
}
