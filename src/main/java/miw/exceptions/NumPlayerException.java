package miw.exceptions;

public class NumPlayerException extends Exception {

	private static final long serialVersionUID = 1L;

	private int numPlayers;

	public NumPlayerException(String message) {
		super(message);
	}

	public NumPlayerException(int numPlayers) {
		super();
		this.numPlayers = numPlayers;
	}

	public NumPlayerException(Throwable cause) {
		super(cause);
	}

	public NumPlayerException(String message, Throwable cause) {
		super(message, cause);
	}

	public String toString() {
		if (numPlayers < 1) {
			return "Numero de jugadores menor que 1";
		} else {
			return "El numero mayor que el limite";
		}
	}

	public NumPlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
