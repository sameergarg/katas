import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

import static java.util.Collections.frequency;

public class CheckoutSystem {


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
        total += offerServiceFactory.offerFor(APPLE).apply(apples);

        int oranges = frequency(shoppingCart, ORANGE);
        total += offerServiceFactory.offerFor(ORANGE).apply(oranges);

        return total;
    }


}
