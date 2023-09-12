package baitap.baitap2;

public class TienException extends Exception{
	private String message;

	public TienException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
}
