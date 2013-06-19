package designpattern.stratergy;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 25/01/2012
 * Time: 22:56
 * To change this template use File | Settings | File Templates.
 */
public class Walk implements MoveStrategy {
    public void move() {
        System.out.println("I am walking");
    }
}
