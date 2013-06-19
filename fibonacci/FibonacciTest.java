package fibonacci;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 07/12/2011
 * Time: 21:52
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciTest {
    FibonacciRecursive fibonacci;

    @Before
    public void setUp() throws Exception {
        fibonacci = new FibonacciRecursive();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldGenerateNumberAtPosition0(){
        int next = fibonacci.at(0);
        Assert.assertEquals(0,next);
    }
    
    @Test
    public void shouldGenerateNumberAtPosition1(){
        int next = fibonacci.at(1);
        Assert.assertEquals(1,next);
    }
    
    @Test
    public void shouldGenerateNumberAtPosition2(){
        int next = fibonacci.at(2);
        Assert.assertEquals(1,next);
    }
    
    @Test
    public void shouldGenerateNumberAtPosition3(){
    	int next = fibonacci.at(3);
    	Assert.assertEquals(2,next);
    }
}
