import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckoutSystemIntegrationTest {

    private CheckoutSystem checkoutSystem;

    @Before
    public void setUp() throws Exception {
        checkoutSystem = new CheckoutSystem(new OfferServiceFactory());
    }

    @Test
    public void shouldPrintReceiptForShoppingCartContainingApplesAfterBuyOneGetOneOffer() throws Exception {
        //given

        //when

        //then
        assertThat("1 Apple", checkoutSystem.printReceipt(asList("Apple")), is("£0.60"));
        assertThat("2 Apple", checkoutSystem.printReceipt(asList("Apple","Apple")), is("£0.60"));
        assertThat("3 Apple", checkoutSystem.printReceipt(asList("Apple", "Apple", "Apple")), is("£1.20"));
    }

    @Test
    public void shouldPrintReceiptForShoppingCartContainingOrangesAfter3For2Offer() throws Exception {
        //given

        //when

        //then
        assertThat("1 Orange", checkoutSystem.printReceipt(asList("Orange")), is("£0.25"));
        assertThat("2 Orange", checkoutSystem.printReceipt(asList("Orange", "Orange")), is("£0.50"));
        assertThat("3 Orange", checkoutSystem.printReceipt(asList("Orange", "Orange","Orange")), is("£0.50"));
        assertThat("4 Orange", checkoutSystem.printReceipt(asList("Orange", "Orange","Orange","Orange")), is("£0.75"));
    }

    @Test
    public void shouldPrintReceiptForShoppingCartContainingApplesAndOrangesAfterOffers() throws Exception {
        //given

        //when

        //then
        assertThat("2 Apple, 1 Orange", checkoutSystem.printReceipt(asList("Apple", "Apple", "Orange")), is("£0.85"));
        assertThat("2 Apple, 3 Oranges", checkoutSystem.printReceipt(asList("Apple", "Apple", "Orange", "Orange", "Orange")), is("£1.10"));
    }


}