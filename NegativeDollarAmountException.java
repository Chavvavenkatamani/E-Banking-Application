package classes;

public class NegativeDollarAmountException  extends Exception {
	
	String message;

	public NegativeDollarAmountException(String message) {
		super(message);
	}


}
