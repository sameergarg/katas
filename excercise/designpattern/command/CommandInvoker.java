package designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
public class CommandInvoker {

    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }
}
