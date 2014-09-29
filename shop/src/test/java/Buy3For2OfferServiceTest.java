import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Buy3For2OfferServiceTest {

    @Test
    public void shouldApply_3For2_Offer() throws Exception {
        //given
        Buy3For2OfferService buy3For2Offer = new Buy3For2OfferService(60);

        //when

        //then
        assertThat("1 item",buy3For2Offer.apply(1), is(60));
        assertThat("2 item",buy3For2Offer.apply(2), is(120));
        assertThat("3 item",buy3For2Offer.apply(3), is(120));
        assertThat("4 item",buy3For2Offer.apply(4), is(180));
    }
}