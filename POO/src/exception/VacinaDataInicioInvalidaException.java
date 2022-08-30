package exception;

public class VacinaDataInicioInvalidaException extends Exception {

	public VacinaDataInicioInvalidaException(String message, Exception e) {
		super(message, e);
	}

	public VacinaDataInicioInvalidaException(String message) {
		super(message);
	}

}
