public class Buy1Get1OfferService implements OfferService {

    private int singleItemCost;

    public Buy1Get1OfferService(int singleItemCost) {
        this.singleItemCost = singleItemCost;
    }

    @Override
    public int apply(int numberOfItems) {
        return (numberOfItems/2)* singleItemCost + (numberOfItems%2)* singleItemCost;
    }
}
