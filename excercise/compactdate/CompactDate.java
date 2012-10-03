package compactdate;

import sun.nio.cs.ext.MacThai;

/**
 * A compact date is a representation of a date in the form "yyyyddd" - the year (four digits) followed by the number of the day within
 * the year.  This class stores a compact date and allows manipulation of that date.
 * <p>
 * CompactDate objects are immutable.
 */
public final class CompactDate implements Comparable<CompactDate> {

    public static final int DAYS_IN_NON_LEAP_YEAR = 365;

    private static final CompactDate sunday = CompactDate.valueOf(1,1,2012);

    private enum months {JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),OCT(31),NOV(30),DEC(31);
        private int days;

        months(int days) {
            this.days=days;
        }
    }

    private int daysInYear;

    private int year;

    private CompactDate(int day, int month, int year) {
        this.year = year;
        this.daysInYear=day;

        for(int i=0;i<month-1;i++){
            daysInYear+=months.values()[i].days;
        }

        if(afterFeb(month) && isLeapYear(year)){
            daysInYear++;
        }

    }

    private CompactDate(int year, int daysInYear) {
        this.year = year;
        this.daysInYear=daysInYear;

    }

    private boolean afterFeb(int month) {
        return month>2;
    }

    private boolean isLeapYear(int year) {
        return (year%400==0) || (year%4==0  && year%100!=0);
    }

    public static CompactDate valueOf(int day, int month, int year) {
        return new CompactDate(day,month,year);
    }

    public static CompactDate valueOf(String compactDate) {
        int year = Integer.parseInt(compactDate.substring(0,4));
        int day = Integer.parseInt(compactDate.substring(4,7));
        return new CompactDate(year,day);
    }

    @Override
    public String toString() {
        return String.format("%04d",this.year)+""+String.format("%03d",this.daysInYear);
    }

    public CompactDate addDays(int days) {
        int totalDays=this.daysInYear+days;
        int daysThisYear = daysInYear(this.year);

        int years=this.year;
        if(totalDays>daysThisYear){
            years = this.year+1;
            totalDays = days-daysThisYear+1;
        }else{
            years = this.year;
        }
        return new CompactDate(years, totalDays);
    }

    private int daysInYear(int year) {
        int daysThisYear = DAYS_IN_NON_LEAP_YEAR;
        if(isLeapYear(year)){
            daysThisYear++;
        }
        return daysThisYear;
    }

    public CompactDate subtractDays(int days) {
        int totalDays=this.daysInYear-days;

        int years=this.year;
        if(totalDays<=0){
            int daysLastYear = daysInYear(this.year-1);
            years = this.year-1;
            totalDays = daysLastYear+totalDays;

        }else{
            years = this.year;
        }
        return new CompactDate(years, totalDays);
    }

    public int compareTo(CompactDate other) {
        return Integer.parseInt(this.toString())-Integer.parseInt(other.toString());
    }

    public int daysUntil(CompactDate date) {
        int yearDays=0;
        if(this.getYear()<date.getYear()){
            for(int year=this.getYear();year<date.getYear();year++){
                yearDays+=daysInYear(year);
            }
        }else if(this.getYear()>date.getYear()){
            for(int year=this.getYear();year>date.getYear();year--){
                yearDays+=daysInYear(year-1);
            }
            yearDays=-1*yearDays;
        }
        return date.getDaysInYear()-this.getDaysInYear()+yearDays;
    }

    public boolean isWeekend() {
        return isSunday()||isSaturday();
    }

    private boolean isSunday() {
        return daysTillSunday() ==0;
    }

    private int daysTillSunday() {
        return (this.daysUntil(sunday)%7+7)%7;
    }

    private boolean isSaturday() {
        return daysTillSunday() ==1;
    }

    public int shoppingDaysUntil(CompactDate date) {
        //days apart from sunday
        int shoppingDays=0;
        int daysBetween = this.daysUntil(date);
        int weeks = daysBetween/7;

        return shoppingDays;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompactDate)) return false;

        CompactDate that = (CompactDate) o;

        if (daysInYear != that.daysInYear) return false;
        if (year != that.year) return false;

        return true;
    }

    public int getDaysInYear() {
        return daysInYear;
    }

    public int getYear() {
        return year;
    }
}
