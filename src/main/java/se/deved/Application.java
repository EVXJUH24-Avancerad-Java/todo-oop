package se.deved;

/*
<-----> Todo Applikation <----->
En applikation för att schemalägga "tasks" som kan avklaras.

Funktionalitet:
1. Skapa "tasks"
    - Schemalägga tasks
    - Prioritera task
    - Upprepande tasks
    - Organisera/gruppera tasks
2. Radera "tasks"
3. Uppdatera "tasks" (uppdatera titel, tid)
4. Avklara "tasks"
5. Lista upp tasks
    - Visa i ordning
    - Visa tid
    - Visa i grupper

Implementation:
- Spara "tasks" till fil

- Task klass - representerar en task
- TaskManager klass - hanterar alla tasks
- Validation klass - utility klass för att validera information
- CommandManager klass - hantera kommandon
- TimeManager klass - hanterar påminnelser om schemalagda tasks

 */

import se.deved.menu.Menu;
import se.deved.menu.UserMenu;

import java.util.Scanner;

// Application -> Menu -> Command

public class Application {

    private MenuManager menuManager;

    public Application() {
        this.menuManager = new SimpleMenuManager(this);
    }

    public static void main(String[] args) {
        Application application = new Application();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            application.getMenuManager().getCurrentMenu().tryExecuteCommand(scanner.nextLine());
        }
    }

    public MenuManager getMenuManager() {
        return menuManager;
    }
}