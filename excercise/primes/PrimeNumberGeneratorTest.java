package primes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 03/07/2012
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class PrimeNumberGeneratorTest {

    PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setUp() throws Exception {
        primeNumberGenerator = new PrimeNumberGenerator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void verifyZeroIsNotPrime(){
        Integer[] primes = primeNumberGenerator.generatePrimes(0);
        assertThat(primes, notNullValue());
        assertThat(primes.length, is(0));
    }

    @Test
    public void verifyOneIsNotPrime(){
        Integer[] primes = primeNumberGenerator.generatePrimes(1);
        assertThat(primes, notNullValue());
        assertThat(primes.length, is(0));
    }

    @Test
    public void verify2IsPrime(){
        Integer[] primes = primeNumberGenerator.generatePrimes(2);
        assertThat(primes, notNullValue());
        assertThat(primes.length, is(1));
        assertThat(primes, is(new Integer[]{2}));
    }

    @Test
    public void verify3IsPrime(){
        Integer[] primes = primeNumberGenerator.generatePrimes(3);
        assertThat(primes, notNullValue());
        assertThat(primes.length, is(2));
        assertThat(primes, is(new Integer[]{2,3}));
    }

    @Test
    public void verifyPrimeNumbers(){
        assertThat(primeNumberGenerator.isPrime(2), is(true));
        assertThat(primeNumberGenerator.isPrime(3), is(true));
        assertThat(primeNumberGenerator.isPrime(4), is(false));
        assertThat(primeNumberGenerator.isPrime(5), is(true));
        assertThat(primeNumberGenerator.isPrime(7), is(true));
        assertThat(primeNumberGenerator.isPrime(9), is(false));
        assertThat(primeNumberGenerator.isPrime(21), is(false));
        assertThat(primeNumberGenerator.isPrime(25), is(false));
        assertThat(primeNumberGenerator.isPrime(97), is(true));
    }



}
