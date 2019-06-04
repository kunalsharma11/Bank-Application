package application.bank.account;

public class Checking extends Account{

	//specific functionalities of checking account
	int debitCardNumber;
	int debitCardPin;
	
	//constructor
	public Checking(String accountHolder, String SIN, double initialDeposit) {
		super(accountHolder, SIN, initialDeposit);
		System.out.println("" +accountHolder +"'s :New Checking account");
		System.out.println("\n");

	}
	
	//specific methods of checking
	
}
