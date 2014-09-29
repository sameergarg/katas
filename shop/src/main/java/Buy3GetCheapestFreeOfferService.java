import java.util.Arrays;

public class Buy3GetCheapestFreeOfferService implements OfferService {

    private int[] itemsCost;

    public Buy3GetCheapestFreeOfferService(int[] itemsCost) {
        this.itemsCost = itemsCost;
        Arrays.sort(this.itemsCost);
    }

    @Override
    public int apply(int numberOfItems) {


        int total = 0;
        int freeItems = numberOfItems/3;

        for(int i=0;i<numberOfItems;i++){
            if(i >= freeItems){
                total+=itemsCost[i];
            }
        }
        return total;
    }
}
