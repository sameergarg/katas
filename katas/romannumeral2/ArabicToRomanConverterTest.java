package romannumeral2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 12/07/2012
 * Time: 09:15
 * To change this template use File | Settings | File Templates.
 */
public class ArabicToRomanConverterTest {

    private RomanConverter romanConverter;

    @Before
    public void setUp(){
        romanConverter = new RomanConverter();
    }

    @Test
    public void shouldConvert1Till3ToRoman(){
        Assert.assertEquals("I", (romanConverter.toRoman(1)));
        Assert.assertEquals("II", (romanConverter.toRoman(2)));
        Assert.assertEquals("III", (romanConverter.toRoman(3)));
    }

    @Test
    public void shouldConvert4ToRoman(){
        Assert.assertEquals("IV", (romanConverter.toRoman(4)));
    }


    @Test
    public void shouldConvert5To8Roman(){
        Assert.assertEquals("V", (romanConverter.toRoman(5)));
        Assert.assertEquals("VI", (romanConverter.toRoman(6)));
        Assert.assertEquals("VII", (romanConverter.toRoman(7)));
        Assert.assertEquals("VIII", (romanConverter.toRoman(8)));
    }

    @Test
    public void shouldConvert9Roman(){
        Assert.assertEquals("IX", (romanConverter.toRoman(9)));
    }

    @Test
    public void shouldConvert10Roman(){
        Assert.assertEquals("X", (romanConverter.toRoman(10)));
    }

    @Test
    public void shouldConvert19To21Roman(){
        Assert.assertEquals("XIX", (romanConverter.toRoman(19)));
        Assert.assertEquals("XX", (romanConverter.toRoman(20)));
        Assert.assertEquals("XXI", (romanConverter.toRoman(21)));
    }
}
