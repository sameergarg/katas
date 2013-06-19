package investmentpredicator;

import java.math.BigDecimal;

/**
 * With an initial investment of x, and a daily increase of y, how long would it take for the initial amount to
 * double
 * Date: 24/12/2012
 * Time: 12:57
 */
public class InvestmentPredictor {

    private BigDecimal dailyInterestPercentage;

    private InvestmentPredictor(BigDecimal dailyInterestPercentage) {
        this.dailyInterestPercentage = dailyInterestPercentage;
    }

    public static InvestmentPredictor atRateOf(BigDecimal dailyInterestPercentage) {
        return new InvestmentPredictor(dailyInterestPercentage);
    }


    public int daysToDoubleInvestmentOf(int investmentAmount) {
        BigDecimal cumulativeAmount = BigDecimal.valueOf(investmentAmount);
        int days = 0;

        while(cumulativeAmount.intValue()<2*investmentAmount){
            cumulativeAmount=cumulativeAmount.add(dailyInterestPercentage.multiply(cumulativeAmount).multiply(BigDecimal.valueOf(.01)));
            days++;
        }
        return days;
    }
}
