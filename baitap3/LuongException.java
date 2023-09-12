package baitap.baitap3;

public class LuongException extends Exception{
	public String message;

	public LuongException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	
}
