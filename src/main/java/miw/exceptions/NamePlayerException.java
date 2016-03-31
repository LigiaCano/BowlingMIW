package miw.exceptions;

public class NamePlayerException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NamePlayerException(){
		super();
	}

	public NamePlayerException(String mesage) {
		super(mesage);
	}
	
	public NamePlayerException(Throwable cause) {
		super(cause);
	}
	
	public NamePlayerException(String message,Throwable cause) {
		super(message,cause);
	}
	
	public NamePlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
