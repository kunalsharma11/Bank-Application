package application.bank.account;

public abstract class Account implements IBaseInterestRate{

	
	//common properties in savings and checking accounts
	String accountHolder;
	String SIN;
	double accountBalance;
	static int index = 30000;
	String accountNumber;
	double interestRate;
	
	//constructor
	public Account(String accountHolder, String SIN, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.SIN = SIN;
		this.accountBalance = initialDeposit;
	
		System.out.println("Name: " +accountHolder +" SIN: " +SIN+" balance: " +initialDeposit);
		
		//generate account number
		index++;
		this.accountNumber= generateAccountNumber();
		
	}
	
	private String generateAccountNumber() {
		String sinLastTwoDigits = SIN.substring(SIN.length()-2,SIN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return sinLastTwoDigits+uniqueID+randomNumber;
	}
	
	//common methods
	
}
