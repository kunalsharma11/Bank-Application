package application.bank.account;

public interface IBaseInterestRate {

	// method gives base interest rate
	default double getBaseInterestRate() {
		return 1.5;
	}

}
