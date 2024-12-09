package lab7;

/**
 * Invoker that controls and runs commands
 */
public class Button {
    private Command command;

    /**
     * Sets the command to be executed when the button is pressed.
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Simulates pressing the button, executing the assigned command.
     */
    public void press() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Команда не встановлена");
        }
    }
}
