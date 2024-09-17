package classes;

public class BankAccount {
	private String CustomerName;
	private int accountNumber = noOfAccounts;
	private String userId;
	private  String userPw;
	private double accountBalance;
	private static int noOfAccounts = 0;
	BankAccount(String customerName, String userId, String userPw) {
		this.CustomerName = customerName;
		this.accountNumber = ++noOfAccounts;
		this.userId = userId;
		this.userPw = userPw;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
		
		
	}
	public static double getNoOfAccounts() {
		return noOfAccounts;
	}
	public static void decrAccounts() {
		noOfAccounts-=1;
	}
	
 
}
