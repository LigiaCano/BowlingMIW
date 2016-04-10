package miw.exceptions;

public class InvalidNumberPlayersException extends Exception {

	private static final long serialVersionUID = 1L;
	private int numPlayers;

	public int getNumPlayers() {
		return numPlayers;
	}

	public InvalidNumberPlayersException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidNumberPlayersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidNumberPlayersException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidNumberPlayersException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidNumberPlayersException(int numPlayers) {
		super();
		this.numPlayers = numPlayers;
	}

	public InvalidNumberPlayersException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if (getNumPlayers() < 1) {
			return "Numero de jugadores menor que 1";
		} else {
			return "El numero mayor que el limite";
		}
	}

	
}
