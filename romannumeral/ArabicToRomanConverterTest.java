package romannumeral;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ArabicToRomanConverterTest {

    private ArabicToRomanConverter arabicToRomanConversion = new ArabicToRomanConverter();

    @org.junit.Test
    public void shouldPrintFrom1To3(){
        assertThat(arabicToRomanConversion.fromArabic(1), is("I"));
        assertThat(arabicToRomanConversion.fromArabic(2), is("II"));
        assertThat(arabicToRomanConversion.fromArabic(3), is("III"));


    }

    @org.junit.Test
    public void shouldPrint4(){
        assertThat(arabicToRomanConversion.fromArabic(4), is("IV"));
    }

    @org.junit.Test
    public void shouldPrint5To8(){
        assertThat(arabicToRomanConversion.fromArabic(5), is("V"));
        assertThat(arabicToRomanConversion.fromArabic(6), is("VI"));
        assertThat(arabicToRomanConversion.fromArabic(7), is("VII"));
        assertThat(arabicToRomanConversion.fromArabic(8), is("VIII"));
    }

    @org.junit.Test
    public void shouldPrint9(){
        assertThat(arabicToRomanConversion.fromArabic(9), is("IX"));

    }


    @org.junit.Test
    public void shouldPrint10To20(){
        assertThat(arabicToRomanConversion.fromArabic(10), is("X"));
        assertThat(arabicToRomanConversion.fromArabic(11), is("XI"));
        assertThat(arabicToRomanConversion.fromArabic(12), is("XII"));
        assertThat(arabicToRomanConversion.fromArabic(13), is("XIII"));
        assertThat(arabicToRomanConversion.fromArabic(14), is("XIV"));
        assertThat(arabicToRomanConversion.fromArabic(15), is("XV"));
        assertThat(arabicToRomanConversion.fromArabic(16), is("XVI"));
        assertThat(arabicToRomanConversion.fromArabic(17), is("XVII"));
        assertThat(arabicToRomanConversion.fromArabic(18), is("XVIII"));
        assertThat(arabicToRomanConversion.fromArabic(19), is("XIX"));
        assertThat(arabicToRomanConversion.fromArabic(20), is("XX"));

    }

    @org.junit.Test
    public void shouldPrint40To50(){
        assertThat(arabicToRomanConversion.fromArabic(40), is("XL"));
        assertThat(arabicToRomanConversion.fromArabic(41), is("XLI"));
        assertThat(arabicToRomanConversion.fromArabic(42), is("XLII"));
        assertThat(arabicToRomanConversion.fromArabic(43), is("XLIII"));
        assertThat(arabicToRomanConversion.fromArabic(44), is("XLIV"));
        assertThat(arabicToRomanConversion.fromArabic(45), is("XLV"));
        assertThat(arabicToRomanConversion.fromArabic(46), is("XLVI"));
        assertThat(arabicToRomanConversion.fromArabic(47), is("XLVII"));
        assertThat(arabicToRomanConversion.fromArabic(48), is("XLVIII"));
        assertThat(arabicToRomanConversion.fromArabic(49), is("XLIX"));
        assertThat(arabicToRomanConversion.fromArabic(50), is("L"));
    }


    @org.junit.Test
    public void shouldPrint51To60(){
        assertThat(arabicToRomanConversion.fromArabic(51), is("LI"));
        assertThat(arabicToRomanConversion.fromArabic(52), is("LII"));
        assertThat(arabicToRomanConversion.fromArabic(53), is("LIII"));
        assertThat(arabicToRomanConversion.fromArabic(54), is("LIV"));
        assertThat(arabicToRomanConversion.fromArabic(55), is("LV"));
        assertThat(arabicToRomanConversion.fromArabic(56), is("LVI"));
        assertThat(arabicToRomanConversion.fromArabic(57), is("LVII"));
        assertThat(arabicToRomanConversion.fromArabic(58), is("LVIII"));
        assertThat(arabicToRomanConversion.fromArabic(59), is("LIX"));
        assertThat(arabicToRomanConversion.fromArabic(60), is("LX"));
    }

    @org.junit.Test
    public void shouldPrintTwoDigitsNumberLessThan90(){
        assertThat(arabicToRomanConversion.fromArabic(90), is("XC"));
    }


    @org.junit.Test
    public void shouldPrintTwoDigitsNumberLessThan100(){
        assertThat(arabicToRomanConversion.fromArabic(100), is("C"));
    }

}
