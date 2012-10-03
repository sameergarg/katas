package romannumeral;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 12:23
 * To change this template use File | Settings | File Templates.
 */
public class RomanToArabicConverterTest {

    private RomanToArabicConverter romanToArabicConverter = new RomanToArabicConverter();

    @Test
    public void shouldConvertArabicFrom3To1(){

        assertThat(romanToArabicConverter.convertToRoman("I"), is(1));
        assertThat(romanToArabicConverter.convertToRoman("II"), is(2));
        assertThat(romanToArabicConverter.convertToRoman("III"), is(3));

    }

    @Test
    public void shouldConvertArabicFrom4To8(){

        assertThat(romanToArabicConverter.convertToRoman("IV"), is(4));
        assertThat(romanToArabicConverter.convertToRoman("V"), is(5));
        assertThat(romanToArabicConverter.convertToRoman("VI"), is(6));
        assertThat(romanToArabicConverter.convertToRoman("VII"), is(7));
        assertThat(romanToArabicConverter.convertToRoman("VIII"), is(8));

    }

    @Test
    public void shouldConvertArabic9(){

        assertThat(romanToArabicConverter.convertToRoman("IX"), is(9));

    }

    @Test
    public void shouldConvertArabic(){

        assertThat(romanToArabicConverter.convertToRoman("X"), is(10));
        assertThat(romanToArabicConverter.convertToRoman("XX"), is(20));
        assertThat(romanToArabicConverter.convertToRoman("XXX"), is(30));
        assertThat(romanToArabicConverter.convertToRoman("XL"), is(40));
        assertThat(romanToArabicConverter.convertToRoman("XLIV"), is(44));
        assertThat(romanToArabicConverter.convertToRoman("XLV"), is(45));
        assertThat(romanToArabicConverter.convertToRoman("L"), is(50));
        assertThat(romanToArabicConverter.convertToRoman("XC"), is(90));
        assertThat(romanToArabicConverter.convertToRoman("XCV"), is(95));
        assertThat(romanToArabicConverter.convertToRoman("XCI"), is(91));
        assertThat(romanToArabicConverter.convertToRoman("LC"), is(150));

    }


}
