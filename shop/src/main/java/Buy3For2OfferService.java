public class Buy3For2OfferService implements OfferService {


    @Override
    public int apply(Integer[] itemsCost) {

        int numberOfItems = itemsCost.length;

        if(numberOfItems==0){
            return 0;
        }

        return (numberOfItems /3)*2* itemsCost[0] +(numberOfItems %3)* itemsCost[0];
    }
}
