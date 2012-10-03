package primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
 */
//TODO
public class PrimeNumberGenerator {

    public Integer[] generatePrimes(int till) {
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for(int i=2;i<=till;i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }

        return primeNumbers.toArray(new Integer[0]);

    }

    protected boolean isPrime(int numberToCheck){

        if(divisibleBy2(numberToCheck)){
            return false;
        }
        /**
         * loop optimisation
         * 1. starting from 3 and doing i+=2 will count off all even
         * 2. i*i to count off numbers more than the square root of the number
         */
        for(int i=3;i*i<=numberToCheck;i+=2){
            if(numberToCheck%i==0){
                return false;
            }
        }

        return true;
    }

    private boolean divisibleBy2(int numberToCheck) {
        return (numberToCheck>2) && (numberToCheck%2==0);
    }
}
