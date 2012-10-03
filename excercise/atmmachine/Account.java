/**
 * 
 */
package atmmachine;

/**
 * @author sameer
 *
 */
public class Account {

	private int accountNumber;
	private int pin;
	private int balance;
	

	public Account(int accountNumber,int pin, int balance) {
		this.accountNumber=accountNumber;
		this.pin =pin;
		this.balance=balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getPin() {
		return pin;
	}

	public int getBalance() {
		return balance;
	}
	
	public int withdraw(int amount){
		if(balance<amount){
			throw new IllegalArgumentException("Not sufficient balance");
		}
		this.balance=this.balance-amount;
		return balance;
	}
	
	

}
