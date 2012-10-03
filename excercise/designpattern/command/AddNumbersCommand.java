package designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class AddNumbersCommand implements Command{

    private Adder adder;

    public AddNumbersCommand(int first, int second) {
        this.adder=new Adder(first,second);
    }

    public int execute() {
        return adder.add();
    }
}
