/**
 * 
 */
package fizzbuzz;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
/**
 * @author sameer
 *
 */
public class FizzBuzzTest {
	FizzBuzz fizzBuzz;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fizzBuzz= new FizzBuzz(15);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void identifyFizz(){
		assertThat(fizzBuzz.isFizz(1),is(false));
		assertThat(fizzBuzz.isFizz(3),is(true));
	}
	
	@Test
	public void identifyBuzz(){
		assertThat(fizzBuzz.isBuzz(1),is(false));
		assertThat(fizzBuzz.isBuzz(5),is(true));
	}
	
	@Test
	public void identifyFizzBuzz(){
		assertThat(fizzBuzz.isFizzBuzz(1),is(false));
		assertThat(fizzBuzz.isFizzBuzz(5),is(false));
		assertThat(fizzBuzz.isFizzBuzz(3),is(false));
		assertThat(fizzBuzz.isFizzBuzz(15),is(true));
	}

}
