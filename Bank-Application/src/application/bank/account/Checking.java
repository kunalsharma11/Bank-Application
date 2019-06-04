package application.bank.account;

public class Checking extends Account{

	//specific functionalities of checking account
	long debitCardNumber;
	int debitCardPin;
	
	//constructor
	public Checking(String accountHolder, String SIN, double initialDeposit) {
		super(accountHolder, SIN, initialDeposit);
		accountNumber = "1"+accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber = (long)(Math.random()*Math.pow(10, 16));
		debitCardPin    = (int)(Math.random()*Math.pow(10, 4));
	}

	//specific methods of checking
	public void showInfo() {
		System.out.println("\nAccount Type: Checking\n");
		super.showInfo();
		System.out.println("Account features: "+"\n 16 digit Debit Card Number is " +debitCardNumber 
				+"\n Debit Card pin is: "+debitCardPin);
	}
	
}
