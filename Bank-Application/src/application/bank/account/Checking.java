package application.bank.account;

public class Checking extends Account{

	//specific functionalities of checking account
	
	
	//constructor
	public Checking(String accountHolder) {
		super(accountHolder);
		System.out.println("" +accountHolder +"'s :New Checking account");
	}
	
	//specific methods of checking
	
}
