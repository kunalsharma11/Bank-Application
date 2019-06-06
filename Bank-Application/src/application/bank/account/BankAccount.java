package application.bank.account;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class BankAccount {

	public static void main(String[] args) {
	
		String file = "C:\\Users\\kunal\\git\\Bank-Application\\Bank-Application\\src\\resources\\CustomerData";

		List<Account> accounts = new LinkedList<Account>();

		// read bank details from a file
		List<String[]> AccountHoldersInfo = DataReader.readFile(file);
		for (String[] customers : AccountHoldersInfo) {
			String name = customers[0];
			String SIN = customers[1];
			String accountType = customers[2];
			double initialDeposit = Double.parseDouble(customers[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, SIN, initialDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, SIN, initialDeposit));
			} else {
				System.out.println("Error in file reading");
			}

		}
		for (Account acc : accounts) {
			acc.showInfo();
			System.out.println("\n");
			
		}
	}

}
