package se.deved.menu;

import se.deved.command.CreateTaskCommand;
import se.deved.command.RemoveTaskCommand;

public class UserMenu extends Menu {

    public UserMenu() {
        registerCommand(new CreateTaskCommand());
        registerCommand(new RemoveTaskCommand());
    }
}
