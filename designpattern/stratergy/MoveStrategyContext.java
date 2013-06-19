package designpattern.stratergy;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 25/01/2012
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class MoveStrategyContext {

    MoveStrategy moveStrategy;

    public static void main(String[] args){
        MoveStrategyContext context = new MoveStrategyContext();
        context.moveStrategy=new Run();
        context.moveStrategy.move();
    }
}
