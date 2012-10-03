package fibonacci;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 28/06/2012
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciNonRecursive {

    public int at(int position){
        int a = 0;
        int b = 1;
        int c = 0;
        if(position<0){
            throw new IllegalArgumentException("position cannot be negative");
        }
        for(int i=0;i<position;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}
