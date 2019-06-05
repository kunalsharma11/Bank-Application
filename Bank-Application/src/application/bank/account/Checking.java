package application.bank.account;

import java.text.DecimalFormat;

public class Checking extends Account{

	//specific functionalities of checking account
	private long debitCardNumber;
	private int debitCardPin;
	private static String accountType = "Checking Account";
	
	//constructor
	public Checking(String accountHolder, String SIN, double initialDeposit) {
		super(accountHolder, SIN, initialDeposit);
		accountNumber = "1"+accountNumber;
		setDebitCard();
	}
	
	public void setInterestRate() {
		interestRate = Double.parseDouble(df2.format(getBaseInterestRate()*.15));
	
	} 
	
	private void setDebitCard() {
		debitCardNumber = (long)(Math.random()*Math.pow(10, 16));
		debitCardPin    = (int)(Math.random()*Math.pow(10, 4));
	}

	//specific methods of checking
	public void showInfo() {
		System.out.println("Account Type: Checking\n");
		super.showInfo();
		System.out.println("Account features: "+"\n 16 digit Debit Card Number is " +debitCardNumber 
				+"\n Debit Card pin is: "+debitCardPin);
	}
	public String toString() {
		return accountHolder+"'s "+accountType;
	}
	
	
	
}
