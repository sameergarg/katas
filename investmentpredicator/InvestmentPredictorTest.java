package investmentpredicator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class InvestmentPredictorTest {

    @Test
    public void calculateTimeToDoubleInvestment(){
        assertThat(InvestmentPredictor.atRateOf(BigDecimal.valueOf(1)).daysToDoubleInvestmentOf(1000), is(70));
    }


}
