package se.deved.command;

import se.deved.Application;

public class CreateTaskCommand extends Command {

    public CreateTaskCommand(Application application) {
        super("create-task", "Create a task.", application);
    }

    @Override
    public void execute(String[] commandArgs) {
        System.out.println("TODO: Create task");
    }
}
