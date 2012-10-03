package romannumeral2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 12/07/2012
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 */
public class RomanToArabicConverterTest {

    RomanConverter romanConverter;

    @Before
    public void setUp(){
        romanConverter = new RomanConverter();
    }

    @Test
    public void shouldConvertRomanToArabic1to3(){
        compareArabicConversion(1,"I");
        compareArabicConversion(2,"II");
        compareArabicConversion(3,"III");
    }

    @Test
    public void shouldConvertRomanToArabic4(){
        compareArabicConversion(4,"IV");
    }

    @Test
    public void shouldConvertRomanToArabic5(){
        compareArabicConversion(5,"V");
    }


    @Test
    public void shouldConvertRomanToArabic6To8(){
        compareArabicConversion(6,"VI");
        compareArabicConversion(7,"VII");
        compareArabicConversion(8,"VIII");
    }

    private void compareArabicConversion(int expectedArabic, String suppliedRoman) {
        Assert.assertEquals(expectedArabic, romanConverter.toArabic(suppliedRoman));
    }

}
