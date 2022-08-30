package exception;

public class VacinaPaisInvalidoException extends Exception {

	public VacinaPaisInvalidoException(String message, Exception e) {
		super(message, e);
	}

	public VacinaPaisInvalidoException(String message) {
		super(message);
	}
	
	
	
}
