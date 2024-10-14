package se.deved.command;

public class CreateTaskCommand extends Command {

    public CreateTaskCommand() {
        super("create-task", "Create a task.");
    }

    @Override
    public void execute(String[] commandArgs) {
        System.out.println("TODO: Create task");
    }
}
