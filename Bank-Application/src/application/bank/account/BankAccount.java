package application.bank.account;

public class BankAccount {

	public static void main(String[] args) {
		
		Checking checkingAcc = new Checking("Kunal","987654321",2000);
		
		Savings savingAcc = new Savings("Rahul","987654321", 4500);
		//read a CSV file 
		checkingAcc.showInfo();
		savingAcc.showInfo();
		
		
//		checkingAcc.deposit(200);
//		savingAcc.withdraw(1440);
//		checkingAcc.transfer(savingAcc, 200);
	}
	
}
