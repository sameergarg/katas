package fizzbuzz;

import java.text.NumberFormat;

public class FizzBuzz {

	private int maxCount;

	public FizzBuzz(int maxCount) {
		this.maxCount = maxCount;
	}

	public boolean isFizz(int i) {
		return (i%3)==0;
	}

	public Boolean isBuzz(int i) {
		return i%5==0;
	}

	public Boolean isFizzBuzz(int i) {
		return i%15==0;
	}


}
