package concurrency.threading;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 23/01/2013
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
public class MinPrimeRunnable implements Runnable {

    private int minPrime;

    public MinPrimeRunnable(int minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        int minimumPrime = minPrime+1;
        boolean primeFound = false;

        while(!primeFound){
            boolean checkNext=false;
            for(int i=2;i<(minimumPrime/2)+1;i++){
                if(minimumPrime%i==0){
                    minimumPrime++;
                    checkNext=true;
                    break;
                }
            }
            if(!checkNext){
                primeFound=true;
            }
        }
        System.out.println("Minimum prime above " + minPrime + " is " + minimumPrime);
    }

    public static void main(String[] args){
        for(int i=2;i<100;i++){
            Thread minPrimeThread =  new Thread(new MinPrimeRunnable(i));
            minPrimeThread.start();
        }
    }
}
