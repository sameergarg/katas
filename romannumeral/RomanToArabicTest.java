package romannumeral;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class RomanToArabicTest {

    private RomanToArabic romanToArabic = new RomanToArabic();

    @Test
    public void shouldConvertArabicFrom3To1(){

        assertThat(romanToArabic.convert("I"), is(1));
        assertThat(romanToArabic.convert("II"), is(2));
        assertThat(romanToArabic.convert("III"), is(3));

    }

    @Test
    public void shouldConvertArabicFrom4To8(){

        assertThat(romanToArabic.convert("IV"), is(4));
        assertThat(romanToArabic.convert("V"), is(5));
        assertThat(romanToArabic.convert("VI"), is(6));
        assertThat(romanToArabic.convert("VII"), is(7));
        assertThat(romanToArabic.convert("VIII"), is(8));

    }

    @Test
    public void shouldConvertArabic9(){

        assertThat(romanToArabic.convert("IX"), is(9));

    }

    @Test
    public void shouldConvertArabic(){

        assertThat(romanToArabic.convert("X"), is(10));
        assertThat(romanToArabic.convert("XX"), is(20));
        assertThat(romanToArabic.convert("XXX"), is(30));
        assertThat(romanToArabic.convert("XL"), is(40));
        assertThat(romanToArabic.convert("XLIV"), is(44));
        assertThat(romanToArabic.convert("XLV"), is(45));
        assertThat(romanToArabic.convert("L"), is(50));
        assertThat(romanToArabic.convert("XC"), is(90));
        assertThat(romanToArabic.convert("XCV"), is(95));
        assertThat(romanToArabic.convert("XCI"), is(91));
        assertThat(romanToArabic.convert("LC"), is(150));

    }


}
