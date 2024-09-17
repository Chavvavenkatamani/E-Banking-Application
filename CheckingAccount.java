package classes;

public class CheckingAccount extends BankAccount{
	private double dailyWithdrawlLimit;
	CheckingAccount(String customerName, String userId, String userPw) {
		super(customerName, userId,userPw);
		this.dailyWithdrawlLimit = 300.00;
	}
	public double getDailyWithDrawlLimit() {
		return dailyWithdrawlLimit;
	}
   public void setDailyWithdrawlLimit(double dailyWithdrawlLimit) {
	   this.dailyWithdrawlLimit = dailyWithdrawlLimit;
   }
}
