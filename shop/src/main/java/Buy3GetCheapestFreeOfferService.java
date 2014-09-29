import java.util.Arrays;

public class Buy3GetCheapestFreeOfferService implements OfferService {


    @Override
    public int apply(Integer[] itemsCost) {
        Arrays.sort(itemsCost);
        int numberOfItems = itemsCost.length;

        int total = 0;
        int freeItems = numberOfItems /3;

        for(int i=0;i< numberOfItems;i++){
            if(i >= freeItems){
                total+= itemsCost[i];
            }
        }
        return total;
    }
}
