package application.bank.account;

public class Savings extends Account{

	//specific functionalities of savings account
	int savingsBoxID;
	int savingsBoxKey;
	
		//constructor
		public Savings(String accountHolder, String SIN, double initialDeposit) {
			super(accountHolder, SIN, initialDeposit);
			accountNumber = "2"+accountNumber;
			System.out.println("acc no. "+accountNumber);
			System.out.println("" +accountHolder +"'s :New Savings account");
			System.out.println("\n");
			
		}
		
		//specific methods of savings account
	
}
