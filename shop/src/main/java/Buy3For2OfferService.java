public class Buy3For2OfferService implements OfferService {

    private int singleItemCost;

    public Buy3For2OfferService(int singleItemCost) {
        this.singleItemCost = singleItemCost;
    }

    @Override
    public int apply(int numberOfItems) {
        return (numberOfItems/3)*2* singleItemCost +(numberOfItems%3)* singleItemCost;
    }
}
