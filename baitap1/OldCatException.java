package baitap.baitap1;

public class OldCatException extends Exception{
	private String message;
	
	public OldCatException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
}
