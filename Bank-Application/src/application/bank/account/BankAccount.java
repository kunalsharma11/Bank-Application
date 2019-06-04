package application.bank.account;

public class BankAccount {

	public static void main(String[] args) {
		
		Checking checkingAcc = new Checking("Kunal","987654321",2000);
		
		Savings savingAcc = new Savings("kunal","987654321", 4500);
		//read a CSV file 
		checkingAcc.showInfo();
		savingAcc.showInfo();
		
	}
	
}
