package designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class Adder {

    private int first;

    private int second;

    public Adder(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int add(){
        return first+second;
    }
}
