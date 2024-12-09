package lab7;
/**
 * The specific command that handles the "Exit action"
 */
public class ExitCommand implements Command {
    private final Receiver receiver;

    /**
     * Constructor for ExitCommand.
     * @param receiver the receiver that executes the command
     */
    public ExitCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Executes the exit application command.
     */
    @Override
    public void execute() {
        receiver.exitApplication();
    }
}
