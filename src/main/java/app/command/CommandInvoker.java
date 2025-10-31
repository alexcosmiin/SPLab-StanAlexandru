package app.command;

public class CommandInvoker {
    public void invoke(Command command) {
        command.execute();
    }
}
