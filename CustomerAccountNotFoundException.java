package classes;

public class CustomerAccountNotFoundException extends Exception {
String message;
	
	public CustomerAccountNotFoundException(String message){
		super(message);
	}


}
