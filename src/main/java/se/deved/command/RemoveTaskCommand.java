package se.deved.command;

import se.deved.Application;

public class RemoveTaskCommand extends Command{

    public RemoveTaskCommand(Application application) {
        super("remove-task", "Remove a task.", application);
    }

    @Override
    public void execute(String[] commandArgs) {

    }
}
