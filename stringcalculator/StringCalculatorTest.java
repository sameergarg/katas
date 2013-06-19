package stringcalculator;

import org.hamcrest.Matchers;
import org.junit.Test;

import javax.swing.*;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static stringcalculator.StringCalculator.sum;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 28/12/2012
 * Time: 14:02
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {

    @Test
    public void shouldReturn0ForEmptyString(){
        assertThat(sum(""), is(0));
    }

    @Test
    public void shouldReturnNumberAsItIsWhenThereIsSingleElementInString() throws Exception {
        assertThat(sum("1"), is(1));
    }

    @Test
    public void shouldAddTwoNumbersSeparatedByComma() throws Exception {
        assertThat(sum("1,2"), is(3));

    }

    @Test
    public void shouldAddTwoNumbersSeparatedByNewLineAndComma() throws Exception {
        assertThat(sum("1,2\n4"), is(7));
    }

    /**
     * to change a delimiter, the beginning of the string will contain a separate line that looks like this:
     * “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     * @throws Exception
     */
    @Test
    public void shouldSupportDifferentDelimiterIfSpecifiedAtBeginning() throws Exception {
        assertThat(sum("//[;]\\n1;2"), is(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfAnyOfTheNumberIsNegative() throws Exception {
        sum("1,-2\n4");
    }

    @Test
    public void shouldPrintAllNegativeNumbersInExceptionMessage() throws Exception {
        try {
            sum("-1,-2\n4");
        } catch (IllegalArgumentException e) {
              assertThat(e.getMessage(), allOf(containsString("-1"), containsString("-2")));

        }
    }

    @Test
    public void numbers_bigger_than_1000_should_be_ignored() throws Exception {
        assertThat(sum("//;\\n1;1001"), is(1));

    }

    @Test
    public void allowDelimitersOfAnyLength() throws Exception {
        assertThat(sum("//[***]\\n1***2***3"), is(6));

    }

    //like this:  “//[delim1][delim2]\n”
    @Test
    public void shouldAllowMultipleDelimiters() throws Exception {
        assertThat(sum("//[*][%]\\n1*2%3"), is(6));

    }
}
