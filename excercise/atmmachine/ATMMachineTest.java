/**
 * 
 */
package atmmachine;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sameer
 *
 */
public class ATMMachineTest {
	private static final int CUSTOMER_1_BALANCE = 10000;
	private static final int CUSTOMER_1_PIN = 1234;
	private static final int CUSTOMER_1_ACCOUNT_NUMBER = 12345678;
	private Account[] accounts = {new Account(CUSTOMER_1_ACCOUNT_NUMBER,CUSTOMER_1_PIN,CUSTOMER_1_BALANCE),new Account(23456789,5678, 0)};
	private ATMMachine atm;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		atm = new ATMMachine(Arrays.asList(accounts));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void withdraw_cash_when_i_have_sufficient_funds(){
		Account account = atm.identify(CUSTOMER_1_ACCOUNT_NUMBER, CUSTOMER_1_PIN);
		assertThat(atm.withDraw(account,account.getBalance()+1),is(false));
		assertThat(atm.withDraw(account,account.getBalance()),is(true));
		assertThat(account.getBalance(), is(0));
	}
	@Test
	public void withdraw_cash_when_i_dont_have_sufficient_funds(){
		Account account = atm.identify(CUSTOMER_1_ACCOUNT_NUMBER, CUSTOMER_1_PIN);
		int originalBalance = account.getBalance();
		assertThat(atm.withDraw(account,account.getBalance()+1),is(false));
		assertThat(account.getBalance(), is(originalBalance));
	}
	
	@Test
	public void provide_option_at_start(){
        String options = atm.provideOptions();
        assertThat("Enter 1 for cash withdrawal, 2 for mini statement, 3 for cancel", is(options));
	}
	
	@Test
	public void identify_customer_by_account_number_and_4_digits_pin(){
		assertThat(atm.identify(12345,2345),nullValue());
		assertThat(atm.identify(CUSTOMER_1_ACCOUNT_NUMBER,2345),nullValue());
		assertThat(atm.identify(CUSTOMER_1_ACCOUNT_NUMBER,CUSTOMER_1_PIN),notNullValue());
	}
	
	@Test
	public void print_mini_statement_consisting_of_last_10_transactions(){
		
	}
	
	//edge cases
	

}
