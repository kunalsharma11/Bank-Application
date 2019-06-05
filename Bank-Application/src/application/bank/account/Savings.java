package application.bank.account;

public class Savings extends Account {

	// specific functionalities of savings account
	private static String accountType = "Savings Account"; 
	private int savingsBoxID;
	private int savingsBoxKey;

	// constructor
	public Savings(String accountHolder, String SIN, double initialDeposit) {
		super(accountHolder, SIN, initialDeposit);
		accountNumber = "2" + accountNumber;
		setSavingsBox();

	}
	

	public void setInterestRate() {
		interestRate = getBaseInterestRate()-.25;
	}
	
	private void setSavingsBox() {
		savingsBoxID = (int)(Math.random()*Math.pow(10, 3));
		savingsBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	// specific methods of savings account
	public void showInfo() {
		System.out.println("\nAccount Type: Savings\n");
		super.showInfo();
		System.out.println("Account features: "+"\n Savings Box ID is " +savingsBoxID 
				+"\n Savings Box key is: "+savingsBoxKey);
		
	}
	public String toString() {
		return accountHolder+"'s "+accountType;
	}

}
