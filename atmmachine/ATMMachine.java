/**
 * 
 */
package atmmachine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @see {http://math-cs.gordon.edu/courses/cs211/ATMExample/},
 * {http://en.wikipedia.org/wiki/Automated_teller_machine},
 * {http://answers.yahoo.com/question/index?qid=20081114095438AALJGu5}
 * <p>
 * Stories
 * <ul>
 * <li>Authenticate user using PIN</li>
 * <li>Select option from</li>
 * <li>Quit</li>
 * <li>Check balance</li>
 * <li>Withdraw cash</li>
 * <li>Print Statements</li>
 * <li>Change PIN</li>
 * </ul>
 * @author sameer
 *
 */
public class ATMMachine {

	private List<Account> accounts;
	
	/**
	 * @param accounts
	 */
	public ATMMachine(List<Account> accounts) {
		super();
		this.accounts = accounts;
	}

	public String provideOptions() {
		return "Enter 1 for cash withdrawal, 2 for mini statement, 3 for cancel\n";
	}

	public Account identify(int accountNumber, int pin) {
		Account identifiedAccount = null;
		for(Account account:accounts){
			if(account.getAccountNumber()==accountNumber && account.getPin()==pin){
				identifiedAccount=account;
				break;
			}
		}
		return identifiedAccount;
	}

	public boolean withDraw(Account account, int amount) {
		boolean moneyWithdrawn = false;
		if(account.getBalance()>=amount){
			account.withdraw(amount);
			moneyWithdrawn=true;
			System.out.println("Please collect your cash. Your new balance is "+account.getBalance()+"\n");
		}else{
			System.out.println("Not sufficient balance\n");
		}
		return moneyWithdrawn;
	}
	
	public static void main(String[] args){
		Account[] accounts = {new Account(12345678, 1234,10000),new Account(23456789,5678, 0)};
		ATMMachine atm = new ATMMachine(Arrays.asList(accounts));
		System.out.println("Please enter 8 digits account number and 3 digits pin separated by space.\n");
		Scanner scanner = new Scanner(System.in);
		int accountNumber = scanner.nextInt();
		
		int pin = scanner.nextInt();
		Account account = atm.identify(accountNumber,pin);
		if(account==null){
			System.out.println("Invalid account number or pin. Please try again.\n");
			return;
		}
		System.out.println(atm.provideOptions());
		int option = scanner.nextInt();
		switch(option){
			case 1:
			    System.out.println("Please enter the amount you wish to withdraw.\n");
			    int amount = scanner.nextInt();
			    atm.withDraw(account, amount);
			case 2:
				
			case 3:	
			    System.out.println("Goodbye.");
				return;	
			default:
				
		}
	}
}
