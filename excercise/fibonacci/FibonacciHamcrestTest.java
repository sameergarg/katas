/**
 * 
 */
package fibonacci;

import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sameer
 *
 */
@RunWith(value=Parameterized.class)
public class FibonacciHamcrestTest {
	
	private int input;
	
	private int expectedOutput;
	
	
	/**
	 * @param input
	 * @param expectedOutput
	 */
	public FibonacciHamcrestTest(int input, int expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	@Parameters
	public static Collection<Object[]> generateDate(){
		return Arrays.asList(new Object[][]{{0,0},{1,1},{2,1},{3,2}});
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link FibonacciRecursive#at(int)}.
	 */
	@Test
	public void testAt() {
		FibonacciRecursive fibonacci = new FibonacciRecursive();
		MatcherAssert.assertThat(fibonacci.at(input), is(expectedOutput));
	}

}
