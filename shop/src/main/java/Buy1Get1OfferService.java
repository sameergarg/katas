public class Buy1Get1OfferService implements OfferService {


    @Override
    public int apply(Integer[] itemsCost) {
        int numberOfItems = itemsCost.length;
        
        if(numberOfItems==0){
            return 0;
        }

        return (numberOfItems /2)* itemsCost[0] + (numberOfItems %2)* itemsCost[0];
    }
}
