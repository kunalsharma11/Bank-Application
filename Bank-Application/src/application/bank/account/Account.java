package application.bank.account;

public abstract class Account implements IBaseInterestRate{

	//common properties in savings and checking accounts
	
	
	//constructor
	public Account(String accountHolder) {
		System.out.println("Inside " +accountHolder +"'s Account");
	}
	
	
	
	//common methods
	
}
