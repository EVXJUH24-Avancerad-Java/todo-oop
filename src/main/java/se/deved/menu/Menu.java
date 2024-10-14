package se.deved.menu;

import se.deved.command.Command;
import se.deved.command.CommandManager;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu implements CommandManager  {

    private List<Command> commands = new ArrayList<>();

    @Override
    public void registerCommand(Command command) {
        this.commands.add(command);
    }

    @Override
    public void tryExecuteCommand(String input) {
        if (input.isBlank())
            throw new IllegalArgumentException("Input must not be empty.");

        String[] commandArgs = input.split(" ");
        String commandName = commandArgs[0];

        for (Command command : commands) {
            if (command.getName().equalsIgnoreCase(commandName)) {
                command.execute(commandArgs);
                return;
            }
        }
    }
}
