package question;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 29/01/2012
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    private int c;

    @org.junit.Test
    public void modifyString(){
        RoundingMode rm = RoundingMode.CEILING;
        BigDecimal d1 = new BigDecimal(-11);
        BigDecimal d2 = new BigDecimal(2);
        System.out.print(d1.divide(d2,rm));

    }
    
   
}
