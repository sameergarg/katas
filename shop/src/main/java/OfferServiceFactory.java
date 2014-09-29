public class OfferServiceFactory {

    public OfferService offerFor(String name) {
        switch(name.toLowerCase()) {
            case("apple"):
                return new Buy1Get1OfferService();
            case ("orange"):
                return new Buy3For2OfferService();
            default:
                throw new IllegalArgumentException(name + " Item not listed");
        }
    }

}
