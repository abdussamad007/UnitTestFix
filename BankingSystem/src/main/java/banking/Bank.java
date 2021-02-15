package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
		accounts = new LinkedHashMap();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
		
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
	//	Account  newAccount = new CommercialAccount(company, company.get, pin, startingDeposit);
        return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		
		ConsumerAccount acount = new ConsumerAccount(person, pin, startingDeposit);
		
        return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if(account != null && account.validatePin(pin))
			return true;
		else
			return false;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if(account != null)
			return account.getBalance();
		else
			return 0.0d;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
	  
		Account account = accounts.get(accountNumber);
		
		if(account != null) {
			double currentBalance = account.getBalance();
			account.creditAccount(currentBalance + amount);
		}
		
		
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if(account != null && account.debitAccount(amount))
			return true;
		else
			return false;
	}
}
