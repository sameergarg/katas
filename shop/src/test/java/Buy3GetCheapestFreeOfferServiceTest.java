import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Buy3GetCheapestFreeOfferServiceTest {

    private Buy3GetCheapestFreeOfferService buy3GetCheapestFreeOffer;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void shouldGetThirdCheapestFree() throws Exception {
        //given

        //when

        //then
        assertThat("1 item", new Buy3GetCheapestFreeOfferService().apply(new Integer[]{60}), is(60));
        assertThat("2 item", new Buy3GetCheapestFreeOfferService().apply(new Integer[]{60,40}), is(100));
        assertThat("3 item", new Buy3GetCheapestFreeOfferService().apply(new Integer[]{60,40,80}), is(140));
        assertThat("4 item", new Buy3GetCheapestFreeOfferService().apply(new Integer[]{60,40,80,80}), is(220));
    }
}