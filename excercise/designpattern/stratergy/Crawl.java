package designpattern.stratergy;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 25/01/2012
 * Time: 22:58
 * To change this template use File | Settings | File Templates.
 */
public class Crawl implements MoveStrategy {

    public void move() {
        System.out.println("I am crawling");
    }
}
