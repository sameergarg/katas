import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Buy1Get1OfferServiceTest {

    @Test
    public void shouldApply_Buy1Get1_Offer() throws Exception {
        //given
        Buy1Get1OfferService buy1Get1Offer = new Buy1Get1OfferService(60);

        //when

        //then
        assertThat("1 Item", buy1Get1Offer.apply(1), is(60));
        assertThat("2 Item", buy1Get1Offer.apply(2), is(60));
        assertThat("3 Item", buy1Get1Offer.apply(3), is(120));
    }
}