public class OfferServiceFactory {

    private static final int APPLE_COST = 60;
    private static final int ORANGE_COST = 25;

    public OfferService offerFor(String name) {
        switch(name.toLowerCase()) {
            case("apple"):
                return new Buy1Get1OfferService(APPLE_COST);
            case ("orange"):
                return new Buy3For2OfferService(ORANGE_COST);
            default:
                throw new IllegalArgumentException(name + " Item not listed");
        }
    }

}
