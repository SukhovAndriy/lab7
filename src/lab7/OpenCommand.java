package lab7;

/**
 * The specific command that handles the "Open action"
 */
public class OpenCommand implements Command {
    private final Receiver receiver;

    /**
     * Constructor for OpenCommand.
     * @param receiver the receiver that executes the command
     */
    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Executes the open file command.
     */
    @Override
    public void execute() {
        receiver.openFile();
    }
}
