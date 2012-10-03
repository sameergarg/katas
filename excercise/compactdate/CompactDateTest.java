package compactdate;

import org.junit.Assert;
import org.junit.Test;

import java.awt.event.ComponentAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 21:39
 * To change this template use File | Settings | File Templates.
 */
public class CompactDateTest {

    @Test
    public void shouldReturnCorrectDateForJanuary1st() {
        CompactDate date = CompactDate.valueOf(1, 1, 2012);
        Assert.assertEquals("2012001", date.toString());
    }

    @Test
    public void shouldReturnCorrectDateForEndOfFeb() {
        Assert.assertEquals("2012059", CompactDate.valueOf(28, 2, 2012).toString());
        Assert.assertEquals("2012060", CompactDate.valueOf(29, 2, 2012).toString());
    }


    @Test
    public void shouldReturnCorrectDateForLeapYearDec31() {
        CompactDate date = CompactDate.valueOf(31, 12, 2012);
        Assert.assertEquals("2012366", date.toString());
    }

    @Test
    public void shouldReturnCorrectDateForSingleDigitYear() {
        CompactDate date = CompactDate.valueOf(1, 1, 1);
        Assert.assertEquals("0001001", date.toString());
    }

    @Test
    public void shouldConvertDateFromString20120101(){
        Assert.assertEquals("2012001",CompactDate.valueOf("2012001").toString());
    }

    @Test
    public void shouldAddDaysToStaySameMonth(){
        CompactDate compactDate =  CompactDate.valueOf(01,01,2012);
        Assert.assertEquals(CompactDate.valueOf(11,01,2012),compactDate.addDays(10));
    }


    @Test
    public void shouldAddDaysToGoToNextMonth(){
        CompactDate compactDate =  CompactDate.valueOf(01,01,2012);
        Assert.assertEquals(CompactDate.valueOf(01,02,2012),compactDate.addDays(31));
    }

    @Test
    public void shouldAddDaysToGoToNextYear(){
        CompactDate compactDate =  CompactDate.valueOf(01,01,2012);
        Assert.assertEquals(CompactDate.valueOf(01,01,2013),compactDate.addDays(366));
    }

    @Test
    public void shouldCompareDateBehind(){
        CompactDate compactDate = CompactDate.valueOf(02,01,2012);
        CompactDate compactDateToBeCompared = CompactDate.valueOf(01,01,2012);
        Assert.assertTrue(compactDate.compareTo(compactDateToBeCompared)>0);
    }
    @Test
    public void shouldCompareSame(){
        CompactDate compactDate = CompactDate.valueOf(01,01,2012);
        CompactDate compactDateToBeCompared = CompactDate.valueOf(01,01,2012);
        Assert.assertTrue(compactDate.compareTo(compactDateToBeCompared)==0);
    }

    @Test
    public void shouldCompareDateAhead(){
        CompactDate compactDate = CompactDate.valueOf(02,01,2012);
        CompactDate compactDateToBeCompared = CompactDate.valueOf(03,01,2012);
        Assert.assertTrue(compactDate.compareTo(compactDateToBeCompared)<0);
    }

    @Test
    public void shouldSubtractDaysToReachInLastYear(){
        CompactDate compactDate = CompactDate.valueOf(01,01,2012);
        Assert.assertEquals(CompactDate.valueOf(31,12,2011), compactDate.subtractDays(1));
        Assert.assertEquals(CompactDate.valueOf(01, 12, 2011), compactDate.subtractDays(31));
    }

    @Test
    public void shouldSubtractDaysToStayInLastYear(){
        Assert.assertEquals(CompactDate.valueOf(01,01,2012), CompactDate.valueOf(31,12,2012).subtractDays(365));
        Assert.assertEquals(CompactDate.valueOf(31,01,2012), CompactDate.valueOf(29,2,2012).subtractDays(29));
    }

    @Test
    public void shouldCalculateDaysUntilWhenDateInFutureButInSameYear(){
        CompactDate compactDate = CompactDate.valueOf(1,1,2012);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(2,1,2012)),1);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(1,1,2012)),0);
    }

    @Test
    public void shouldCalculateDaysUntilWhenDateInPastButInSameYear(){
        CompactDate compactDate = CompactDate.valueOf(1,3,2012);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(1,2,2012)),-29);
    }

    @Test
    public void shouldCalculateDaysUntilWhenDateInFutureButInNextYear(){
        CompactDate compactDate = CompactDate.valueOf(1,1,2012);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(1,1,2013)),366);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(1,2,2013)),397);
    }

    @Test
    public void shouldCalculateDaysUntilWhenDateInPastAndInPastYear(){
        CompactDate compactDate = CompactDate.valueOf(1,1,2012);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(1,1,2011)),-365);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(1,1,2010)),-730);
        Assert.assertEquals(compactDate.daysUntil(CompactDate.valueOf(31,12,2011)),-1);
    }

    @Test
    public void shouldDetectWhenSundayOnWeekend(){
        Assert.assertTrue(CompactDate.valueOf(01,01,2012).isWeekend());
        Assert.assertTrue(CompactDate.valueOf(8,01,2012).isWeekend());
    }

    @Test
    public void shouldDetectWhenSaturdayOnWeekend(){
        Assert.assertTrue(CompactDate.valueOf(07,01,2012).isWeekend());
        Assert.assertTrue(CompactDate.valueOf(31,12,2011).isWeekend());
    }

    @Test
    public void shouldDetermineNextShoppingDayWithinSameWeek(){
        Assert.assertEquals(CompactDate.valueOf(1,01,2012).shoppingDaysUntil(CompactDate.valueOf(01,01,2012)),0);
        Assert.assertEquals(CompactDate.valueOf(1,01,2012).shoppingDaysUntil(CompactDate.valueOf(02,01,2012)),1);
    }

    @Test
    public void shouldDetermineNextShoppingDayTillNextWeek(){
        Assert.assertEquals(CompactDate.valueOf(1,01,2012).shoppingDaysUntil(CompactDate.valueOf(9,01,2012)),7);
    }

}
