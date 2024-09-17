package classes;

public class InvalidPasswordFormatException  extends Throwable {

	String message;

	public InvalidPasswordFormatException(String message) {
		super(message);
	}

}
