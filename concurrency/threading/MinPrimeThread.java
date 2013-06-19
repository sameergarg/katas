package concurrency.threading;

public class MinPrimeThread extends Thread{

    private int minPrime;

    public MinPrimeThread(int minPrime) {
        super("minimum prime for "+minPrime);
        this.minPrime = minPrime;
    }

    @Override
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
        for(int i=2;i<200;i++){
            Thread minPrimeThread = new MinPrimeThread(i);
            minPrimeThread.start();
        }
    }

}
