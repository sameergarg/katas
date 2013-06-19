package fibonacci;

/**
 * a program to generate the Fibonacci Series
 * 
 * @author sameer
 * 
 */
public class FibonacciRecursive {

	public int at(int i) {
		switch (i) {
		case 0:
			return 0;
		case 1:
			return 1;
		default:
            return at(i-1)+at(i-2);
		}
		
	}

}
