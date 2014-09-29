import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

import static java.util.Collections.frequency;
import static java.util.Collections.nCopies;

public class CheckoutSystem {


    private static final int APPLE_COST = 60;
    private static final int ORANGE_COST = 25;
    private static final String APPLE = "Apple";
    private static final String ORANGE = "Orange";

    private OfferServiceFactory offerServiceFactory;

    public CheckoutSystem(OfferServiceFactory offerServiceFactory) {
        this.offerServiceFactory = offerServiceFactory;
    }

    public String printReceipt(List<String> shoppingCart) {

        BigDecimal total = new BigDecimal(scan(shoppingCart) * .01);

        return NumberFormat.getCurrencyInstance().format(total);
    }

    private int scan(List<String> shoppingCart) {

        int total = 0;

        int apples = frequency(shoppingCart, APPLE);
        total += offerServiceFactory.offerFor(APPLE).apply(nCopies(apples, APPLE_COST).toArray(new Integer[apples]));

        int oranges = frequency(shoppingCart, ORANGE);
        total += offerServiceFactory.offerFor(ORANGE).apply(nCopies(oranges, ORANGE_COST).toArray(new Integer[oranges]));

        return total;
    }


}
