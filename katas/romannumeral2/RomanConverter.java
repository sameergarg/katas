package romannumeral2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 12/07/2012
 * Time: 09:17
 * To change this template use File | Settings | File Templates.
 */
public class RomanConverter {


    private enum ROMANS {
        X(10), IX(9), V(5), IV(4), I(1);

        private int arabic;

        ROMANS(int arabic) {
            this.arabic = arabic;

        }

    }


    public int toArabic(String roman) {
        int arabic = 0;

        List<ROMANS> romansInAscendingOrder = Arrays.asList(ROMANS.values());
        Collections.reverse(romansInAscendingOrder);

        while (roman.length() > 0) {
            for (ROMANS romanElement : romansInAscendingOrder) {
                if (roman.contains(romanElement.name())) {
                    arabic += romanElement.arabic;
                    roman = roman.substring(0,roman.indexOf(romanElement.name()));
                    break;
                }
            }
        }

        return arabic;
    }

    public String toRoman(int arabic) {
        StringBuilder romans = new StringBuilder();

        for (ROMANS roman : ROMANS.values()) {
            while (arabic >= roman.arabic) {
                romans.append(roman.name());
                arabic -= roman.arabic;
            }
        }

        return romans.toString();
    }
}
