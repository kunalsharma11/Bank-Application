package application.bank.account;

import java.text.DecimalFormat;

public abstract class Account implements IBaseInterestRate{

	
	//common properties in savings and checking accounts
	protected String accountHolder;
	private String SIN;
	private double accountBalance;
	private static int index = 30000;
	protected String accountNumber;
	protected Double interestRate;
	
	

	
	protected DecimalFormat df2 = new DecimalFormat("#.##");
	//constructor
	public Account(String accountHolder, String SIN, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.SIN = SIN;
		this.accountBalance = initialDeposit;

		//generate account number
		index++;
		this.accountNumber= generateAccountNumber();
		setInterestRate();
		
	}

	
	private String generateAccountNumber() {
		String sinLastTwoDigits = SIN.substring(SIN.length()-2,SIN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return sinLastTwoDigits+uniqueID+randomNumber;
	}
	
	
	public abstract void setInterestRate();

	public void InterestMoney() {
		double interestMoney = accountBalance*(interestRate/100);
		accountBalance = accountBalance+interestMoney;
		System.out.println("Interest Money is $"+interestMoney);
		printBalance();
	}
	
	//common methods
	
	public void deposit(double amount) {
		accountBalance = accountBalance + amount;
		System.out.println("Depositing $" +amount+ " in your account");
		printBalance();
	}
	
	public void withdraw(double amount) {
		accountBalance = accountBalance - amount;
		System.out.println("Withdrawing $" +amount+ " in your account");
		printBalance();
	}
	public void transfer(String toWhichAccount, double amount) {
		accountBalance = accountBalance - amount;
		System.out.println("Transfered $" +amount+ " to " +toWhichAccount);
		printBalance();
	}
	
	public void transfer(Object toWhichAccount, double amount) {
		accountBalance = accountBalance - amount;
		System.out.println("Transfered $" +amount+ " to " +toWhichAccount.toString());
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your current account balance is "+accountBalance);
	}
	
	public void showInfo() {
		System.out.println("Account Holder's Name: " +accountHolder+
				"\nAccount Number: "+accountNumber+ "\nAccount Balance: "
				+accountBalance+"\nInterest Rate: " +interestRate +"%"
				);
	}
}
