/**
 * 
 */
package fibonacci;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 * series of tests which differ only in their inputs and expected results
 * @see {@link http://blogs.oracle.com/jacobc/entry/parameterized_unit_tests_with_junit}
 * @author sameer
 *
 */
@RunWith(value=Parameterized.class)
public class FibonacciParameterizedTest {
	public int input;
	public int expectedOutput;
	
	/**
	 *
     * Constructor.
     * The JUnit test runner will instantiate this class once for every
     * element in the Collection returned by the method annotated with
     *
	 * @param input
	 * @param expectedOutput
	 */
	public FibonacciParameterizedTest(int input, int expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<Object[]> generateData(){
		// In this example, the parameter generator returns a List of
	    // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
	    // generated or loaded in any way you like.
		return Arrays.asList(new Object[][]{
			{0,0},{1,1},{2,1},{3,2},{4,3},{5,5},{6,8},{7,13}
		});
	}
	
	@Test
	public void shouldDetermineNumberAtGivenPosition(){
		FibonacciNonRecursive fibonacci = new FibonacciNonRecursive();
		System.out.println("Checking for "+input);
		Assert.assertEquals(expectedOutput, fibonacci.at(input));
	}
	
	
}
