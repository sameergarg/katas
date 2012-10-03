package stringmatcher.palindrome;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:42
 * To change this template use File | Settings | File Templates.
 */
public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    public void verifyPalindrome(){
        assertThat(palindrome.isPalindrome("hah"), is(true));
        assertThat(palindrome.isPalindrome(""), is(true));
        assertThat(palindrome.isPalindrome("    "), is(true));
        assertThat(palindrome.isPalindrome("hh"), is(true));
        assertThat(palindrome.isPalindrome("h"), is(true));
        assertThat(palindrome.isPalindrome("roottoor"), is(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldVerifyNull(){
       palindrome.isPalindrome(null);
    }
}
